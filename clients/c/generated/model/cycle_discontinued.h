/*
 * cycle_discontinued.h
 *
 * Whether this cycle is now discontinued.
 */

#ifndef _cycle_discontinued_H_
#define _cycle_discontinued_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct cycle_discontinued_t cycle_discontinued_t;




typedef struct cycle_discontinued_t {

} cycle_discontinued_t;

cycle_discontinued_t *cycle_discontinued_create(
);

void cycle_discontinued_free(cycle_discontinued_t *cycle_discontinued);

cycle_discontinued_t *cycle_discontinued_parseFromJSON(cJSON *cycle_discontinuedJSON);

cJSON *cycle_discontinued_convertToJSON(cycle_discontinued_t *cycle_discontinued);

#endif /* _cycle_discontinued_H_ */

