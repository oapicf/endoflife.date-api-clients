# OpenAPI\Client\DefaultApi



All URIs are relative to https://endoflife.date, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getApiAllJson()**](DefaultApi.md#getApiAllJson) | **GET** /api/all.json | All Products |
| [**getApiProductCycleJson()**](DefaultApi.md#getApiProductCycleJson) | **GET** /api/{product}/{cycle}.json | Single cycle details |
| [**getApiProductJson()**](DefaultApi.md#getApiProductJson) | **GET** /api/{product}.json | Get All Details |


## `getApiAllJson()`

```php
getApiAllJson(): string[]
```

All Products

Return a list of all products. Each of these can be used for the other API endpoints.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DefaultApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->getApiAllJson();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DefaultApi->getApiAllJson: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**string[]**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getApiProductCycleJson()`

```php
getApiProductCycleJson($product, $cycle): \OpenAPI\Client\Model\Cycle
```

Single cycle details

Gets details of a single cycle.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DefaultApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$product = 'product_example'; // string | Product URL as per the canonical URL on the endofife.date website.
$cycle = 'cycle_example'; // string | Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD's releng/14.0 becomes releng-14.0.

try {
    $result = $apiInstance->getApiProductCycleJson($product, $cycle);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DefaultApi->getApiProductCycleJson: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **product** | **string**| Product URL as per the canonical URL on the endofife.date website. | |
| **cycle** | **string**| Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD&#39;s releng/14.0 becomes releng-14.0. | |

### Return type

[**\OpenAPI\Client\Model\Cycle**](../Model/Cycle.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getApiProductJson()`

```php
getApiProductJson($product): \OpenAPI\Client\Model\Cycle[]
```

Get All Details

Get EoL dates of all cycles of a given product.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DefaultApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$product = 'product_example'; // string | Product URL as per the canonical URL on the endofife.date website.

try {
    $result = $apiInstance->getApiProductJson($product);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DefaultApi->getApiProductJson: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **product** | **string**| Product URL as per the canonical URL on the endofife.date website. | |

### Return type

[**\OpenAPI\Client\Model\Cycle[]**](../Model/Cycle.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
