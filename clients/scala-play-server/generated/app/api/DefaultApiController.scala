package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Cycle

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-10T09:11:31.374855606Z[Etc/UTC]", comments = "Generator version: 7.6.0")
@Singleton
class DefaultApiController @Inject()(cc: ControllerComponents, api: DefaultApi) extends AbstractController(cc) {
  /**
    * GET /api/all.json
    */
  def getApiAllJson(): Action[AnyContent] = Action { request =>
    def executeApi(): List[String] = {
      api.getApiAllJson()
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:product/:cycle.json
    * @param product Product URL as per the canonical URL on the endofife.date website
    * @param cycle Release Cycle for which the details must be fetched
    */
  def getApiProductCycleJson(product: String, cycle: String): Action[AnyContent] = Action { request =>
    def executeApi(): Cycle = {
      api.getApiProductCycleJson(product, cycle)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:product.json
    * @param product Product URL as per the canonical URL on the endofife.date website
    */
  def getApiProductJson(product: String): Action[AnyContent] = Action { request =>
    def executeApi(): List[Cycle] = {
      api.getApiProductJson(product)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  private def splitCollectionParam(paramValues: String, collectionFormat: String): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv" => ",+"
        case "tsv" => "\t+"
        case "ssv" => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}
