#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cycle.h"



cycle_t *cycle_create(
    any_type_t *cycle,
    any_type_t *release_date,
    any_type_t *eol,
    any_type_t *latest,
    any_type_t *link,
    any_type_t *lts,
    any_type_t *support,
    any_type_t *discontinued
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
        _free(cycle->cycle);
        cycle->cycle = NULL;
    }
    if (cycle->release_date) {
        _free(cycle->release_date);
        cycle->release_date = NULL;
    }
    if (cycle->eol) {
        _free(cycle->eol);
        cycle->eol = NULL;
    }
    if (cycle->latest) {
        _free(cycle->latest);
        cycle->latest = NULL;
    }
    if (cycle->link) {
        _free(cycle->link);
        cycle->link = NULL;
    }
    if (cycle->lts) {
        _free(cycle->lts);
        cycle->lts = NULL;
    }
    if (cycle->support) {
        _free(cycle->support);
        cycle->support = NULL;
    }
    if (cycle->discontinued) {
        _free(cycle->discontinued);
        cycle->discontinued = NULL;
    }
    free(cycle);
}

cJSON *cycle_convertToJSON(cycle_t *cycle) {
    cJSON *item = cJSON_CreateObject();

    // cycle->cycle
    if(cycle->cycle) {
    cJSON *cycle_local_JSON = _convertToJSON(cycle->cycle);
    if(cycle_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "cycle", cycle_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // cycle->release_date
    if(cycle->release_date) {
    cJSON *release_date_local_JSON = _convertToJSON(cycle->release_date);
    if(release_date_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "releaseDate", release_date_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // cycle->eol
    if(cycle->eol) {
    cJSON *eol_local_JSON = _convertToJSON(cycle->eol);
    if(eol_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "eol", eol_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // cycle->latest
    if(cycle->latest) {
    cJSON *latest_local_JSON = _convertToJSON(cycle->latest);
    if(latest_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "latest", latest_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // cycle->link
    if(cycle->link) {
    cJSON *link_local_JSON = _convertToJSON(cycle->link);
    if(link_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "link", link_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // cycle->lts
    if(cycle->lts) {
    cJSON *lts_local_JSON = _convertToJSON(cycle->lts);
    if(lts_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "lts", lts_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // cycle->support
    if(cycle->support) {
    cJSON *support_local_JSON = _convertToJSON(cycle->support);
    if(support_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "support", support_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // cycle->discontinued
    if(cycle->discontinued) {
    cJSON *discontinued_local_JSON = _convertToJSON(cycle->discontinued);
    if(discontinued_local_JSON == NULL) {
        goto fail; // custom
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
    _t *cycle_local_nonprim = NULL;

    // define the local variable for cycle->release_date
    _t *release_date_local_nonprim = NULL;

    // define the local variable for cycle->eol
    _t *eol_local_nonprim = NULL;

    // define the local variable for cycle->latest
    _t *latest_local_nonprim = NULL;

    // define the local variable for cycle->link
    _t *link_local_nonprim = NULL;

    // define the local variable for cycle->lts
    _t *lts_local_nonprim = NULL;

    // define the local variable for cycle->support
    _t *support_local_nonprim = NULL;

    // define the local variable for cycle->discontinued
    _t *discontinued_local_nonprim = NULL;

    // cycle->cycle
    cJSON *cycle = cJSON_GetObjectItemCaseSensitive(cycleJSON, "cycle");
    if (cycle) { 
    cycle_local_nonprim = _parseFromJSON(cycle); //custom
    }

    // cycle->release_date
    cJSON *release_date = cJSON_GetObjectItemCaseSensitive(cycleJSON, "releaseDate");
    if (release_date) { 
    release_date_local_nonprim = _parseFromJSON(release_date); //custom
    }

    // cycle->eol
    cJSON *eol = cJSON_GetObjectItemCaseSensitive(cycleJSON, "eol");
    if (eol) { 
    eol_local_nonprim = _parseFromJSON(eol); //custom
    }

    // cycle->latest
    cJSON *latest = cJSON_GetObjectItemCaseSensitive(cycleJSON, "latest");
    if (latest) { 
    latest_local_nonprim = _parseFromJSON(latest); //custom
    }

    // cycle->link
    cJSON *link = cJSON_GetObjectItemCaseSensitive(cycleJSON, "link");
    if (link) { 
    link_local_nonprim = _parseFromJSON(link); //custom
    }

    // cycle->lts
    cJSON *lts = cJSON_GetObjectItemCaseSensitive(cycleJSON, "lts");
    if (lts) { 
    lts_local_nonprim = _parseFromJSON(lts); //custom
    }

    // cycle->support
    cJSON *support = cJSON_GetObjectItemCaseSensitive(cycleJSON, "support");
    if (support) { 
    support_local_nonprim = _parseFromJSON(support); //custom
    }

    // cycle->discontinued
    cJSON *discontinued = cJSON_GetObjectItemCaseSensitive(cycleJSON, "discontinued");
    if (discontinued) { 
    discontinued_local_nonprim = _parseFromJSON(discontinued); //custom
    }


    cycle_local_var = cycle_create (
        cycle ? cycle_local_nonprim : NULL,
        release_date ? release_date_local_nonprim : NULL,
        eol ? eol_local_nonprim : NULL,
        latest ? latest_local_nonprim : NULL,
        link ? link_local_nonprim : NULL,
        lts ? lts_local_nonprim : NULL,
        support ? support_local_nonprim : NULL,
        discontinued ? discontinued_local_nonprim : NULL
        );

    return cycle_local_var;
end:
    if (cycle_local_nonprim) {
        _free(cycle_local_nonprim);
        cycle_local_nonprim = NULL;
    }
    if (release_date_local_nonprim) {
        _free(release_date_local_nonprim);
        release_date_local_nonprim = NULL;
    }
    if (eol_local_nonprim) {
        _free(eol_local_nonprim);
        eol_local_nonprim = NULL;
    }
    if (latest_local_nonprim) {
        _free(latest_local_nonprim);
        latest_local_nonprim = NULL;
    }
    if (link_local_nonprim) {
        _free(link_local_nonprim);
        link_local_nonprim = NULL;
    }
    if (lts_local_nonprim) {
        _free(lts_local_nonprim);
        lts_local_nonprim = NULL;
    }
    if (support_local_nonprim) {
        _free(support_local_nonprim);
        support_local_nonprim = NULL;
    }
    if (discontinued_local_nonprim) {
        _free(discontinued_local_nonprim);
        discontinued_local_nonprim = NULL;
    }
    return NULL;

}
