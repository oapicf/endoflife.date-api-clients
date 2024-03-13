#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cycle.h"



cycle_t *cycle_create(
    cycle_cycle_t *cycle,
    char *release_date,
    cycle_eol_t *eol,
    char *latest,
    char *link,
    cycle_lts_t *lts,
    cycle_support_t *support,
    cycle_discontinued_t *discontinued
    ) {
    cycle_t *cycle_local_var = malloc(sizeof(cycle_t));
    if (!cycle_local_var) {
        return NULL;
    }
    cycle_local_var->cycle = cycle;
    cycle_local_var->release_date = release_date;
    cycle_local_var->eol = eol;
    cycle_local_var->latest = latest;
    cycle_local_var->link = link;
    cycle_local_var->lts = lts;
    cycle_local_var->support = support;
    cycle_local_var->discontinued = discontinued;

    return cycle_local_var;
}


void cycle_free(cycle_t *cycle) {
    if(NULL == cycle){
        return ;
    }
    listEntry_t *listEntry;
    if (cycle->cycle) {
        cycle_cycle_free(cycle->cycle);
        cycle->cycle = NULL;
    }
    if (cycle->release_date) {
        free(cycle->release_date);
        cycle->release_date = NULL;
    }
    if (cycle->eol) {
        cycle_eol_free(cycle->eol);
        cycle->eol = NULL;
    }
    if (cycle->latest) {
        free(cycle->latest);
        cycle->latest = NULL;
    }
    if (cycle->link) {
        free(cycle->link);
        cycle->link = NULL;
    }
    if (cycle->lts) {
        cycle_lts_free(cycle->lts);
        cycle->lts = NULL;
    }
    if (cycle->support) {
        cycle_support_free(cycle->support);
        cycle->support = NULL;
    }
    if (cycle->discontinued) {
        cycle_discontinued_free(cycle->discontinued);
        cycle->discontinued = NULL;
    }
    free(cycle);
}

cJSON *cycle_convertToJSON(cycle_t *cycle) {
    cJSON *item = cJSON_CreateObject();

    // cycle->cycle
    if(cycle->cycle) {
    cJSON *cycle_local_JSON = cycle_cycle_convertToJSON(cycle->cycle);
    if(cycle_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cycle", cycle_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // cycle->release_date
    if(cycle->release_date) {
    if(cJSON_AddStringToObject(item, "releaseDate", cycle->release_date) == NULL) {
    goto fail; //Date
    }
    }


    // cycle->eol
    if(cycle->eol) {
    cJSON *eol_local_JSON = cycle_eol_convertToJSON(cycle->eol);
    if(eol_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "eol", eol_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // cycle->latest
    if(cycle->latest) {
    if(cJSON_AddStringToObject(item, "latest", cycle->latest) == NULL) {
    goto fail; //String
    }
    }


    // cycle->link
    if(cycle->link) {
    if(cJSON_AddStringToObject(item, "link", cycle->link) == NULL) {
    goto fail; //String
    }
    }


    // cycle->lts
    if(cycle->lts) {
    cJSON *lts_local_JSON = cycle_lts_convertToJSON(cycle->lts);
    if(lts_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "lts", lts_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // cycle->support
    if(cycle->support) {
    cJSON *support_local_JSON = cycle_support_convertToJSON(cycle->support);
    if(support_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "support", support_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // cycle->discontinued
    if(cycle->discontinued) {
    cJSON *discontinued_local_JSON = cycle_discontinued_convertToJSON(cycle->discontinued);
    if(discontinued_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "discontinued", discontinued_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

cycle_t *cycle_parseFromJSON(cJSON *cycleJSON){

    cycle_t *cycle_local_var = NULL;

    // define the local variable for cycle->cycle
    cycle_cycle_t *cycle_local_nonprim = NULL;

    // define the local variable for cycle->eol
    cycle_eol_t *eol_local_nonprim = NULL;

    // define the local variable for cycle->lts
    cycle_lts_t *lts_local_nonprim = NULL;

    // define the local variable for cycle->support
    cycle_support_t *support_local_nonprim = NULL;

    // define the local variable for cycle->discontinued
    cycle_discontinued_t *discontinued_local_nonprim = NULL;

    // cycle->cycle
    cJSON *cycle = cJSON_GetObjectItemCaseSensitive(cycleJSON, "cycle");
    if (cycle) { 
    cycle_local_nonprim = cycle_cycle_parseFromJSON(cycle); //nonprimitive
    }

    // cycle->release_date
    cJSON *release_date = cJSON_GetObjectItemCaseSensitive(cycleJSON, "releaseDate");
    if (release_date) { 
    if(!cJSON_IsString(release_date))
    {
    goto end; //Date
    }
    }

    // cycle->eol
    cJSON *eol = cJSON_GetObjectItemCaseSensitive(cycleJSON, "eol");
    if (eol) { 
    eol_local_nonprim = cycle_eol_parseFromJSON(eol); //nonprimitive
    }

    // cycle->latest
    cJSON *latest = cJSON_GetObjectItemCaseSensitive(cycleJSON, "latest");
    if (latest) { 
    if(!cJSON_IsString(latest) && !cJSON_IsNull(latest))
    {
    goto end; //String
    }
    }

    // cycle->link
    cJSON *link = cJSON_GetObjectItemCaseSensitive(cycleJSON, "link");
    if (link) { 
    if(!cJSON_IsString(link) && !cJSON_IsNull(link))
    {
    goto end; //String
    }
    }

    // cycle->lts
    cJSON *lts = cJSON_GetObjectItemCaseSensitive(cycleJSON, "lts");
    if (lts) { 
    lts_local_nonprim = cycle_lts_parseFromJSON(lts); //nonprimitive
    }

    // cycle->support
    cJSON *support = cJSON_GetObjectItemCaseSensitive(cycleJSON, "support");
    if (support) { 
    support_local_nonprim = cycle_support_parseFromJSON(support); //nonprimitive
    }

    // cycle->discontinued
    cJSON *discontinued = cJSON_GetObjectItemCaseSensitive(cycleJSON, "discontinued");
    if (discontinued) { 
    discontinued_local_nonprim = cycle_discontinued_parseFromJSON(discontinued); //nonprimitive
    }


    cycle_local_var = cycle_create (
        cycle ? cycle_local_nonprim : NULL,
        release_date ? strdup(release_date->valuestring) : NULL,
        eol ? eol_local_nonprim : NULL,
        latest && !cJSON_IsNull(latest) ? strdup(latest->valuestring) : NULL,
        link && !cJSON_IsNull(link) ? strdup(link->valuestring) : NULL,
        lts ? lts_local_nonprim : NULL,
        support ? support_local_nonprim : NULL,
        discontinued ? discontinued_local_nonprim : NULL
        );

    return cycle_local_var;
end:
    if (cycle_local_nonprim) {
        cycle_cycle_free(cycle_local_nonprim);
        cycle_local_nonprim = NULL;
    }
    if (eol_local_nonprim) {
        cycle_eol_free(eol_local_nonprim);
        eol_local_nonprim = NULL;
    }
    if (lts_local_nonprim) {
        cycle_lts_free(lts_local_nonprim);
        lts_local_nonprim = NULL;
    }
    if (support_local_nonprim) {
        cycle_support_free(support_local_nonprim);
        support_local_nonprim = NULL;
    }
    if (discontinued_local_nonprim) {
        cycle_discontinued_free(discontinued_local_nonprim);
        discontinued_local_nonprim = NULL;
    }
    return NULL;

}
