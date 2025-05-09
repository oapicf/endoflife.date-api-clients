/*
 * cycle_lts.h
 *
 * Whether this release cycle has long-term-support (LTS), or the date it entered LTS status.
 */

#ifndef _cycle_lts_H_
#define _cycle_lts_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct cycle_lts_t cycle_lts_t;




typedef struct cycle_lts_t {

    int _library_owned; // Is the library responsible for freeing this object?
} cycle_lts_t;

__attribute__((deprecated)) cycle_lts_t *cycle_lts_create(
);

void cycle_lts_free(cycle_lts_t *cycle_lts);

cycle_lts_t *cycle_lts_parseFromJSON(cJSON *cycle_ltsJSON);

cJSON *cycle_lts_convertToJSON(cycle_lts_t *cycle_lts);

#endif /* _cycle_lts_H_ */

