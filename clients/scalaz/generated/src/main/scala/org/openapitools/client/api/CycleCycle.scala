package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CycleCycle._

case class CycleCycle (
  
object CycleCycle {
  import DateTimeCodecs._

  implicit val CycleCycleCodecJson: CodecJson[CycleCycle] = CodecJson.derive[CycleCycle]
  implicit val CycleCycleDecoder: EntityDecoder[CycleCycle] = jsonOf[CycleCycle]
  implicit val CycleCycleEncoder: EntityEncoder[CycleCycle] = jsonEncoderOf[CycleCycle]
}
