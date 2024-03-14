package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Whether this cycle is now discontinued.
 */
case class CycleDiscontinued()

object CycleDiscontinued {
    /**
     * Creates the codec for converting CycleDiscontinued from and to JSON.
     */
    implicit val decoder: Decoder[CycleDiscontinued] = deriveDecoder
    implicit val encoder: ObjectEncoder[CycleDiscontinued] = deriveEncoder
}
