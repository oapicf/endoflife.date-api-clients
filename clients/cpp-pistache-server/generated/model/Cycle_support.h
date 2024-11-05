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
/*
 * Cycle_support.h
 *
 * Whether this release cycle has active support
 */

#ifndef Cycle_support_H_
#define Cycle_support_H_


#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Whether this release cycle has active support
/// </summary>
class  Cycle_support
{
public:
    Cycle_support();
    virtual ~Cycle_support() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const Cycle_support& rhs) const;
    bool operator!=(const Cycle_support& rhs) const;

    /////////////////////////////////////////////
    /// Cycle_support members


    friend  void to_json(nlohmann::json& j, const Cycle_support& o);
    friend  void from_json(const nlohmann::json& j, Cycle_support& o);
protected:
    
};

} // namespace org::openapitools::server::model

#endif /* Cycle_support_H_ */