#![allow(unused_qualifications)]
#[cfg(not(feature = "validate"))]
use validator::Validate;

use crate::models;
#[cfg(any(feature = "client", feature = "server"))]
use crate::header;
#[cfg(feature = "validate")]
use serde_valid::Validate;

/// Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
#[derive(Debug, Clone, PartialEq, Validate, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct Cycle {
    #[serde(rename = "cycle")]

    #[cfg_attr(feature = "validate", validate)]
    #[cfg_attr(feature = "validate", validate)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub cycle: Option<models::CycleCycle>,

    /// Release date for the first release in this cycle.
    #[serde(rename = "releaseDate")]
    #[cfg_attr(not(feature = "validate"), validate(
            length(min = 10, max = 10),
        ))]
    #[cfg_attr(feature = "validate", validate(min_length = 10))]
    #[cfg_attr(feature = "validate", validate(max_length = 10))]

    #[serde(skip_serializing_if="Option::is_none")]
    pub release_date: Option<chrono::naive::NaiveDate>,

    #[serde(rename = "eol")]

    #[cfg_attr(feature = "validate", validate)]
    #[cfg_attr(feature = "validate", validate)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub eol: Option<models::CycleEol>,

    /// Latest release in this cycle.
    #[serde(rename = "latest")]
    #[cfg_attr(not(feature = "validate"), validate(
            length(min = 1),
        ))]
    #[cfg_attr(feature = "validate", validate(min_length = 1))]

    #[serde(skip_serializing_if="Option::is_none")]
    pub latest: Option<String>,

    /// Link to changelog for the latest release in this cycle, or null if unavailable.
    #[serde(rename = "link")]
    #[cfg_attr(not(feature = "validate"), validate(
            length(min = 1),
        ))]
    #[cfg_attr(feature = "validate", validate(min_length = 1))]

    #[serde(deserialize_with = "swagger::nullable_format::deserialize_optional_nullable")]
    #[serde(default = "swagger::nullable_format::default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub link: Option<swagger::Nullable<String>>,

    #[serde(rename = "lts")]

    #[cfg_attr(feature = "validate", validate)]
    #[cfg_attr(feature = "validate", validate)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub lts: Option<models::CycleLts>,

    #[serde(rename = "support")]

    #[cfg_attr(feature = "validate", validate)]
    #[cfg_attr(feature = "validate", validate)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub support: Option<models::CycleSupport>,

    #[serde(rename = "discontinued")]

    #[cfg_attr(feature = "validate", validate)]
    #[cfg_attr(feature = "validate", validate)]
    #[serde(skip_serializing_if="Option::is_none")]
    pub discontinued: Option<models::CycleDiscontinued>,

}


