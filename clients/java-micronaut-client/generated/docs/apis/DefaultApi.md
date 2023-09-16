# DefaultApi

All URIs are relative to *https://endoflife.date*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getApiAllJson**](DefaultApi.md#getApiAllJson) | **GET** /api/all.json | All Products |
| [**getApiProductCycleJson**](DefaultApi.md#getApiProductCycleJson) | **GET** /api/{product}/{cycle}.json | Single cycle details |
| [**getApiProductJson**](DefaultApi.md#getApiProductJson) | **GET** /api/{product}.json | Get All Details |


## Creating DefaultApi

To initiate an instance of `DefaultApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.DefaultApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(DefaultApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    DefaultApi defaultApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="getApiAllJson"></a>
# **getApiAllJson**
```java
Mono<Object> DefaultApi.getApiAllJson()
```

All Products

Return a list of all products. Each of these can be used for the other API endpoints.



### Return type
`Object`



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getApiProductCycleJson"></a>
# **getApiProductCycleJson**
```java
Mono<Cycle> DefaultApi.getApiProductCycleJson(productcycle)
```

Single cycle details

Gets details of a single cycle

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **product** | [**Object**](.md)| Product URL as per the canonical URL on the endofife.date website | |
| **cycle** | [**Object**](.md)| Release Cycle for which the details must be fetched | |


### Return type
[**Cycle**](Cycle.md)



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="getApiProductJson"></a>
# **getApiProductJson**
```java
Mono<Object> DefaultApi.getApiProductJson(product)
```

Get All Details

Get EoL dates of all cycles of a given product.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **product** | [**Object**](.md)| Product URL as per the canonical URL on the endofife.date website | |


### Return type
`Object`



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

