# endoflifedate.DefaultApi

All URIs are relative to *https://endoflife.date*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_api_all_json**](DefaultApi.md#get_api_all_json) | **GET** /api/all.json | All Products
[**get_api_product_cycle_json**](DefaultApi.md#get_api_product_cycle_json) | **GET** /api/{product}/{cycle}.json | Single cycle details
[**get_api_product_json**](DefaultApi.md#get_api_product_json) | **GET** /api/{product}.json | Get All Details


# **get_api_all_json**
> object get_api_all_json()

All Products

Return a list of all products. Each of these can be used for the other API endpoints.

### Example

```python
import time
import os
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

**object**

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

Gets details of a single cycle

### Example

```python
import time
import os
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
    product = None # object | Product URL as per the canonical URL on the endofife.date website
    cycle = None # object | Release Cycle for which the details must be fetched

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
 **product** | [**object**](.md)| Product URL as per the canonical URL on the endofife.date website | 
 **cycle** | [**object**](.md)| Release Cycle for which the details must be fetched | 

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
> object get_api_product_json(product)

Get All Details

Get EoL dates of all cycles of a given product.

### Example

```python
import time
import os
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
    product = None # object | Product URL as per the canonical URL on the endofife.date website

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
 **product** | [**object**](.md)| Product URL as per the canonical URL on the endofife.date website | 

### Return type

**object**

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

