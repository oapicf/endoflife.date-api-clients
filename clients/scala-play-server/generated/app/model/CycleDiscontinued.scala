package model

import play.api.libs.json._

/**
  * Whether this device version is no longer in production.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-12T05:02:30.066770890Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CycleDiscontinued(
)

object CycleDiscontinued {
  implicit lazy val cycleDiscontinuedJsonFormat: Format[CycleDiscontinued] = Json.format[CycleDiscontinued]
}

