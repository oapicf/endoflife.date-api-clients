/**
 * endoflife.date
 * Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include <QJsonArray>
#include <QJsonDocument>
#include <QJsonObject>
#include <QVariantMap>
#include <QDebug>

#include "OAIHelpers.h"
#include "OAIDefaultApiRequest.h"

namespace OpenAPI {

OAIDefaultApiRequest::OAIDefaultApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIDefaultApiHandler> hdl) : QObject(s), socket(s), handler(hdl) {
    auto headers = s->headers();
    for(auto itr = headers.begin(); itr != headers.end(); itr++) {
        requestHeaders.insert(QString(itr.key()), QString(itr.value()));
    }
}

OAIDefaultApiRequest::~OAIDefaultApiRequest(){
    disconnect(this, nullptr, nullptr, nullptr);
    qDebug() << "OAIDefaultApiRequest::~OAIDefaultApiRequest()";
}

QMap<QString, QString>
OAIDefaultApiRequest::getRequestHeaders() const {
    return requestHeaders;
}

void OAIDefaultApiRequest::setResponseHeaders(const QMultiMap<QString, QString>& headers){
    for(auto itr = headers.begin(); itr != headers.end(); ++itr) {
        responseHeaders.insert(itr.key(), itr.value());
    }
}


QHttpEngine::Socket* OAIDefaultApiRequest::getRawSocket(){
    return socket;
}


void OAIDefaultApiRequest::getApiAll_jsonRequest(){
    qDebug() << "/api/all.json";
    connect(this, &OAIDefaultApiRequest::getApiAll_json, handler.data(), &OAIDefaultApiHandler::getApiAll_json);

    


    emit getApiAll_json();
}


void OAIDefaultApiRequest::getApiProductCycle_jsonRequest(const QString& productstr, const QString& cyclestr){
    qDebug() << "/api/{product}/{cycle}.json";
    connect(this, &OAIDefaultApiRequest::getApiProductCycle_json, handler.data(), &OAIDefaultApiHandler::getApiProductCycle_json);

    
    OAIAnyType product;
    fromStringValue(productstr, product);
        OAIAnyType cycle;
    fromStringValue(cyclestr, cycle);
    

    emit getApiProductCycle_json(product, cycle);
}


void OAIDefaultApiRequest::getApiProduct_jsonRequest(const QString& productstr){
    qDebug() << "/api/{product}.json";
    connect(this, &OAIDefaultApiRequest::getApiProduct_json, handler.data(), &OAIDefaultApiHandler::getApiProduct_json);

    
    OAIAnyType product;
    fromStringValue(productstr, product);
    

    emit getApiProduct_json(product);
}



void OAIDefaultApiRequest::getApiAll_jsonResponse(const OAIAnyType& res){
    setSocketResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIDefaultApiRequest::getApiProductCycle_jsonResponse(const OAICycle& res){
    setSocketResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIDefaultApiRequest::getApiProduct_jsonResponse(const OAIAnyType& res){
    setSocketResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIDefaultApiRequest::getApiAll_jsonError(const OAIAnyType& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIDefaultApiRequest::getApiProductCycle_jsonError(const OAICycle& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIDefaultApiRequest::getApiProduct_jsonError(const OAIAnyType& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIDefaultApiRequest::sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type); // TODO
    socket->write(res);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIDefaultApiRequest::sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type);  // TODO
    socket->write(res->readAll());
    if(socket->isOpen()){
        socket->close();
    }
}

}