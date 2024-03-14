#ifndef cycle_support_TEST
#define cycle_support_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define cycle_support_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/cycle_support.h"
cycle_support_t* instantiate_cycle_support(int include_optional);



cycle_support_t* instantiate_cycle_support(int include_optional) {
  cycle_support_t* cycle_support = NULL;
  if (include_optional) {
    cycle_support = cycle_support_create(
    );
  } else {
    cycle_support = cycle_support_create(
    );
  }

  return cycle_support;
}


#ifdef cycle_support_MAIN

void test_cycle_support(int include_optional) {
    cycle_support_t* cycle_support_1 = instantiate_cycle_support(include_optional);

	cJSON* jsoncycle_support_1 = cycle_support_convertToJSON(cycle_support_1);
	printf("cycle_support :\n%s\n", cJSON_Print(jsoncycle_support_1));
	cycle_support_t* cycle_support_2 = cycle_support_parseFromJSON(jsoncycle_support_1);
	cJSON* jsoncycle_support_2 = cycle_support_convertToJSON(cycle_support_2);
	printf("repeating cycle_support:\n%s\n", cJSON_Print(jsoncycle_support_2));
}

int main() {
  test_cycle_support(1);
  test_cycle_support(0);

  printf("Hello world \n");
  return 0;
}

#endif // cycle_support_MAIN
#endif // cycle_support_TEST
