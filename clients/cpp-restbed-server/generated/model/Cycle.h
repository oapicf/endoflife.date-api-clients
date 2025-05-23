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
 * Cycle.h
 *
 * Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
 */

#ifndef Cycle_H_
#define Cycle_H_



#include "Cycle_support.h"
#include "Cycle_eol.h"
#include <string>
#include "Cycle_cycle.h"
#include "Cycle_discontinued.h"
#include "Cycle_lts.h"
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
/// </summary>
class  Cycle 
{
public:
    Cycle() = default;
    explicit Cycle(boost::property_tree::ptree const& pt);
    virtual ~Cycle() = default;

    Cycle(const Cycle& other) = default; // copy constructor
    Cycle(Cycle&& other) noexcept = default; // move constructor

    Cycle& operator=(const Cycle& other) = default; // copy assignment
    Cycle& operator=(Cycle&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// Cycle members

    /// <summary>
    /// 
    /// </summary>
    Cycle_cycle getCycle() const;
    void setCycle(Cycle_cycle value);

    /// <summary>
    /// Release date for the first release in this cycle.
    /// </summary>
    std::string getReleaseDate() const;
    void setReleaseDate(std::string value);

    /// <summary>
    /// 
    /// </summary>
    Cycle_eol getEol() const;
    void setEol(Cycle_eol value);

    /// <summary>
    /// Latest release in this cycle.
    /// </summary>
    std::string getLatest() const;
    void setLatest(std::string value);

    /// <summary>
    /// Link to changelog for the latest release in this cycle, or null if unavailable.
    /// </summary>
    std::string getLink() const;
    void setLink(std::string value);

    /// <summary>
    /// 
    /// </summary>
    Cycle_lts getLts() const;
    void setLts(Cycle_lts value);

    /// <summary>
    /// 
    /// </summary>
    Cycle_support getSupport() const;
    void setSupport(Cycle_support value);

    /// <summary>
    /// 
    /// </summary>
    Cycle_discontinued getDiscontinued() const;
    void setDiscontinued(Cycle_discontinued value);

protected:
    Cycle_cycle m_Cycle;
    std::string m_ReleaseDate = "";
    Cycle_eol m_Eol;
    std::string m_Latest = "";
    std::string m_Link = "";
    Cycle_lts m_Lts;
    Cycle_support m_Support;
    Cycle_discontinued m_Discontinued;
};

std::vector<Cycle> createCycleVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<Cycle>(const Cycle& val) {
    return val.toPropertyTree();
}

template<>
inline Cycle fromPt<Cycle>(const boost::property_tree::ptree& pt) {
    Cycle ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* Cycle_H_ */