impl Cycle {
    #[allow(clippy::new_without_default)]
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
/// specified in <https://swagger.io/docs/specification/serialization/>
/// Should be implemented in a serde serializer
impl std::fmt::Display for Cycle {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![
            // Skipping non-primitive type cycle in query parameter serialization
            // Skipping non-primitive type releaseDate in query parameter serialization
            // Skipping non-primitive type eol in query parameter serialization
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
            // Skipping non-primitive type lts in query parameter serialization
            // Skipping non-primitive type support in query parameter serialization
            // Skipping non-primitive type discontinued in query parameter serialization
        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a Cycle value
/// as specified in <https://swagger.io/docs/specification/serialization/>
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
            pub link: Vec<swagger::Nullable<String>>,
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

// Methods for converting between header::IntoHeaderValue<Cycle> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<Cycle>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<Cycle>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for Cycle - value: {hdr_value} is invalid {e}"))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Cycle> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <Cycle as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{value}' into Cycle - {err}"))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {hdr_value:?} to string: {e}"))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<Vec<Cycle>>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_values: header::IntoHeaderValue<Vec<Cycle>>) -> std::result::Result<Self, Self::Error> {
        let hdr_values : Vec<String> = hdr_values.0.into_iter().map(|hdr_value| {
            hdr_value.to_string()
        }).collect();

        match hyper::header::HeaderValue::from_str(&hdr_values.join(", ")) {
           std::result::Result::Ok(hdr_value) => std::result::Result::Ok(hdr_value),
           std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to convert {hdr_values:?} into a header - {e}",))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Vec<Cycle>> {
    type Error = String;

    fn try_from(hdr_values: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_values.to_str() {
            std::result::Result::Ok(hdr_values) => {
                let hdr_values : std::vec::Vec<Cycle> = hdr_values
                .split(',')
                .filter_map(|hdr_value| match hdr_value.trim() {
                    "" => std::option::Option::None,
                    hdr_value => std::option::Option::Some({
                        match <Cycle as std::str::FromStr>::from_str(hdr_value) {
                            std::result::Result::Ok(value) => std::result::Result::Ok(value),
                            std::result::Result::Err(err) => std::result::Result::Err(
                                format!("Unable to convert header value '{hdr_value}' into Cycle - {err}"))
                        }
                    })
                }).collect::<std::result::Result<std::vec::Vec<_>, String>>()?;

                std::result::Result::Ok(header::IntoHeaderValue(hdr_values))
            },
            std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to parse header: {hdr_values:?} as a string - {e}")),
        }
    }
}

/// The release cycle which this release is part of.
#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "validate", derive(Validate))]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct CycleCycle(
    swagger::AnyOf2<f64,String>
);

impl std::convert::From<swagger::AnyOf2<f64,String>> for CycleCycle {
    fn from(x: swagger::AnyOf2<f64,String>) -> Self {
        CycleCycle(x)
    }
}

impl std::convert::From<CycleCycle> for swagger::AnyOf2<f64,String> {
    fn from(x: CycleCycle) -> Self {
        x.0
    }
}

impl std::ops::Deref for CycleCycle {
    type Target = swagger::AnyOf2<f64,String>;
    fn deref(&self) -> &swagger::AnyOf2<f64,String> {
        &self.0
    }
}

impl std::ops::DerefMut for CycleCycle {
    fn deref_mut(&mut self) -> &mut swagger::AnyOf2<f64,String> {
        &mut self.0
    }
}

/// Converts the CycleCycle value to the Query Parameters representation (style=form, explode=false)
/// specified in <https://swagger.io/docs/specification/serialization/>
/// Should be implemented in a serde serializer
impl std::fmt::Display for CycleCycle {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        // Display for this model is not supported
        write!(f, "")
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CycleCycle value
/// as specified in <https://swagger.io/docs/specification/serialization/>
/// Should be implemented in a serde deserializer
impl ::std::str::FromStr for CycleCycle {
    type Err = &'static str;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        std::result::Result::Err("Parsing CycleCycle is not supported")
    }
}

// Methods for converting between header::IntoHeaderValue<CycleCycle> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<CycleCycle>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CycleCycle>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CycleCycle - value: {hdr_value} is invalid {e}"))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<CycleCycle> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <CycleCycle as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{value}' into CycleCycle - {err}"))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {hdr_value:?} to string: {e}"))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<Vec<CycleCycle>>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_values: header::IntoHeaderValue<Vec<CycleCycle>>) -> std::result::Result<Self, Self::Error> {
        let hdr_values : Vec<String> = hdr_values.0.into_iter().map(|hdr_value| {
            hdr_value.to_string()
        }).collect();

