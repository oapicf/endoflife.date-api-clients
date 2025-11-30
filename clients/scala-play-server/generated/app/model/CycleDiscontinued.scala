package model

import play.api.libs.json._

/**
  * Whether this device version is no longer in production.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-11-30T06:35:16.672805115Z[Etc/UTC]", comments = "Generator version: 7.17.0")
case class CycleDiscontinued(
)

object CycleDiscontinued {
  implicit lazy val cycleDiscontinuedJsonFormat: Format[CycleDiscontinued] = Json.format[CycleDiscontinued]
}

