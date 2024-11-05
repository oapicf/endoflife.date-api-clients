--[[
  endoflife.date

  Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)

  The version of the OpenAPI document: 0.0.1
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- cycle_lts class
local cycle_lts = {}
local cycle_lts_mt = {
	__name = "cycle_lts";
	__index = cycle_lts;
}

local function cast_cycle_lts(t)
	return setmetatable(t, cycle_lts_mt)
end

local function new_cycle_lts()
	return cast_cycle_lts({
	})
end

return {
	cast = cast_cycle_lts;
	new = new_cycle_lts;
}