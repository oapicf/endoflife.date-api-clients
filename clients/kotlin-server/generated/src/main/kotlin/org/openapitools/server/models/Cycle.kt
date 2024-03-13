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
package org.openapitools.server.models


/**
 * Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
 * @param cycle Release Cycle
 * @param releaseDate Release Date for the first release in this cycle
 * @param eol End of Life Date for this release cycle
 * @param latest Latest release in this cycle
 * @param link Link to changelog for the latest release, if available
 * @param lts Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date.
 * @param support Whether this release cycle has active support
 * @param discontinued Whether this cycle is now discontinued.
 */
data class Cycle(
    /* Release Cycle */
    val cycle: kotlin.Any? = null,
    /* Release Date for the first release in this cycle */
    val releaseDate: kotlin.Any? = null,
    /* End of Life Date for this release cycle */
    val eol: kotlin.Any? = null,
    /* Latest release in this cycle */
    val latest: kotlin.Any? = null,
    /* Link to changelog for the latest release, if available */
    val link: kotlin.Any? = null,
    /* Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date.  */
    val lts: kotlin.Any? = null,
    /* Whether this release cycle has active support */
    val support: kotlin.Any? = null,
    /* Whether this cycle is now discontinued. */
    val discontinued: kotlin.Any? = null
)