        match hyper::header::HeaderValue::from_str(&hdr_values.join(", ")) {
           std::result::Result::Ok(hdr_value) => std::result::Result::Ok(hdr_value),
           std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to convert {hdr_values:?} into a header - {e}",))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Vec<CycleCycle>> {
    type Error = String;

    fn try_from(hdr_values: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_values.to_str() {
            std::result::Result::Ok(hdr_values) => {
                let hdr_values : std::vec::Vec<CycleCycle> = hdr_values
                .split(',')
                .filter_map(|hdr_value| match hdr_value.trim() {
                    "" => std::option::Option::None,
                    hdr_value => std::option::Option::Some({
                        match <CycleCycle as std::str::FromStr>::from_str(hdr_value) {
                            std::result::Result::Ok(value) => std::result::Result::Ok(value),
                            std::result::Result::Err(err) => std::result::Result::Err(
                                format!("Unable to convert header value '{hdr_value}' into CycleCycle - {err}"))
                        }
                    })
                }).collect::<std::result::Result<std::vec::Vec<_>, String>>()?;

                std::result::Result::Ok(header::IntoHeaderValue(hdr_values))
            },
            std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to parse header: {hdr_values:?} as a string - {e}")),
        }
    }
}

/// Whether this device version is no longer in production.
#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "validate", derive(Validate))]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct CycleDiscontinued(
    #[cfg_attr(feature = "validate", validate(min_length = 10))]
    #[cfg_attr(feature = "validate", validate(max_length = 10))]
    swagger::AnyOf2<String,bool>
);

impl std::convert::From<swagger::AnyOf2<String,bool>> for CycleDiscontinued {
    fn from(x: swagger::AnyOf2<String,bool>) -> Self {
        CycleDiscontinued(x)
    }
}

impl std::convert::From<CycleDiscontinued> for swagger::AnyOf2<String,bool> {
    fn from(x: CycleDiscontinued) -> Self {
        x.0
    }
}

impl std::ops::Deref for CycleDiscontinued {
    type Target = swagger::AnyOf2<String,bool>;
    fn deref(&self) -> &swagger::AnyOf2<String,bool> {
        &self.0
    }
}

impl std::ops::DerefMut for CycleDiscontinued {
    fn deref_mut(&mut self) -> &mut swagger::AnyOf2<String,bool> {
        &mut self.0
    }
}

/// Converts the CycleDiscontinued value to the Query Parameters representation (style=form, explode=false)
/// specified in <https://swagger.io/docs/specification/serialization/>
/// Should be implemented in a serde serializer
impl std::fmt::Display for CycleDiscontinued {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        // Display for this model is not supported
        write!(f, "")
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CycleDiscontinued value
/// as specified in <https://swagger.io/docs/specification/serialization/>
/// Should be implemented in a serde deserializer
impl ::std::str::FromStr for CycleDiscontinued {
    type Err = &'static str;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        std::result::Result::Err("Parsing CycleDiscontinued is not supported")
    }
}

// Methods for converting between header::IntoHeaderValue<CycleDiscontinued> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<CycleDiscontinued>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CycleDiscontinued>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CycleDiscontinued - value: {hdr_value} is invalid {e}"))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<CycleDiscontinued> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <CycleDiscontinued as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{value}' into CycleDiscontinued - {err}"))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {hdr_value:?} to string: {e}"))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<Vec<CycleDiscontinued>>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_values: header::IntoHeaderValue<Vec<CycleDiscontinued>>) -> std::result::Result<Self, Self::Error> {
        let hdr_values : Vec<String> = hdr_values.0.into_iter().map(|hdr_value| {
            hdr_value.to_string()
        }).collect();

        match hyper::header::HeaderValue::from_str(&hdr_values.join(", ")) {
           std::result::Result::Ok(hdr_value) => std::result::Result::Ok(hdr_value),
           std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to convert {hdr_values:?} into a header - {e}",))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Vec<CycleDiscontinued>> {
    type Error = String;

    fn try_from(hdr_values: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_values.to_str() {
            std::result::Result::Ok(hdr_values) => {
                let hdr_values : std::vec::Vec<CycleDiscontinued> = hdr_values
                .split(',')
                .filter_map(|hdr_value| match hdr_value.trim() {
                    "" => std::option::Option::None,
                    hdr_value => std::option::Option::Some({
                        match <CycleDiscontinued as std::str::FromStr>::from_str(hdr_value) {
                            std::result::Result::Ok(value) => std::result::Result::Ok(value),
                            std::result::Result::Err(err) => std::result::Result::Err(
                                format!("Unable to convert header value '{hdr_value}' into CycleDiscontinued - {err}"))
                        }
                    })
                }).collect::<std::result::Result<std::vec::Vec<_>, String>>()?;

                std::result::Result::Ok(header::IntoHeaderValue(hdr_values))
            },
            std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to parse header: {hdr_values:?} as a string - {e}")),
        }
    }
}

/// End-of-Life date for this release cycle.
#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "validate", derive(Validate))]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct CycleEol(
    #[cfg_attr(feature = "validate", validate(min_length = 1))]
    swagger::AnyOf2<String,bool>
);

impl std::convert::From<swagger::AnyOf2<String,bool>> for CycleEol {
    fn from(x: swagger::AnyOf2<String,bool>) -> Self {
        CycleEol(x)
    }
}

impl std::convert::From<CycleEol> for swagger::AnyOf2<String,bool> {
    fn from(x: CycleEol) -> Self {
        x.0
    }
}

impl std::ops::Deref for CycleEol {
    type Target = swagger::AnyOf2<String,bool>;
    fn deref(&self) -> &swagger::AnyOf2<String,bool> {
        &self.0
    }
}

impl std::ops::DerefMut for CycleEol {
    fn deref_mut(&mut self) -> &mut swagger::AnyOf2<String,bool> {
        &mut self.0
    }
}

