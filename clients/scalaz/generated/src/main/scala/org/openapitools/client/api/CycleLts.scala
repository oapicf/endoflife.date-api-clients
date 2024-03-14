package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CycleLts._

case class CycleLts (
  
object CycleLts {
  import DateTimeCodecs._

  implicit val CycleLtsCodecJson: CodecJson[CycleLts] = CodecJson.derive[CycleLts]
  implicit val CycleLtsDecoder: EntityDecoder[CycleLts] = jsonOf[CycleLts]
  implicit val CycleLtsEncoder: EntityEncoder[CycleLts] = jsonEncoderOf[CycleLts]
}
