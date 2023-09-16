# DEFAULT_API

All URIs are relative to *https://endoflife.date*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**api_all_json**](DEFAULT_API.md#api_all_json) | **Get** /api/all.json | All Products
[**api_product_cycle_json**](DEFAULT_API.md#api_product_cycle_json) | **Get** /api/{product}/{cycle}.json | Single cycle details
[**api_product_json**](DEFAULT_API.md#api_product_json) | **Get** /api/{product}.json | Get All Details


# **api_all_json**
> api_all_json : detachable ANY


All Products

Return a list of all products. Each of these can be used for the other API endpoints.


### Parameters
This endpoint does not need any parameter.

### Return type

[**ANY**](ANY.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_product_cycle_json**
> api_product_cycle_json (product: ANY ; cycle: ANY ): detachable CYCLE


Single cycle details

Gets details of a single cycle


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | [**ANY**](.md)| Product URL as per the canonical URL on the endofife.date website | [default to null]
 **cycle** | [**ANY**](.md)| Release Cycle for which the details must be fetched | [default to null]

### Return type

[**CYCLE**](cycle.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_product_json**
> api_product_json (product: ANY ): detachable ANY


Get All Details

Get EoL dates of all cycles of a given product.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | [**ANY**](.md)| Product URL as per the canonical URL on the endofife.date website | [default to null]

### Return type

[**ANY**](ANY.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

