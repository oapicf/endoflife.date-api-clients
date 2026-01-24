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
    @Schema(example = "null", description = "")
    @get:JsonProperty("cycle") val cycle: CycleCycle? = null,

    @field:Valid
    @get:Size(min=10,max=10)
    @Schema(example = "null", description = "Release date for the first release in this cycle.")
    @get:JsonProperty("releaseDate") val releaseDate: java.time.LocalDate? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("eol") val eol: CycleEol? = null,

    @get:Size(min=1)
    @Schema(example = "null", description = "Latest release in this cycle.")
    @get:JsonProperty("latest") val latest: kotlin.String? = null,

    @get:Size(min=1)
    @Schema(example = "null", description = "Link to changelog for the latest release in this cycle, or null if unavailable.")
    @get:JsonProperty("link") val link: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("lts") val lts: CycleLts? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("support") val support: CycleSupport? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("discontinued") val discontinued: CycleDiscontinued? = null
) {

}

