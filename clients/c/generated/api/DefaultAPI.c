#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "DefaultAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21


// All Products
//
// Return a list of all products. Each of these can be used for the other API endpoints.
//
list_t*
DefaultAPI_getApiAllJson(apiClient_t *apiClient)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/api/all.json");




    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //primitive return type not simple
    list_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *localVarJSON = cJSON_Parse(apiClient->dataReceived);
        cJSON *VarJSON;
        elementToReturn = list_createList();
        cJSON_ArrayForEach(VarJSON, localVarJSON){
            keyValuePair_t *keyPair = keyValuePair_create(strdup(VarJSON->string), cJSON_Print(VarJSON));
            list_addElement(elementToReturn, keyPair);
        }
        cJSON_Delete(localVarJSON);
    }

    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Single cycle details
//
// Gets details of a single cycle.
//
cycle_t*
DefaultAPI_getApiProductCycleJson(apiClient_t *apiClient, char *product, char *cycle)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/api/{product}/{cycle}.json");

    if(!product)
        goto end;
    if(!cycle)
        goto end;


    // Path Params
    long sizeOfPathParams_product = strlen(product)+3 + strlen(cycle)+3 + sizeof("{ product }") - 1;
    if(product == NULL) {
        goto end;
    }
    char* localVarToReplace_product = malloc(sizeOfPathParams_product);
    sprintf(localVarToReplace_product, "{%s}", "product");

    localVarPath = strReplace(localVarPath, localVarToReplace_product, product);

    // Path Params
    long sizeOfPathParams_cycle = strlen(product)+3 + strlen(cycle)+3 + sizeof("{ cycle }") - 1;
    if(cycle == NULL) {
        goto end;
    }
    char* localVarToReplace_cycle = malloc(sizeOfPathParams_cycle);
    sprintf(localVarToReplace_cycle, "{%s}", "cycle");

    localVarPath = strReplace(localVarPath, localVarToReplace_cycle, cycle);


    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    cycle_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *DefaultAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        elementToReturn = cycle_parseFromJSON(DefaultAPIlocalVarJSON);
        cJSON_Delete(DefaultAPIlocalVarJSON);
        if(elementToReturn == NULL) {
            // return 0;
        }
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_product);
    free(localVarToReplace_cycle);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get All Details
//
// Get EoL dates of all cycles of a given product.
//
list_t*
DefaultAPI_getApiProductJson(apiClient_t *apiClient, char *product)
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/api/{product}.json");

    if(!product)
        goto end;


    // Path Params
    long sizeOfPathParams_product = strlen(product)+3 + sizeof("{ product }") - 1;
    if(product == NULL) {
        goto end;
    }
    char* localVarToReplace_product = malloc(sizeOfPathParams_product);
    sprintf(localVarToReplace_product, "{%s}", "product");

    localVarPath = strReplace(localVarPath, localVarToReplace_product, product);


    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    list_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *DefaultAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        if(!cJSON_IsArray(DefaultAPIlocalVarJSON)) {
            return 0;//nonprimitive container
        }
        elementToReturn = list_createList();
        cJSON *VarJSON;
        cJSON_ArrayForEach(VarJSON, DefaultAPIlocalVarJSON)
        {
            if(!cJSON_IsObject(VarJSON))
            {
               // return 0;
            }
            char *localVarJSONToChar = cJSON_Print(VarJSON);
            list_addElement(elementToReturn , localVarJSONToChar);
        }

        cJSON_Delete( DefaultAPIlocalVarJSON);
        cJSON_Delete( VarJSON);
    }
    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_product);
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

