# DefaultApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**getApiAllJson**](DefaultApi.md#getApiAllJson) | **GET** /api/all.json | All Products
[**getApiProductCycleJson**](DefaultApi.md#getApiProductCycleJson) | **GET** /api/{product}/{cycle}.json | Single cycle details
[**getApiProductJson**](DefaultApi.md#getApiProductJson) | **GET** /api/{product}.json | Get All Details



## getApiAllJson

All Products

Return a list of all products. Each of these can be used for the other API endpoints.

### Example

```bash
 getApiAllJson
```

### Parameters

This endpoint does not need any parameter.

### Return type

**array[string]**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getApiProductCycleJson

Single cycle details

Gets details of a single cycle

### Example

```bash
 getApiProductCycleJson product=value cycle=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | **string** | Product URL as per the canonical URL on the endofife.date website | [default to null]
 **cycle** | **string** | Release Cycle for which the details must be fetched | [default to null]

### Return type

[**Cycle**](Cycle.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getApiProductJson

Get All Details

Get EoL dates of all cycles of a given product.

### Example

```bash
 getApiProductJson product=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | **string** | Product URL as per the canonical URL on the endofife.date website | [default to null]

### Return type

[**array[Cycle]**](Cycle.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

