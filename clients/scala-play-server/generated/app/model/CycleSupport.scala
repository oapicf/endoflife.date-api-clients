package model

import play.api.libs.json._

/**
  * Whether this release cycle has active support
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T10:26:06.423739496Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CycleSupport(
)

object CycleSupport {
  implicit lazy val cycleSupportJsonFormat: Format[CycleSupport] = Json.format[CycleSupport]
}

