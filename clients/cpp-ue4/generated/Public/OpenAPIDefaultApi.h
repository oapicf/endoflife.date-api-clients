/**
 * endoflife.date
 * Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)
 *
 * OpenAPI spec version: 0.0.1
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#pragma once

#include "CoreMinimal.h"
#include "OpenAPIBaseModel.h"

namespace OpenAPI
{

class OPENAPI_API OpenAPIDefaultApi
{
public:
	OpenAPIDefaultApi();
	~OpenAPIDefaultApi();

	/* Sets the URL Endpoint.
	* Note: several fallback endpoints can be configured in request retry policies, see Request::SetShouldRetry */
	void SetURL(const FString& Url);

	/* Adds global header params to all requests */
	void AddHeaderParam(const FString& Key, const FString& Value);
	void ClearHeaderParams();

	/* Sets the retry manager to the user-defined retry manager. User must manage the lifetime of the retry manager.
	* If no retry manager is specified and a request needs retries, a default retry manager will be used.
	* See also: Request::SetShouldRetry */
	void SetHttpRetryManager(FHttpRetrySystem::FManager& RetryManager);
	FHttpRetrySystem::FManager& GetHttpRetryManager();

	class GetApiAllJsonRequest;
	class GetApiAllJsonResponse;
	class GetApiProductCycleJsonRequest;
	class GetApiProductCycleJsonResponse;
	class GetApiProductJsonRequest;
	class GetApiProductJsonResponse;
	
    DECLARE_DELEGATE_OneParam(FGetApiAllJsonDelegate, const GetApiAllJsonResponse&);
    DECLARE_DELEGATE_OneParam(FGetApiProductCycleJsonDelegate, const GetApiProductCycleJsonResponse&);
    DECLARE_DELEGATE_OneParam(FGetApiProductJsonDelegate, const GetApiProductJsonResponse&);
    
    FHttpRequestPtr GetApiAllJson(const GetApiAllJsonRequest& Request, const FGetApiAllJsonDelegate& Delegate = FGetApiAllJsonDelegate()) const;
    FHttpRequestPtr GetApiProductCycleJson(const GetApiProductCycleJsonRequest& Request, const FGetApiProductCycleJsonDelegate& Delegate = FGetApiProductCycleJsonDelegate()) const;
    FHttpRequestPtr GetApiProductJson(const GetApiProductJsonRequest& Request, const FGetApiProductJsonDelegate& Delegate = FGetApiProductJsonDelegate()) const;
    
private:
    void OnGetApiAllJsonResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FGetApiAllJsonDelegate Delegate) const;
    void OnGetApiProductCycleJsonResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FGetApiProductCycleJsonDelegate Delegate) const;
    void OnGetApiProductJsonResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FGetApiProductJsonDelegate Delegate) const;
    
	FHttpRequestRef CreateHttpRequest(const Request& Request) const;
	bool IsValid() const;
	void HandleResponse(FHttpResponsePtr HttpResponse, bool bSucceeded, Response& InOutResponse) const;

	FString Url;
	TMap<FString,FString> AdditionalHeaderParams;
	mutable FHttpRetrySystem::FManager* RetryManager = nullptr;
	mutable TUniquePtr<HttpRetryManager> DefaultRetryManager;
};

}
