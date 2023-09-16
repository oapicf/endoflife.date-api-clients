# endoflife.date API Client


Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)

## Requirements

- [Salesforce DX](https://www.salesforce.com/products/platform/products/salesforce-dx/)

If everything is set correctly:

- Running `sfdx version` in a command prompt should output something like:

  ```bash
  sfdx-cli/5.7.5-05549de (darwin-amd64) go1.7.5 sfdxstable
  ```

## Installation

1. Copy the output into your Salesforce DX folder - or alternatively deploy the output directly into the workspace.
2. Deploy the code via Salesforce DX to your Scratch Org

   ```bash
      sfdx force:source:push
   ```

3. If the API needs authentication update the Named Credential in Setup.
4. Run your Apex tests using

   ```bash
       sfdx sfdx force:apex:test:run
   ```

5. Retrieve the job id from the console and check the test results.

  ```bash
  sfdx force:apex:test:report -i theJobId
  ```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Apex code:

```java
OASDefaultApi api = new OASDefaultApi();

try {
    // cross your fingers
    oas_any_type_not_mapped result = api.getApiAllJson();
    System.debug(result);
} catch (OAS.ApiException e) {
    // ...handle your exceptions
}
```

## Documentation for API Endpoints

All URIs are relative to *https://endoflife.date*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OASDefaultApi* | [**getApiAllJson**](OASDefaultApi.md#getApiAllJson) | **GET** /api/all.json | All Products
*OASDefaultApi* | [**getApiProductCycleJson**](OASDefaultApi.md#getApiProductCycleJson) | **GET** /api/{product}/{cycle}.json | Single cycle details
*OASDefaultApi* | [**getApiProductJson**](OASDefaultApi.md#getApiProductJson) | **GET** /api/{product}.json | Get All Details


## Documentation for Models

 - [OASCycle](OASCycle.md)


## Documentation for Authorization

Endpoints do not require authorization.


## Author

blah@cliffano.com

