package model

import play.api.libs.json._

/**
  * Whether this release cycle has long-term-support (LTS), or the date it entered LTS status.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-24T12:08:01.998091523Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CycleLts(
)

object CycleLts {
  implicit lazy val cycleLtsJsonFormat: Format[CycleLts] = Json.format[CycleLts]
}

