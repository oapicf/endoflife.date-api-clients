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

#include "cycle_cycle.h"
#include "cycle_discontinued.h"
#include "cycle_eol.h"
#include "cycle_lts.h"
#include "cycle_support.h"



typedef struct cycle_t {
    struct cycle_cycle_t *cycle; //model
    char *release_date; //date
    struct cycle_eol_t *eol; //model
    char *latest; // string
    char *link; // string
    struct cycle_lts_t *lts; //model
    struct cycle_support_t *support; //model
    struct cycle_discontinued_t *discontinued; //model

    int _library_owned; // Is the library responsible for freeing this object?
} cycle_t;

__attribute__((deprecated)) cycle_t *cycle_create(
    cycle_cycle_t *cycle,
    char *release_date,
    cycle_eol_t *eol,
    char *latest,
    char *link,
    cycle_lts_t *lts,
    cycle_support_t *support,
    cycle_discontinued_t *discontinued
);

void cycle_free(cycle_t *cycle);

cycle_t *cycle_parseFromJSON(cJSON *cycleJSON);

cJSON *cycle_convertToJSON(cycle_t *cycle);

#endif /* _cycle_H_ */

