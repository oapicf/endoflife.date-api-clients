# endoflife.date

Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)


    ## API

          ### Default

          |Name|Role|
          |----|----|
          |`org.openapitools.server.api.DefaultController`|akka-http API controller|
          |`org.openapitools.server.api.DefaultApi`|Representing trait|
              |`org.openapitools.server.api.DefaultApiImpl`|Default implementation|

                * `GET /api/all.json` - All Products
                * `GET /api/{product}/{cycle}.json` - Single cycle details
                * `GET /api/{product}.json` - Get All Details

