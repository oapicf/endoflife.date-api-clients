-module(openapi_cycle_eol).

-include("openapi.hrl").

-export([openapi_cycle_eol/0]).

-export([openapi_cycle_eol/1]).

-export_type([openapi_cycle_eol/0]).

-type openapi_cycle_eol() ::
  [ 
  ].


openapi_cycle_eol() ->
    openapi_cycle_eol([]).

openapi_cycle_eol(Fields) ->
  Default = [ 
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

