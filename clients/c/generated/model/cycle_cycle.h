/*
 * cycle_cycle.h
 *
 * The release cycle which this release is part of.
 */

#ifndef _cycle_cycle_H_
#define _cycle_cycle_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct cycle_cycle_t cycle_cycle_t;




typedef struct cycle_cycle_t {

    int _library_owned; // Is the library responsible for freeing this object?
} cycle_cycle_t;

__attribute__((deprecated)) cycle_cycle_t *cycle_cycle_create(
);

void cycle_cycle_free(cycle_cycle_t *cycle_cycle);

cycle_cycle_t *cycle_cycle_parseFromJSON(cJSON *cycle_cycleJSON);

cJSON *cycle_cycle_convertToJSON(cycle_cycle_t *cycle_cycle);

#endif /* _cycle_cycle_H_ */

