package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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

    @field:Valid
    @Schema(example = "null", description = "Release Cycle")
    @get:JsonProperty("cycle") val cycle: kotlin.Any? = null,

    @field:Valid
    @get:Size(min=10,max=10)
    @Schema(example = "null", description = "Release Date for the first release in this cycle")
    @get:JsonProperty("releaseDate") val releaseDate: kotlin.Any? = null,

    @field:Valid
    @get:Size(min=1)
    @Schema(example = "null", description = "End of Life Date for this release cycle")
    @get:JsonProperty("eol") val eol: kotlin.Any? = null,

    @field:Valid
    @get:Size(min=1)
    @Schema(example = "null", description = "Latest release in this cycle")
    @get:JsonProperty("latest") val latest: kotlin.Any? = null,

    @field:Valid
    @get:Size(min=1)
    @Schema(example = "null", description = "Link to changelog for the latest release, if available")
    @get:JsonProperty("link") val link: kotlin.Any? = null,

    @field:Valid
    @Schema(example = "null", description = "Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date. ")
    @get:JsonProperty("lts") val lts: kotlin.Any? = null,

    @field:Valid
    @get:Size(min=10,max=10)
    @Schema(example = "null", description = "Whether this release cycle has active support")
    @get:JsonProperty("support") val support: kotlin.Any? = null,

    @field:Valid
    @get:Size(min=10,max=10)
    @Schema(example = "null", description = "Whether this cycle is now discontinued.")
    @get:JsonProperty("discontinued") val discontinued: kotlin.Any? = null
) {

}

