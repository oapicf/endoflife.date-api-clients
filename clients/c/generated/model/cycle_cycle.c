#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cycle_cycle.h"



static cycle_cycle_t *cycle_cycle_create_internal(
    ) {
    cycle_cycle_t *cycle_cycle_local_var = malloc(sizeof(cycle_cycle_t));
    if (!cycle_cycle_local_var) {
        return NULL;
    }

    cycle_cycle_local_var->_library_owned = 1;
    return cycle_cycle_local_var;
}

__attribute__((deprecated)) cycle_cycle_t *cycle_cycle_create(
    ) {
    return cycle_cycle_create_internal (
        );
}

void cycle_cycle_free(cycle_cycle_t *cycle_cycle) {
    if(NULL == cycle_cycle){
        return ;
    }
    if(cycle_cycle->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "cycle_cycle_free");
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


    cycle_cycle_local_var = cycle_cycle_create_internal (
        );

    return cycle_cycle_local_var;
end:
    return NULL;

}
