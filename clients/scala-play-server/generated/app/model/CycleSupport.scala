package model

import play.api.libs.json._

/**
  * Whether this release cycle has active support.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-09T11:50:38.515443487Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CycleSupport(
)

object CycleSupport {
  implicit lazy val cycleSupportJsonFormat: Format[CycleSupport] = Json.format[CycleSupport]
}

