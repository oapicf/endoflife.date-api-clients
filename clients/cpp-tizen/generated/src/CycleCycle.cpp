#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Cycle_cycle.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Cycle_cycle::Cycle_cycle()
{
	//__init();
}

Cycle_cycle::~Cycle_cycle()
{
	//__cleanup();
}

void
Cycle_cycle::__init()
{
}

void
Cycle_cycle::__cleanup()
{
	//
}

void
Cycle_cycle::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
}

Cycle_cycle::Cycle_cycle(char* json)
{
	this->fromJson(json);
}

char*
Cycle_cycle::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}


