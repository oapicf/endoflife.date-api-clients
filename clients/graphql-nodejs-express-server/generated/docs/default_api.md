# default_api

All URIs are relative to *https://endoflife.date*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetApiAllJson**](default_api.md#GetApiAllJson) | **GET** /api/all.json | All Products
[**GetApiProductCycleJson**](default_api.md#GetApiProductCycleJson) | **GET** /api/{product}/{cycle}.json | Single cycle details
[**GetApiProductJson**](default_api.md#GetApiProductJson) | **GET** /api/{product}.json | Get All Details


<a name="GetApiAllJson"></a>
# **GetApiAllJson**
> String! GetApiAllJson()

All Products

Return a list of all products. Each of these can be used for the other API endpoints.
<a name="GetApiProductCycleJson"></a>
# **GetApiProductCycleJson**
> Cycle GetApiProductCycleJson(product, cycle)

Single cycle details

Gets details of a single cycle.
<a name="GetApiProductJson"></a>
# **GetApiProductJson**
> Cycle GetApiProductJson(product)

Get All Details

Get EoL dates of all cycles of a given product.
