/*
 * endoflife.date
 *
 * Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://openapi-generator.tech
 */

/// Cycle : Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct Cycle {
    /// Release Cycle
    #[serde(rename = "cycle", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub cycle: Option<Option<serde_json::Value>>,
    /// Release Date for the first release in this cycle
    #[serde(rename = "releaseDate", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub release_date: Option<Option<serde_json::Value>>,
    /// End of Life Date for this release cycle
    #[serde(rename = "eol", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub eol: Option<Option<serde_json::Value>>,
    /// Latest release in this cycle
    #[serde(rename = "latest", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub latest: Option<Option<serde_json::Value>>,
    /// Link to changelog for the latest release, if available
    #[serde(rename = "link", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub link: Option<Option<serde_json::Value>>,
    /// Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date.
    #[serde(rename = "lts", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub lts: Option<Option<serde_json::Value>>,
    /// Whether this release cycle has active support
    #[serde(rename = "support", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub support: Option<Option<serde_json::Value>>,
    /// Whether this cycle is now discontinued.
    #[serde(rename = "discontinued", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub discontinued: Option<Option<serde_json::Value>>,
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


