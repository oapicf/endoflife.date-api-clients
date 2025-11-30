#![allow(unused_qualifications)]

use http::HeaderValue;
use validator::Validate;

#[cfg(feature = "server")]
use crate::header;
use crate::{models, types::*};

#[allow(dead_code)]
fn from_validation_error(e: validator::ValidationError) -> validator::ValidationErrors {
  let mut errs = validator::ValidationErrors::new();
  errs.add("na", e);
  errs
}

#[allow(dead_code)]
pub fn check_xss_string(v: &str) -> std::result::Result<(), validator::ValidationError> {
    if ammonia::is_html(v) {
        std::result::Result::Err(validator::ValidationError::new("xss detected"))
    } else {
        std::result::Result::Ok(())
    }
}

#[allow(dead_code)]
pub fn check_xss_vec_string(v: &[String]) -> std::result::Result<(), validator::ValidationError> {
    if v.iter().any(|i| ammonia::is_html(i)) {
        std::result::Result::Err(validator::ValidationError::new("xss detected"))
    } else {
        std::result::Result::Ok(())
    }
}

#[allow(dead_code)]
pub fn check_xss_map_string(
    v: &std::collections::HashMap<String, String>,
) -> std::result::Result<(), validator::ValidationError> {
    if v.keys().any(|k| ammonia::is_html(k)) || v.values().any(|v| ammonia::is_html(v)) {
        std::result::Result::Err(validator::ValidationError::new("xss detected"))
    } else {
        std::result::Result::Ok(())
    }
}

#[allow(dead_code)]
pub fn check_xss_map_nested<T>(
    v: &std::collections::HashMap<String, T>,
) -> std::result::Result<(), validator::ValidationError>
where
    T: validator::Validate,
{
    if v.keys().any(|k| ammonia::is_html(k)) || v.values().any(|v| v.validate().is_err()) {
        std::result::Result::Err(validator::ValidationError::new("xss detected"))
    } else {
        std::result::Result::Ok(())
    }
}

#[allow(dead_code)]
pub fn check_xss_map<T>(v: &std::collections::HashMap<String, T>) -> std::result::Result<(), validator::ValidationError> {
    if v.keys().any(|k| ammonia::is_html(k)) {
        std::result::Result::Err(validator::ValidationError::new("xss detected"))
    } else {
        std::result::Result::Ok(())
    }
}



    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct GetApiProductCycleJsonPathParams {
            /// Product URL as per the canonical URL on the endofife.date website.
                pub product: String,
            /// Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD's releng/14.0 becomes releng-14.0.
                pub cycle: String,
    }



    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
    pub struct GetApiProductJsonPathParams {
            /// Product URL as per the canonical URL on the endofife.date website.
                pub product: String,
    }




/// Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct Cycle {
    #[serde(rename = "cycle")]
          #[validate(nested)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub cycle: Option<models::CycleCycle>,

    /// Release date for the first release in this cycle.
    #[serde(rename = "releaseDate")]
    #[validate(
            length(min = 10, max = 10),
    )]
    #[serde(skip_serializing_if="Option::is_none")]
    pub release_date: Option<chrono::naive::NaiveDate>,

    #[serde(rename = "eol")]
          #[validate(nested)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub eol: Option<models::CycleEol>,

    /// Latest release in this cycle.
    #[serde(rename = "latest")]
    #[validate(
            length(min = 1),
          custom(function = "check_xss_string"),
    )]
    #[serde(skip_serializing_if="Option::is_none")]
    pub latest: Option<String>,

    /// Link to changelog for the latest release in this cycle, or null if unavailable.
    #[serde(rename = "link")]
    #[validate(
            length(min = 1),
    )]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub link: Option<Nullable<String>>,

    #[serde(rename = "lts")]
          #[validate(nested)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub lts: Option<models::CycleLts>,

    #[serde(rename = "support")]
          #[validate(nested)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub support: Option<models::CycleSupport>,

    #[serde(rename = "discontinued")]
          #[validate(nested)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub discontinued: Option<models::CycleDiscontinued>,

}



impl Cycle {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> Cycle {
        Cycle {
 cycle: None,
 release_date: None,
 eol: None,
 latest: None,
 link: None,
 lts: None,
 support: None,
 discontinued: None,
        }
    }
}

