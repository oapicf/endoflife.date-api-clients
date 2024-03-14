#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cycle_cycle.h"



cycle_cycle_t *cycle_cycle_create(
    ) {
    cycle_cycle_t *cycle_cycle_local_var = malloc(sizeof(cycle_cycle_t));
    if (!cycle_cycle_local_var) {
        return NULL;
    }

    return cycle_cycle_local_var;
}


void cycle_cycle_free(cycle_cycle_t *cycle_cycle) {
    if(NULL == cycle_cycle){
        return ;
    }
    listEntry_t *listEntry;
    free(cycle_cycle);
}

cJSON *cycle_cycle_convertToJSON(cycle_cycle_t *cycle_cycle) {
    cJSON *item = cJSON_CreateObject();
    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

cycle_cycle_t *cycle_cycle_parseFromJSON(cJSON *cycle_cycleJSON){

    cycle_cycle_t *cycle_cycle_local_var = NULL;


    cycle_cycle_local_var = cycle_cycle_create (
        );

    return cycle_cycle_local_var;
end:
    return NULL;

}
