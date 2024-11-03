package model

import play.api.libs.json._

/**
  * Whether this cycle is now discontinued.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-10T09:11:31.374855606Z[Etc/UTC]", comments = "Generator version: 7.6.0")
case class CycleDiscontinued(
)

object CycleDiscontinued {
  implicit lazy val cycleDiscontinuedJsonFormat: Format[CycleDiscontinued] = Json.format[CycleDiscontinued]
}

