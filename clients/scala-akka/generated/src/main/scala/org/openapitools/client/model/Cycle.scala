/**
 * endoflife.date
 * Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model

import java.time.LocalDate
import org.openapitools.client.core.ApiModel

case class Cycle (
  cycle: Option[CycleCycle] = None,
  /* Release Date for the first release in this cycle */
  releaseDate: Option[LocalDate] = None,
  eol: Option[CycleEol] = None,
  /* Latest release in this cycle */
  latest: Option[String] = None,
  /* Link to changelog for the latest release, if available */
  link: Option[String] = None,
  lts: Option[CycleLts] = None,
  support: Option[CycleSupport] = None,
  discontinued: Option[CycleDiscontinued] = None
) extends ApiModel
