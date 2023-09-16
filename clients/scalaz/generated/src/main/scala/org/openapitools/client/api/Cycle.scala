package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Cycle._

case class Cycle (
  /* Release Cycle */
  cycle: Option[AnyType],
/* Release Date for the first release in this cycle */
  releaseDate: Option[AnyType],
/* End of Life Date for this release cycle */
  eol: Option[AnyType],
/* Latest release in this cycle */
  latest: Option[AnyType],
/* Link to changelog for the latest release, if available */
  link: Option[AnyType],
/* Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date.  */
  lts: Option[AnyType],
/* Whether this release cycle has active support */
  support: Option[AnyType],
/* Whether this cycle is now discontinued. */
  discontinued: Option[AnyType])

object Cycle {
  import DateTimeCodecs._

  implicit val CycleCodecJson: CodecJson[Cycle] = CodecJson.derive[Cycle]
  implicit val CycleDecoder: EntityDecoder[Cycle] = jsonOf[Cycle]
  implicit val CycleEncoder: EntityEncoder[Cycle] = jsonEncoderOf[Cycle]
}
