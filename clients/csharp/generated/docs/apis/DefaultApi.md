# Org.OpenAPITools.Api.DefaultApi

All URIs are relative to *https://endoflife.date*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**GetApiAllJson**](DefaultApi.md#getapialljson) | **GET** /api/all.json | All Products |
| [**GetApiProductCycleJson**](DefaultApi.md#getapiproductcyclejson) | **GET** /api/{product}/{cycle}.json | Single cycle details |
| [**GetApiProductJson**](DefaultApi.md#getapiproductjson) | **GET** /api/{product}.json | Get All Details |

<a id="getapialljson"></a>
# **GetApiAllJson**
> List&lt;string&gt; GetApiAllJson ()

All Products

Return a list of all products. Each of these can be used for the other API endpoints.


### Parameters
This endpoint does not need any parameter.
### Return type

**List<string>**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="getapiproductcyclejson"></a>
# **GetApiProductCycleJson**
> Cycle GetApiProductCycleJson (string product, string cycle)

Single cycle details

Gets details of a single cycle.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **product** | **string** | Product URL as per the canonical URL on the endofife.date website. |  |
| **cycle** | **string** | Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD&#39;s releng/14.0 becomes releng-14.0. |  |

### Return type

[**Cycle**](Cycle.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="getapiproductjson"></a>
# **GetApiProductJson**
> List&lt;Cycle&gt; GetApiProductJson (string product)

Get All Details

Get EoL dates of all cycles of a given product.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **product** | **string** | Product URL as per the canonical URL on the endofife.date website. |  |

### Return type

[**List&lt;Cycle&gt;**](Cycle.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

