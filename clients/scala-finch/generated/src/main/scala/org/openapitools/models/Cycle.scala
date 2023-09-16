package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AnyType

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
case class Cycle(cycle: Option[AnyType],
                releaseDate: Option[AnyType],
                eol: Option[AnyType],
                latest: Option[AnyType],
                link: Option[AnyType],
                lts: Option[AnyType],
                support: Option[AnyType],
                discontinued: Option[AnyType]
                )

object Cycle {
    /**
     * Creates the codec for converting Cycle from and to JSON.
     */
    implicit val decoder: Decoder[Cycle] = deriveDecoder
    implicit val encoder: ObjectEncoder[Cycle] = deriveEncoder
}
