/**
 * endoflife.date
 * Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)
 *
 * OpenAPI spec version: 0.0.1
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#include "OpenAPICycle.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPICycle::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (Cycle.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("cycle")); WriteJsonValue(Writer, Cycle.GetValue());
	}
	if (ReleaseDate.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("releaseDate")); WriteJsonValue(Writer, ReleaseDate.GetValue());
	}
	if (Eol.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("eol")); WriteJsonValue(Writer, Eol.GetValue());
	}
	if (Latest.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("latest")); WriteJsonValue(Writer, Latest.GetValue());
	}
	if (Link.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("link")); WriteJsonValue(Writer, Link.GetValue());
	}
	if (Lts.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("lts")); WriteJsonValue(Writer, Lts.GetValue());
	}
	if (Support.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("support")); WriteJsonValue(Writer, Support.GetValue());
	}
	if (Discontinued.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("discontinued")); WriteJsonValue(Writer, Discontinued.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPICycle::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("cycle"), Cycle);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("releaseDate"), ReleaseDate);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("eol"), Eol);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("latest"), Latest);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("link"), Link);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("lts"), Lts);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("support"), Support);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("discontinued"), Discontinued);

	return ParseSuccess;
}

}