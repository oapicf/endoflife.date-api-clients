package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate

import Cycle._

case class Cycle (
  cycle: Option[CycleCycle],
/* Release Date for the first release in this cycle */
  releaseDate: Option[LocalDate],
eol: Option[CycleEol],
/* Latest release in this cycle */
  latest: Option[String],
/* Link to changelog for the latest release, if available */
  link: Option[String],
lts: Option[CycleLts],
support: Option[CycleSupport],
discontinued: Option[CycleDiscontinued])

object Cycle {
  import DateTimeCodecs._

  implicit val CycleCodecJson: CodecJson[Cycle] = CodecJson.derive[Cycle]
  implicit val CycleDecoder: EntityDecoder[Cycle] = jsonOf[Cycle]
  implicit val CycleEncoder: EntityEncoder[Cycle] = jsonEncoderOf[Cycle]
}
