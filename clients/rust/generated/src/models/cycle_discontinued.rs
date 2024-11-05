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

/// CycleDiscontinued : Whether this cycle is now discontinued.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct CycleDiscontinued {
}

impl CycleDiscontinued {
    /// Whether this cycle is now discontinued.
    pub fn new() -> CycleDiscontinued {
        CycleDiscontinued {
        }
    }
}
