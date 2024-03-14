-module(openapi_cycle_discontinued).

-include("openapi.hrl").

-export([openapi_cycle_discontinued/0]).

-export([openapi_cycle_discontinued/1]).

-export_type([openapi_cycle_discontinued/0]).

-type openapi_cycle_discontinued() ::
  [ 
  ].


openapi_cycle_discontinued() ->
    openapi_cycle_discontinued([]).

openapi_cycle_discontinued(Fields) ->
  Default = [ 
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

