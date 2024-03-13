# DefaultApi

All URIs are relative to *https://endoflife.date*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetApiAllJson**](DefaultApi.md#GetApiAllJson) | **GET** /api/all.json | All Products
[**GetApiProductCycleJson**](DefaultApi.md#GetApiProductCycleJson) | **GET** /api/{product}/{cycle}.json | Single cycle details
[**GetApiProductJson**](DefaultApi.md#GetApiProductJson) | **GET** /api/{product}.json | Get All Details


# **GetApiAllJson**
> array[character] GetApiAllJson()

All Products

Return a list of all products. Each of these can be used for the other API endpoints.

### Example
```R
library(openapi)

# All Products
#

api_instance <- DefaultApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetApiAllJson(data_file = "result.txt")
result <- api_instance$GetApiAllJson()
dput(result)
```

### Parameters
This endpoint does not need any parameter.

### Return type

**array[character]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **GetApiProductCycleJson**
> Cycle GetApiProductCycleJson(product, cycle)

Single cycle details

Gets details of a single cycle

### Example
```R
library(openapi)

# Single cycle details
#
# prepare function argument(s)
var_product <- "product_example" # character | Product URL as per the canonical URL on the endofife.date website
var_cycle <- "cycle_example" # character | Release Cycle for which the details must be fetched

api_instance <- DefaultApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetApiProductCycleJson(var_product, var_cycledata_file = "result.txt")
result <- api_instance$GetApiProductCycleJson(var_product, var_cycle)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | **character**| Product URL as per the canonical URL on the endofife.date website | 
 **cycle** | **character**| Release Cycle for which the details must be fetched | 

### Return type

[**Cycle**](cycle.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **GetApiProductJson**
> array[Cycle] GetApiProductJson(product)

Get All Details

Get EoL dates of all cycles of a given product.

### Example
```R
library(openapi)

# Get All Details
#
# prepare function argument(s)
var_product <- "product_example" # character | Product URL as per the canonical URL on the endofife.date website

api_instance <- DefaultApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetApiProductJson(var_productdata_file = "result.txt")
result <- api_instance$GetApiProductJson(var_product)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | **character**| Product URL as per the canonical URL on the endofife.date website | 

### Return type

[**array[Cycle]**](cycle.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

