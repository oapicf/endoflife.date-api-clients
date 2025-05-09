package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.time.LocalDateTime
import org.openapitools.models.CycleCycle
import org.openapitools.models.CycleDiscontinued
import org.openapitools.models.CycleEol
import org.openapitools.models.CycleLts
import org.openapitools.models.CycleSupport

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
case class Cycle(cycle: Option[CycleCycle],
                releaseDate: Option[LocalDateTime],
                eol: Option[CycleEol],
                latest: Option[String],
                link: Option[String],
                lts: Option[CycleLts],
                support: Option[CycleSupport],
                discontinued: Option[CycleDiscontinued]
                )

object Cycle {
    /**
     * Creates the codec for converting Cycle from and to JSON.
     */
    implicit val decoder: Decoder[Cycle] = deriveDecoder
    implicit val encoder: ObjectEncoder[Cycle] = deriveEncoder
}
