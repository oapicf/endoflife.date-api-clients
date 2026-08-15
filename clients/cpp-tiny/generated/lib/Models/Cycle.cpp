

#include "Cycle.h"

using namespace Tiny;

Cycle::Cycle()
{
	cycle = Cycle_cycle();
	releaseDate = std::string();
	eol = Cycle_eol();
	latest = std::string();
	link = std::string();
	lts = Cycle_lts();
	support = Cycle_support();
	discontinued = Cycle_discontinued();
}

Cycle::Cycle(std::string jsonString)
{
	this->fromJson(jsonString);
}

Cycle::~Cycle()
{

}

void
Cycle::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cycleKey = "cycle";

    if(object.has_key(cycleKey))
    {
        bourne::json value = object[cycleKey];




        Cycle_cycle* obj = &cycle;
		obj->fromJson(value.dump());

    }

    const char *releaseDateKey = "releaseDate";

    if(object.has_key(releaseDateKey))
    {
        bourne::json value = object[releaseDateKey];




        Date* obj = &releaseDate;
		obj->fromJson(value.dump());

    }

    const char *eolKey = "eol";

    if(object.has_key(eolKey))
    {
        bourne::json value = object[eolKey];




        Cycle_eol* obj = &eol;
		obj->fromJson(value.dump());

    }

    const char *latestKey = "latest";

    if(object.has_key(latestKey))
    {
        bourne::json value = object[latestKey];



        jsonToValue(&latest, value, "std::string");


    }

    const char *linkKey = "link";

    if(object.has_key(linkKey))
    {
        bourne::json value = object[linkKey];



        jsonToValue(&link, value, "std::string");


    }

    const char *ltsKey = "lts";

    if(object.has_key(ltsKey))
    {
        bourne::json value = object[ltsKey];




        Cycle_lts* obj = &lts;
		obj->fromJson(value.dump());

    }

    const char *supportKey = "support";

    if(object.has_key(supportKey))
    {
        bourne::json value = object[supportKey];




        Cycle_support* obj = &support;
		obj->fromJson(value.dump());

    }

    const char *discontinuedKey = "discontinued";

    if(object.has_key(discontinuedKey))
    {
        bourne::json value = object[discontinuedKey];




        Cycle_discontinued* obj = &discontinued;
		obj->fromJson(value.dump());

    }


}

bourne::json
Cycle::toJson()
{
    bourne::json object = bourne::json::object();






	object["cycle"] = getCycle().toJson();






	object["releaseDate"] = getReleaseDate().toJson();






	object["eol"] = getEol().toJson();





    object["latest"] = getLatest();






    object["link"] = getLink();







	object["lts"] = getLts().toJson();






	object["support"] = getSupport().toJson();






	object["discontinued"] = getDiscontinued().toJson();


    return object;

}

Cycle_cycle
Cycle::getCycle()
{
	return cycle;
}

void
Cycle::setCycle(Cycle_cycle cycle)
{
	this->cycle = cycle;
}

Date
Cycle::getReleaseDate()
{
	return releaseDate;
}

void
Cycle::setReleaseDate(Date releaseDate)
{
	this->releaseDate = releaseDate;
}

Cycle_eol
Cycle::getEol()
{
	return eol;
}

void
Cycle::setEol(Cycle_eol eol)
{
	this->eol = eol;
}

std::string
Cycle::getLatest()
{
	return latest;
}

void
Cycle::setLatest(std::string latest)
{
	this->latest = latest;
}

std::string
Cycle::getLink()
{
	return link;
}

void
Cycle::setLink(std::string link)
{
	this->link = link;
}

Cycle_lts
Cycle::getLts()
{
	return lts;
}

void
Cycle::setLts(Cycle_lts lts)
{
	this->lts = lts;
}

Cycle_support
Cycle::getSupport()
{
	return support;
}

void
Cycle::setSupport(Cycle_support support)
{
	this->support = support;
}

Cycle_discontinued
Cycle::getDiscontinued()
{
	return discontinued;
}

void
Cycle::setDiscontinued(Cycle_discontinued discontinued)
{
	this->discontinued = discontinued;
}



