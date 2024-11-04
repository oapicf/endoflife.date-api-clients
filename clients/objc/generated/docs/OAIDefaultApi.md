# OAIDefaultApi

All URIs are relative to *https://endoflife.date*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getApiAllJson**](OAIDefaultApi.md#getapialljson) | **GET** /api/all.json | All Products
[**getApiProductCycleJson**](OAIDefaultApi.md#getapiproductcyclejson) | **GET** /api/{product}/{cycle}.json | Single cycle details
[**getApiProductJson**](OAIDefaultApi.md#getapiproductjson) | **GET** /api/{product}.json | Get All Details


# **getApiAllJson**
```objc
-(NSURLSessionTask*) getApiAllJsonWithCompletionHandler: 
        (void (^)(NSArray<NSString*>* output, NSError* error)) handler;
```

All Products

Return a list of all products. Each of these can be used for the other API endpoints.

### Example
```objc


OAIDefaultApi*apiInstance = [[OAIDefaultApi alloc] init];

// All Products
[apiInstance getApiAllJsonWithCompletionHandler: 
          ^(NSArray<NSString*>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIDefaultApi->getApiAllJson: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

**NSArray<NSString*>***

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getApiProductCycleJson**
```objc
-(NSURLSessionTask*) getApiProductCycleJsonWithProduct: (NSString*) product
    cycle: (NSString*) cycle
        completionHandler: (void (^)(OAICycle* output, NSError* error)) handler;
```

Single cycle details

Gets details of a single cycle

### Example
```objc

NSString* product = @"product_example"; // Product URL as per the canonical URL on the endofife.date website
NSString* cycle = @"cycle_example"; // Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD's releng/14.0 becomes releng-14.0.

OAIDefaultApi*apiInstance = [[OAIDefaultApi alloc] init];

// Single cycle details
[apiInstance getApiProductCycleJsonWithProduct:product
              cycle:cycle
          completionHandler: ^(OAICycle* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIDefaultApi->getApiProductCycleJson: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | **NSString***| Product URL as per the canonical URL on the endofife.date website | 
 **cycle** | **NSString***| Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD&#39;s releng/14.0 becomes releng-14.0. | 

### Return type

[**OAICycle***](OAICycle.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getApiProductJson**
```objc
-(NSURLSessionTask*) getApiProductJsonWithProduct: (NSString*) product
        completionHandler: (void (^)(NSArray<OAICycle>* output, NSError* error)) handler;
```

Get All Details

Get EoL dates of all cycles of a given product.

### Example
```objc

NSString* product = @"product_example"; // Product URL as per the canonical URL on the endofife.date website

OAIDefaultApi*apiInstance = [[OAIDefaultApi alloc] init];

// Get All Details
[apiInstance getApiProductJsonWithProduct:product
          completionHandler: ^(NSArray<OAICycle>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIDefaultApi->getApiProductJson: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | **NSString***| Product URL as per the canonical URL on the endofife.date website | 

### Return type

[**NSArray<OAICycle>***](OAICycle.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

