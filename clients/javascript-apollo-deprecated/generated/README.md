# endoflife_date

EndoflifeDate - JavaScript client for endoflife_date
Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki).
This SDK is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 0.0.1
- Package version: 0.0.1
- Generator version: 7.12.0
- Build package: org.openapitools.codegen.languages.JavascriptApolloClientCodegen
For more information, please visit [https://github.com/oapicf/endoflife.date-api-clients](https://github.com/oapicf/endoflife.date-api-clients)

## Installation

### For [Node.js](https://nodejs.org/)

#### npm

To publish the library as a [npm](https://www.npmjs.com/), please follow the procedure in ["Publishing npm packages"](https://docs.npmjs.com/getting-started/publishing-npm-packages).

Then install it via:

```shell
npm install endoflife_date --save
```

Finally, you need to build the module:

```shell
npm run build
```

##### Local development

To use the library locally without publishing to a remote npm registry, first install the dependencies by changing into the directory containing `package.json` (and this README). Let's call this `JAVASCRIPT_CLIENT_DIR`. Then run:

```shell
npm install
```

Next, [link](https://docs.npmjs.com/cli/link) it globally in npm with the following, also from `JAVASCRIPT_CLIENT_DIR`:

```shell
npm link
```

To use the link you just defined in your project, switch to the directory you want to use your endoflife_date from, and run:

```shell
npm link /path/to/<JAVASCRIPT_CLIENT_DIR>
```

Finally, you need to build the module:

```shell
npm run build
```

#### git

If the library is hosted at a git repository, e.g.https://github.com/oapicf/endoflife.date-api-clients
then install it via:

```shell
    npm install oapicf/endoflife.date-api-clients --save
```

### For browser

The library also works in the browser environment via npm and [browserify](http://browserify.org/). After following
the above steps with Node.js and installing browserify with `npm install -g browserify`,
perform the following (assuming *main.js* is your entry file):

```shell
browserify main.js > bundle.js
```

Then include *bundle.js* in the HTML pages.

### Webpack Configuration

Using Webpack you may encounter the following error: "Module not found: Error:
Cannot resolve module", most certainly you should disable AMD loader. Add/merge
the following section to your webpack config:

```javascript
module: {
  rules: [
    {
      parser: {
        amd: false
      }
    }
  ]
}
```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following JS code:

```javascript
var EndoflifeDate = require('endoflife_date');


var api = new EndoflifeDate.DefaultApi()
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
api.getApiAllJson(callback);

```

## Documentation for API Endpoints

All URIs are relative to *https://endoflife.date*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*EndoflifeDate.DefaultApi* | [**getApiAllJson**](docs/DefaultApi.md#getApiAllJson) | **GET** /api/all.json | All Products
*EndoflifeDate.DefaultApi* | [**getApiProductCycleJson**](docs/DefaultApi.md#getApiProductCycleJson) | **GET** /api/{product}/{cycle}.json | Single cycle details
*EndoflifeDate.DefaultApi* | [**getApiProductJson**](docs/DefaultApi.md#getApiProductJson) | **GET** /api/{product}.json | Get All Details


## Documentation for Models

 - [EndoflifeDate.Cycle](docs/Cycle.md)
 - [EndoflifeDate.CycleCycle](docs/CycleCycle.md)
 - [EndoflifeDate.CycleDiscontinued](docs/CycleDiscontinued.md)
 - [EndoflifeDate.CycleEol](docs/CycleEol.md)
 - [EndoflifeDate.CycleLts](docs/CycleLts.md)
 - [EndoflifeDate.CycleSupport](docs/CycleSupport.md)


## Documentation for Authorization

Endpoints do not require authorization.

