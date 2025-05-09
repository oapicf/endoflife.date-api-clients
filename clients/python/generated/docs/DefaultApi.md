# endoflifedate.DefaultApi

All URIs are relative to *https://endoflife.date*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_api_all_json**](DefaultApi.md#get_api_all_json) | **GET** /api/all.json | All Products
[**get_api_product_cycle_json**](DefaultApi.md#get_api_product_cycle_json) | **GET** /api/{product}/{cycle}.json | Single cycle details
[**get_api_product_json**](DefaultApi.md#get_api_product_json) | **GET** /api/{product}.json | Get All Details


# **get_api_all_json**
> List[str] get_api_all_json()

All Products

Return a list of all products. Each of these can be used for the other API endpoints.

### Example


```python
import endoflifedate
from endoflifedate.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://endoflife.date
# See configuration.py for a list of all supported configuration parameters.
configuration = endoflifedate.Configuration(
    host = "https://endoflife.date"
)


# Enter a context with an instance of the API client
with endoflifedate.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = endoflifedate.DefaultApi(api_client)

    try:
        # All Products
        api_response = api_instance.get_api_all_json()
        print("The response of DefaultApi->get_api_all_json:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_api_all_json: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

**List[str]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_api_product_cycle_json**
> Cycle get_api_product_cycle_json(product, cycle)

Single cycle details

Gets details of a single cycle.

### Example


```python
import endoflifedate
from endoflifedate.models.cycle import Cycle
from endoflifedate.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://endoflife.date
# See configuration.py for a list of all supported configuration parameters.
configuration = endoflifedate.Configuration(
    host = "https://endoflife.date"
)


# Enter a context with an instance of the API client
with endoflifedate.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = endoflifedate.DefaultApi(api_client)
    product = 'product_example' # str | Product URL as per the canonical URL on the endofife.date website.
    cycle = 'cycle_example' # str | Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD's releng/14.0 becomes releng-14.0.

    try:
        # Single cycle details
        api_response = api_instance.get_api_product_cycle_json(product, cycle)
        print("The response of DefaultApi->get_api_product_cycle_json:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_api_product_cycle_json: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | **str**| Product URL as per the canonical URL on the endofife.date website. | 
 **cycle** | **str**| Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD&#39;s releng/14.0 becomes releng-14.0. | 

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
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_api_product_json**
> List[Cycle] get_api_product_json(product)

Get All Details

Get EoL dates of all cycles of a given product.

### Example


```python
import endoflifedate
from endoflifedate.models.cycle import Cycle
from endoflifedate.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://endoflife.date
# See configuration.py for a list of all supported configuration parameters.
configuration = endoflifedate.Configuration(
    host = "https://endoflife.date"
)


# Enter a context with an instance of the API client
with endoflifedate.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = endoflifedate.DefaultApi(api_client)
    product = 'product_example' # str | Product URL as per the canonical URL on the endofife.date website.

    try:
        # Get All Details
        api_response = api_instance.get_api_product_json(product)
        print("The response of DefaultApi->get_api_product_json:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_api_product_json: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | **str**| Product URL as per the canonical URL on the endofife.date website. | 

### Return type

[**List[Cycle]**](Cycle.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

