# Documentation for OpenAPI Petstore
This is a client generator for microcontrollers on the Espressif32 platform and the Arduino framework
After the client have been generated, you have to change these following variables:
- root.cert | Provide your service root certificate.
- src/main.cpp | Change wifi name
- src/main.cpp | Change wifi password
- lib/service/AbstractService.h | Change to your url

# Documentation for endoflife.date 0.0.1 Tiny client cpp (Arduino) 

The project is structured like this:
```
samples/client/petstore/tiny/cpp/
├── lib
│   ├── Models
│   ├── service
│   └── TestFiles
├── platformio.ini
├── pre_compiling_bourne.py
├── README.md
├── root.cert
├── src
│   └── main.cpp
└── test
    └── RunTests.cpp
```

All URIs are relative to https://endoflife.datehttps://endoflife.date

### DefaultApi
|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|*getApiAll_json* | *GET* /api/all.json | All Products.|
|*getApiProductCycle_json* | *GET* /api/{product}/{cycle}.json | Single cycle details.|
|*getApiProduct_json* | *GET* /api/{product}.json | Get All Details.|


## What are the Model files for the data structures/objects?
|Class | Description|
|------------- | -------------|
|*Cycle* | Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.|
|*Cycle_cycle* | Release Cycle|
|*Cycle_discontinued* | Whether this cycle is now discontinued.|
|*Cycle_eol* | End of Life Date for this release cycle|
|*Cycle_lts* | Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date. |
|*Cycle_support* | Whether this release cycle has active support|

