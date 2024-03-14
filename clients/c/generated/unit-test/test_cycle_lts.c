#ifndef cycle_lts_TEST
#define cycle_lts_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define cycle_lts_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/cycle_lts.h"
cycle_lts_t* instantiate_cycle_lts(int include_optional);



cycle_lts_t* instantiate_cycle_lts(int include_optional) {
  cycle_lts_t* cycle_lts = NULL;
  if (include_optional) {
    cycle_lts = cycle_lts_create(
    );
  } else {
    cycle_lts = cycle_lts_create(
    );
  }

  return cycle_lts;
}


#ifdef cycle_lts_MAIN

void test_cycle_lts(int include_optional) {
    cycle_lts_t* cycle_lts_1 = instantiate_cycle_lts(include_optional);

	cJSON* jsoncycle_lts_1 = cycle_lts_convertToJSON(cycle_lts_1);
	printf("cycle_lts :\n%s\n", cJSON_Print(jsoncycle_lts_1));
	cycle_lts_t* cycle_lts_2 = cycle_lts_parseFromJSON(jsoncycle_lts_1);
	cJSON* jsoncycle_lts_2 = cycle_lts_convertToJSON(cycle_lts_2);
	printf("repeating cycle_lts:\n%s\n", cJSON_Print(jsoncycle_lts_2));
}

int main() {
  test_cycle_lts(1);
  test_cycle_lts(0);

  printf("Hello world \n");
  return 0;
}

#endif // cycle_lts_MAIN
#endif // cycle_lts_TEST
