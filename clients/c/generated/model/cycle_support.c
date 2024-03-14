#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cycle_support.h"



cycle_support_t *cycle_support_create(
    ) {
    cycle_support_t *cycle_support_local_var = malloc(sizeof(cycle_support_t));
    if (!cycle_support_local_var) {
        return NULL;
    }

    return cycle_support_local_var;
}


void cycle_support_free(cycle_support_t *cycle_support) {
    if(NULL == cycle_support){
        return ;
    }
    listEntry_t *listEntry;
    free(cycle_support);
}

cJSON *cycle_support_convertToJSON(cycle_support_t *cycle_support) {
    cJSON *item = cJSON_CreateObject();
    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

cycle_support_t *cycle_support_parseFromJSON(cJSON *cycle_supportJSON){

    cycle_support_t *cycle_support_local_var = NULL;


    cycle_support_local_var = cycle_support_create (
        );

    return cycle_support_local_var;
end:
    return NULL;

}
