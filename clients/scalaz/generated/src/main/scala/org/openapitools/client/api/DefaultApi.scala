package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import java.io.File
import java.net.URLEncoder
import java.util.UUID

import org.http4s._
import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.http4s.client._
import org.http4s.client.blaze.PooledHttp1Client
import org.http4s.headers._

import org.joda.time.DateTime

import scalaz.concurrent.Task

import HelperCodecs._

import org.openapitools.client.api.AnyType
import org.openapitools.client.api.Cycle

object DefaultApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getApiAllJson(host: String): Task[AnyType] = {
    implicit val returnTypeDecoder: EntityDecoder[AnyType] = jsonOf[AnyType]

    val path = "/api/all.json"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AnyType](req)

    } yield resp
  }

  def getApiProductCycleJson(host: String, product: AnyType, cycle: AnyType): Task[Cycle] = {
    implicit val returnTypeDecoder: EntityDecoder[Cycle] = jsonOf[Cycle]

    val path = "/api/{product}/{cycle}.json".replaceAll("\\{" + "product" + "\\}",escape(product.toString)).replaceAll("\\{" + "cycle" + "\\}",escape(cycle.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Cycle](req)

    } yield resp
  }

  def getApiProductJson(host: String, product: AnyType): Task[AnyType] = {
    implicit val returnTypeDecoder: EntityDecoder[AnyType] = jsonOf[AnyType]

    val path = "/api/{product}.json".replaceAll("\\{" + "product" + "\\}",escape(product.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AnyType](req)

    } yield resp
  }

}

class HttpServiceDefaultApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getApiAllJson(): Task[AnyType] = {
    implicit val returnTypeDecoder: EntityDecoder[AnyType] = jsonOf[AnyType]

    val path = "/api/all.json"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AnyType](req)

    } yield resp
  }

  def getApiProductCycleJson(product: AnyType, cycle: AnyType): Task[Cycle] = {
    implicit val returnTypeDecoder: EntityDecoder[Cycle] = jsonOf[Cycle]

    val path = "/api/{product}/{cycle}.json".replaceAll("\\{" + "product" + "\\}",escape(product.toString)).replaceAll("\\{" + "cycle" + "\\}",escape(cycle.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[Cycle](req)

    } yield resp
  }

  def getApiProductJson(product: AnyType): Task[AnyType] = {
    implicit val returnTypeDecoder: EntityDecoder[AnyType] = jsonOf[AnyType]

    val path = "/api/{product}.json".replaceAll("\\{" + "product" + "\\}",escape(product.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AnyType](req)

    } yield resp
  }

}
