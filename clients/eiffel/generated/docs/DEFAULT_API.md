# DEFAULT_API

All URIs are relative to *https://endoflife.date*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**api_all_json**](DEFAULT_API.md#api_all_json) | **Get** /api/all.json | All Products
[**api_product_cycle_json**](DEFAULT_API.md#api_product_cycle_json) | **Get** /api/{product}/{cycle}.json | Single cycle details
[**api_product_json**](DEFAULT_API.md#api_product_json) | **Get** /api/{product}.json | Get All Details


# **api_all_json**
> api_all_json : detachable LIST [STRING_32]


All Products

Return a list of all products. Each of these can be used for the other API endpoints.


### Parameters
This endpoint does not need any parameter.

### Return type

[**LIST [STRING_32]**](STRING_32.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_product_cycle_json**
> api_product_cycle_json (product: STRING_32 ; cycle: STRING_32 ): detachable CYCLE


Single cycle details

Gets details of a single cycle


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | **STRING_32**| Product URL as per the canonical URL on the endofife.date website | [default to null]
 **cycle** | **STRING_32**| Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD&#39;s releng/14.0 becomes releng-14.0. | [default to null]

### Return type

[**CYCLE**](cycle.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **api_product_json**
> api_product_json (product: STRING_32 ): detachable LIST [CYCLE]


Get All Details

Get EoL dates of all cycles of a given product.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | **STRING_32**| Product URL as per the canonical URL on the endofife.date website | [default to null]

### Return type

[**LIST [CYCLE]**](cycle.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

