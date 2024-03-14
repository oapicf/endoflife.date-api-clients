package model

import play.api.libs.json._

/**
  * Whether this cycle is now discontinued.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-13T10:52:42.906253649Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CycleDiscontinued(
)

object CycleDiscontinued {
  implicit lazy val cycleDiscontinuedJsonFormat: Format[CycleDiscontinued] = Json.format[CycleDiscontinued]
}

