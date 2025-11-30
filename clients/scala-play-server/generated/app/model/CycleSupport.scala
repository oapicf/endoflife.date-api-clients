package model

import play.api.libs.json._

/**
  * Whether this release cycle has active support.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-11-30T06:35:16.672805115Z[Etc/UTC]", comments = "Generator version: 7.17.0")
case class CycleSupport(
)

object CycleSupport {
  implicit lazy val cycleSupportJsonFormat: Format[CycleSupport] = Json.format[CycleSupport]
}

