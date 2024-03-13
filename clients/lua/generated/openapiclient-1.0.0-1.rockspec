package = "openapiclient"
version = "1.0.0-1"
source = {
	url = "https://github.com/oapicf/endoflife.date-api-clients.git"
}

description = {
	summary = "API client generated by OpenAPI Generator",
	detailed = [[
Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)]],
	homepage = "https://openapi-generator.tech",
	license = "Unlicense",
	maintainer = "OpenAPI Generator contributors",
}

dependencies = {
	"lua >= 5.2",
	"http",
	"dkjson",
	"basexx"
}

build = {
	type = "builtin",
	modules = {
		["openapiclient.api.default_api"] = "openapiclient/api/default_api.lua";
		["openapiclient.model.cycle"] = "openapiclient/model/cycle.lua";
		["openapiclient.model.cycle_cycle"] = "openapiclient/model/cycle_cycle.lua";
		["openapiclient.model.cycle_discontinued"] = "openapiclient/model/cycle_discontinued.lua";
		["openapiclient.model.cycle_eol"] = "openapiclient/model/cycle_eol.lua";
		["openapiclient.model.cycle_lts"] = "openapiclient/model/cycle_lts.lua";
		["openapiclient.model.cycle_support"] = "openapiclient/model/cycle_support.lua";
	}
}
