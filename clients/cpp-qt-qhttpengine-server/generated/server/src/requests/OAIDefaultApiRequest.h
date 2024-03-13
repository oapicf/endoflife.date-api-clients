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

#ifndef OAI_OAIDefaultApiRequest_H
#define OAI_OAIDefaultApiRequest_H

#include <QObject>
#include <QStringList>
#include <QMultiMap>
#include <QNetworkReply>
#include <QSharedPointer>

#include <qhttpengine/socket.h>
#include "OAICycle.h"
#include <QList>
#include <QString>
#include "OAIDefaultApiHandler.h"

namespace OpenAPI {

class OAIDefaultApiRequest : public QObject
{
    Q_OBJECT

public:
    OAIDefaultApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIDefaultApiHandler> handler);
    virtual ~OAIDefaultApiRequest();

    void getApiAll_jsonRequest();
    void getApiProductCycle_jsonRequest(const QString& product, const QString& cycle);
    void getApiProduct_jsonRequest(const QString& product);
    

    void getApiAll_jsonResponse(const QList<QString>& res);
    void getApiProductCycle_jsonResponse(const OAICycle& res);
    void getApiProduct_jsonResponse(const QList<OAICycle>& res);
    

    void getApiAll_jsonError(const QList<QString>& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getApiProductCycle_jsonError(const OAICycle& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getApiProduct_jsonError(const QList<OAICycle>& res, QNetworkReply::NetworkError error_type, QString& error_str);
    

    void sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type);

    void sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type);

    QMap<QString, QString> getRequestHeaders() const;

    QHttpEngine::Socket* getRawSocket();

    void setResponseHeaders(const QMultiMap<QString,QString>& headers);

Q_SIGNALS:
    void getApiAll_json();
    void getApiProductCycle_json(QString product, QString cycle);
    void getApiProduct_json(QString product);
    

private:
    QMap<QString, QString> requestHeaders;
    QMap<QString, QString> responseHeaders;
    QHttpEngine::Socket  *socket;
    QSharedPointer<OAIDefaultApiHandler> handler;

    inline void setSocketResponseHeaders(){
        QHttpEngine::Socket::HeaderMap resHeaders;
        for(auto itr = responseHeaders.begin(); itr != responseHeaders.end(); ++itr) {
            resHeaders.insert(itr.key().toUtf8(), itr.value().toUtf8());
        }
        socket->setHeaders(resHeaders);
    }
};

}

#endif // OAI_OAIDefaultApiRequest_H
