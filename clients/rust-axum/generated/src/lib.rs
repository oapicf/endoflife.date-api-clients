#![allow(missing_docs, trivial_casts, unused_variables, unused_mut, unused_imports, unused_extern_crates, non_camel_case_types)]
#![allow(unused_imports, unused_attributes)]
#![allow(clippy::derive_partial_eq_without_eq, clippy::disallowed_names)]

use async_trait::async_trait;
use axum::extract::*;
use axum_extra::extract::{CookieJar, Multipart};
use bytes::Bytes;
use http::Method;
use serde::{Deserialize, Serialize};

use types::*;

pub const BASE_PATH: &str = "";
pub const API_VERSION: &str = "0.0.1";

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


/// API
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Api {

                /// All Products.
                ///
                /// GetApiAllPeriodJson - GET /api/all.json
                async fn get_api_all_period_json(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                ) -> Result<GetApiAllPeriodJsonResponse, String>;


                /// Single cycle details.
                ///
                /// GetApiProductCyclePeriodJson - GET /api/{product}/{cycle}.json
                async fn get_api_product_cycle_period_json(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::GetApiProductCyclePeriodJsonPathParams,
                ) -> Result<GetApiProductCyclePeriodJsonResponse, String>;


                /// Get All Details.
                ///
                /// GetApiProductPeriodJson - GET /api/{product}.json
                async fn get_api_product_period_json(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                  path_params: models::GetApiProductPeriodJsonPathParams,
                ) -> Result<GetApiProductPeriodJsonResponse, String>;

}

#[cfg(feature = "server")]
pub mod server;

pub mod models;
pub mod types;

#[cfg(feature = "server")]
pub(crate) mod header;
