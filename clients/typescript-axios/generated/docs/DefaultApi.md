# DefaultApi

All URIs are relative to *https://endoflife.date*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**getApiAllJson**](#getapialljson) | **GET** /api/all.json | All Products|
|[**getApiProductCycleJson**](#getapiproductcyclejson) | **GET** /api/{product}/{cycle}.json | Single cycle details|
|[**getApiProductJson**](#getapiproductjson) | **GET** /api/{product}.json | Get All Details|

# **getApiAllJson**
> Array<string> getApiAllJson()

Return a list of all products. Each of these can be used for the other API endpoints.

### Example

```typescript
import {
    DefaultApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new DefaultApi(configuration);

const { status, data } = await apiInstance.getApiAllJson();
```

### Parameters
This endpoint does not have any parameters.


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
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getApiProductCycleJson**
> Cycle getApiProductCycleJson()

Gets details of a single cycle.

### Example

```typescript
import {
    DefaultApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new DefaultApi(configuration);

let product: string; //Product URL as per the canonical URL on the endofife.date website. (default to undefined)
let cycle: string; //Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD\'s releng/14.0 becomes releng-14.0. (default to undefined)

const { status, data } = await apiInstance.getApiProductCycleJson(
    product,
    cycle
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **product** | [**string**] | Product URL as per the canonical URL on the endofife.date website. | defaults to undefined|
| **cycle** | [**string**] | Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD\&#39;s releng/14.0 becomes releng-14.0. | defaults to undefined|


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
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getApiProductJson**
> Array<Cycle> getApiProductJson()

Get EoL dates of all cycles of a given product.

### Example

```typescript
import {
    DefaultApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new DefaultApi(configuration);

let product: string; //Product URL as per the canonical URL on the endofife.date website. (default to undefined)

const { status, data } = await apiInstance.getApiProductJson(
    product
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **product** | [**string**] | Product URL as per the canonical URL on the endofife.date website. | defaults to undefined|


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
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

