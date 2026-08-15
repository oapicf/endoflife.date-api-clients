

#include "Cycle_discontinued.h"

using namespace Tiny;

Cycle_discontinued::Cycle_discontinued()
{
}

Cycle_discontinued::Cycle_discontinued(std::string jsonString)
{
	this->fromJson(jsonString);
}

Cycle_discontinued::~Cycle_discontinued()
{

}

void
Cycle_discontinued::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
Cycle_discontinued::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



