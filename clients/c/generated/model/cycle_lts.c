#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cycle_lts.h"



cycle_lts_t *cycle_lts_create(
    ) {
    cycle_lts_t *cycle_lts_local_var = malloc(sizeof(cycle_lts_t));
    if (!cycle_lts_local_var) {
        return NULL;
    }

    return cycle_lts_local_var;
}


void cycle_lts_free(cycle_lts_t *cycle_lts) {
    if(NULL == cycle_lts){
        return ;
    }
    listEntry_t *listEntry;
    free(cycle_lts);
}

cJSON *cycle_lts_convertToJSON(cycle_lts_t *cycle_lts) {
    cJSON *item = cJSON_CreateObject();
    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

cycle_lts_t *cycle_lts_parseFromJSON(cJSON *cycle_ltsJSON){

    cycle_lts_t *cycle_lts_local_var = NULL;


    cycle_lts_local_var = cycle_lts_create (
        );

    return cycle_lts_local_var;
end:
    return NULL;

}
