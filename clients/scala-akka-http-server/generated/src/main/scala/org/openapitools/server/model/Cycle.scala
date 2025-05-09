package org.openapitools.server.model

import java.time.LocalDate

/**
 * = Cycle =
 *
 * Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
 *
 * @param cycle  for example: ''null''
 * @param releaseDate Release date for the first release in this cycle. for example: ''null''
 * @param eol  for example: ''null''
 * @param latest Latest release in this cycle. for example: ''null''
 * @param link Link to changelog for the latest release in this cycle, or null if unavailable. for example: ''null''
 * @param lts  for example: ''null''
 * @param support  for example: ''null''
 * @param discontinued  for example: ''null''
*/
final case class Cycle (
  cycle: Option[CycleCycle] = None,
  releaseDate: Option[LocalDate] = None,
  eol: Option[CycleEol] = None,
  latest: Option[String] = None,
  link: Option[String] = None,
  lts: Option[CycleLts] = None,
  support: Option[CycleSupport] = None,
  discontinued: Option[CycleDiscontinued] = None
)

