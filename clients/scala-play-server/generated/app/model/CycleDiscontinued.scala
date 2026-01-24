package model

import play.api.libs.json._

/**
  * Whether this device version is no longer in production.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-24T12:08:01.998091523Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CycleDiscontinued(
)

object CycleDiscontinued {
  implicit lazy val cycleDiscontinuedJsonFormat: Format[CycleDiscontinued] = Json.format[CycleDiscontinued]
}

