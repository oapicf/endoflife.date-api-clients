package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Whether this release cycle has long-term-support (LTS), or the date it entered LTS status.
 */
case class CycleLts()

object CycleLts {
    /**
     * Creates the codec for converting CycleLts from and to JSON.
     */
    implicit val decoder: Decoder[CycleLts] = deriveDecoder
    implicit val encoder: ObjectEncoder[CycleLts] = deriveEncoder
}
