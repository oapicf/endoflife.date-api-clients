#ifndef cycle_discontinued_TEST
#define cycle_discontinued_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define cycle_discontinued_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/cycle_discontinued.h"
cycle_discontinued_t* instantiate_cycle_discontinued(int include_optional);



cycle_discontinued_t* instantiate_cycle_discontinued(int include_optional) {
  cycle_discontinued_t* cycle_discontinued = NULL;
  if (include_optional) {
    cycle_discontinued = cycle_discontinued_create(
    );
  } else {
    cycle_discontinued = cycle_discontinued_create(
    );
  }

  return cycle_discontinued;
}


#ifdef cycle_discontinued_MAIN

void test_cycle_discontinued(int include_optional) {
    cycle_discontinued_t* cycle_discontinued_1 = instantiate_cycle_discontinued(include_optional);

	cJSON* jsoncycle_discontinued_1 = cycle_discontinued_convertToJSON(cycle_discontinued_1);
	printf("cycle_discontinued :\n%s\n", cJSON_Print(jsoncycle_discontinued_1));
	cycle_discontinued_t* cycle_discontinued_2 = cycle_discontinued_parseFromJSON(jsoncycle_discontinued_1);
	cJSON* jsoncycle_discontinued_2 = cycle_discontinued_convertToJSON(cycle_discontinued_2);
	printf("repeating cycle_discontinued:\n%s\n", cJSON_Print(jsoncycle_discontinued_2));
}

int main() {
  test_cycle_discontinued(1);
  test_cycle_discontinued(0);

  printf("Hello world \n");
  return 0;
}

#endif // cycle_discontinued_MAIN
#endif // cycle_discontinued_TEST
