/**
* endoflife.date
* Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki).
*
* The version of the OpenAPI document: 0.0.1
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.models

import org.openapitools.server.models.CycleCycle
import org.openapitools.server.models.CycleDiscontinued
import org.openapitools.server.models.CycleEol
import org.openapitools.server.models.CycleLts
import org.openapitools.server.models.CycleSupport

import kotlinx.serialization.Serializable
/**
 * Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
 * @param cycle 
 * @param releaseDate Release date for the first release in this cycle.
 * @param eol 
 * @param latest Latest release in this cycle.
 * @param link Link to changelog for the latest release in this cycle, or null if unavailable.
 * @param lts 
 * @param support 
 * @param discontinued 
 */
@Serializable
data class Cycle(
    val cycle: CycleCycle? = null,
    /* Release date for the first release in this cycle. */
    val releaseDate: java.time.LocalDate? = null,
    val eol: CycleEol? = null,
    /* Latest release in this cycle. */
    val latest: kotlin.String? = null,
    /* Link to changelog for the latest release in this cycle, or null if unavailable. */
    val link: kotlin.String? = null,
    val lts: CycleLts? = null,
    val support: CycleSupport? = null,
    val discontinued: CycleDiscontinued? = null
)

