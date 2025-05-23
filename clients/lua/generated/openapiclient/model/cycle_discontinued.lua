--[[
  endoflife.date

  Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki).

  The version of the OpenAPI document: 0.0.1
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- cycle_discontinued class
local cycle_discontinued = {}
local cycle_discontinued_mt = {
	__name = "cycle_discontinued";
	__index = cycle_discontinued;
}

local function cast_cycle_discontinued(t)
	return setmetatable(t, cycle_discontinued_mt)
end

local function new_cycle_discontinued()
	return cast_cycle_discontinued({
	})
end

return {
	cast = cast_cycle_discontinued;
	new = new_cycle_discontinued;
}
