package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.Cycle


class DefaultApi(
    defaultService: DefaultApiService,
    defaultMarshaller: DefaultApiMarshaller
) {

  
  import defaultMarshaller._

  lazy val route: Route =
    path("api" / "all.json") { 
      get {  
            defaultService.getApiAllJson()
      }
    } ~
    path("api" / Segment / "{cycle}.json") { (product, cycle) => 
      get {  
            defaultService.getApiProductCycleJson(product = product, cycle = cycle)
      }
    } ~
    path("api" / "{product}.json") { (product) => 
      get {  
            defaultService.getApiProductJson(product = product)
      }
    }
}


trait DefaultApiService {

  def getApiAllJson200(responseStringarray: Seq[String])(implicit toEntityMarshallerStringarray: ToEntityMarshaller[Seq[String]]): Route =
    complete((200, responseStringarray))
  /**
   * Code: 200, Message: OK, DataType: Seq[String]
   */
  def getApiAllJson(): Route

  def getApiProductCycleJson200(responseCycle: Cycle)(implicit toEntityMarshallerCycle: ToEntityMarshaller[Cycle]): Route =
    complete((200, responseCycle))
  /**
   * Code: 200, Message: OK, DataType: Cycle
   */
  def getApiProductCycleJson(product: String, cycle: String)
      (implicit toEntityMarshallerCycle: ToEntityMarshaller[Cycle]): Route

  def getApiProductJson200(responseCyclearray: Seq[Cycle])(implicit toEntityMarshallerCyclearray: ToEntityMarshaller[Seq[Cycle]]): Route =
    complete((200, responseCyclearray))
  /**
   * Code: 200, Message: OK, DataType: Seq[Cycle]
   */
  def getApiProductJson(product: String)
      (implicit toEntityMarshallerCyclearray: ToEntityMarshaller[Seq[Cycle]]): Route

}

trait DefaultApiMarshaller {


  implicit def toEntityMarshallerCycle: ToEntityMarshaller[Cycle]

  implicit def toEntityMarshallerCyclearray: ToEntityMarshaller[Seq[Cycle]]

}

