package org.openapitools.server.model


/**
 * = Cycle =
 *
 * Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
 *
 * @param cycle Release Cycle for example: ''null''
 * @param releaseDate Release Date for the first release in this cycle for example: ''null''
 * @param eol End of Life Date for this release cycle for example: ''null''
 * @param latest Latest release in this cycle for example: ''null''
 * @param link Link to changelog for the latest release, if available for example: ''null''
 * @param lts Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date.  for example: ''null''
 * @param support Whether this release cycle has active support for example: ''null''
 * @param discontinued Whether this cycle is now discontinued. for example: ''null''
*/
final case class Cycle (
  cycle: Option[AnyType] = None,
  releaseDate: Option[AnyType] = None,
  eol: Option[AnyType] = None,
  latest: Option[AnyType] = None,
  link: Option[AnyType] = None,
  lts: Option[AnyType] = None,
  support: Option[AnyType] = None,
  discontinued: Option[AnyType] = None
)

