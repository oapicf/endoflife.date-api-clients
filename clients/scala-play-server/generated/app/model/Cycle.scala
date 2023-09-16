package model

import play.api.libs.json._

/**
  * Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
  * @param cycle Release Cycle
  * @param releaseDate Release Date for the first release in this cycle
  * @param eol End of Life Date for this release cycle
  * @param latest Latest release in this cycle
  * @param link Link to changelog for the latest release, if available
  * @param lts Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date. 
  * @param support Whether this release cycle has active support
  * @param discontinued Whether this cycle is now discontinued.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2023-09-16T14:49:07.439280Z[Etc/UTC]")
case class Cycle(
  cycle: Option[OasAnyTypeNotMapped],
  releaseDate: Option[OasAnyTypeNotMapped],
  eol: Option[OasAnyTypeNotMapped],
  latest: Option[OasAnyTypeNotMapped],
  link: Option[OasAnyTypeNotMapped],
  lts: Option[OasAnyTypeNotMapped],
  support: Option[OasAnyTypeNotMapped],
  discontinued: Option[OasAnyTypeNotMapped]
)

object Cycle {
  implicit lazy val cycleJsonFormat: Format[Cycle] = Json.format[Cycle]
}

