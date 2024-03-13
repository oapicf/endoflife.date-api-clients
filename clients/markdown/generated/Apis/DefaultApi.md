# DefaultApi

All URIs are relative to *https://endoflife.date*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getApiAll.json**](DefaultApi.md#getApiAll.json) | **GET** /api/all.json | All Products |
| [**getApiProduct.json**](DefaultApi.md#getApiProduct.json) | **GET** /api/{product}.json | Get All Details |
| [**getApiProductCycle.json**](DefaultApi.md#getApiProductCycle.json) | **GET** /api/{product}/{cycle}.json | Single cycle details |


<a name="getApiAll.json"></a>
# **getApiAll.json**
> List getApiAll.json()

All Products

    Return a list of all products. Each of these can be used for the other API endpoints.

### Parameters
This endpoint does not need any parameter.

### Return type

**List**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getApiProduct.json"></a>
# **getApiProduct.json**
> List getApiProduct.json(product)

Get All Details

    Get EoL dates of all cycles of a given product.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **product** | **String**| Product URL as per the canonical URL on the endofife.date website | [default to null] |

### Return type

[**List**](../Models/cycle.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getApiProductCycle.json"></a>
# **getApiProductCycle.json**
> cycle getApiProductCycle.json(product, cycle)

Single cycle details

    Gets details of a single cycle

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **product** | **String**| Product URL as per the canonical URL on the endofife.date website | [default to null] |
| **cycle** | **String**| Release Cycle for which the details must be fetched | [default to null] |

### Return type

[**cycle**](../Models/cycle.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

