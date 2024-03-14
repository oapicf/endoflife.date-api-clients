/*
 * cycle_lts.h
 *
 * Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date. 
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

} cycle_lts_t;

cycle_lts_t *cycle_lts_create(
);

void cycle_lts_free(cycle_lts_t *cycle_lts);

cycle_lts_t *cycle_lts_parseFromJSON(cJSON *cycle_ltsJSON);

cJSON *cycle_lts_convertToJSON(cycle_lts_t *cycle_lts);

#endif /* _cycle_lts_H_ */

