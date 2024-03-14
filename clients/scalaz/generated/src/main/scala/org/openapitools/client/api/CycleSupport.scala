package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CycleSupport._

case class CycleSupport (
  
object CycleSupport {
  import DateTimeCodecs._

  implicit val CycleSupportCodecJson: CodecJson[CycleSupport] = CodecJson.derive[CycleSupport]
  implicit val CycleSupportDecoder: EntityDecoder[CycleSupport] = jsonOf[CycleSupport]
  implicit val CycleSupportEncoder: EntityEncoder[CycleSupport] = jsonEncoderOf[CycleSupport]
}
