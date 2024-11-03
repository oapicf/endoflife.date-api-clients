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
 * Cycle_eol.h
 *
 * End of Life Date for this release cycle
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_Cycle_eol_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_Cycle_eol_H_


#include "CppRestOpenAPIClient/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// End of Life Date for this release cycle
/// </summary>
class  Cycle_eol
    : public ModelBase
{
public:
    Cycle_eol();
    virtual ~Cycle_eol();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// Cycle_eol members


protected:
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_Cycle_eol_H_ */
