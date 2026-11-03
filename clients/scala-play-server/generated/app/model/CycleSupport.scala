package model

import play.api.libs.json._

/**
  * Whether this release cycle has active support.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:12:03.201471982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CycleSupport(
)

object CycleSupport {
  implicit lazy val cycleSupportJsonFormat: Format[CycleSupport] = Json.format[CycleSupport]
}

