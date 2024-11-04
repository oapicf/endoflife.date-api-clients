# EndoflifeDate.DefaultApi

All URIs are relative to *https://endoflife.date*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getApiAllJson**](DefaultApi.md#getApiAllJson) | **GET** /api/all.json | All Products
[**getApiProductCycleJson**](DefaultApi.md#getApiProductCycleJson) | **GET** /api/{product}/{cycle}.json | Single cycle details
[**getApiProductJson**](DefaultApi.md#getApiProductJson) | **GET** /api/{product}.json | Get All Details



## getApiAllJson

> [String] getApiAllJson()

All Products

Return a list of all products. Each of these can be used for the other API endpoints.

### Example

```javascript
import EndoflifeDate from 'endoflife-date';

let apiInstance = new EndoflifeDate.DefaultApi();
apiInstance.getApiAllJson((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

This endpoint does not need any parameter.

### Return type

**[String]**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getApiProductCycleJson

> Cycle getApiProductCycleJson(product, cycle)

Single cycle details

Gets details of a single cycle

### Example

```javascript
import EndoflifeDate from 'endoflife-date';

let apiInstance = new EndoflifeDate.DefaultApi();
let product = "product_example"; // String | Product URL as per the canonical URL on the endofife.date website
let cycle = "cycle_example"; // String | Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD's releng/14.0 becomes releng-14.0.
apiInstance.getApiProductCycleJson(product, cycle, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | **String**| Product URL as per the canonical URL on the endofife.date website | 
 **cycle** | **String**| Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD&#39;s releng/14.0 becomes releng-14.0. | 

### Return type

[**Cycle**](Cycle.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getApiProductJson

> [Cycle] getApiProductJson(product)

Get All Details

Get EoL dates of all cycles of a given product.

### Example

```javascript
import EndoflifeDate from 'endoflife-date';

let apiInstance = new EndoflifeDate.DefaultApi();
let product = "product_example"; // String | Product URL as per the canonical URL on the endofife.date website
apiInstance.getApiProductJson(product, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | **String**| Product URL as per the canonical URL on the endofife.date website | 

### Return type

[**[Cycle]**](Cycle.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

