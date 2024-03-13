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

import org.openapitools.client.core.ApiModel

case class Cycle (
  /* Release Cycle */
  cycle: Option[AnyType] = None,
  /* Release Date for the first release in this cycle */
  releaseDate: Option[AnyType] = None,
  /* End of Life Date for this release cycle */
  eol: Option[AnyType] = None,
  /* Latest release in this cycle */
  latest: Option[AnyType] = None,
  /* Link to changelog for the latest release, if available */
  link: Option[AnyType] = None,
  /* Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date.  */
  lts: Option[AnyType] = None,
  /* Whether this release cycle has active support */
  support: Option[AnyType] = None,
  /* Whether this cycle is now discontinued. */
  discontinued: Option[AnyType] = None
) extends ApiModel

