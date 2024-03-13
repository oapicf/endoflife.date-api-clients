#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/cycle.h"


// All Products
//
// Return a list of all products. Each of these can be used for the other API endpoints.
//
list_t*
DefaultAPI_getApiAllJson(apiClient_t *apiClient);


// Single cycle details
//
// Gets details of a single cycle
//
cycle_t*
DefaultAPI_getApiProductCycleJson(apiClient_t *apiClient, char *product, char *cycle);


// Get All Details
//
// Get EoL dates of all cycles of a given product.
//
list_t*
DefaultAPI_getApiProductJson(apiClient_t *apiClient, char *product);


