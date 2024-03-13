/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.CycleCycle
import org.openapitools.client.models.CycleDiscontinued
import org.openapitools.client.models.CycleEol
import org.openapitools.client.models.CycleLts
import org.openapitools.client.models.CycleSupport

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
 *
 * @param cycle 
 * @param releaseDate Release Date for the first release in this cycle
 * @param eol 
 * @param latest Latest release in this cycle
 * @param link Link to changelog for the latest release, if available
 * @param lts 
 * @param support 
 * @param discontinued 
 */


data class Cycle (

    @Json(name = "cycle")
    val cycle: CycleCycle? = null,

    /* Release Date for the first release in this cycle */
    @Json(name = "releaseDate")
    val releaseDate: java.time.LocalDate? = null,

    @Json(name = "eol")
    val eol: CycleEol? = null,

    /* Latest release in this cycle */
    @Json(name = "latest")
    val latest: kotlin.String? = null,

    /* Link to changelog for the latest release, if available */
    @Json(name = "link")
    val link: kotlin.String? = null,

    @Json(name = "lts")
    val lts: CycleLts? = null,

    @Json(name = "support")
    val support: CycleSupport? = null,

    @Json(name = "discontinued")
    val discontinued: CycleDiscontinued? = null

)

