# EndOfLifeDateApiClient::DefaultApi

All URIs are relative to *https://endoflife.date*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**get_api_all_json**](DefaultApi.md#get_api_all_json) | **GET** /api/all.json | All Products |
| [**get_api_product_cycle_json**](DefaultApi.md#get_api_product_cycle_json) | **GET** /api/{product}/{cycle}.json | Single cycle details |
| [**get_api_product_json**](DefaultApi.md#get_api_product_json) | **GET** /api/{product}.json | Get All Details |


## get_api_all_json

> Array&lt;String&gt; get_api_all_json

All Products

Return a list of all products. Each of these can be used for the other API endpoints.

### Examples

```ruby
require 'time'
require 'endoflife_date'

api_instance = EndOfLifeDateApiClient::DefaultApi.new

begin
  # All Products
  result = api_instance.get_api_all_json
  p result
rescue EndOfLifeDateApiClient::ApiError => e
  puts "Error when calling DefaultApi->get_api_all_json: #{e}"
end
```

#### Using the get_api_all_json_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(Array&lt;String&gt;, Integer, Hash)> get_api_all_json_with_http_info

```ruby
begin
  # All Products
  data, status_code, headers = api_instance.get_api_all_json_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => Array&lt;String&gt;
rescue EndOfLifeDateApiClient::ApiError => e
  puts "Error when calling DefaultApi->get_api_all_json_with_http_info: #{e}"
end
```

### Parameters

This endpoint does not need any parameter.

### Return type

**Array&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_api_product_cycle_json

> <Cycle> get_api_product_cycle_json(product, cycle)

Single cycle details

Gets details of a single cycle.

### Examples

```ruby
require 'time'
require 'endoflife_date'

api_instance = EndOfLifeDateApiClient::DefaultApi.new
product = 'product_example' # String | Product URL as per the canonical URL on the endofife.date website.
cycle = 'cycle_example' # String | Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD's releng/14.0 becomes releng-14.0.

begin
  # Single cycle details
  result = api_instance.get_api_product_cycle_json(product, cycle)
  p result
rescue EndOfLifeDateApiClient::ApiError => e
  puts "Error when calling DefaultApi->get_api_product_cycle_json: #{e}"
end
```

#### Using the get_api_product_cycle_json_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Cycle>, Integer, Hash)> get_api_product_cycle_json_with_http_info(product, cycle)

```ruby
begin
  # Single cycle details
  data, status_code, headers = api_instance.get_api_product_cycle_json_with_http_info(product, cycle)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Cycle>
rescue EndOfLifeDateApiClient::ApiError => e
  puts "Error when calling DefaultApi->get_api_product_cycle_json_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **product** | **String** | Product URL as per the canonical URL on the endofife.date website. |  |
| **cycle** | **String** | Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD&#39;s releng/14.0 becomes releng-14.0. |  |

### Return type

[**Cycle**](Cycle.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_api_product_json

> <Array<Cycle>> get_api_product_json(product)

Get All Details

Get EoL dates of all cycles of a given product.

### Examples

```ruby
require 'time'
require 'endoflife_date'

api_instance = EndOfLifeDateApiClient::DefaultApi.new
product = 'product_example' # String | Product URL as per the canonical URL on the endofife.date website.

begin
  # Get All Details
  result = api_instance.get_api_product_json(product)
  p result
rescue EndOfLifeDateApiClient::ApiError => e
  puts "Error when calling DefaultApi->get_api_product_json: #{e}"
end
```

#### Using the get_api_product_json_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<Cycle>>, Integer, Hash)> get_api_product_json_with_http_info(product)

```ruby
begin
  # Get All Details
  data, status_code, headers = api_instance.get_api_product_json_with_http_info(product)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<Cycle>>
rescue EndOfLifeDateApiClient::ApiError => e
  puts "Error when calling DefaultApi->get_api_product_json_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **product** | **String** | Product URL as per the canonical URL on the endofife.date website. |  |

### Return type

[**Array&lt;Cycle&gt;**](Cycle.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

