package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Release Cycle
 */
case class CycleCycle()

object CycleCycle {
    /**
     * Creates the codec for converting CycleCycle from and to JSON.
     */
    implicit val decoder: Decoder[CycleCycle] = deriveDecoder
    implicit val encoder: ObjectEncoder[CycleCycle] = deriveEncoder
}
