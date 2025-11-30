# .DefaultApi

All URIs are relative to *https://endoflife.date*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getApiAllJson**](DefaultApi.md#getApiAllJson) | **GET** /api/all.json | All Products
[**getApiProductCycleJson**](DefaultApi.md#getApiProductCycleJson) | **GET** /api/{product}/{cycle}.json | Single cycle details
[**getApiProductJson**](DefaultApi.md#getApiProductJson) | **GET** /api/{product}.json | Get All Details


# **getApiAllJson**
> Array<string> getApiAllJson()

Return a list of all products. Each of these can be used for the other API endpoints.

### Example


```typescript
import { createConfiguration, DefaultApi } from '';

const configuration = createConfiguration();
const apiInstance = new DefaultApi(configuration);

const request = {};

const data = await apiInstance.getApiAllJson(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Array<string>**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getApiProductCycleJson**
> Cycle getApiProductCycleJson()

Gets details of a single cycle.

### Example


```typescript
import { createConfiguration, DefaultApi } from '';
import type { DefaultApiGetApiProductCycleJsonRequest } from '';

const configuration = createConfiguration();
const apiInstance = new DefaultApi(configuration);

const request: DefaultApiGetApiProductCycleJsonRequest = {
    // Product URL as per the canonical URL on the endofife.date website.
  product: "product_example",
    // Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD\'s releng/14.0 becomes releng-14.0.
  cycle: "cycle_example",
};

const data = await apiInstance.getApiProductCycleJson(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | [**string**] | Product URL as per the canonical URL on the endofife.date website. | defaults to undefined
 **cycle** | [**string**] | Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD\&#39;s releng/14.0 becomes releng-14.0. | defaults to undefined


### Return type

**Cycle**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getApiProductJson**
> Array<Cycle> getApiProductJson()

Get EoL dates of all cycles of a given product.

### Example


```typescript
import { createConfiguration, DefaultApi } from '';
import type { DefaultApiGetApiProductJsonRequest } from '';

const configuration = createConfiguration();
const apiInstance = new DefaultApi(configuration);

const request: DefaultApiGetApiProductJsonRequest = {
    // Product URL as per the canonical URL on the endofife.date website.
  product: "product_example",
};

const data = await apiInstance.getApiProductJson(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | [**string**] | Product URL as per the canonical URL on the endofife.date website. | defaults to undefined


### Return type

**Array<Cycle>**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


