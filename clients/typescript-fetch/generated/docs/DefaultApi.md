# DefaultApi

All URIs are relative to *https://endoflife.date*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getApiAllJson**](DefaultApi.md#getapialljson) | **GET** /api/all.json | All Products |
| [**getApiProductCycleJson**](DefaultApi.md#getapiproductcyclejson) | **GET** /api/{product}/{cycle}.json | Single cycle details |
| [**getApiProductJson**](DefaultApi.md#getapiproductjson) | **GET** /api/{product}.json | Get All Details |



## getApiAllJson

> Array&lt;string&gt; getApiAllJson()

All Products

Return a list of all products. Each of these can be used for the other API endpoints.

### Example

```ts
import {
  Configuration,
  DefaultApi,
} from '';
import type { GetApiAllJsonRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new DefaultApi();

  try {
    const data = await api.getApiAllJson();
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters

This endpoint does not need any parameter.

### Return type

**Array<string>**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## getApiProductCycleJson

> Cycle getApiProductCycleJson(product, cycle)

Single cycle details

Gets details of a single cycle.

### Example

```ts
import {
  Configuration,
  DefaultApi,
} from '';
import type { GetApiProductCycleJsonRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new DefaultApi();

  const body = {
    // string | Product URL as per the canonical URL on the endofife.date website.
    product: product_example,
    // string | Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD\'s releng/14.0 becomes releng-14.0.
    cycle: cycle_example,
  } satisfies GetApiProductCycleJsonRequest;

  try {
    const data = await api.getApiProductCycleJson(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **product** | `string` | Product URL as per the canonical URL on the endofife.date website. | [Defaults to `undefined`] |
| **cycle** | `string` | Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD\&#39;s releng/14.0 becomes releng-14.0. | [Defaults to `undefined`] |

### Return type

[**Cycle**](Cycle.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## getApiProductJson

> Array&lt;Cycle&gt; getApiProductJson(product)

Get All Details

Get EoL dates of all cycles of a given product.

### Example

```ts
import {
  Configuration,
  DefaultApi,
} from '';
import type { GetApiProductJsonRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new DefaultApi();

  const body = {
    // string | Product URL as per the canonical URL on the endofife.date website.
    product: product_example,
  } satisfies GetApiProductJsonRequest;

  try {
    const data = await api.getApiProductJson(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **product** | `string` | Product URL as per the canonical URL on the endofife.date website. | [Defaults to `undefined`] |

### Return type

[**Array&lt;Cycle&gt;**](Cycle.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

