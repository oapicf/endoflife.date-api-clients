# DefaultApi

All URIs are relative to *https://endoflife.date*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_api_all_json**](DefaultApi.md#get_api_all_json) | **GET** /api/all.json | All Products
[**get_api_product_cycle_json**](DefaultApi.md#get_api_product_cycle_json) | **GET** /api/{product}/{cycle}.json | Single cycle details
[**get_api_product_json**](DefaultApi.md#get_api_product_json) | **GET** /api/{product}.json | Get All Details


# **get_api_all_json**
> get_api_all_json(_api::DefaultApi; _mediaType=nothing) -> Vector{String}, OpenAPI.Clients.ApiResponse <br/>
> get_api_all_json(_api::DefaultApi, response_stream::Channel; _mediaType=nothing) -> Channel{ Vector{String} }, OpenAPI.Clients.ApiResponse

All Products

Return a list of all products. Each of these can be used for the other API endpoints.

### Required Parameters
This endpoint does not need any parameter.

### Return type

**Vector{String}**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **get_api_product_cycle_json**
> get_api_product_cycle_json(_api::DefaultApi, product::String, cycle::String; _mediaType=nothing) -> Cycle, OpenAPI.Clients.ApiResponse <br/>
> get_api_product_cycle_json(_api::DefaultApi, response_stream::Channel, product::String, cycle::String; _mediaType=nothing) -> Channel{ Cycle }, OpenAPI.Clients.ApiResponse

Single cycle details

Gets details of a single cycle.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**product** | **String** | Product URL as per the canonical URL on the endofife.date website. |
**cycle** | **String** | Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD&#39;s releng/14.0 becomes releng-14.0. |

### Return type

[**Cycle**](Cycle.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **get_api_product_json**
> get_api_product_json(_api::DefaultApi, product::String; _mediaType=nothing) -> Vector{Cycle}, OpenAPI.Clients.ApiResponse <br/>
> get_api_product_json(_api::DefaultApi, response_stream::Channel, product::String; _mediaType=nothing) -> Channel{ Vector{Cycle} }, OpenAPI.Clients.ApiResponse

Get All Details

Get EoL dates of all cycles of a given product.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**product** | **String** | Product URL as per the canonical URL on the endofife.date website. |

### Return type

[**Vector{Cycle}**](Cycle.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

