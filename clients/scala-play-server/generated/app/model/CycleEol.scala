package model

import play.api.libs.json._

/**
  * End of Life Date for this release cycle
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T10:26:06.423739496Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CycleEol(
)

object CycleEol {
  implicit lazy val cycleEolJsonFormat: Format[CycleEol] = Json.format[CycleEol]
}

