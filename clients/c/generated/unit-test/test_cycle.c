#ifndef cycle_TEST
#define cycle_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define cycle_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/cycle.h"
cycle_t* instantiate_cycle(int include_optional);



cycle_t* instantiate_cycle(int include_optional) {
  cycle_t* cycle = NULL;
  if (include_optional) {
    cycle = cycle_create(
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null
    );
  } else {
    cycle = cycle_create(
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null
    );
  }

  return cycle;
}


#ifdef cycle_MAIN

void test_cycle(int include_optional) {
    cycle_t* cycle_1 = instantiate_cycle(include_optional);

	cJSON* jsoncycle_1 = cycle_convertToJSON(cycle_1);
	printf("cycle :\n%s\n", cJSON_Print(jsoncycle_1));
	cycle_t* cycle_2 = cycle_parseFromJSON(jsoncycle_1);
	cJSON* jsoncycle_2 = cycle_convertToJSON(cycle_2);
	printf("repeating cycle:\n%s\n", cJSON_Print(jsoncycle_2));
}

int main() {
  test_cycle(1);
  test_cycle(0);

  printf("Hello world \n");
  return 0;
}

#endif // cycle_MAIN
#endif // cycle_TEST
