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
 * Cycle_discontinued.h
 *
 * Whether this device version is no longer in production.
 */

#ifndef Cycle_discontinued_H_
#define Cycle_discontinued_H_



#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Whether this device version is no longer in production.
/// </summary>
class  Cycle_discontinued 
{
public:
    Cycle_discontinued() = default;
    explicit Cycle_discontinued(boost::property_tree::ptree const& pt);
    virtual ~Cycle_discontinued() = default;

    Cycle_discontinued(const Cycle_discontinued& other) = default; // copy constructor
    Cycle_discontinued(Cycle_discontinued&& other) noexcept = default; // move constructor

    Cycle_discontinued& operator=(const Cycle_discontinued& other) = default; // copy assignment
    Cycle_discontinued& operator=(Cycle_discontinued&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// Cycle_discontinued members

protected:
};

std::vector<Cycle_discontinued> createCycle_discontinuedVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<Cycle_discontinued>(const Cycle_discontinued& val) {
    return val.toPropertyTree();
}

template<>
inline Cycle_discontinued fromPt<Cycle_discontinued>(const boost::property_tree::ptree& pt) {
    Cycle_discontinued ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* Cycle_discontinued_H_ */
