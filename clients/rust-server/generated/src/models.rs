#![allow(unused_qualifications)]

use validator::Validate;

use crate::models;
#[cfg(any(feature = "client", feature = "server"))]
use crate::header;

/// Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct Cycle {
    /// Release Cycle
    #[serde(rename = "cycle")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub cycle: Option<serde_json::Value>,

    /// Release Date for the first release in this cycle
    #[serde(rename = "releaseDate")]
    #[validate(
            length(min = 10, max = 10),
        )]
    #[serde(skip_serializing_if="Option::is_none")]
    pub release_date: Option<serde_json::Value>,

    /// End of Life Date for this release cycle
    #[serde(rename = "eol")]
    #[validate(
            length(min = 1),
        )]
    #[serde(skip_serializing_if="Option::is_none")]
    pub eol: Option<serde_json::Value>,

    /// Latest release in this cycle
    #[serde(rename = "latest")]
    #[validate(
            length(min = 1),
        )]
    #[serde(skip_serializing_if="Option::is_none")]
    pub latest: Option<serde_json::Value>,

    /// Link to changelog for the latest release, if available
    #[serde(rename = "link")]
    #[validate(
            length(min = 1),
        )]
    #[serde(skip_serializing_if="Option::is_none")]
    pub link: Option<serde_json::Value>,

    /// Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date. 
    #[serde(rename = "lts")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub lts: Option<serde_json::Value>,

    /// Whether this release cycle has active support
    #[serde(rename = "support")]
    #[validate(
            length(min = 10, max = 10),
        )]
    #[serde(skip_serializing_if="Option::is_none")]
    pub support: Option<serde_json::Value>,

    /// Whether this cycle is now discontinued.
    #[serde(rename = "discontinued")]
    #[validate(
            length(min = 10, max = 10),
        )]
    #[serde(skip_serializing_if="Option::is_none")]
    pub discontinued: Option<serde_json::Value>,

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
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for Cycle {
    fn to_string(&self) -> String {
        let params: Vec<Option<String>> = vec![
            // Skipping cycle in query parameter serialization

            // Skipping releaseDate in query parameter serialization

            // Skipping eol in query parameter serialization

            // Skipping latest in query parameter serialization

            // Skipping link in query parameter serialization

            // Skipping lts in query parameter serialization

            // Skipping support in query parameter serialization

            // Skipping discontinued in query parameter serialization

        ];

        params.into_iter().flatten().collect::<Vec<_>>().join(",")
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
            pub cycle: Vec<serde_json::Value>,
            pub release_date: Vec<serde_json::Value>,
            pub eol: Vec<serde_json::Value>,
            pub latest: Vec<serde_json::Value>,
            pub link: Vec<serde_json::Value>,
            pub lts: Vec<serde_json::Value>,
            pub support: Vec<serde_json::Value>,
            pub discontinued: Vec<serde_json::Value>,
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
                    "cycle" => intermediate_rep.cycle.push(<serde_json::Value as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "releaseDate" => intermediate_rep.release_date.push(<serde_json::Value as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "eol" => intermediate_rep.eol.push(<serde_json::Value as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "latest" => intermediate_rep.latest.push(<serde_json::Value as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "link" => intermediate_rep.link.push(<serde_json::Value as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "lts" => intermediate_rep.lts.push(<serde_json::Value as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "support" => intermediate_rep.support.push(<serde_json::Value as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "discontinued" => intermediate_rep.discontinued.push(<serde_json::Value as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
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
            link: intermediate_rep.link.into_iter().next(),
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
                 format!("Invalid header value for Cycle - value: {} is invalid {}",
                     hdr_value, e))
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
                            format!("Unable to convert header value '{}' into Cycle - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}

