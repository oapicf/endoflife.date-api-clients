package model

import play.api.libs.json._

/**
  * End-of-Life date for this release cycle.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-12T05:02:30.066770890Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CycleEol(
)

object CycleEol {
  implicit lazy val cycleEolJsonFormat: Format[CycleEol] = Json.format[CycleEol]
}

