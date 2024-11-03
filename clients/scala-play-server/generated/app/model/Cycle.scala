package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
  * @param releaseDate Release Date for the first release in this cycle
  * @param latest Latest release in this cycle
  * @param link Link to changelog for the latest release, if available
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-10T09:11:31.374855606Z[Etc/UTC]", comments = "Generator version: 7.6.0")
case class Cycle(
  cycle: Option[CycleCycle],
  releaseDate: Option[LocalDate],
  eol: Option[CycleEol],
  latest: Option[String],
  link: Option[String],
  lts: Option[CycleLts],
  support: Option[CycleSupport],
  discontinued: Option[CycleDiscontinued]
)

object Cycle {
  implicit lazy val cycleJsonFormat: Format[Cycle] = Json.format[Cycle]
}

