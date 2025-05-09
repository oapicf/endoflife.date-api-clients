#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cycle_eol.h"



static cycle_eol_t *cycle_eol_create_internal(
    ) {
    cycle_eol_t *cycle_eol_local_var = malloc(sizeof(cycle_eol_t));
    if (!cycle_eol_local_var) {
        return NULL;
    }

    cycle_eol_local_var->_library_owned = 1;
    return cycle_eol_local_var;
}

__attribute__((deprecated)) cycle_eol_t *cycle_eol_create(
    ) {
    return cycle_eol_create_internal (
        );
}

void cycle_eol_free(cycle_eol_t *cycle_eol) {
    if(NULL == cycle_eol){
        return ;
    }
    if(cycle_eol->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "cycle_eol_free");
        return ;
    }
    listEntry_t *listEntry;
    free(cycle_eol);
}

cJSON *cycle_eol_convertToJSON(cycle_eol_t *cycle_eol) {
    cJSON *item = cJSON_CreateObject();
    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

cycle_eol_t *cycle_eol_parseFromJSON(cJSON *cycle_eolJSON){

    cycle_eol_t *cycle_eol_local_var = NULL;


    cycle_eol_local_var = cycle_eol_create_internal (
        );

    return cycle_eol_local_var;
end:
    return NULL;

}
