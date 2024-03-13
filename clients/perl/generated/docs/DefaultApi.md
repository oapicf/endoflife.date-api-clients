# WWW::OpenAPIClient::DefaultApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::DefaultApi;
```

All URIs are relative to *https://endoflife.date*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_api_all_json**](DefaultApi.md#get_api_all_json) | **GET** /api/all.json | All Products
[**get_api_product_cycle_json**](DefaultApi.md#get_api_product_cycle_json) | **GET** /api/{product}/{cycle}.json | Single cycle details
[**get_api_product_json**](DefaultApi.md#get_api_product_json) | **GET** /api/{product}.json | Get All Details


# **get_api_all_json**
> ARRAY[string] get_api_all_json()

All Products

Return a list of all products. Each of these can be used for the other API endpoints.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::DefaultApi;
my $api_instance = WWW::OpenAPIClient::DefaultApi->new(
);


eval {
    my $result = $api_instance->get_api_all_json();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling DefaultApi->get_api_all_json: $@\n";
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ARRAY[string]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_api_product_cycle_json**
> Cycle get_api_product_cycle_json(product => $product, cycle => $cycle)

Single cycle details

Gets details of a single cycle

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::DefaultApi;
my $api_instance = WWW::OpenAPIClient::DefaultApi->new(
);

my $product = "product_example"; # string | Product URL as per the canonical URL on the endofife.date website
my $cycle = "cycle_example"; # string | Release Cycle for which the details must be fetched

eval {
    my $result = $api_instance->get_api_product_cycle_json(product => $product, cycle => $cycle);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling DefaultApi->get_api_product_cycle_json: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | **string**| Product URL as per the canonical URL on the endofife.date website | 
 **cycle** | **string**| Release Cycle for which the details must be fetched | 

### Return type

[**Cycle**](Cycle.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_api_product_json**
> ARRAY[Cycle] get_api_product_json(product => $product)

Get All Details

Get EoL dates of all cycles of a given product.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::DefaultApi;
my $api_instance = WWW::OpenAPIClient::DefaultApi->new(
);

my $product = "product_example"; # string | Product URL as per the canonical URL on the endofife.date website

eval {
    my $result = $api_instance->get_api_product_json(product => $product);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling DefaultApi->get_api_product_json: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | **string**| Product URL as per the canonical URL on the endofife.date website | 

### Return type

[**ARRAY[Cycle]**](Cycle.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

