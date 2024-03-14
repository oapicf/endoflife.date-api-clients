#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cycle_discontinued.h"



cycle_discontinued_t *cycle_discontinued_create(
    ) {
    cycle_discontinued_t *cycle_discontinued_local_var = malloc(sizeof(cycle_discontinued_t));
    if (!cycle_discontinued_local_var) {
        return NULL;
    }

    return cycle_discontinued_local_var;
}


void cycle_discontinued_free(cycle_discontinued_t *cycle_discontinued) {
    if(NULL == cycle_discontinued){
        return ;
    }
    listEntry_t *listEntry;
    free(cycle_discontinued);
}

cJSON *cycle_discontinued_convertToJSON(cycle_discontinued_t *cycle_discontinued) {
    cJSON *item = cJSON_CreateObject();
    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

cycle_discontinued_t *cycle_discontinued_parseFromJSON(cJSON *cycle_discontinuedJSON){

    cycle_discontinued_t *cycle_discontinued_local_var = NULL;


    cycle_discontinued_local_var = cycle_discontinued_create (
        );

    return cycle_discontinued_local_var;
end:
    return NULL;

}
