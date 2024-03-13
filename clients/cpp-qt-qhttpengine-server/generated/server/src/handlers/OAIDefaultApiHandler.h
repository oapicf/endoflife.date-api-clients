/**
 * endoflife.date
 * Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#ifndef OAI_OAIDefaultApiHandler_H
#define OAI_OAIDefaultApiHandler_H

#include <QObject>

#include "OAIAnyType.h"
#include "OAICycle.h"
#include <QString>

namespace OpenAPI {

class OAIDefaultApiHandler : public QObject
{
    Q_OBJECT

public:
    OAIDefaultApiHandler();
    virtual ~OAIDefaultApiHandler();


public slots:
    virtual void getApiAll_json();
    virtual void getApiProductCycle_json(OAIAnyType product, OAIAnyType cycle);
    virtual void getApiProduct_json(OAIAnyType product);


};

}

#endif // OAI_OAIDefaultApiHandler_H
