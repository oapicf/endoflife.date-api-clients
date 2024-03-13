#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "DefaultAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)


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

    // create the path
    long sizeOfPath = strlen("/api/all.json")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/api/all.json");



    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //primitive return type not simple
    cJSON *localVarJSON = cJSON_Parse(apiClient->dataReceived);
    cJSON *VarJSON;
    list_t *elementToReturn = list_createList();
    cJSON_ArrayForEach(VarJSON, localVarJSON){
        keyValuePair_t *keyPair = keyValuePair_create(strdup(VarJSON->string), cJSON_Print(VarJSON));
        list_addElement(elementToReturn, keyPair);
    }
    cJSON_Delete(localVarJSON);

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
// Gets details of a single cycle
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

    // create the path
    long sizeOfPath = strlen("/api/{product}/{cycle}.json")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/api/{product}/{cycle}.json");


    // Path Params
    long sizeOfPathParams_product = strlen(product)+3 + strlen(cycle)+3 + strlen("{ product }");
    if(product == NULL) {
        goto end;
    }
    char* localVarToReplace_product = malloc(sizeOfPathParams_product);
    sprintf(localVarToReplace_product, "{%s}", "product");

    localVarPath = strReplace(localVarPath, localVarToReplace_product, product);

    // Path Params
    long sizeOfPathParams_cycle = strlen(product)+3 + strlen(cycle)+3 + strlen("{ cycle }");
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
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    //nonprimitive not container
    cJSON *DefaultAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    cycle_t *elementToReturn = cycle_parseFromJSON(DefaultAPIlocalVarJSON);
    cJSON_Delete(DefaultAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
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

    // create the path
    long sizeOfPath = strlen("/api/{product}.json")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/api/{product}.json");


    // Path Params
    long sizeOfPathParams_product = strlen(product)+3 + strlen("{ product }");
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
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","OK");
    //}
    cJSON *DefaultAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    if(!cJSON_IsArray(DefaultAPIlocalVarJSON)) {
        return 0;//nonprimitive container
    }
    list_t *elementToReturn = list_createList();
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

