use async_trait::async_trait;
use axum::extract::*;
use axum_extra::extract::{CookieJar, Host};
use bytes::Bytes;
use http::Method;
use serde::{Deserialize, Serialize};

use crate::{models, types::*};

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetApiAllJsonResponse {
    /// OK
    Status200_OK
    (Vec<String>)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetApiProductCycleJsonResponse {
    /// OK
    Status200_OK
    (models::Cycle)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetApiProductJsonResponse {
    /// OK
    Status200_OK
    (Vec<models::Cycle>)
}




/// Default
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Default<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// All Products.
    ///
    /// GetApiAllJson - GET /api/all.json
    async fn get_api_all_json(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
    ) -> Result<GetApiAllJsonResponse, E>;

    /// Single cycle details.
    ///
    /// GetApiProductCycleJson - GET /api/{product}/{cycle}.json
    async fn get_api_product_cycle_json(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::GetApiProductCycleJsonPathParams,
    ) -> Result<GetApiProductCycleJsonResponse, E>;

    /// Get All Details.
    ///
    /// GetApiProductJson - GET /api/{product}.json
    async fn get_api_product_json(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::GetApiProductJsonPathParams,
    ) -> Result<GetApiProductJsonResponse, E>;
}
