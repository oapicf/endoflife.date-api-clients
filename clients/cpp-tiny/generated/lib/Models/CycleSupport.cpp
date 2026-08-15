

#include "Cycle_support.h"

using namespace Tiny;

Cycle_support::Cycle_support()
{
}

Cycle_support::Cycle_support(std::string jsonString)
{
	this->fromJson(jsonString);
}

Cycle_support::~Cycle_support()
{

}

void
Cycle_support::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
Cycle_support::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



