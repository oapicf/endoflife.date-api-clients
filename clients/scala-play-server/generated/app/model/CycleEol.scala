package model

import play.api.libs.json._

/**
  * End-of-Life date for this release cycle.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-09T11:50:38.515443487Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CycleEol(
)

object CycleEol {
  implicit lazy val cycleEolJsonFormat: Format[CycleEol] = Json.format[CycleEol]
}

