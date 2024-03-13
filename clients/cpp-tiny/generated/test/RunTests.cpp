
#include "CycleTest.cpp"

#include "Cycle_cycleTest.cpp"

#include "Cycle_discontinuedTest.cpp"

#include "Cycle_eolTest.cpp"

#include "Cycle_ltsTest.cpp"

#include "Cycle_supportTest.cpp"



void setUp(){}

void tearDown(){}

void runTests(){
    
    
    
    
    
    RUN_TEST(test_Cycle_latest_is_assigned_from_json);
    
    
    RUN_TEST(test_Cycle_link_is_assigned_from_json);
    
    
    
    
    
    
    
    
    
    

    
    
    
    
    
    RUN_TEST(test_Cycle_latest_is_converted_to_json);
    
    
    RUN_TEST(test_Cycle_link_is_converted_to_json);
    
    
    
    
    
    
    
    
    
    


}

int main(void) {
    UNITY_BEGIN();
    runTests();
    return UNITY_END();
}

void setup() {
    UNITY_BEGIN();
    runTests();
    UNITY_END();
}

void loop() {

}
