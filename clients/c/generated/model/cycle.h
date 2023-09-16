/*
 * cycle.h
 *
 * Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
 */

#ifndef _cycle_H_
#define _cycle_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct cycle_t cycle_t;

#include "any_type.h"



typedef struct cycle_t {
    any_type_t *cycle; // custom
    any_type_t *release_date; // custom
    any_type_t *eol; // custom
    any_type_t *latest; // custom
    any_type_t *link; // custom
    any_type_t *lts; // custom
    any_type_t *support; // custom
    any_type_t *discontinued; // custom

} cycle_t;

cycle_t *cycle_create(
    any_type_t *cycle,
    any_type_t *release_date,
    any_type_t *eol,
    any_type_t *latest,
    any_type_t *link,
    any_type_t *lts,
    any_type_t *support,
    any_type_t *discontinued
);

void cycle_free(cycle_t *cycle);

cycle_t *cycle_parseFromJSON(cJSON *cycleJSON);

cJSON *cycle_convertToJSON(cycle_t *cycle);

#endif /* _cycle_H_ */

