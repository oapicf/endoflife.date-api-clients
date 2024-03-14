-module(openapi_cycle_support).

-include("openapi.hrl").

-export([openapi_cycle_support/0]).

-export([openapi_cycle_support/1]).

-export_type([openapi_cycle_support/0]).

-type openapi_cycle_support() ::
  [ 
  ].


openapi_cycle_support() ->
    openapi_cycle_support([]).

openapi_cycle_support(Fields) ->
  Default = [ 
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

