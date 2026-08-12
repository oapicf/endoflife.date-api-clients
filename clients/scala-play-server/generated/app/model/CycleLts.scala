package model

import play.api.libs.json._

/**
  * Whether this release cycle has long-term-support (LTS), or the date it entered LTS status.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-12T05:02:30.066770890Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CycleLts(
)

object CycleLts {
  implicit lazy val cycleLtsJsonFormat: Format[CycleLts] = Json.format[CycleLts]
}

