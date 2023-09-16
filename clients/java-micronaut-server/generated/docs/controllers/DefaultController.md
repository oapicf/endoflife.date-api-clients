# DefaultController

All URIs are relative to `""`

The controller class is defined in **[DefaultController.java](../../src/main/java/org/openapitools/controller/DefaultController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**getApiAllJson**](#getApiAllJson) | **GET** /api/all.json | All Products
[**getApiProductCycleJson**](#getApiProductCycleJson) | **GET** /api/{product}/{cycle}.json | Single cycle details
[**getApiProductJson**](#getApiProductJson) | **GET** /api/{product}.json | Get All Details

<a id="getApiAllJson"></a>
# **getApiAllJson**
```java
Mono<Object> DefaultController.getApiAllJson()
```

All Products

Return a list of all products. Each of these can be used for the other API endpoints.


### Return type
`Object`


### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="getApiProductCycleJson"></a>
# **getApiProductCycleJson**
```java
Mono<Cycle> DefaultController.getApiProductCycleJson(productcycle)
```

Single cycle details

Gets details of a single cycle

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**product** | [**Object**](../../docs/models/.md) | Product URL as per the canonical URL on the endofife.date website |
**cycle** | [**Object**](../../docs/models/.md) | Release Cycle for which the details must be fetched |

### Return type
[**Cycle**](../../docs/models/Cycle.md)


### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="getApiProductJson"></a>
# **getApiProductJson**
```java
Mono<Object> DefaultController.getApiProductJson(product)
```

Get All Details

Get EoL dates of all cycles of a given product.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**product** | [**Object**](../../docs/models/.md) | Product URL as per the canonical URL on the endofife.date website |

### Return type
`Object`


### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

