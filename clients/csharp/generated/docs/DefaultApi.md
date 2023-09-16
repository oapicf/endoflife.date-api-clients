# Org.OpenAPITools.Api.DefaultApi

All URIs are relative to *https://endoflife.date*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**GetApiAllJson**](DefaultApi.md#getapialljson) | **GET** /api/all.json | All Products |
| [**GetApiProductCycleJson**](DefaultApi.md#getapiproductcyclejson) | **GET** /api/{product}/{cycle}.json | Single cycle details |
| [**GetApiProductJson**](DefaultApi.md#getapiproductjson) | **GET** /api/{product}.json | Get All Details |

<a id="getapialljson"></a>
# **GetApiAllJson**
> Object GetApiAllJson ()

All Products

Return a list of all products. Each of these can be used for the other API endpoints.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetApiAllJsonExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://endoflife.date";
            var apiInstance = new DefaultApi(config);

            try
            {
                // All Products
                Object result = apiInstance.GetApiAllJson();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DefaultApi.GetApiAllJson: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetApiAllJsonWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // All Products
    ApiResponse<Object> response = apiInstance.GetApiAllJsonWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DefaultApi.GetApiAllJsonWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getapiproductcyclejson"></a>
# **GetApiProductCycleJson**
> Cycle GetApiProductCycleJson (Object product, Object cycle)

Single cycle details

Gets details of a single cycle

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetApiProductCycleJsonExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://endoflife.date";
            var apiInstance = new DefaultApi(config);
            var product = new Object(); // Object | Product URL as per the canonical URL on the endofife.date website
            var cycle = new Object(); // Object | Release Cycle for which the details must be fetched

            try
            {
                // Single cycle details
                Cycle result = apiInstance.GetApiProductCycleJson(product, cycle);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DefaultApi.GetApiProductCycleJson: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetApiProductCycleJsonWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Single cycle details
    ApiResponse<Cycle> response = apiInstance.GetApiProductCycleJsonWithHttpInfo(product, cycle);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DefaultApi.GetApiProductCycleJsonWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **product** | [**Object**](Object.md) | Product URL as per the canonical URL on the endofife.date website |  |
| **cycle** | [**Object**](Object.md) | Release Cycle for which the details must be fetched |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getapiproductjson"></a>
# **GetApiProductJson**
> Object GetApiProductJson (Object product)

Get All Details

Get EoL dates of all cycles of a given product.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetApiProductJsonExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://endoflife.date";
            var apiInstance = new DefaultApi(config);
            var product = new Object(); // Object | Product URL as per the canonical URL on the endofife.date website

            try
            {
                // Get All Details
                Object result = apiInstance.GetApiProductJson(product);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DefaultApi.GetApiProductJson: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetApiProductJsonWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get All Details
    ApiResponse<Object> response = apiInstance.GetApiProductJsonWithHttpInfo(product);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DefaultApi.GetApiProductJsonWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **product** | [**Object**](Object.md) | Product URL as per the canonical URL on the endofife.date website |  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

