# PSOpenAPITools.PSOpenAPITools/Api.DefaultApi

All URIs are relative to *https://endoflife.date*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Get-ApiAllJson**](DefaultApi.md#Get-ApiAllJson) | **GET** /api/all.json | All Products
[**Get-ApiProductCycleJson**](DefaultApi.md#Get-ApiProductCycleJson) | **GET** /api/{product}/{cycle}.json | Single cycle details
[**Get-ApiProductJson**](DefaultApi.md#Get-ApiProductJson) | **GET** /api/{product}.json | Get All Details


<a id="Get-ApiAllJson"></a>
# **Get-ApiAllJson**
> AnyType Get-ApiAllJson<br>

All Products

Return a list of all products. Each of these can be used for the other API endpoints.

### Example
```powershell

# All Products
try {
    $Result = Get-ApiAllJson
} catch {
    Write-Host ("Exception occurred when calling Get-ApiAllJson: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AnyType**](AnyType.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-ApiProductCycleJson"></a>
# **Get-ApiProductCycleJson**
> Cycle Get-ApiProductCycleJson<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Product] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Cycle] <PSCustomObject><br>

Single cycle details

Gets details of a single cycle

### Example
```powershell
$Product =  # AnyType | Product URL as per the canonical URL on the endofife.date website
$Cycle =  # AnyType | Release Cycle for which the details must be fetched

# Single cycle details
try {
    $Result = Get-ApiProductCycleJson -Product $Product -Cycle $Cycle
} catch {
    Write-Host ("Exception occurred when calling Get-ApiProductCycleJson: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Product** | [**AnyType**](AnyType.md)| Product URL as per the canonical URL on the endofife.date website | 
 **Cycle** | [**AnyType**](AnyType.md)| Release Cycle for which the details must be fetched | 

### Return type

[**Cycle**](Cycle.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-ApiProductJson"></a>
# **Get-ApiProductJson**
> AnyType Get-ApiProductJson<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Product] <PSCustomObject><br>

Get All Details

Get EoL dates of all cycles of a given product.

### Example
```powershell
$Product =  # AnyType | Product URL as per the canonical URL on the endofife.date website

# Get All Details
try {
    $Result = Get-ApiProductJson -Product $Product
} catch {
    Write-Host ("Exception occurred when calling Get-ApiProductJson: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Product** | [**AnyType**](AnyType.md)| Product URL as per the canonical URL on the endofife.date website | 

### Return type

[**AnyType**](AnyType.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

