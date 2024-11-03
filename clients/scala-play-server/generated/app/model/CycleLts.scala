package model

import play.api.libs.json._

/**
  * Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-10T09:11:31.374855606Z[Etc/UTC]", comments = "Generator version: 7.6.0")
case class CycleLts(
)

object CycleLts {
  implicit lazy val cycleLtsJsonFormat: Format[CycleLts] = Json.format[CycleLts]
}

