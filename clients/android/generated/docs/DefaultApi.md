# DefaultApi

All URIs are relative to *https://endoflife.date*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getApiAllJson**](DefaultApi.md#getApiAllJson) | **GET** /api/all.json | All Products
[**getApiProductCycleJson**](DefaultApi.md#getApiProductCycleJson) | **GET** /api/{product}/{cycle}.json | Single cycle details
[**getApiProductJson**](DefaultApi.md#getApiProductJson) | **GET** /api/{product}.json | Get All Details



## getApiAllJson

> OasAnyTypeNotMapped getApiAllJson()

All Products

Return a list of all products. Each of these can be used for the other API endpoints.

### Example

```java
// Import classes:
//import org.openapitools.client.api.DefaultApi;

DefaultApi apiInstance = new DefaultApi();
try {
    OasAnyTypeNotMapped result = apiInstance.getApiAllJson();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getApiAllJson");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**OasAnyTypeNotMapped**](OasAnyTypeNotMapped.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getApiProductCycleJson

> Cycle getApiProductCycleJson(product, cycle)

Single cycle details

Gets details of a single cycle

### Example

```java
// Import classes:
//import org.openapitools.client.api.DefaultApi;

DefaultApi apiInstance = new DefaultApi();
OasAnyTypeNotMapped product = null; // OasAnyTypeNotMapped | Product URL as per the canonical URL on the endofife.date website
OasAnyTypeNotMapped cycle = null; // OasAnyTypeNotMapped | Release Cycle for which the details must be fetched
try {
    Cycle result = apiInstance.getApiProductCycleJson(product, cycle);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getApiProductCycleJson");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | [**OasAnyTypeNotMapped**](.md)| Product URL as per the canonical URL on the endofife.date website | [default to null]
 **cycle** | [**OasAnyTypeNotMapped**](.md)| Release Cycle for which the details must be fetched | [default to null]

### Return type

[**Cycle**](Cycle.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getApiProductJson

> OasAnyTypeNotMapped getApiProductJson(product)

Get All Details

Get EoL dates of all cycles of a given product.

### Example

```java
// Import classes:
//import org.openapitools.client.api.DefaultApi;

DefaultApi apiInstance = new DefaultApi();
OasAnyTypeNotMapped product = null; // OasAnyTypeNotMapped | Product URL as per the canonical URL on the endofife.date website
try {
    OasAnyTypeNotMapped result = apiInstance.getApiProductJson(product);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getApiProductJson");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | [**OasAnyTypeNotMapped**](.md)| Product URL as per the canonical URL on the endofife.date website | [default to null]

### Return type

[**OasAnyTypeNotMapped**](OasAnyTypeNotMapped.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

