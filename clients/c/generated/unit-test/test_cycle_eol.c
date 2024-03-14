#ifndef cycle_eol_TEST
#define cycle_eol_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define cycle_eol_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/cycle_eol.h"
cycle_eol_t* instantiate_cycle_eol(int include_optional);



cycle_eol_t* instantiate_cycle_eol(int include_optional) {
  cycle_eol_t* cycle_eol = NULL;
  if (include_optional) {
    cycle_eol = cycle_eol_create(
    );
  } else {
    cycle_eol = cycle_eol_create(
    );
  }

  return cycle_eol;
}


#ifdef cycle_eol_MAIN

void test_cycle_eol(int include_optional) {
    cycle_eol_t* cycle_eol_1 = instantiate_cycle_eol(include_optional);

	cJSON* jsoncycle_eol_1 = cycle_eol_convertToJSON(cycle_eol_1);
	printf("cycle_eol :\n%s\n", cJSON_Print(jsoncycle_eol_1));
	cycle_eol_t* cycle_eol_2 = cycle_eol_parseFromJSON(jsoncycle_eol_1);
	cJSON* jsoncycle_eol_2 = cycle_eol_convertToJSON(cycle_eol_2);
	printf("repeating cycle_eol:\n%s\n", cJSON_Print(jsoncycle_eol_2));
}

int main() {
  test_cycle_eol(1);
  test_cycle_eol(0);

  printf("Hello world \n");
  return 0;
}

#endif // cycle_eol_MAIN
#endif // cycle_eol_TEST
