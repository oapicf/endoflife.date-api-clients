/**
 * endoflife.date
 * Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
 * Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
 */
export interface Cycle {
    /**
     * Release Cycle
     */
    cycle?: any | null;
    /**
     * Release Date for the first release in this cycle
     */
    releaseDate?: any | null;
    /**
     * End of Life Date for this release cycle
     */
    eol?: any | null;
    /**
     * Latest release in this cycle
     */
    latest?: any | null;
    /**
     * Link to changelog for the latest release, if available
     */
    link?: any | null;
    /**
     * Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date.
     */
    lts?: any | null;
    /**
     * Whether this release cycle has active support
     */
    support?: any | null;
    /**
     * Whether this cycle is now discontinued.
     */
    discontinued?: any | null;
}

