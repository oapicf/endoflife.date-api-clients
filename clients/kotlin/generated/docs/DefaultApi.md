# DefaultApi

All URIs are relative to *https://endoflife.date*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getApiAllJson**](DefaultApi.md#getApiAllJson) | **GET** /api/all.json | All Products
[**getApiProductCycleJson**](DefaultApi.md#getApiProductCycleJson) | **GET** /api/{product}/{cycle}.json | Single cycle details
[**getApiProductJson**](DefaultApi.md#getApiProductJson) | **GET** /api/{product}.json | Get All Details


<a id="getApiAllJson"></a>
# **getApiAllJson**
> kotlin.Any getApiAllJson()

All Products

Return a list of all products. Each of these can be used for the other API endpoints.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
try {
    val result : kotlin.Any = apiInstance.getApiAllJson()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getApiAllJson")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getApiAllJson")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getApiProductCycleJson"></a>
# **getApiProductCycleJson**
> Cycle getApiProductCycleJson(product, cycle)

Single cycle details

Gets details of a single cycle

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val product : kotlin.Any =  // kotlin.Any | Product URL as per the canonical URL on the endofife.date website
val cycle : kotlin.Any =  // kotlin.Any | Release Cycle for which the details must be fetched
try {
    val result : Cycle = apiInstance.getApiProductCycleJson(product, cycle)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getApiProductCycleJson")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getApiProductCycleJson")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | [**kotlin.Any**](.md)| Product URL as per the canonical URL on the endofife.date website |
 **cycle** | [**kotlin.Any**](.md)| Release Cycle for which the details must be fetched |

### Return type

[**Cycle**](Cycle.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getApiProductJson"></a>
# **getApiProductJson**
> kotlin.Any getApiProductJson(product)

Get All Details

Get EoL dates of all cycles of a given product.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val product : kotlin.Any =  // kotlin.Any | Product URL as per the canonical URL on the endofife.date website
try {
    val result : kotlin.Any = apiInstance.getApiProductJson(product)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getApiProductJson")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getApiProductJson")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | [**kotlin.Any**](.md)| Product URL as per the canonical URL on the endofife.date website |

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

