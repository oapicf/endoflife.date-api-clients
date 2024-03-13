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
package org.openapitools.client.api

import org.openapitools.client.model.Cycle
import org.openapitools.client.core.JsonSupport._
import sttp.client3._
import sttp.model.Method

object DefaultApi {

def apply(baseUrl: String = "https://endoflife.date") = new DefaultApi(baseUrl)
}

class DefaultApi(baseUrl: String) {

  /**
   * Return a list of all products. Each of these can be used for the other API endpoints.
   * 
   * Expected answers:
   *   code 200 : Seq[String] (OK)
   */
  def getApiAllJson(
): Request[Either[ResponseException[String, Exception], Seq[String]], Any] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/api/all.json")
      .contentType("application/json")
      .response(asJson[Seq[String]])

  /**
   * Gets details of a single cycle
   * 
   * Expected answers:
   *   code 200 : Cycle (OK)
   * 
   * @param product Product URL as per the canonical URL on the endofife.date website
   * @param cycle Release Cycle for which the details must be fetched
   */
  def getApiProductCycleJson(product: String, cycle: String
): Request[Either[ResponseException[String, Exception], Cycle], Any] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/api/${product}/${cycle}.json")
      .contentType("application/json")
      .response(asJson[Cycle])

  /**
   * Get EoL dates of all cycles of a given product.
   * 
   * Expected answers:
   *   code 200 : Seq[Cycle] (OK)
   * 
   * @param product Product URL as per the canonical URL on the endofife.date website
   */
  def getApiProductJson(product: String
): Request[Either[ResponseException[String, Exception], Seq[Cycle]], Any] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/api/${product}.json")
      .contentType("application/json")
      .response(asJson[Seq[Cycle]])

}
