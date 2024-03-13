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



#include "Cycle.h"

#include <string>
#include <vector>
#include <map>
#include <sstream>
#include <stdexcept>
#include <regex>
#include <boost/lexical_cast.hpp>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>
#include "helpers.h"

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

Cycle::Cycle(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string Cycle::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void Cycle::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree Cycle::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.add_child("cycle", m_Cycle.toPropertyTree());
	pt.put("releaseDate", m_ReleaseDate);
	pt.add_child("eol", m_Eol.toPropertyTree());
	pt.put("latest", m_Latest);
	pt.put("link", m_Link);
	pt.add_child("lts", m_Lts.toPropertyTree());
	pt.add_child("support", m_Support.toPropertyTree());
	pt.add_child("discontinued", m_Discontinued.toPropertyTree());
	return pt;
}

void Cycle::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	if (pt.get_child_optional("cycle")) {
        m_Cycle = fromPt<Cycle_cycle>(pt.get_child("cycle"));
	}
	m_ReleaseDate = pt.get("releaseDate", "");
	if (pt.get_child_optional("eol")) {
        m_Eol = fromPt<Cycle_eol>(pt.get_child("eol"));
	}
	m_Latest = pt.get("latest", "");
	m_Link = pt.get("link", "");
	if (pt.get_child_optional("lts")) {
        m_Lts = fromPt<Cycle_lts>(pt.get_child("lts"));
	}
	if (pt.get_child_optional("support")) {
        m_Support = fromPt<Cycle_support>(pt.get_child("support"));
	}
	if (pt.get_child_optional("discontinued")) {
        m_Discontinued = fromPt<Cycle_discontinued>(pt.get_child("discontinued"));
	}
}

Cycle_cycle Cycle::getCycle() const
{
    return m_Cycle;
}

void Cycle::setCycle(Cycle_cycle value)
{
    m_Cycle = value;
}


std::string Cycle::getReleaseDate() const
{
    return m_ReleaseDate;
}

void Cycle::setReleaseDate(std::string value)
{
    m_ReleaseDate = value;
}


Cycle_eol Cycle::getEol() const
{
    return m_Eol;
}

void Cycle::setEol(Cycle_eol value)
{
    m_Eol = value;
}


std::string Cycle::getLatest() const
{
    return m_Latest;
}

void Cycle::setLatest(std::string value)
{
    m_Latest = value;
}


std::string Cycle::getLink() const
{
    return m_Link;
}

void Cycle::setLink(std::string value)
{
    m_Link = value;
}


Cycle_lts Cycle::getLts() const
{
    return m_Lts;
}

void Cycle::setLts(Cycle_lts value)
{
    m_Lts = value;
}


Cycle_support Cycle::getSupport() const
{
    return m_Support;
}

void Cycle::setSupport(Cycle_support value)
{
    m_Support = value;
}


Cycle_discontinued Cycle::getDiscontinued() const
{
    return m_Discontinued;
}

void Cycle::setDiscontinued(Cycle_discontinued value)
{
    m_Discontinued = value;
}



std::vector<Cycle> createCycleVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<Cycle>();
    for (const auto& child: pt) {
        vec.emplace_back(Cycle(child.second));
    }

    return vec;
}

}
}
}
}

