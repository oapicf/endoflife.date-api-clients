package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * End of Life Date for this release cycle
 */
case class CycleEol()

object CycleEol {
    /**
     * Creates the codec for converting CycleEol from and to JSON.
     */
    implicit val decoder: Decoder[CycleEol] = deriveDecoder
    implicit val encoder: ObjectEncoder[CycleEol] = deriveEncoder
}
