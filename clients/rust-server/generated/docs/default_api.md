# default_api

All URIs are relative to *https://endoflife.date*

Method | HTTP request | Description
------------- | ------------- | -------------
**get-api-all.json**](default_api.md#get-api-all.json) | **GET** /api/all.json | All Products
**get-api-:product-:cycle.json**](default_api.md#get-api-:product-:cycle.json) | **GET** /api/{product}/{cycle}.json | Single cycle details
**get-api-:product.json**](default_api.md#get-api-:product.json) | **GET** /api/{product}.json | Get All Details


# **get-api-all.json**
> serde_json::Value get-api-all.json()
All Products

Return a list of all products. Each of these can be used for the other API endpoints.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**serde_json::Value**](AnyType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get-api-:product-:cycle.json**
> models::Cycle get-api-:product-:cycle.json(product, cycle)
Single cycle details

Gets details of a single cycle

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **product** | [****](.md)| Product URL as per the canonical URL on the endofife.date website | 
  **cycle** | [****](.md)| Release Cycle for which the details must be fetched | 

### Return type

[**models::Cycle**](cycle.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get-api-:product.json**
> serde_json::Value get-api-:product.json(product)
Get All Details

Get EoL dates of all cycles of a given product.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **product** | [****](.md)| Product URL as per the canonical URL on the endofife.date website | 

### Return type

[**serde_json::Value**](AnyType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

