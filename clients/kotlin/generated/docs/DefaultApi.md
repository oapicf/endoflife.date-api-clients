# DefaultApi

All URIs are relative to *https://endoflife.date*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getApiAllJson**](DefaultApi.md#getApiAllJson) | **GET** /api/all.json | All Products |
| [**getApiProductCycleJson**](DefaultApi.md#getApiProductCycleJson) | **GET** /api/{product}/{cycle}.json | Single cycle details |
| [**getApiProductJson**](DefaultApi.md#getApiProductJson) | **GET** /api/{product}.json | Get All Details |


<a id="getApiAllJson"></a>
# **getApiAllJson**
> kotlin.collections.List&lt;kotlin.String&gt; getApiAllJson()

All Products

Return a list of all products. Each of these can be used for the other API endpoints.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
try {
    val result : kotlin.collections.List<kotlin.String> = apiInstance.getApiAllJson()
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

**kotlin.collections.List&lt;kotlin.String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getApiProductCycleJson"></a>
# **getApiProductCycleJson**
> Cycle getApiProductCycleJson(product, cycle)

Single cycle details

Gets details of a single cycle.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val product : kotlin.String = product_example // kotlin.String | Product URL as per the canonical URL on the endofife.date website.
val cycle : kotlin.String = cycle_example // kotlin.String | Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD's releng/14.0 becomes releng-14.0.
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
| **product** | **kotlin.String**| Product URL as per the canonical URL on the endofife.date website. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cycle** | **kotlin.String**| Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD&#39;s releng/14.0 becomes releng-14.0. | |

### Return type

[**Cycle**](Cycle.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getApiProductJson"></a>
# **getApiProductJson**
> kotlin.collections.List&lt;Cycle&gt; getApiProductJson(product)

Get All Details

Get EoL dates of all cycles of a given product.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val product : kotlin.String = product_example // kotlin.String | Product URL as per the canonical URL on the endofife.date website.
try {
    val result : kotlin.collections.List<Cycle> = apiInstance.getApiProductJson(product)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **product** | **kotlin.String**| Product URL as per the canonical URL on the endofife.date website. | |

### Return type

[**kotlin.collections.List&lt;Cycle&gt;**](Cycle.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

