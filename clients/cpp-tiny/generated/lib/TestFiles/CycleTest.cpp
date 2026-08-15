
#include "Cycle.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"






void test_Cycle_latest_is_assigned_from_json()
{


    bourne::json input =
    {
        "latest", "hello"
    };

    Cycle obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLatest().c_str());






}


void test_Cycle_link_is_assigned_from_json()
{


    bourne::json input =
    {
        "link", "hello"
    };

    Cycle obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLink().c_str());






}









void test_Cycle_latest_is_converted_to_json()
{

    bourne::json input =
    {
        "latest", "hello"
    };

    Cycle obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["latest"] == output["latest"]);



}


void test_Cycle_link_is_converted_to_json()
{

    bourne::json input =
    {
        "link", "hello"
    };

    Cycle obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["link"] == output["link"]);



}





