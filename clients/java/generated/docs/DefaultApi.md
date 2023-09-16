# DefaultApi

All URIs are relative to *https://endoflife.date*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getApiAllJson**](DefaultApi.md#getApiAllJson) | **GET** /api/all.json | All Products |
| [**getApiProductCycleJson**](DefaultApi.md#getApiProductCycleJson) | **GET** /api/{product}/{cycle}.json | Single cycle details |
| [**getApiProductJson**](DefaultApi.md#getApiProductJson) | **GET** /api/{product}.json | Get All Details |


<a id="getApiAllJson"></a>
# **getApiAllJson**
> Object getApiAllJson()

All Products

Return a list of all products. Each of these can be used for the other API endpoints.

### Example
```java
// Import classes:
import com.cliffano.endoflifedate.ApiClient;
import com.cliffano.endoflifedate.ApiException;
import com.cliffano.endoflifedate.Configuration;
import com.cliffano.endoflifedate.models.*;
import com.cliffano.endoflifedate.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://endoflife.date");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      Object result = apiInstance.getApiAllJson();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getApiAllJson");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
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

<a id="getApiProductCycleJson"></a>
# **getApiProductCycleJson**
> Cycle getApiProductCycleJson(product, cycle)

Single cycle details

Gets details of a single cycle

### Example
```java
// Import classes:
import com.cliffano.endoflifedate.ApiClient;
import com.cliffano.endoflifedate.ApiException;
import com.cliffano.endoflifedate.Configuration;
import com.cliffano.endoflifedate.models.*;
import com.cliffano.endoflifedate.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://endoflife.date");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Object product = null; // Object | Product URL as per the canonical URL on the endofife.date website
    Object cycle = null; // Object | Release Cycle for which the details must be fetched
    try {
      Cycle result = apiInstance.getApiProductCycleJson(product, cycle);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getApiProductCycleJson");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **product** | [**Object**](.md)| Product URL as per the canonical URL on the endofife.date website | |
| **cycle** | [**Object**](.md)| Release Cycle for which the details must be fetched | |

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

<a id="getApiProductJson"></a>
# **getApiProductJson**
> Object getApiProductJson(product)

Get All Details

Get EoL dates of all cycles of a given product.

### Example
```java
// Import classes:
import com.cliffano.endoflifedate.ApiClient;
import com.cliffano.endoflifedate.ApiException;
import com.cliffano.endoflifedate.Configuration;
import com.cliffano.endoflifedate.models.*;
import com.cliffano.endoflifedate.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://endoflife.date");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Object product = null; // Object | Product URL as per the canonical URL on the endofife.date website
    try {
      Object result = apiInstance.getApiProductJson(product);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getApiProductJson");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **product** | [**Object**](.md)| Product URL as per the canonical URL on the endofife.date website | |

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

