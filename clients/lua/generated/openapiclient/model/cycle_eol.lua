--[[
  endoflife.date

  Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki).

  The version of the OpenAPI document: 0.0.1
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- cycle_eol class
local cycle_eol = {}
local cycle_eol_mt = {
	__name = "cycle_eol";
	__index = cycle_eol;
}

local function cast_cycle_eol(t)
	return setmetatable(t, cycle_eol_mt)
end

local function new_cycle_eol()
	return cast_cycle_eol({
	})
end

return {
	cast = cast_cycle_eol;
	new = new_cycle_eol;
}
