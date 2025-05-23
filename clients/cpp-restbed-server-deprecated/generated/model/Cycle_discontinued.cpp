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



#include "Cycle_discontinued.h"

#include <string>
#include <vector>
#include <sstream>
#include <stdexcept>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

Cycle_discontinued::Cycle_discontinued(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string Cycle_discontinued::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void Cycle_discontinued::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree Cycle_discontinued::toPropertyTree()
{
    return toPropertyTree_internal();
}

void Cycle_discontinued::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string Cycle_discontinued::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void Cycle_discontinued::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree Cycle_discontinued::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	return pt;
}

void Cycle_discontinued::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
}


std::vector<Cycle_discontinued> createCycle_discontinuedVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<Cycle_discontinued>();
    for (const auto& child: pt) {
        vec.emplace_back(Cycle_discontinued(child.second));
    }

    return vec;
}

}
}
}
}

