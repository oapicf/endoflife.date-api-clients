#ifndef cycle_cycle_TEST
#define cycle_cycle_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define cycle_cycle_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/cycle_cycle.h"
cycle_cycle_t* instantiate_cycle_cycle(int include_optional);



cycle_cycle_t* instantiate_cycle_cycle(int include_optional) {
  cycle_cycle_t* cycle_cycle = NULL;
  if (include_optional) {
    cycle_cycle = cycle_cycle_create(
    );
  } else {
    cycle_cycle = cycle_cycle_create(
    );
  }

  return cycle_cycle;
}


#ifdef cycle_cycle_MAIN

void test_cycle_cycle(int include_optional) {
    cycle_cycle_t* cycle_cycle_1 = instantiate_cycle_cycle(include_optional);

	cJSON* jsoncycle_cycle_1 = cycle_cycle_convertToJSON(cycle_cycle_1);
	printf("cycle_cycle :\n%s\n", cJSON_Print(jsoncycle_cycle_1));
	cycle_cycle_t* cycle_cycle_2 = cycle_cycle_parseFromJSON(jsoncycle_cycle_1);
	cJSON* jsoncycle_cycle_2 = cycle_cycle_convertToJSON(cycle_cycle_2);
	printf("repeating cycle_cycle:\n%s\n", cJSON_Print(jsoncycle_cycle_2));
}

int main() {
  test_cycle_cycle(1);
  test_cycle_cycle(0);

  printf("Hello world \n");
  return 0;
}

#endif // cycle_cycle_MAIN
#endif // cycle_cycle_TEST
