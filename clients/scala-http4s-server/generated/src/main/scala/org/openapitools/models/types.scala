package org.openapitools.models

import java.time._

import io.circe.refined._
import io.circe.syntax._
import io.circe.{ Decoder, Encoder }
import io.circe.generic.semiauto.{ deriveDecoder, deriveEncoder }

import eu.timepit.refined.api.Refined
import eu.timepit.refined.boolean.And
import eu.timepit.refined.collection.MinSize
import java.time.LocalDate

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

case class Cycle(
  cycle: Option[CycleCycle],
  releaseDate: Option[LocalDate],
  eol: Option[CycleEol],
  latest: Option[Refined[String, MinSize[1]]],
  link: Option[Refined[String, MinSize[1]]],
  lts: Option[CycleLts],
  support: Option[CycleSupport],
  discontinued: Option[CycleDiscontinued]
)
object Cycle {
  implicit val encoderCycle: Encoder[Cycle] = deriveEncoder[Cycle].mapJson(_.dropNullValues)
  implicit val decoderCycle: Decoder[Cycle] = deriveDecoder[Cycle]
}

/**
* The release cycle which this release is part of.
*/

case class CycleCycle(
)
object CycleCycle {
  implicit val encoderCycleCycle: Encoder[CycleCycle] = deriveEncoder[CycleCycle].mapJson(_.dropNullValues)
  implicit val decoderCycleCycle: Decoder[CycleCycle] = deriveDecoder[CycleCycle]
}

/**
* Whether this device version is no longer in production.
*/

case class CycleDiscontinued(
)
object CycleDiscontinued {
  implicit val encoderCycleDiscontinued: Encoder[CycleDiscontinued] = deriveEncoder[CycleDiscontinued].mapJson(_.dropNullValues)
  implicit val decoderCycleDiscontinued: Decoder[CycleDiscontinued] = deriveDecoder[CycleDiscontinued]
}

/**
* End-of-Life date for this release cycle.
*/

case class CycleEol(
)
object CycleEol {
  implicit val encoderCycleEol: Encoder[CycleEol] = deriveEncoder[CycleEol].mapJson(_.dropNullValues)
  implicit val decoderCycleEol: Decoder[CycleEol] = deriveDecoder[CycleEol]
}

/**
* Whether this release cycle has long-term-support (LTS), or the date it entered LTS status.
*/

case class CycleLts(
)
object CycleLts {
  implicit val encoderCycleLts: Encoder[CycleLts] = deriveEncoder[CycleLts].mapJson(_.dropNullValues)
  implicit val decoderCycleLts: Decoder[CycleLts] = deriveDecoder[CycleLts]
}

/**
* Whether this release cycle has active support.
*/

case class CycleSupport(
)
object CycleSupport {
  implicit val encoderCycleSupport: Encoder[CycleSupport] = deriveEncoder[CycleSupport].mapJson(_.dropNullValues)
  implicit val decoderCycleSupport: Decoder[CycleSupport] = deriveDecoder[CycleSupport]
}

