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

#include "OAICycle.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICycle::OAICycle(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICycle::OAICycle() {
    this->initializeModel();
}

OAICycle::~OAICycle() {}

void OAICycle::initializeModel() {

    m_cycle_isSet = false;
    m_cycle_isValid = false;

    m_release_date_isSet = false;
    m_release_date_isValid = false;

    m_eol_isSet = false;
    m_eol_isValid = false;

    m_latest_isSet = false;
    m_latest_isValid = false;

    m_link_isSet = false;
    m_link_isValid = false;

    m_lts_isSet = false;
    m_lts_isValid = false;

    m_support_isSet = false;
    m_support_isValid = false;

    m_discontinued_isSet = false;
    m_discontinued_isValid = false;
}

void OAICycle::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICycle::fromJsonObject(QJsonObject json) {

    m_cycle_isValid = ::OpenAPI::fromJsonValue(cycle, json[QString("cycle")]);
    m_cycle_isSet = !json[QString("cycle")].isNull() && m_cycle_isValid;

    m_release_date_isValid = ::OpenAPI::fromJsonValue(release_date, json[QString("releaseDate")]);
    m_release_date_isSet = !json[QString("releaseDate")].isNull() && m_release_date_isValid;

    m_eol_isValid = ::OpenAPI::fromJsonValue(eol, json[QString("eol")]);
    m_eol_isSet = !json[QString("eol")].isNull() && m_eol_isValid;

    m_latest_isValid = ::OpenAPI::fromJsonValue(latest, json[QString("latest")]);
    m_latest_isSet = !json[QString("latest")].isNull() && m_latest_isValid;

    m_link_isValid = ::OpenAPI::fromJsonValue(link, json[QString("link")]);
    m_link_isSet = !json[QString("link")].isNull() && m_link_isValid;

    m_lts_isValid = ::OpenAPI::fromJsonValue(lts, json[QString("lts")]);
    m_lts_isSet = !json[QString("lts")].isNull() && m_lts_isValid;

    m_support_isValid = ::OpenAPI::fromJsonValue(support, json[QString("support")]);
    m_support_isSet = !json[QString("support")].isNull() && m_support_isValid;

    m_discontinued_isValid = ::OpenAPI::fromJsonValue(discontinued, json[QString("discontinued")]);
    m_discontinued_isSet = !json[QString("discontinued")].isNull() && m_discontinued_isValid;
}

QString OAICycle::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICycle::asJsonObject() const {
    QJsonObject obj;
    if (m_cycle_isSet) {
        obj.insert(QString("cycle"), ::OpenAPI::toJsonValue(cycle));
    }
    if (m_release_date_isSet) {
        obj.insert(QString("releaseDate"), ::OpenAPI::toJsonValue(release_date));
    }
    if (m_eol_isSet) {
        obj.insert(QString("eol"), ::OpenAPI::toJsonValue(eol));
    }
    if (m_latest_isSet) {
        obj.insert(QString("latest"), ::OpenAPI::toJsonValue(latest));
    }
    if (m_link_isSet) {
        obj.insert(QString("link"), ::OpenAPI::toJsonValue(link));
    }
    if (m_lts_isSet) {
        obj.insert(QString("lts"), ::OpenAPI::toJsonValue(lts));
    }
    if (m_support_isSet) {
        obj.insert(QString("support"), ::OpenAPI::toJsonValue(support));
    }
    if (m_discontinued_isSet) {
        obj.insert(QString("discontinued"), ::OpenAPI::toJsonValue(discontinued));
    }
    return obj;
}

OAIAnyType OAICycle::getCycle() const {
    return cycle;
}
void OAICycle::setCycle(const OAIAnyType &cycle) {
    this->cycle = cycle;
    this->m_cycle_isSet = true;
}

bool OAICycle::is_cycle_Set() const{
    return m_cycle_isSet;
}

bool OAICycle::is_cycle_Valid() const{
    return m_cycle_isValid;
}

OAIAnyType OAICycle::getReleaseDate() const {
    return release_date;
}
void OAICycle::setReleaseDate(const OAIAnyType &release_date) {
    this->release_date = release_date;
    this->m_release_date_isSet = true;
}

bool OAICycle::is_release_date_Set() const{
    return m_release_date_isSet;
}

bool OAICycle::is_release_date_Valid() const{
    return m_release_date_isValid;
}

OAIAnyType OAICycle::getEol() const {
    return eol;
}
void OAICycle::setEol(const OAIAnyType &eol) {
    this->eol = eol;
    this->m_eol_isSet = true;
}

bool OAICycle::is_eol_Set() const{
    return m_eol_isSet;
}

bool OAICycle::is_eol_Valid() const{
    return m_eol_isValid;
}

OAIAnyType OAICycle::getLatest() const {
    return latest;
}
void OAICycle::setLatest(const OAIAnyType &latest) {
    this->latest = latest;
    this->m_latest_isSet = true;
}

bool OAICycle::is_latest_Set() const{
    return m_latest_isSet;
}

bool OAICycle::is_latest_Valid() const{
    return m_latest_isValid;
}

OAIAnyType OAICycle::getLink() const {
    return link;
}
void OAICycle::setLink(const OAIAnyType &link) {
    this->link = link;
    this->m_link_isSet = true;
}

bool OAICycle::is_link_Set() const{
    return m_link_isSet;
}

bool OAICycle::is_link_Valid() const{
    return m_link_isValid;
}

OAIAnyType OAICycle::getLts() const {
    return lts;
}
void OAICycle::setLts(const OAIAnyType &lts) {
    this->lts = lts;
    this->m_lts_isSet = true;
}

bool OAICycle::is_lts_Set() const{
    return m_lts_isSet;
}

bool OAICycle::is_lts_Valid() const{
    return m_lts_isValid;
}

OAIAnyType OAICycle::getSupport() const {
    return support;
}
void OAICycle::setSupport(const OAIAnyType &support) {
    this->support = support;
    this->m_support_isSet = true;
}

bool OAICycle::is_support_Set() const{
    return m_support_isSet;
}

bool OAICycle::is_support_Valid() const{
    return m_support_isValid;
}

OAIAnyType OAICycle::getDiscontinued() const {
    return discontinued;
}
void OAICycle::setDiscontinued(const OAIAnyType &discontinued) {
    this->discontinued = discontinued;
    this->m_discontinued_isSet = true;
}

bool OAICycle::is_discontinued_Set() const{
    return m_discontinued_isSet;
}

bool OAICycle::is_discontinued_Valid() const{
    return m_discontinued_isValid;
}

bool OAICycle::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_cycle_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_release_date_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_eol_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_latest_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_link_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_lts_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_support_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_discontinued_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICycle::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
