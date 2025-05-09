package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Whether this release cycle has active support.
 */
case class CycleSupport()

object CycleSupport {
    /**
     * Creates the codec for converting CycleSupport from and to JSON.
     */
    implicit val decoder: Decoder[CycleSupport] = deriveDecoder
    implicit val encoder: ObjectEncoder[CycleSupport] = deriveEncoder
}
