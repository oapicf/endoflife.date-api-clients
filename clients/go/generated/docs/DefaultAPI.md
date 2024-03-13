# \DefaultAPI

All URIs are relative to *https://endoflife.date*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetApiAllJson**](DefaultAPI.md#GetApiAllJson) | **Get** /api/all.json | All Products
[**GetApiProductCycleJson**](DefaultAPI.md#GetApiProductCycleJson) | **Get** /api/{product}/{cycle}.json | Single cycle details
[**GetApiProductJson**](DefaultAPI.md#GetApiProductJson) | **Get** /api/{product}.json | Get All Details



## GetApiAllJson

> interface{} GetApiAllJson(ctx).Execute()

All Products



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "github.com/oapicf/endoflife.date-api-clients"
)

func main() {

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DefaultAPI.GetApiAllJson(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DefaultAPI.GetApiAllJson``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetApiAllJson`: interface{}
    fmt.Fprintf(os.Stdout, "Response from `DefaultAPI.GetApiAllJson`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetApiAllJsonRequest struct via the builder pattern


### Return type

**interface{}**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetApiProductCycleJson

> Cycle GetApiProductCycleJson(ctx, product, cycle).Execute()

Single cycle details



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "github.com/oapicf/endoflife.date-api-clients"
)

func main() {
    product := TODO // interface{} | Product URL as per the canonical URL on the endofife.date website
    cycle := TODO // interface{} | Release Cycle for which the details must be fetched

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DefaultAPI.GetApiProductCycleJson(context.Background(), product, cycle).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DefaultAPI.GetApiProductCycleJson``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetApiProductCycleJson`: Cycle
    fmt.Fprintf(os.Stdout, "Response from `DefaultAPI.GetApiProductCycleJson`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**product** | [**interface{}**](.md) | Product URL as per the canonical URL on the endofife.date website |
**cycle** | [**interface{}**](.md) | Release Cycle for which the details must be fetched |

### Other Parameters

Other parameters are passed through a pointer to a apiGetApiProductCycleJsonRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**Cycle**](Cycle.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetApiProductJson

> interface{} GetApiProductJson(ctx, product).Execute()

Get All Details



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "github.com/oapicf/endoflife.date-api-clients"
)

func main() {
    product := TODO // interface{} | Product URL as per the canonical URL on the endofife.date website

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DefaultAPI.GetApiProductJson(context.Background(), product).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DefaultAPI.GetApiProductJson``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetApiProductJson`: interface{}
    fmt.Fprintf(os.Stdout, "Response from `DefaultAPI.GetApiProductJson`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**product** | [**interface{}**](.md) | Product URL as per the canonical URL on the endofife.date website |

### Other Parameters

Other parameters are passed through a pointer to a apiGetApiProductJsonRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

**interface{}**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

