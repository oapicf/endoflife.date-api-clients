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
	//cycle = new Cycle_cycle();
	//releaseDate = null;
	//eol = new Cycle_eol();
	//latest = std::string();
	//link = std::string();
	//lts = new Cycle_lts();
	//support = new Cycle_support();
	//discontinued = new Cycle_discontinued();
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
	

		if (isprimitive("Cycle_cycle")) {
			jsonToValue(&cycle, node, "Cycle_cycle", "Cycle_cycle");
		} else {
			
			Cycle_cycle* obj = static_cast<Cycle_cycle*> (&cycle);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *releaseDateKey = "releaseDate";
	node = json_object_get_member(pJsonObject, releaseDateKey);
	if (node !=NULL) {
	

		if (isprimitive("Date")) {
			jsonToValue(&releaseDate, node, "Date", "Date");
		} else {
			
		}
	}
	const gchar *eolKey = "eol";
	node = json_object_get_member(pJsonObject, eolKey);
	if (node !=NULL) {
	

		if (isprimitive("Cycle_eol")) {
			jsonToValue(&eol, node, "Cycle_eol", "Cycle_eol");
		} else {
			
			Cycle_eol* obj = static_cast<Cycle_eol*> (&eol);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *latestKey = "latest";
	node = json_object_get_member(pJsonObject, latestKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&latest, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *linkKey = "link";
	node = json_object_get_member(pJsonObject, linkKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&link, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *ltsKey = "lts";
	node = json_object_get_member(pJsonObject, ltsKey);
	if (node !=NULL) {
	

		if (isprimitive("Cycle_lts")) {
			jsonToValue(&lts, node, "Cycle_lts", "Cycle_lts");
		} else {
			
			Cycle_lts* obj = static_cast<Cycle_lts*> (&lts);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *supportKey = "support";
	node = json_object_get_member(pJsonObject, supportKey);
	if (node !=NULL) {
	

		if (isprimitive("Cycle_support")) {
			jsonToValue(&support, node, "Cycle_support", "Cycle_support");
		} else {
			
			Cycle_support* obj = static_cast<Cycle_support*> (&support);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *discontinuedKey = "discontinued";
	node = json_object_get_member(pJsonObject, discontinuedKey);
	if (node !=NULL) {
	

		if (isprimitive("Cycle_discontinued")) {
			jsonToValue(&discontinued, node, "Cycle_discontinued", "Cycle_discontinued");
		} else {
			
			Cycle_discontinued* obj = static_cast<Cycle_discontinued*> (&discontinued);
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
	if (isprimitive("Cycle_cycle")) {
		Cycle_cycle obj = getCycle();
		node = converttoJson(&obj, "Cycle_cycle", "");
	}
	else {
		
		Cycle_cycle obj = static_cast<Cycle_cycle> (getCycle());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cycleKey = "cycle";
	json_object_set_member(pJsonObject, cycleKey, node);
	if (isprimitive("Date")) {
		Date obj = getReleaseDate();
		node = converttoJson(&obj, "Date", "");
	}
	else {
		
	}
	const gchar *releaseDateKey = "releaseDate";
	json_object_set_member(pJsonObject, releaseDateKey, node);
	if (isprimitive("Cycle_eol")) {
		Cycle_eol obj = getEol();
		node = converttoJson(&obj, "Cycle_eol", "");
	}
	else {
		
		Cycle_eol obj = static_cast<Cycle_eol> (getEol());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *eolKey = "eol";
	json_object_set_member(pJsonObject, eolKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLatest();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *latestKey = "latest";
	json_object_set_member(pJsonObject, latestKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLink();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *linkKey = "link";
	json_object_set_member(pJsonObject, linkKey, node);
	if (isprimitive("Cycle_lts")) {
		Cycle_lts obj = getLts();
		node = converttoJson(&obj, "Cycle_lts", "");
	}
	else {
		
		Cycle_lts obj = static_cast<Cycle_lts> (getLts());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ltsKey = "lts";
	json_object_set_member(pJsonObject, ltsKey, node);
	if (isprimitive("Cycle_support")) {
		Cycle_support obj = getSupport();
		node = converttoJson(&obj, "Cycle_support", "");
	}
	else {
		
		Cycle_support obj = static_cast<Cycle_support> (getSupport());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *supportKey = "support";
	json_object_set_member(pJsonObject, supportKey, node);
	if (isprimitive("Cycle_discontinued")) {
		Cycle_discontinued obj = getDiscontinued();
		node = converttoJson(&obj, "Cycle_discontinued", "");
	}
	else {
		
		Cycle_discontinued obj = static_cast<Cycle_discontinued> (getDiscontinued());
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

Cycle_cycle
Cycle::getCycle()
{
	return cycle;
}

void
Cycle::setCycle(Cycle_cycle  cycle)
{
	this->cycle = cycle;
}

Date
Cycle::getReleaseDate()
{
	return releaseDate;
}

void
Cycle::setReleaseDate(Date  releaseDate)
{
	this->releaseDate = releaseDate;
}

Cycle_eol
Cycle::getEol()
{
	return eol;
}

void
Cycle::setEol(Cycle_eol  eol)
{
	this->eol = eol;
}

std::string
Cycle::getLatest()
{
	return latest;
}

void
Cycle::setLatest(std::string  latest)
{
	this->latest = latest;
}

std::string
Cycle::getLink()
{
	return link;
}

void
Cycle::setLink(std::string  link)
{
	this->link = link;
}

Cycle_lts
Cycle::getLts()
{
	return lts;
}

void
Cycle::setLts(Cycle_lts  lts)
{
	this->lts = lts;
}

Cycle_support
Cycle::getSupport()
{
	return support;
}

void
Cycle::setSupport(Cycle_support  support)
{
	this->support = support;
}

Cycle_discontinued
Cycle::getDiscontinued()
{
	return discontinued;
}

void
Cycle::setDiscontinued(Cycle_discontinued  discontinued)
{
	this->discontinued = discontinued;
}


