package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CycleCycle
import org.openapitools.model.CycleDiscontinued
import org.openapitools.model.CycleEol
import org.openapitools.model.CycleLts
import org.openapitools.model.CycleSupport
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

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
data class Cycle(

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("cycle")
    @get:JsonProperty("cycle") val cycle: CycleCycle? = null,

    @field:Valid
    @get:Size(min=10,max=10)
    @Schema(description = "Release date for the first release in this cycle.")
    @param:JsonProperty("releaseDate")
    @get:JsonProperty("releaseDate") val releaseDate: java.time.LocalDate? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("eol")
    @get:JsonProperty("eol") val eol: CycleEol? = null,

    @get:Size(min=1)
    @Schema(description = "Latest release in this cycle.")
    @param:JsonProperty("latest")
    @get:JsonProperty("latest") val latest: kotlin.String? = null,

    @get:Size(min=1)
    @Schema(description = "Link to changelog for the latest release in this cycle, or null if unavailable.")
    @param:JsonProperty("link")
    @get:JsonProperty("link") val link: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("lts")
    @get:JsonProperty("lts") val lts: CycleLts? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("support")
    @get:JsonProperty("support") val support: CycleSupport? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("discontinued")
    @get:JsonProperty("discontinued") val discontinued: CycleDiscontinued? = null
) {

}

