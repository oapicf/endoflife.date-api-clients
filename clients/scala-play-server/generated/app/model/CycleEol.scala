package model

import play.api.libs.json._

/**
  * End-of-Life date for this release cycle.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-15T02:30:22.774812366Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CycleEol(
)

object CycleEol {
  implicit lazy val cycleEolJsonFormat: Format[CycleEol] = Json.format[CycleEol]
}

