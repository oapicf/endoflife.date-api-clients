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
pub enum GetApiAllPeriodJsonResponse {
    /// OK
    Status200_OK
    (Vec<String>)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetApiProductCyclePeriodJsonResponse {
    /// OK
    Status200_OK
    (models::Cycle)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetApiProductPeriodJsonResponse {
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
    /// GetApiAllPeriodJson - GET /api/all.json
    async fn get_api_all_period_json(
    &self,
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
    ) -> Result<GetApiAllPeriodJsonResponse, E>;

    /// Single cycle details.
    ///
    /// GetApiProductCyclePeriodJson - GET /api/{product}/{cycle}.json
    async fn get_api_product_cycle_period_json(
    &self,
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::GetApiProductCyclePeriodJsonPathParams,
    ) -> Result<GetApiProductCyclePeriodJsonResponse, E>;

    /// Get All Details.
    ///
    /// GetApiProductPeriodJson - GET /api/{product}.json
    async fn get_api_product_period_json(
    &self,
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::GetApiProductPeriodJsonPathParams,
    ) -> Result<GetApiProductPeriodJsonResponse, E>;
}
