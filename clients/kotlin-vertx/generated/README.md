# org.openapitools - Kotlin Server library for endoflife.date

## Requires

* Kotlin 1.3.10
* Maven 3.3

## Build

```
mvn clean package
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.

<a id="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://endoflife.date*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**getApiAllJson**](docs/DefaultApi.md#getapialljson) | **GET** /api/all.json | All Products
*DefaultApi* | [**getApiProductCycleJson**](docs/DefaultApi.md#getapiproductcyclejson) | **GET** /api/{product}/{cycle}.json | Single cycle details
*DefaultApi* | [**getApiProductJson**](docs/DefaultApi.md#getapiproductjson) | **GET** /api/{product}.json | Get All Details


<a id="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.server.api.model.Cycle](docs/Cycle.md)
 - [org.openapitools.server.api.model.CycleCycle](docs/CycleCycle.md)
 - [org.openapitools.server.api.model.CycleDiscontinued](docs/CycleDiscontinued.md)
 - [org.openapitools.server.api.model.CycleEol](docs/CycleEol.md)
 - [org.openapitools.server.api.model.CycleLts](docs/CycleLts.md)
 - [org.openapitools.server.api.model.CycleSupport](docs/CycleSupport.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.

