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

#ifndef OAI_OAIDefaultApi_H
#define OAI_OAIDefaultApi_H

#include "OAIHelpers.h"
#include "OAIHttpRequest.h"
#include "OAIServerConfiguration.h"
#include "OAIOauth.h"

#include "OAICycle.h"
#include <QJsonValue>
#include <QString>

#include <QObject>
#include <QByteArray>
#include <QStringList>
#include <QList>
#include <QNetworkAccessManager>

namespace OpenAPI {

class OAIDefaultApi : public QObject {
    Q_OBJECT

public:
    OAIDefaultApi(const int timeOut = 0);
    ~OAIDefaultApi();

    void initializeServerConfigs();
    int setDefaultServerValue(int serverIndex,const QString &operation, const QString &variable,const QString &val);
    void setServerIndex(const QString &operation, int serverIndex);
    void setApiKey(const QString &apiKeyName, const QString &apiKey);
    void setBearerToken(const QString &token);
    void setUsername(const QString &username);
    void setPassword(const QString &password);
    void setTimeOut(const int timeOut);
    void setWorkingDirectory(const QString &path);
    void setNetworkAccessManager(QNetworkAccessManager* manager);
    int addServerConfiguration(const QString &operation, const QUrl &url, const QString &description = "", const QMap<QString, OAIServerVariable> &variables = QMap<QString, OAIServerVariable>());
    void setNewServerForAllOperations(const QUrl &url, const QString &description = "", const QMap<QString, OAIServerVariable> &variables =  QMap<QString, OAIServerVariable>());
    void setNewServer(const QString &operation, const QUrl &url, const QString &description = "", const QMap<QString, OAIServerVariable> &variables =  QMap<QString, OAIServerVariable>());
    void addHeaders(const QString &key, const QString &value);
    void enableRequestCompression();
    void enableResponseCompression();
    void abortRequests();
    QString getParamStylePrefix(const QString &style);
    QString getParamStyleSuffix(const QString &style);
    QString getParamStyleDelimiter(const QString &style, const QString &name, bool isExplode);


    void getApiAll_json();

    /**
    * @param[in]  product QJsonValue [required]
    * @param[in]  cycle QJsonValue [required]
    */
    void getApiProductCycle_json(const QJsonValue &product, const QJsonValue &cycle);

    /**
    * @param[in]  product QJsonValue [required]
    */
    void getApiProduct_json(const QJsonValue &product);


private:
    QMap<QString,int> _serverIndices;
    QMap<QString,QList<OAIServerConfiguration>> _serverConfigs;
    QMap<QString, QString> _apiKeys;
    QString _bearerToken;
    QString _username;
    QString _password;
    int _timeOut;
    QString _workingDirectory;
    QNetworkAccessManager* _manager;
    QMap<QString, QString> _defaultHeaders;
    bool _isResponseCompressionEnabled;
    bool _isRequestCompressionEnabled;
    OAIHttpRequestInput _latestInput;
    OAIHttpRequestWorker *_latestWorker;
    QStringList _latestScope;
    OauthCode _authFlow;
    OauthImplicit _implicitFlow;
    OauthCredentials _credentialFlow;
    OauthPassword _passwordFlow;
    int _OauthMethod = 0;

    void getApiAll_jsonCallback(OAIHttpRequestWorker *worker);
    void getApiProductCycle_jsonCallback(OAIHttpRequestWorker *worker);
    void getApiProduct_jsonCallback(OAIHttpRequestWorker *worker);

signals:

    void getApiAll_jsonSignal(QJsonValue summary);
    void getApiProductCycle_jsonSignal(OAICycle summary);
    void getApiProduct_jsonSignal(QJsonValue summary);

    void getApiAll_jsonSignalFull(OAIHttpRequestWorker *worker, QJsonValue summary);
    void getApiProductCycle_jsonSignalFull(OAIHttpRequestWorker *worker, OAICycle summary);
    void getApiProduct_jsonSignalFull(OAIHttpRequestWorker *worker, QJsonValue summary);

    void getApiAll_jsonSignalE(QJsonValue summary, QNetworkReply::NetworkError error_type, QString error_str);
    void getApiProductCycle_jsonSignalE(OAICycle summary, QNetworkReply::NetworkError error_type, QString error_str);
    void getApiProduct_jsonSignalE(QJsonValue summary, QNetworkReply::NetworkError error_type, QString error_str);

    void getApiAll_jsonSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void getApiProductCycle_jsonSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void getApiProduct_jsonSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);

    void abortRequestsSignal();
    void allPendingRequestsCompleted();

public slots:
    void tokenAvailable();

};

} // namespace OpenAPI
#endif