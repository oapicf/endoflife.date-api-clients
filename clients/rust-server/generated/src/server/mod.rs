use futures::{future, future::BoxFuture, Stream, stream, future::FutureExt, stream::TryStreamExt};
use hyper::{Request, Response, StatusCode, Body, HeaderMap};
use hyper::header::{HeaderName, HeaderValue, CONTENT_TYPE};
use log::warn;
#[allow(unused_imports)]
use std::convert::{TryFrom, TryInto};
use std::error::Error;
use std::future::Future;
use std::marker::PhantomData;
use std::task::{Context, Poll};
use swagger::{ApiError, BodyExt, Has, RequestParser, XSpanIdString};
pub use swagger::auth::Authorization;
use swagger::auth::Scopes;
use url::form_urlencoded;

#[allow(unused_imports)]
use crate::models;
use crate::header;

pub use crate::context;

type ServiceFuture = BoxFuture<'static, Result<Response<Body>, crate::ServiceError>>;

use crate::{Api,
     GetApiAllPeriodJsonResponse,
     GetApiProductCyclePeriodJsonResponse,
     GetApiProductPeriodJsonResponse
};

mod paths {
    use lazy_static::lazy_static;

    lazy_static! {
        pub static ref GLOBAL_REGEX_SET: regex::RegexSet = regex::RegexSet::new(vec![
            r"^/api/all.json$",
            r"^/api/(?P<product>[^/?#]*).json$",
            r"^/api/(?P<product>[^/?#]*)/(?P<cycle>[^/?#]*).json$"
        ])
        .expect("Unable to create global regex set");
    }
    pub(crate) static ID_API_ALL_JSON: usize = 0;
    pub(crate) static ID_API_PRODUCT_JSON: usize = 1;
    lazy_static! {
        pub static ref REGEX_API_PRODUCT_JSON: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/(?P<product>[^/?#]*).json$")
                .expect("Unable to create regex for API_PRODUCT_JSON");
    }
    pub(crate) static ID_API_PRODUCT_CYCLE_JSON: usize = 2;
    lazy_static! {
        pub static ref REGEX_API_PRODUCT_CYCLE_JSON: regex::Regex =
            #[allow(clippy::invalid_regex)]
            regex::Regex::new(r"^/api/(?P<product>[^/?#]*)/(?P<cycle>[^/?#]*).json$")
                .expect("Unable to create regex for API_PRODUCT_CYCLE_JSON");
    }
}

pub struct MakeService<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString>  + Send + Sync + 'static
{
    api_impl: T,
    marker: PhantomData<C>,
}

impl<T, C> MakeService<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString>  + Send + Sync + 'static
{
    pub fn new(api_impl: T) -> Self {
        MakeService {
            api_impl,
            marker: PhantomData
        }
    }
}

impl<T, C, Target> hyper::service::Service<Target> for MakeService<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString>  + Send + Sync + 'static
{
    type Response = Service<T, C>;
    type Error = crate::ServiceError;
    type Future = future::Ready<Result<Self::Response, Self::Error>>;

    fn poll_ready(&mut self, cx: &mut Context<'_>) -> Poll<Result<(), Self::Error>> {
        Poll::Ready(Ok(()))
    }

    fn call(&mut self, target: Target) -> Self::Future {
        future::ok(Service::new(
            self.api_impl.clone(),
        ))
    }
}

fn method_not_allowed() -> Result<Response<Body>, crate::ServiceError> {
    Ok(
        Response::builder().status(StatusCode::METHOD_NOT_ALLOWED)
            .body(Body::empty())
            .expect("Unable to create Method Not Allowed response")
    )
}

pub struct Service<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString>  + Send + Sync + 'static
{
    api_impl: T,
    marker: PhantomData<C>,
}

impl<T, C> Service<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString>  + Send + Sync + 'static
{
    pub fn new(api_impl: T) -> Self {
        Service {
            api_impl,
            marker: PhantomData
        }
    }
}

impl<T, C> Clone for Service<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString>  + Send + Sync + 'static
{
    fn clone(&self) -> Self {
        Service {
            api_impl: self.api_impl.clone(),
            marker: self.marker,
        }
    }
}

impl<T, C> hyper::service::Service<(Request<Body>, C)> for Service<T, C> where
    T: Api<C> + Clone + Send + Sync + 'static,
    C: Has<XSpanIdString>  + Send + Sync + 'static
{
    type Response = Response<Body>;
    type Error = crate::ServiceError;
    type Future = ServiceFuture;

    fn poll_ready(&mut self, cx: &mut Context) -> Poll<Result<(), Self::Error>> {
        self.api_impl.poll_ready(cx)
    }

    fn call(&mut self, req: (Request<Body>, C)) -> Self::Future { async fn run<T, C>(mut api_impl: T, req: (Request<Body>, C)) -> Result<Response<Body>, crate::ServiceError> where
        T: Api<C> + Clone + Send + 'static,
        C: Has<XSpanIdString>  + Send + Sync + 'static
    {
        let (request, context) = req;
        let (parts, body) = request.into_parts();
        let (method, uri, headers) = (parts.method, parts.uri, parts.headers);
        let path = paths::GLOBAL_REGEX_SET.matches(uri.path());

        match method {

            // GetApiAllPeriodJson - GET /api/all.json
            hyper::Method::GET if path.matched(paths::ID_API_ALL_JSON) => {
                                let result = api_impl.get_api_all_period_json(
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetApiAllPeriodJsonResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_API_ALL_PERIOD_JSON_OK"));
                                                    let body_content = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetApiProductCyclePeriodJson - GET /api/{product}/{cycle}.json
            hyper::Method::GET if path.matched(paths::ID_API_PRODUCT_CYCLE_JSON) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_PRODUCT_CYCLE_JSON
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_PRODUCT_CYCLE_JSON in set but failed match against \"{}\"", path, paths::REGEX_API_PRODUCT_CYCLE_JSON.as_str())
                    );

                let param_product = match percent_encoding::percent_decode(path_params["product"].as_bytes()).decode_utf8() {
                    Ok(param_product) => match param_product.parse::<String>() {
                        Ok(param_product) => param_product,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter product: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["product"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_cycle = match percent_encoding::percent_decode(path_params["cycle"].as_bytes()).decode_utf8() {
                    Ok(param_cycle) => match param_cycle.parse::<String>() {
                        Ok(param_cycle) => param_cycle,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter cycle: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["cycle"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.get_api_product_cycle_period_json(
                                            param_product,
                                            param_cycle,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetApiProductCyclePeriodJsonResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_API_PRODUCT_CYCLE_PERIOD_JSON_OK"));
                                                    let body_content = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // GetApiProductPeriodJson - GET /api/{product}.json
            hyper::Method::GET if path.matched(paths::ID_API_PRODUCT_JSON) => {
                // Path parameters
                let path: &str = uri.path();
                let path_params =
                    paths::REGEX_API_PRODUCT_JSON
                    .captures(path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE API_PRODUCT_JSON in set but failed match against \"{}\"", path, paths::REGEX_API_PRODUCT_JSON.as_str())
                    );

                let param_product = match percent_encoding::percent_decode(path_params["product"].as_bytes()).decode_utf8() {
                    Ok(param_product) => match param_product.parse::<String>() {
                        Ok(param_product) => param_product,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter product: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["product"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.get_api_product_period_json(
                                            param_product,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                GetApiProductPeriodJsonResponse::OK
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for GET_API_PRODUCT_PERIOD_JSON_OK"));
                                                    let body_content = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body_content);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            _ if path.matched(paths::ID_API_ALL_JSON) => method_not_allowed(),
            _ if path.matched(paths::ID_API_PRODUCT_JSON) => method_not_allowed(),
            _ if path.matched(paths::ID_API_PRODUCT_CYCLE_JSON) => method_not_allowed(),
            _ => Ok(Response::builder().status(StatusCode::NOT_FOUND)
                    .body(Body::empty())
                    .expect("Unable to create Not Found response"))
        }
    } Box::pin(run(self.api_impl.clone(), req)) }
}

/// Request parser for `Api`.
pub struct ApiRequestParser;
impl<T> RequestParser<T> for ApiRequestParser {
    fn parse_operation_id(request: &Request<T>) -> Option<&'static str> {
        let path = paths::GLOBAL_REGEX_SET.matches(request.uri().path());
        match *request.method() {
            // GetApiAllPeriodJson - GET /api/all.json
            hyper::Method::GET if path.matched(paths::ID_API_ALL_JSON) => Some("GetApiAllPeriodJson"),
            // GetApiProductCyclePeriodJson - GET /api/{product}/{cycle}.json
            hyper::Method::GET if path.matched(paths::ID_API_PRODUCT_CYCLE_JSON) => Some("GetApiProductCyclePeriodJson"),
            // GetApiProductPeriodJson - GET /api/{product}.json
            hyper::Method::GET if path.matched(paths::ID_API_PRODUCT_JSON) => Some("GetApiProductPeriodJson"),
            _ => None,
        }
    }
}
