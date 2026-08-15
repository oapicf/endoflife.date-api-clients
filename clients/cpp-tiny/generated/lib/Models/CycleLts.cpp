

#include "Cycle_lts.h"

using namespace Tiny;

Cycle_lts::Cycle_lts()
{
}

Cycle_lts::Cycle_lts(std::string jsonString)
{
	this->fromJson(jsonString);
}

Cycle_lts::~Cycle_lts()
{

}

void
Cycle_lts::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
Cycle_lts::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



