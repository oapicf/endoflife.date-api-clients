# DefaultApi

All URIs are relative to *https://endoflife.date*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getApiAllJson**](DefaultApi.md#getApiAllJson) | **GET** /api/all.json | All Products |
| [**getApiProductCycleJson**](DefaultApi.md#getApiProductCycleJson) | **GET** /api/{product}/{cycle}.json | Single cycle details |
| [**getApiProductJson**](DefaultApi.md#getApiProductJson) | **GET** /api/{product}.json | Get All Details |


<a id="getApiAllJson"></a>
# **getApiAllJson**
> List&lt;String&gt; getApiAllJson()

All Products

Return a list of all products. Each of these can be used for the other API endpoints.

### Example
```java
// Import classes:
import com.github.oapicf.endoflifedate.ApiClient;
import com.github.oapicf.endoflifedate.ApiException;
import com.github.oapicf.endoflifedate.Configuration;
import com.github.oapicf.endoflifedate.models.*;
import com.github.oapicf.endoflifedate.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://endoflife.date");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      List<String> result = apiInstance.getApiAllJson();
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

**List&lt;String&gt;**

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
import com.github.oapicf.endoflifedate.ApiClient;
import com.github.oapicf.endoflifedate.ApiException;
import com.github.oapicf.endoflifedate.Configuration;
import com.github.oapicf.endoflifedate.models.*;
import com.github.oapicf.endoflifedate.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://endoflife.date");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String product = "product_example"; // String | Product URL as per the canonical URL on the endofife.date website
    String cycle = "cycle_example"; // String | Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD's releng/14.0 becomes releng-14.0.
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
| **product** | **String**| Product URL as per the canonical URL on the endofife.date website | |
| **cycle** | **String**| Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD&#39;s releng/14.0 becomes releng-14.0. | |

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
> List&lt;Cycle&gt; getApiProductJson(product)

Get All Details

Get EoL dates of all cycles of a given product.

### Example
```java
// Import classes:
import com.github.oapicf.endoflifedate.ApiClient;
import com.github.oapicf.endoflifedate.ApiException;
import com.github.oapicf.endoflifedate.Configuration;
import com.github.oapicf.endoflifedate.models.*;
import com.github.oapicf.endoflifedate.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://endoflife.date");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String product = "product_example"; // String | Product URL as per the canonical URL on the endofife.date website
    try {
      List<Cycle> result = apiInstance.getApiProductJson(product);
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
| **product** | **String**| Product URL as per the canonical URL on the endofife.date website | |

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

