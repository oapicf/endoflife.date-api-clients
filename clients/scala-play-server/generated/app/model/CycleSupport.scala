package model

import play.api.libs.json._

/**
  * Whether this release cycle has active support
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-13T10:52:42.906253649Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CycleSupport(
)

object CycleSupport {
  implicit lazy val cycleSupportJsonFormat: Format[CycleSupport] = Json.format[CycleSupport]
}

