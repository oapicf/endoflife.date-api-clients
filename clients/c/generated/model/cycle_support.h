/*
 * cycle_support.h
 *
 * Whether this release cycle has active support.
 */

#ifndef _cycle_support_H_
#define _cycle_support_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct cycle_support_t cycle_support_t;




typedef struct cycle_support_t {

    int _library_owned; // Is the library responsible for freeing this object?
} cycle_support_t;

__attribute__((deprecated)) cycle_support_t *cycle_support_create(
);

void cycle_support_free(cycle_support_t *cycle_support);

cycle_support_t *cycle_support_parseFromJSON(cJSON *cycle_supportJSON);

cJSON *cycle_support_convertToJSON(cycle_support_t *cycle_support);

#endif /* _cycle_support_H_ */

