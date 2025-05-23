/**
 * endoflife.date
 * Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki).
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include "OAICycle_discontinued.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICycle_discontinued::OAICycle_discontinued(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICycle_discontinued::OAICycle_discontinued() {
    this->initializeModel();
}

OAICycle_discontinued::~OAICycle_discontinued() {}

void OAICycle_discontinued::initializeModel() {

}

void OAICycle_discontinued::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICycle_discontinued::fromJsonObject(QJsonObject json) {

}

QString OAICycle_discontinued::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICycle_discontinued::asJsonObject() const {
    QJsonObject obj;
    return obj;
}

bool OAICycle_discontinued::isSet() const {
    bool isObjectUpdated = false;
    do {

    } while (false);
    return isObjectUpdated;
}

bool OAICycle_discontinued::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
