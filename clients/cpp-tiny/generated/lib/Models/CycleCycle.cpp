

#include "Cycle_cycle.h"

using namespace Tiny;

Cycle_cycle::Cycle_cycle()
{
}

Cycle_cycle::Cycle_cycle(std::string jsonString)
{
	this->fromJson(jsonString);
}

Cycle_cycle::~Cycle_cycle()
{

}

void
Cycle_cycle::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
Cycle_cycle::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



