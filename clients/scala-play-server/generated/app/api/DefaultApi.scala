package api

import play.api.libs.json._
import model.Cycle
import model.OasAnyTypeNotMapped

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2023-09-16T14:49:07.439280Z[Etc/UTC]")
trait DefaultApi {
  /**
    * All Products
    * Return a list of all products. Each of these can be used for the other API endpoints.
    */
  def getApiAllJson(): OasAnyTypeNotMapped

  /**
    * Single cycle details
    * Gets details of a single cycle
    * @param product Product URL as per the canonical URL on the endofife.date website
    * @param cycle Release Cycle for which the details must be fetched
    */
  def getApiProductCycleJson(product: OasAnyTypeNotMapped, cycle: OasAnyTypeNotMapped): Cycle

  /**
    * Get All Details
    * Get EoL dates of all cycles of a given product.
    * @param product Product URL as per the canonical URL on the endofife.date website
    */
  def getApiProductJson(product: OasAnyTypeNotMapped): OasAnyTypeNotMapped
}
