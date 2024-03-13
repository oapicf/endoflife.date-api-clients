package api

import play.api.libs.json._
import model.Cycle

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-13T10:52:42.906253649Z[Etc/UTC]", comments = "Generator version: 7.4.0")
trait DefaultApi {
  /**
    * All Products
    * Return a list of all products. Each of these can be used for the other API endpoints.
    */
  def getApiAllJson(): List[String]

  /**
    * Single cycle details
    * Gets details of a single cycle
    * @param product Product URL as per the canonical URL on the endofife.date website
    * @param cycle Release Cycle for which the details must be fetched
    */
  def getApiProductCycleJson(product: String, cycle: String): Cycle

  /**
    * Get All Details
    * Get EoL dates of all cycles of a given product.
    * @param product Product URL as per the canonical URL on the endofife.date website
    */
  def getApiProductJson(product: String): List[Cycle]
}
