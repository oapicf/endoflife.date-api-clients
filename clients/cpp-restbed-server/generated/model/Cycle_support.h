/**
 * endoflife.date
 * Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
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



#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Whether this release cycle has active support
/// </summary>
class  Cycle_support 
{
public:
    Cycle_support() = default;
    explicit Cycle_support(boost::property_tree::ptree const& pt);
    virtual ~Cycle_support() = default;

    Cycle_support(const Cycle_support& other) = default; // copy constructor
    Cycle_support(Cycle_support&& other) noexcept = default; // move constructor

    Cycle_support& operator=(const Cycle_support& other) = default; // copy assignment
    Cycle_support& operator=(Cycle_support&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// Cycle_support members

protected:
};

std::vector<Cycle_support> createCycle_supportVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<Cycle_support>(const Cycle_support& val) {
    return val.toPropertyTree();
}

template<>
inline Cycle_support fromPt<Cycle_support>(const boost::property_tree::ptree& pt) {
    Cycle_support ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* Cycle_support_H_ */