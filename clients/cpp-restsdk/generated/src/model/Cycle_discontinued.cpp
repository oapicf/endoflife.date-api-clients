/**
 * endoflife.date
 * Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.6.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/Cycle_discontinued.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



Cycle_discontinued::Cycle_discontinued()
{
}

Cycle_discontinued::~Cycle_discontinued()
{
}

void Cycle_discontinued::validate()
{
    // TODO: implement validation
}

web::json::value Cycle_discontinued::toJson() const
{

    web::json::value val = web::json::value::object();
    

    return val;
}

bool Cycle_discontinued::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    return ok;
}

void Cycle_discontinued::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
}

bool Cycle_discontinued::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    return ok;
}

}
}
}
}


