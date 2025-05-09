#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cycle_discontinued.h"



static cycle_discontinued_t *cycle_discontinued_create_internal(
    ) {
    cycle_discontinued_t *cycle_discontinued_local_var = malloc(sizeof(cycle_discontinued_t));
    if (!cycle_discontinued_local_var) {
        return NULL;
    }

    cycle_discontinued_local_var->_library_owned = 1;
    return cycle_discontinued_local_var;
}

__attribute__((deprecated)) cycle_discontinued_t *cycle_discontinued_create(
    ) {
    return cycle_discontinued_create_internal (
        );
}

void cycle_discontinued_free(cycle_discontinued_t *cycle_discontinued) {
    if(NULL == cycle_discontinued){
        return ;
    }
    if(cycle_discontinued->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "cycle_discontinued_free");
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


    cycle_discontinued_local_var = cycle_discontinued_create_internal (
        );

    return cycle_discontinued_local_var;
end:
    return NULL;

}
