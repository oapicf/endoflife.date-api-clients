/**
* endoflife.date
* Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)
*
* The version of the OpenAPI document: 0.0.1
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "Cycle_support.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

Cycle_support::Cycle_support()
{
    
}

void Cycle_support::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool Cycle_support::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool Cycle_support::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "Cycle_support" : pathPrefix;

    
    return success;
}

bool Cycle_support::operator==(const Cycle_support& rhs) const
{
    return
    
    
    ;
}

bool Cycle_support::operator!=(const Cycle_support& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const Cycle_support& o)
{
    j = nlohmann::json::object();
    
}

void from_json(const nlohmann::json& j, Cycle_support& o)
{
    
}



} // namespace org::openapitools::server::model