/// Converts the CycleEol value to the Query Parameters representation (style=form, explode=false)
/// specified in <https://swagger.io/docs/specification/serialization/>
/// Should be implemented in a serde serializer
impl std::fmt::Display for CycleEol {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        // Display for this model is not supported
        write!(f, "")
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CycleEol value
/// as specified in <https://swagger.io/docs/specification/serialization/>
/// Should be implemented in a serde deserializer
impl ::std::str::FromStr for CycleEol {
    type Err = &'static str;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        std::result::Result::Err("Parsing CycleEol is not supported")
    }
}

// Methods for converting between header::IntoHeaderValue<CycleEol> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<CycleEol>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CycleEol>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CycleEol - value: {hdr_value} is invalid {e}"))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<CycleEol> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <CycleEol as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{value}' into CycleEol - {err}"))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {hdr_value:?} to string: {e}"))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<Vec<CycleEol>>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_values: header::IntoHeaderValue<Vec<CycleEol>>) -> std::result::Result<Self, Self::Error> {
        let hdr_values : Vec<String> = hdr_values.0.into_iter().map(|hdr_value| {
            hdr_value.to_string()
        }).collect();

        match hyper::header::HeaderValue::from_str(&hdr_values.join(", ")) {
           std::result::Result::Ok(hdr_value) => std::result::Result::Ok(hdr_value),
           std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to convert {hdr_values:?} into a header - {e}",))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Vec<CycleEol>> {
    type Error = String;

    fn try_from(hdr_values: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_values.to_str() {
            std::result::Result::Ok(hdr_values) => {
                let hdr_values : std::vec::Vec<CycleEol> = hdr_values
                .split(',')
                .filter_map(|hdr_value| match hdr_value.trim() {
                    "" => std::option::Option::None,
                    hdr_value => std::option::Option::Some({
                        match <CycleEol as std::str::FromStr>::from_str(hdr_value) {
                            std::result::Result::Ok(value) => std::result::Result::Ok(value),
                            std::result::Result::Err(err) => std::result::Result::Err(
                                format!("Unable to convert header value '{hdr_value}' into CycleEol - {err}"))
                        }
                    })
                }).collect::<std::result::Result<std::vec::Vec<_>, String>>()?;

                std::result::Result::Ok(header::IntoHeaderValue(hdr_values))
            },
            std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to parse header: {hdr_values:?} as a string - {e}")),
        }
    }
}

/// Whether this release cycle has long-term-support (LTS), or the date it entered LTS status.
#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "validate", derive(Validate))]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct CycleLts(
    swagger::AnyOf2<String,bool>
);

impl std::convert::From<swagger::AnyOf2<String,bool>> for CycleLts {
    fn from(x: swagger::AnyOf2<String,bool>) -> Self {
        CycleLts(x)
    }
}

impl std::convert::From<CycleLts> for swagger::AnyOf2<String,bool> {
    fn from(x: CycleLts) -> Self {
        x.0
    }
}

impl std::ops::Deref for CycleLts {
    type Target = swagger::AnyOf2<String,bool>;
    fn deref(&self) -> &swagger::AnyOf2<String,bool> {
        &self.0
    }
}

impl std::ops::DerefMut for CycleLts {
    fn deref_mut(&mut self) -> &mut swagger::AnyOf2<String,bool> {
        &mut self.0
    }
}

/// Converts the CycleLts value to the Query Parameters representation (style=form, explode=false)
/// specified in <https://swagger.io/docs/specification/serialization/>
/// Should be implemented in a serde serializer
impl std::fmt::Display for CycleLts {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        // Display for this model is not supported
        write!(f, "")
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CycleLts value
/// as specified in <https://swagger.io/docs/specification/serialization/>
/// Should be implemented in a serde deserializer
impl ::std::str::FromStr for CycleLts {
    type Err = &'static str;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        std::result::Result::Err("Parsing CycleLts is not supported")
    }
}

