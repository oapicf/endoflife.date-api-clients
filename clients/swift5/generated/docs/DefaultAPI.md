# DefaultAPI

All URIs are relative to *https://endoflife.date*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getApiAllJson**](DefaultAPI.md#getapialljson) | **GET** /api/all.json | All Products
[**getApiProductCycleJson**](DefaultAPI.md#getapiproductcyclejson) | **GET** /api/{product}/{cycle}.json | Single cycle details
[**getApiProductJson**](DefaultAPI.md#getapiproductjson) | **GET** /api/{product}.json | Get All Details


# **getApiAllJson**
```swift
    open class func getApiAllJson(completion: @escaping (_ data: [String]?, _ error: Error?) -> Void)
```

All Products

Return a list of all products. Each of these can be used for the other API endpoints.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient


// All Products
DefaultAPI.getApiAllJson() { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getApiProductCycleJson**
```swift
    open class func getApiProductCycleJson(product: String, cycle: String, completion: @escaping (_ data: Cycle?, _ error: Error?) -> Void)
```

Single cycle details

Gets details of a single cycle

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let product = "product_example" // String | Product URL as per the canonical URL on the endofife.date website
let cycle = "cycle_example" // String | Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD's releng/14.0 becomes releng-14.0.

// Single cycle details
DefaultAPI.getApiProductCycleJson(product: product, cycle: cycle) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | **String** | Product URL as per the canonical URL on the endofife.date website | 
 **cycle** | **String** | Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD&#39;s releng/14.0 becomes releng-14.0. | 

### Return type

[**Cycle**](Cycle.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getApiProductJson**
```swift
    open class func getApiProductJson(product: String, completion: @escaping (_ data: [Cycle]?, _ error: Error?) -> Void)
```

Get All Details

Get EoL dates of all cycles of a given product.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let product = "product_example" // String | Product URL as per the canonical URL on the endofife.date website

// Get All Details
DefaultAPI.getApiProductJson(product: product) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | **String** | Product URL as per the canonical URL on the endofife.date website | 

### Return type

[**[Cycle]**](Cycle.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

