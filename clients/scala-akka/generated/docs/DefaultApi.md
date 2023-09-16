# DefaultApi

All URIs are relative to *https://endoflife.date*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getApiAllJson**](DefaultApi.md#getApiAllJson) | **GET** /api/all.json | All Products
[**getApiAllJsonWithHttpInfo**](DefaultApi.md#getApiAllJsonWithHttpInfo) | **GET** /api/all.json | All Products
[**getApiProductCycleJson**](DefaultApi.md#getApiProductCycleJson) | **GET** /api/{product}/{cycle}.json | Single cycle details
[**getApiProductCycleJsonWithHttpInfo**](DefaultApi.md#getApiProductCycleJsonWithHttpInfo) | **GET** /api/{product}/{cycle}.json | Single cycle details
[**getApiProductJson**](DefaultApi.md#getApiProductJson) | **GET** /api/{product}.json | Get All Details
[**getApiProductJsonWithHttpInfo**](DefaultApi.md#getApiProductJsonWithHttpInfo) | **GET** /api/{product}.json | Get All Details



## getApiAllJson

> getApiAllJson(): ApiRequest[AnyType]

All Products

Return a list of all products. Each of these can be used for the other API endpoints.

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher

    val apiInvoker = ApiInvoker()
    val apiInstance = DefaultApi("https://endoflife.date")    
    val request = apiInstance.getApiAllJson()
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling DefaultApi#getApiAllJson")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling DefaultApi#getApiAllJson")
            exception.printStackTrace();
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiRequest[[**AnyType**](AnyType.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getApiProductCycleJson

> getApiProductCycleJson(getApiProductCycleJsonRequest): ApiRequest[Cycle]

Single cycle details

Gets details of a single cycle

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher

    val apiInvoker = ApiInvoker()
    val apiInstance = DefaultApi("https://endoflife.date")
    val product: AnyType =  // AnyType | Product URL as per the canonical URL on the endofife.date website

    val cycle: AnyType =  // AnyType | Release Cycle for which the details must be fetched
    
    val request = apiInstance.getApiProductCycleJson(product, cycle)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling DefaultApi#getApiProductCycleJson")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling DefaultApi#getApiProductCycleJson")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | [**AnyType**](.md)| Product URL as per the canonical URL on the endofife.date website |
 **cycle** | [**AnyType**](.md)| Release Cycle for which the details must be fetched |

### Return type

ApiRequest[[**Cycle**](Cycle.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getApiProductJson

> getApiProductJson(getApiProductJsonRequest): ApiRequest[AnyType]

Get All Details

Get EoL dates of all cycles of a given product.

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher

    val apiInvoker = ApiInvoker()
    val apiInstance = DefaultApi("https://endoflife.date")
    val product: AnyType =  // AnyType | Product URL as per the canonical URL on the endofife.date website
    
    val request = apiInstance.getApiProductJson(product)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling DefaultApi#getApiProductJson")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling DefaultApi#getApiProductJson")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | [**AnyType**](.md)| Product URL as per the canonical URL on the endofife.date website |

### Return type

ApiRequest[[**AnyType**](AnyType.md)]


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

