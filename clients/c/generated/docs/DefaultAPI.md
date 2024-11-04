# DefaultAPI

All URIs are relative to *https://endoflife.date*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DefaultAPI_getApiAllJson**](DefaultAPI.md#DefaultAPI_getApiAllJson) | **GET** /api/all.json | All Products
[**DefaultAPI_getApiProductCycleJson**](DefaultAPI.md#DefaultAPI_getApiProductCycleJson) | **GET** /api/{product}/{cycle}.json | Single cycle details
[**DefaultAPI_getApiProductJson**](DefaultAPI.md#DefaultAPI_getApiProductJson) | **GET** /api/{product}.json | Get All Details


# **DefaultAPI_getApiAllJson**
```c
// All Products
//
// Return a list of all products. Each of these can be used for the other API endpoints.
//
list_t* DefaultAPI_getApiAllJson(apiClient_t *apiClient);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |

### Return type


[list_t](char.md) *




### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_getApiProductCycleJson**
```c
// Single cycle details
//
// Gets details of a single cycle
//
cycle_t* DefaultAPI_getApiProductCycleJson(apiClient_t *apiClient, char *product, char *cycle);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**product** | **char \*** | Product URL as per the canonical URL on the endofife.date website | 
**cycle** | **char \*** | Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD&#39;s releng/14.0 becomes releng-14.0. | 

### Return type

[cycle_t](cycle.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DefaultAPI_getApiProductJson**
```c
// Get All Details
//
// Get EoL dates of all cycles of a given product.
//
list_t* DefaultAPI_getApiProductJson(apiClient_t *apiClient, char *product);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**product** | **char \*** | Product URL as per the canonical URL on the endofife.date website | 

### Return type

[list_t](cycle.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

