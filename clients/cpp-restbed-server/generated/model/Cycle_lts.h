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

/*
 * Cycle_lts.h
 *
 * Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date. 
 */

#ifndef Cycle_lts_H_
#define Cycle_lts_H_



#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date. 
/// </summary>
class  Cycle_lts 
{
public:
    Cycle_lts() = default;
    explicit Cycle_lts(boost::property_tree::ptree const& pt);
    virtual ~Cycle_lts() = default;

    Cycle_lts(const Cycle_lts& other) = default; // copy constructor
    Cycle_lts(Cycle_lts&& other) noexcept = default; // move constructor

    Cycle_lts& operator=(const Cycle_lts& other) = default; // copy assignment
    Cycle_lts& operator=(Cycle_lts&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// Cycle_lts members

protected:
};

std::vector<Cycle_lts> createCycle_ltsVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<Cycle_lts>(const Cycle_lts& val) {
    return val.toPropertyTree();
}

template<>
inline Cycle_lts fromPt<Cycle_lts>(const boost::property_tree::ptree& pt) {
    Cycle_lts ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* Cycle_lts_H_ */
