# \DefaultApi

All URIs are relative to *https://endoflife.date*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_api_all_period_json**](DefaultApi.md#get_api_all_period_json) | **GET** /api/all.json | All Products
[**get_api_product_cycle_period_json**](DefaultApi.md#get_api_product_cycle_period_json) | **GET** /api/{product}/{cycle}.json | Single cycle details
[**get_api_product_period_json**](DefaultApi.md#get_api_product_period_json) | **GET** /api/{product}.json | Get All Details



## get_api_all_period_json

> Vec<String> get_api_all_period_json()
All Products

Return a list of all products. Each of these can be used for the other API endpoints.

### Parameters

This endpoint does not need any parameter.

### Return type

**Vec<String>**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_api_product_cycle_period_json

> models::Cycle get_api_product_cycle_period_json(product, cycle)
Single cycle details

Gets details of a single cycle

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**product** | **String** | Product URL as per the canonical URL on the endofife.date website | [required] |
**cycle** | **String** | Release Cycle for which the details must be fetched | [required] |

### Return type

[**models::Cycle**](cycle.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_api_product_period_json

> Vec<models::Cycle> get_api_product_period_json(product)
Get All Details

Get EoL dates of all cycles of a given product.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**product** | **String** | Product URL as per the canonical URL on the endofife.date website | [required] |

### Return type

[**Vec<models::Cycle>**](cycle.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

