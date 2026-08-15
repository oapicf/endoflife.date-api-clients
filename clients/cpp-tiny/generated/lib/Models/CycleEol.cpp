

#include "Cycle_eol.h"

using namespace Tiny;

Cycle_eol::Cycle_eol()
{
}

Cycle_eol::Cycle_eol(std::string jsonString)
{
	this->fromJson(jsonString);
}

Cycle_eol::~Cycle_eol()
{

}

void
Cycle_eol::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
Cycle_eol::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



