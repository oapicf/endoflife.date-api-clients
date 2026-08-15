#ifndef TINY_CPP_CLIENT_DefaultApi_H_
#define TINY_CPP_CLIENT_DefaultApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "Cycle.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class DefaultApi : public Service {
public:
    DefaultApi() = default;

    virtual ~DefaultApi();

    /**
    * All Products.
    *
    * Return a list of all products. Each of these can be used for the other API endpoints.
    */
    Response<
                    std::list<std::string>
        >
    getApiAll_json(
    );
    /**
    * Single cycle details.
    *
    * Gets details of a single cycle.
    * \param product Product URL as per the canonical URL on the endofife.date website. *Required*
    * \param cycle Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD's releng/14.0 becomes releng-14.0. *Required*
    */
    Response<
                Cycle
        >
    getApiProductCycle_json(
            
            std::string product
            , 
            
            std::string cycle
            
    );
    /**
    * Get All Details.
    *
    * Get EoL dates of all cycles of a given product.
    * \param product Product URL as per the canonical URL on the endofife.date website. *Required*
    */
    Response<
                    std::list<Cycle>
        >
    getApiProduct_json(
            
            std::string product
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_DefaultApi_H_ */