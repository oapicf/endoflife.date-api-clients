/**
 * endoflife.date
 * Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki).
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.12.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * Cycle_eol.h
 *
 * End-of-Life date for this release cycle.
 */

#ifndef Cycle_eol_H_
#define Cycle_eol_H_



#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// End-of-Life date for this release cycle.
/// </summary>
class  Cycle_eol 
{
public:
    Cycle_eol() = default;
    explicit Cycle_eol(boost::property_tree::ptree const& pt);
    virtual ~Cycle_eol() = default;

    Cycle_eol(const Cycle_eol& other) = default; // copy constructor
    Cycle_eol(Cycle_eol&& other) noexcept = default; // move constructor

    Cycle_eol& operator=(const Cycle_eol& other) = default; // copy assignment
    Cycle_eol& operator=(Cycle_eol&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// Cycle_eol members

protected:
};

std::vector<Cycle_eol> createCycle_eolVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<Cycle_eol>(const Cycle_eol& val) {
    return val.toPropertyTree();
}

template<>
inline Cycle_eol fromPt<Cycle_eol>(const boost::property_tree::ptree& pt) {
    Cycle_eol ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* Cycle_eol_H_ */
