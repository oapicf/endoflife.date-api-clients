#![allow(missing_docs, trivial_casts, unused_variables, unused_mut, unused_imports, unused_extern_crates, unused_attributes, non_camel_case_types)]
#![allow(clippy::derive_partial_eq_without_eq, clippy::disallowed_names)]

use async_trait::async_trait;
use futures::Stream;
use std::error::Error;
use std::collections::BTreeSet;
use std::task::{Poll, Context};
use swagger::{ApiError, ContextWrapper};
use serde::{Serialize, Deserialize};
use crate::server::Authorization;


type ServiceError = Box<dyn Error + Send + Sync + 'static>;

pub const BASE_PATH: &str = "";
pub const API_VERSION: &str = "0.0.1";

mod auth;
pub use auth::{AuthenticationApi, Claims};


#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetApiAllJsonResponse {
    /// OK
    OK
    (Vec<String>)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetApiProductJsonResponse {
    /// OK
    OK
    (Vec<models::Cycle>)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
pub enum GetApiProductCycleJsonResponse {
    /// OK
    OK
    (models::Cycle)
}

/// API
#[async_trait]
#[allow(clippy::too_many_arguments, clippy::ptr_arg)]
pub trait Api<C: Send + Sync> {
    /// All Products
    async fn get_api_all_json(
        &self,
        context: &C) -> Result<GetApiAllJsonResponse, ApiError>;

    /// Get All Details
    async fn get_api_product_json(
        &self,
        product: String,
        context: &C) -> Result<GetApiProductJsonResponse, ApiError>;

    /// Single cycle details
    async fn get_api_product_cycle_json(
        &self,
        product: String,
        cycle: String,
        context: &C) -> Result<GetApiProductCycleJsonResponse, ApiError>;

}

/// API where `Context` isn't passed on every API call
#[async_trait]
#[allow(clippy::too_many_arguments, clippy::ptr_arg)]
pub trait ApiNoContext<C: Send + Sync> {

    fn context(&self) -> &C;

    /// All Products
    async fn get_api_all_json(
        &self,
        ) -> Result<GetApiAllJsonResponse, ApiError>;

    /// Get All Details
    async fn get_api_product_json(
        &self,
        product: String,
        ) -> Result<GetApiProductJsonResponse, ApiError>;

    /// Single cycle details
    async fn get_api_product_cycle_json(
        &self,
        product: String,
        cycle: String,
        ) -> Result<GetApiProductCycleJsonResponse, ApiError>;

}

/// Trait to extend an API to make it easy to bind it to a context.
pub trait ContextWrapperExt<C: Send + Sync> where Self: Sized
{
    /// Binds this API to a context.
    fn with_context(self, context: C) -> ContextWrapper<Self, C>;
}

impl<T: Api<C> + Send + Sync, C: Clone + Send + Sync> ContextWrapperExt<C> for T {
    fn with_context(self: T, context: C) -> ContextWrapper<T, C> {
         ContextWrapper::<T, C>::new(self, context)
    }
}

#[async_trait]
impl<T: Api<C> + Send + Sync, C: Clone + Send + Sync> ApiNoContext<C> for ContextWrapper<T, C> {
    fn context(&self) -> &C {
        ContextWrapper::context(self)
    }

    /// All Products
    async fn get_api_all_json(
        &self,
        ) -> Result<GetApiAllJsonResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_api_all_json(&context).await
    }

    /// Get All Details
    async fn get_api_product_json(
        &self,
        product: String,
        ) -> Result<GetApiProductJsonResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_api_product_json(product, &context).await
    }

    /// Single cycle details
    async fn get_api_product_cycle_json(
        &self,
        product: String,
        cycle: String,
        ) -> Result<GetApiProductCycleJsonResponse, ApiError>
    {
        let context = self.context().clone();
        self.api().get_api_product_cycle_json(product, cycle, &context).await
    }

}


#[cfg(feature = "client")]
pub mod client;

// Re-export Client as a top-level name
#[cfg(feature = "client")]
pub use client::Client;

#[cfg(feature = "server")]
pub mod server;

// Re-export router() as a top-level name
#[cfg(feature = "server")]
pub use self::server::Service;

#[cfg(feature = "server")]
pub mod context;

pub mod models;

#[cfg(any(feature = "client", feature = "server"))]
pub(crate) mod header;
