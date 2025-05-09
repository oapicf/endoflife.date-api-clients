#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cycle_support.h"



static cycle_support_t *cycle_support_create_internal(
    ) {
    cycle_support_t *cycle_support_local_var = malloc(sizeof(cycle_support_t));
    if (!cycle_support_local_var) {
        return NULL;
    }

    cycle_support_local_var->_library_owned = 1;
    return cycle_support_local_var;
}

__attribute__((deprecated)) cycle_support_t *cycle_support_create(
    ) {
    return cycle_support_create_internal (
        );
}

void cycle_support_free(cycle_support_t *cycle_support) {
    if(NULL == cycle_support){
        return ;
    }
    if(cycle_support->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "cycle_support_free");
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


    cycle_support_local_var = cycle_support_create_internal (
        );

    return cycle_support_local_var;
end:
    return NULL;

}