// Methods for converting between header::IntoHeaderValue<CycleLts> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<CycleLts>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CycleLts>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CycleLts - value: {hdr_value} is invalid {e}"))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<CycleLts> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <CycleLts as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{value}' into CycleLts - {err}"))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {hdr_value:?} to string: {e}"))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<Vec<CycleLts>>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_values: header::IntoHeaderValue<Vec<CycleLts>>) -> std::result::Result<Self, Self::Error> {
        let hdr_values : Vec<String> = hdr_values.0.into_iter().map(|hdr_value| {
            hdr_value.to_string()
        }).collect();

        match hyper::header::HeaderValue::from_str(&hdr_values.join(", ")) {
           std::result::Result::Ok(hdr_value) => std::result::Result::Ok(hdr_value),
           std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to convert {hdr_values:?} into a header - {e}",))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Vec<CycleLts>> {
    type Error = String;

    fn try_from(hdr_values: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_values.to_str() {
            std::result::Result::Ok(hdr_values) => {
                let hdr_values : std::vec::Vec<CycleLts> = hdr_values
                .split(',')
                .filter_map(|hdr_value| match hdr_value.trim() {
                    "" => std::option::Option::None,
                    hdr_value => std::option::Option::Some({
                        match <CycleLts as std::str::FromStr>::from_str(hdr_value) {
                            std::result::Result::Ok(value) => std::result::Result::Ok(value),
                            std::result::Result::Err(err) => std::result::Result::Err(
                                format!("Unable to convert header value '{hdr_value}' into CycleLts - {err}"))
                        }
                    })
                }).collect::<std::result::Result<std::vec::Vec<_>, String>>()?;

                std::result::Result::Ok(header::IntoHeaderValue(hdr_values))
            },
            std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to parse header: {hdr_values:?} as a string - {e}")),
        }
    }
}

/// Whether this release cycle has active support.
#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "validate", derive(Validate))]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct CycleSupport(
    #[cfg_attr(feature = "validate", validate(min_length = 10))]
    #[cfg_attr(feature = "validate", validate(max_length = 10))]
    swagger::AnyOf2<String,bool>
);

impl std::convert::From<swagger::AnyOf2<String,bool>> for CycleSupport {
    fn from(x: swagger::AnyOf2<String,bool>) -> Self {
        CycleSupport(x)
    }
}

impl std::convert::From<CycleSupport> for swagger::AnyOf2<String,bool> {
    fn from(x: CycleSupport) -> Self {
        x.0
    }
}

impl std::ops::Deref for CycleSupport {
    type Target = swagger::AnyOf2<String,bool>;
    fn deref(&self) -> &swagger::AnyOf2<String,bool> {
        &self.0
    }
}

impl std::ops::DerefMut for CycleSupport {
    fn deref_mut(&mut self) -> &mut swagger::AnyOf2<String,bool> {
        &mut self.0
    }
}

/// Converts the CycleSupport value to the Query Parameters representation (style=form, explode=false)
/// specified in <https://swagger.io/docs/specification/serialization/>
/// Should be implemented in a serde serializer
impl std::fmt::Display for CycleSupport {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        // Display for this model is not supported
        write!(f, "")
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CycleSupport value
/// as specified in <https://swagger.io/docs/specification/serialization/>
/// Should be implemented in a serde deserializer
impl ::std::str::FromStr for CycleSupport {
    type Err = &'static str;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        std::result::Result::Err("Parsing CycleSupport is not supported")
    }
}

// Methods for converting between header::IntoHeaderValue<CycleSupport> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<CycleSupport>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CycleSupport>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CycleSupport - value: {hdr_value} is invalid {e}"))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<CycleSupport> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <CycleSupport as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{value}' into CycleSupport - {err}"))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {hdr_value:?} to string: {e}"))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<Vec<CycleSupport>>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_values: header::IntoHeaderValue<Vec<CycleSupport>>) -> std::result::Result<Self, Self::Error> {
        let hdr_values : Vec<String> = hdr_values.0.into_iter().map(|hdr_value| {
            hdr_value.to_string()
        }).collect();

        match hyper::header::HeaderValue::from_str(&hdr_values.join(", ")) {
           std::result::Result::Ok(hdr_value) => std::result::Result::Ok(hdr_value),
           std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to convert {hdr_values:?} into a header - {e}",))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Vec<CycleSupport>> {
    type Error = String;

    fn try_from(hdr_values: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_values.to_str() {
            std::result::Result::Ok(hdr_values) => {
                let hdr_values : std::vec::Vec<CycleSupport> = hdr_values
                .split(',')
                .filter_map(|hdr_value| match hdr_value.trim() {
                    "" => std::option::Option::None,
                    hdr_value => std::option::Option::Some({
                        match <CycleSupport as std::str::FromStr>::from_str(hdr_value) {
                            std::result::Result::Ok(value) => std::result::Result::Ok(value),
                            std::result::Result::Err(err) => std::result::Result::Err(
                                format!("Unable to convert header value '{hdr_value}' into CycleSupport - {err}"))
                        }
                    })
                }).collect::<std::result::Result<std::vec::Vec<_>, String>>()?;

                std::result::Result::Ok(header::IntoHeaderValue(hdr_values))
            },
            std::result::Result::Err(e) => std::result::Result::Err(format!("Unable to parse header: {hdr_values:?} as a string - {e}")),
        }
    }
}
