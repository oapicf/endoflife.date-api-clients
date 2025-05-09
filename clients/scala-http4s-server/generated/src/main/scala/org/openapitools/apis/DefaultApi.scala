package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.Cycle


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class DefaultApiRoutes[
  F[_]: JsonDecoder: Monad
](delegate: DefaultApiDelegate[F]) extends Http4sDsl[F] {
  object getApiAll.json {
    import DefaultApiDelegate.getApiAll.jsonResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "all.json" =>
        delegate.getApiAll.json.handle(req, responses)

    }


    val responses: getApiAll.jsonResponses[F] = new getApiAll.jsonResponses[F] {
      def resp200(value: List[String]): F[Response[F]] = Ok(value)
    }
  }
  object getApiProduct.json {
    import DefaultApiDelegate.getApiProduct.jsonResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "{product}.json" =>
        delegate.getApiProduct.json.handle(req, product, responses)

    }


    val responses: getApiProduct.jsonResponses[F] = new getApiProduct.jsonResponses[F] {
      def resp200(value: List[Cycle]): F[Response[F]] = Ok(value)
    }
  }
  object getApiProductCycle.json {
    import DefaultApiDelegate.getApiProductCycle.jsonResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / product / "{cycle}.json" =>
        delegate.getApiProductCycle.json.handle(req, product, cycle, responses)

    }


    val responses: getApiProductCycle.jsonResponses[F] = new getApiProductCycle.jsonResponses[F] {
      def resp200(value: Cycle): F[Response[F]] = Ok(value)
    }
  }

  val routes =
    getApiAll.json.route <+>
    getApiProduct.json.route <+>
    getApiProductCycle.json.route
}

object DefaultApiDelegate {
  trait getApiAll.jsonResponses[F[_]] {
    def resp200(value: List[String]): F[Response[F]]
  }

  trait getApiProduct.jsonResponses[F[_]] {
    def resp200(value: List[Cycle]): F[Response[F]]
  }

  trait getApiProductCycle.jsonResponses[F[_]] {
    def resp200(value: Cycle): F[Response[F]]
  }

}

trait DefaultApiDelegate[F[_]] {

  trait getApiAll.json {
    import DefaultApiDelegate.getApiAll.jsonResponses

    def handle(
      req: Request[F],
      responses: getApiAll.jsonResponses[F]
    ): F[Response[F]]

  }
  def getApiAll.json: getApiAll.json


  trait getApiProduct.json {
    import DefaultApiDelegate.getApiProduct.jsonResponses

    def handle(
      req: Request[F],
      product: ,
      responses: getApiProduct.jsonResponses[F]
    ): F[Response[F]]

  }
  def getApiProduct.json: getApiProduct.json


  trait getApiProductCycle.json {
    import DefaultApiDelegate.getApiProductCycle.jsonResponses

    def handle(
      req: Request[F],
      product: String,
      cycle: ,
      responses: getApiProductCycle.jsonResponses[F]
    ): F[Response[F]]

  }
  def getApiProductCycle.json: getApiProductCycle.json

}