/// Converts the Cycle value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for Cycle {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![
            // Skipping cycle in query parameter serialization

            // Skipping releaseDate in query parameter serialization

            // Skipping eol in query parameter serialization


            self.latest.as_ref().map(|latest| {
                [
                    "latest".to_string(),
                    latest.to_string(),
                ].join(",")
            }),


            self.link.as_ref().map(|link| {
                [
                    "link".to_string(),
                    link.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),

            // Skipping lts in query parameter serialization

            // Skipping support in query parameter serialization

            // Skipping discontinued in query parameter serialization

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a Cycle value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for Cycle {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub cycle: Vec<models::CycleCycle>,
            pub release_date: Vec<chrono::naive::NaiveDate>,
            pub eol: Vec<models::CycleEol>,
            pub latest: Vec<String>,
            pub link: Vec<String>,
            pub lts: Vec<models::CycleLts>,
            pub support: Vec<models::CycleSupport>,
            pub discontinued: Vec<models::CycleDiscontinued>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing Cycle".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "cycle" => intermediate_rep.cycle.push(<models::CycleCycle as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "releaseDate" => intermediate_rep.release_date.push(<chrono::naive::NaiveDate as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "eol" => intermediate_rep.eol.push(<models::CycleEol as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "latest" => intermediate_rep.latest.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    "link" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in Cycle".to_string()),
                    #[allow(clippy::redundant_clone)]
                    "lts" => intermediate_rep.lts.push(<models::CycleLts as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "support" => intermediate_rep.support.push(<models::CycleSupport as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "discontinued" => intermediate_rep.discontinued.push(<models::CycleDiscontinued as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing Cycle".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(Cycle {
            cycle: intermediate_rep.cycle.into_iter().next(),
            release_date: intermediate_rep.release_date.into_iter().next(),
            eol: intermediate_rep.eol.into_iter().next(),
            latest: intermediate_rep.latest.into_iter().next(),
            link: std::result::Result::Err("Nullable types not supported in Cycle".to_string())?,
            lts: intermediate_rep.lts.into_iter().next(),
            support: intermediate_rep.support.into_iter().next(),
            discontinued: intermediate_rep.discontinued.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<Cycle> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<Cycle>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<Cycle>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(format!(r#"Invalid header value for Cycle - value: {hdr_value} is invalid {e}"#))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<Cycle> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <Cycle as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(format!(r#"Unable to convert header value '{value}' into Cycle - {err}"#))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(format!(r#"Unable to convert header: {hdr_value:?} to string: {e}"#))
        }
    }
}



/// The release cycle which this release is part of.
#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[serde(untagged)]
#[allow(non_camel_case_types, clippy::large_enum_variant)]
pub enum CycleCycle {
    F64(f64),
    String(String),
}

impl validator::Validate for CycleCycle
{
    fn validate(&self) -> std::result::Result<(), validator::ValidationErrors> {
        match self {
            Self::F64(_) => std::result::Result::Ok(()),
            Self::String(_) => std::result::Result::Ok(()),
        }
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CycleCycle value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CycleCycle {
    type Err = serde_json::Error;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        serde_json::from_str(s)
    }
}


impl From<f64> for CycleCycle {
    fn from(value: f64) -> Self {
        Self::F64(value)
    }
}
impl From<String> for CycleCycle {
    fn from(value: String) -> Self {
        Self::String(value)
    }
}





/// Whether this device version is no longer in production.
#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[serde(untagged)]
#[allow(non_camel_case_types, clippy::large_enum_variant)]
pub enum CycleDiscontinued {
    String(String),
    Bool(bool),
}

impl validator::Validate for CycleDiscontinued
{
    fn validate(&self) -> std::result::Result<(), validator::ValidationErrors> {
        match self {
            Self::String(_) => std::result::Result::Ok(()),
            Self::Bool(_) => std::result::Result::Ok(()),
        }
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CycleDiscontinued value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CycleDiscontinued {
    type Err = serde_json::Error;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        serde_json::from_str(s)
    }
}


impl From<String> for CycleDiscontinued {
    fn from(value: String) -> Self {
        Self::String(value)
    }
}
impl From<bool> for CycleDiscontinued {
    fn from(value: bool) -> Self {
        Self::Bool(value)
    }
}





/// End-of-Life date for this release cycle.
#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[serde(untagged)]
#[allow(non_camel_case_types, clippy::large_enum_variant)]
pub enum CycleEol {
    String(String),
    Bool(bool),
}

impl validator::Validate for CycleEol
{
    fn validate(&self) -> std::result::Result<(), validator::ValidationErrors> {
        match self {
            Self::String(_) => std::result::Result::Ok(()),
            Self::Bool(_) => std::result::Result::Ok(()),
        }
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CycleEol value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CycleEol {
    type Err = serde_json::Error;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        serde_json::from_str(s)
    }
}


impl From<String> for CycleEol {
    fn from(value: String) -> Self {
        Self::String(value)
    }
}
impl From<bool> for CycleEol {
    fn from(value: bool) -> Self {
        Self::Bool(value)
    }
}





/// Whether this release cycle has long-term-support (LTS), or the date it entered LTS status.
#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[serde(untagged)]
#[allow(non_camel_case_types, clippy::large_enum_variant)]
pub enum CycleLts {
    String(String),
    Bool(bool),
}

impl validator::Validate for CycleLts
{
    fn validate(&self) -> std::result::Result<(), validator::ValidationErrors> {
        match self {
            Self::String(_) => std::result::Result::Ok(()),
            Self::Bool(_) => std::result::Result::Ok(()),
        }
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CycleLts value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CycleLts {
    type Err = serde_json::Error;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        serde_json::from_str(s)
    }
}


impl From<String> for CycleLts {
    fn from(value: String) -> Self {
        Self::String(value)
    }
}
impl From<bool> for CycleLts {
    fn from(value: bool) -> Self {
        Self::Bool(value)
    }
}





/// Whether this release cycle has active support.
#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[serde(untagged)]
#[allow(non_camel_case_types, clippy::large_enum_variant)]
pub enum CycleSupport {
    String(String),
    Bool(bool),
}

impl validator::Validate for CycleSupport
{
    fn validate(&self) -> std::result::Result<(), validator::ValidationErrors> {
        match self {
            Self::String(_) => std::result::Result::Ok(()),
            Self::Bool(_) => std::result::Result::Ok(()),
        }
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CycleSupport value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CycleSupport {
    type Err = serde_json::Error;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        serde_json::from_str(s)
    }
}


impl From<String> for CycleSupport {
    fn from(value: String) -> Self {
        Self::String(value)
    }
}
impl From<bool> for CycleSupport {
    fn from(value: bool) -> Self {
        Self::Bool(value)
    }
}




