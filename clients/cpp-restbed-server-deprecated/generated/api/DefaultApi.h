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
 * DefaultApi.h
 *
 * 
 */

#ifndef DefaultApi_H_
#define DefaultApi_H_


#include <memory>
#include <utility>
#include <exception>

#include <corvusoft/restbed/session.hpp>
#include <corvusoft/restbed/resource.hpp>
#include <corvusoft/restbed/request.hpp>
#include <corvusoft/restbed/service.hpp>
#include <corvusoft/restbed/settings.hpp>

#include "Cycle.h"
#include <string>
#include <vector>

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

///
/// Exception to flag problems in the handlers
///
class  DefaultApiException: public std::exception
{
public:
    DefaultApiException(int status_code, std::string what);

    int getStatus() const;
    const char* what() const noexcept override;

private:
    int m_status;
    std::string m_what;
};

/// <summary>
/// All Products
/// </summary>
/// <remarks>
/// Return a list of all products. Each of these can be used for the other API endpoints.
/// </remarks>
class  DefaultApiApiAll.jsonResource: public restbed::Resource
{
public:
    DefaultApiApiAll.jsonResource(const std::string& context = "");
    virtual ~DefaultApiApiAll.jsonResource();

protected:
    //////////////////////////////////////////////////////////
    // Override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, std::vector<std::string>> handler_GET(
        );


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);



    virtual std::pair<int, std::string> handleDefaultApiException(const DefaultApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);


    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, const std::string& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_GET_internal(const std::shared_ptr<restbed::Session> session);
};


/// <summary>
/// Single cycle details
/// </summary>
/// <remarks>
/// Gets details of a single cycle.
/// </remarks>
class  DefaultApiApiProduct{cycle}.jsonResource: public restbed::Resource
{
public:
    DefaultApiApiProduct{cycle}.jsonResource(const std::string& context = "");
    virtual ~DefaultApiApiProduct{cycle}.jsonResource();

protected:
    //////////////////////////////////////////////////////////
    // Override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, std::shared_ptr<Cycle>> handler_GET(
        std::string const & product, std::string const & cycle);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);

    virtual std::string getPathParam_product(const std::shared_ptr<const restbed::Request>& request)
    {
        return request->get_path_parameter("product", "");
    }

    virtual std::string getPathParam_cycle(const std::shared_ptr<const restbed::Request>& request)
    {
        return request->get_path_parameter("cycle", "");
    }



    virtual std::pair<int, std::string> handleDefaultApiException(const DefaultApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);


    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, const std::string& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_GET_internal(const std::shared_ptr<restbed::Session> session);
};


/// <summary>
/// Get All Details
/// </summary>
/// <remarks>
/// Get EoL dates of all cycles of a given product.
/// </remarks>
class  DefaultApiApi{product}.jsonResource: public restbed::Resource
{
public:
    DefaultApiApi{product}.jsonResource(const std::string& context = "");
    virtual ~DefaultApiApi{product}.jsonResource();

protected:
    //////////////////////////////////////////////////////////
    // Override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, std::vector<std::shared_ptr<Cycle>>> handler_GET(
        std::string const & product);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);

    virtual std::string getPathParam_product(const std::shared_ptr<const restbed::Request>& request)
    {
        return request->get_path_parameter("product", "");
    }



    virtual std::pair<int, std::string> handleDefaultApiException(const DefaultApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);


    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, const std::string& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_GET_internal(const std::shared_ptr<restbed::Session> session);
};



//
// The restbed service to actually implement the REST server
//
class  DefaultApi
{
public:
    explicit DefaultApi(std::shared_ptr<restbed::Service> const& restbedService);
    virtual ~DefaultApi();

    virtual void setDefaultApiApiAll.jsonResource(std::shared_ptr<DefaultApiApiAll.jsonResource> spDefaultApiApiAll.jsonResource);
    virtual void setDefaultApiApiProduct{cycle}.jsonResource(std::shared_ptr<DefaultApiApiProduct{cycle}.jsonResource> spDefaultApiApiProduct{cycle}.jsonResource);
    virtual void setDefaultApiApi{product}.jsonResource(std::shared_ptr<DefaultApiApi{product}.jsonResource> spDefaultApiApi{product}.jsonResource);

    virtual void publishDefaultResources();

    virtual std::shared_ptr<restbed::Service> service();

protected:
    std::shared_ptr<DefaultApiApiAll.jsonResource> m_spDefaultApiApiAll.jsonResource;
    std::shared_ptr<DefaultApiApiProduct{cycle}.jsonResource> m_spDefaultApiApiProduct{cycle}.jsonResource;
    std::shared_ptr<DefaultApiApi{product}.jsonResource> m_spDefaultApiApi{product}.jsonResource;

private:
    std::shared_ptr<restbed::Service> m_service;
};


}
}
}
}

#endif /* DefaultApi_H_ */

