/*
 * cycle_eol.h
 *
 * End of Life Date for this release cycle
 */

#ifndef _cycle_eol_H_
#define _cycle_eol_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct cycle_eol_t cycle_eol_t;




typedef struct cycle_eol_t {

} cycle_eol_t;

cycle_eol_t *cycle_eol_create(
);

void cycle_eol_free(cycle_eol_t *cycle_eol);

cycle_eol_t *cycle_eol_parseFromJSON(cJSON *cycle_eolJSON);

cJSON *cycle_eol_convertToJSON(cycle_eol_t *cycle_eol);

#endif /* _cycle_eol_H_ */

