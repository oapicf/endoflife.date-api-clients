#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Cycle.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Cycle::Cycle()
{
	//__init();
}

Cycle::~Cycle()
{
	//__cleanup();
}

void
Cycle::__init()
{
	//cycle = null;
	//releaseDate = null;
	//eol = null;
	//latest = null;
	//link = null;
	//lts = null;
	//support = null;
	//discontinued = null;
}

void
Cycle::__cleanup()
{
	//if(cycle != NULL) {
	//
	//delete cycle;
	//cycle = NULL;
	//}
	//if(releaseDate != NULL) {
	//
	//delete releaseDate;
	//releaseDate = NULL;
	//}
	//if(eol != NULL) {
	//
	//delete eol;
	//eol = NULL;
	//}
	//if(latest != NULL) {
	//
	//delete latest;
	//latest = NULL;
	//}
	//if(link != NULL) {
	//
	//delete link;
	//link = NULL;
	//}
	//if(lts != NULL) {
	//
	//delete lts;
	//lts = NULL;
	//}
	//if(support != NULL) {
	//
	//delete support;
	//support = NULL;
	//}
	//if(discontinued != NULL) {
	//
	//delete discontinued;
	//discontinued = NULL;
	//}
	//
}

void
Cycle::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cycleKey = "cycle";
	node = json_object_get_member(pJsonObject, cycleKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&cycle, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&cycle);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *releaseDateKey = "releaseDate";
	node = json_object_get_member(pJsonObject, releaseDateKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&releaseDate, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&releaseDate);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *eolKey = "eol";
	node = json_object_get_member(pJsonObject, eolKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&eol, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&eol);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *latestKey = "latest";
	node = json_object_get_member(pJsonObject, latestKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&latest, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&latest);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *linkKey = "link";
	node = json_object_get_member(pJsonObject, linkKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&link, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&link);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *ltsKey = "lts";
	node = json_object_get_member(pJsonObject, ltsKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&lts, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&lts);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *supportKey = "support";
	node = json_object_get_member(pJsonObject, supportKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&support, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&support);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *discontinuedKey = "discontinued";
	node = json_object_get_member(pJsonObject, discontinuedKey);
	if (node !=NULL) {
	

		if (isprimitive("AnyType")) {
			jsonToValue(&discontinued, node, "AnyType", "");
		} else {
			
			AnyType* obj = static_cast<AnyType*> (&discontinued);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

Cycle::Cycle(char* json)
{
	this->fromJson(json);
}

char*
Cycle::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AnyType")) {
		AnyType obj = getCycle();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getCycle());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cycleKey = "cycle";
	json_object_set_member(pJsonObject, cycleKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getReleaseDate();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getReleaseDate());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *releaseDateKey = "releaseDate";
	json_object_set_member(pJsonObject, releaseDateKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getEol();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getEol());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *eolKey = "eol";
	json_object_set_member(pJsonObject, eolKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getLatest();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getLatest());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *latestKey = "latest";
	json_object_set_member(pJsonObject, latestKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getLink();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getLink());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *linkKey = "link";
	json_object_set_member(pJsonObject, linkKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getLts();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getLts());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ltsKey = "lts";
	json_object_set_member(pJsonObject, ltsKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getSupport();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getSupport());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *supportKey = "support";
	json_object_set_member(pJsonObject, supportKey, node);
	if (isprimitive("AnyType")) {
		AnyType obj = getDiscontinued();
		node = converttoJson(&obj, "AnyType", "");
	}
	else {
		
		AnyType obj = static_cast<AnyType> (getDiscontinued());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *discontinuedKey = "discontinued";
	json_object_set_member(pJsonObject, discontinuedKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

AnyType
Cycle::getCycle()
{
	return cycle;
}

void
Cycle::setCycle(AnyType  cycle)
{
	this->cycle = cycle;
}

AnyType
Cycle::getReleaseDate()
{
	return releaseDate;
}

void
Cycle::setReleaseDate(AnyType  releaseDate)
{
	this->releaseDate = releaseDate;
}

AnyType
Cycle::getEol()
{
	return eol;
}

void
Cycle::setEol(AnyType  eol)
{
	this->eol = eol;
}

AnyType
Cycle::getLatest()
{
	return latest;
}

void
Cycle::setLatest(AnyType  latest)
{
	this->latest = latest;
}

AnyType
Cycle::getLink()
{
	return link;
}

void
Cycle::setLink(AnyType  link)
{
	this->link = link;
}

AnyType
Cycle::getLts()
{
	return lts;
}

void
Cycle::setLts(AnyType  lts)
{
	this->lts = lts;
}

AnyType
Cycle::getSupport()
{
	return support;
}

void
Cycle::setSupport(AnyType  support)
{
	this->support = support;
}

AnyType
Cycle::getDiscontinued()
{
	return discontinued;
}

void
Cycle::setDiscontinued(AnyType  discontinued)
{
	this->discontinued = discontinued;
}


