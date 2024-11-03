/*
 * endoflife.date
 *
 * Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://openapi-generator.tech
 */

use crate::models;
use serde::{Deserialize, Serialize};

/// Cycle : Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct Cycle {
    #[serde(rename = "cycle", skip_serializing_if = "Option::is_none")]
    pub cycle: Option<Box<models::CycleCycle>>,
    /// Release Date for the first release in this cycle
    #[serde(rename = "releaseDate", skip_serializing_if = "Option::is_none")]
    pub release_date: Option<String>,
    #[serde(rename = "eol", skip_serializing_if = "Option::is_none")]
    pub eol: Option<Box<models::CycleEol>>,
    /// Latest release in this cycle
    #[serde(rename = "latest", skip_serializing_if = "Option::is_none")]
    pub latest: Option<String>,
    /// Link to changelog for the latest release, if available
    #[serde(rename = "link", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub link: Option<Option<String>>,
    #[serde(rename = "lts", skip_serializing_if = "Option::is_none")]
    pub lts: Option<Box<models::CycleLts>>,
    #[serde(rename = "support", skip_serializing_if = "Option::is_none")]
    pub support: Option<Box<models::CycleSupport>>,
    #[serde(rename = "discontinued", skip_serializing_if = "Option::is_none")]
    pub discontinued: Option<Box<models::CycleDiscontinued>>,
}

impl Cycle {
    /// Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
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

