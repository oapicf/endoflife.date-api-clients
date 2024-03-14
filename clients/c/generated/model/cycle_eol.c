#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cycle_eol.h"



cycle_eol_t *cycle_eol_create(
    ) {
    cycle_eol_t *cycle_eol_local_var = malloc(sizeof(cycle_eol_t));
    if (!cycle_eol_local_var) {
        return NULL;
    }

    return cycle_eol_local_var;
}


void cycle_eol_free(cycle_eol_t *cycle_eol) {
    if(NULL == cycle_eol){
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


    cycle_eol_local_var = cycle_eol_create (
        );

    return cycle_eol_local_var;
end:
    return NULL;

}
