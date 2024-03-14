package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CycleDiscontinued._

case class CycleDiscontinued (
  
object CycleDiscontinued {
  import DateTimeCodecs._

  implicit val CycleDiscontinuedCodecJson: CodecJson[CycleDiscontinued] = CodecJson.derive[CycleDiscontinued]
  implicit val CycleDiscontinuedDecoder: EntityDecoder[CycleDiscontinued] = jsonOf[CycleDiscontinued]
  implicit val CycleDiscontinuedEncoder: EntityEncoder[CycleDiscontinued] = jsonEncoderOf[CycleDiscontinued]
}
