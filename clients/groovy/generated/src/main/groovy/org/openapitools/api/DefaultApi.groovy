package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Cycle

class DefaultApi {
    String basePath = "https://endoflife.date"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getApiAllJson ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/all.json"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    String.class )

    }

    def getApiProductCycleJson ( String product, String cycle, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/${product}/${cycle}.json"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (product == null) {
            throw new RuntimeException("missing required params product")
        }
        // verify required params are set
        if (cycle == null) {
            throw new RuntimeException("missing required params cycle")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    Cycle.class )

    }

    def getApiProductJson ( String product, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/${product}.json"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (product == null) {
            throw new RuntimeException("missing required params product")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    Cycle.class )

    }

}
