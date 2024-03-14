-module(openapi_cycle_cycle).

-include("openapi.hrl").

-export([openapi_cycle_cycle/0]).

-export([openapi_cycle_cycle/1]).

-export_type([openapi_cycle_cycle/0]).

-type openapi_cycle_cycle() ::
  [ 
  ].


openapi_cycle_cycle() ->
    openapi_cycle_cycle([]).

openapi_cycle_cycle(Fields) ->
  Default = [ 
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

