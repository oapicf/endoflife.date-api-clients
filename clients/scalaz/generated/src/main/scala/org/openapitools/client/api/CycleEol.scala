package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CycleEol._

case class CycleEol (
  
object CycleEol {
  import DateTimeCodecs._

  implicit val CycleEolCodecJson: CodecJson[CycleEol] = CodecJson.derive[CycleEol]
  implicit val CycleEolDecoder: EntityDecoder[CycleEol] = jsonOf[CycleEol]
  implicit val CycleEolEncoder: EntityEncoder[CycleEol] = jsonEncoderOf[CycleEol]
}
