-module(openapi_cycle).

-include("openapi.hrl").

-export([openapi_cycle/0]).

-export([openapi_cycle/1]).

-export_type([openapi_cycle/0]).

-type openapi_cycle() ::
  [ {'cycle', openapi_cycle_cycle:openapi_cycle_cycle() }
  | {'releaseDate', date() }
  | {'eol', openapi_cycle_eol:openapi_cycle_eol() }
  | {'latest', binary() }
  | {'link', binary() }
  | {'lts', openapi_cycle_lts:openapi_cycle_lts() }
  | {'support', openapi_cycle_support:openapi_cycle_support() }
  | {'discontinued', openapi_cycle_discontinued:openapi_cycle_discontinued() }
  ].


openapi_cycle() ->
    openapi_cycle([]).

openapi_cycle(Fields) ->
  Default = [ {'cycle', openapi_cycle_cycle:openapi_cycle_cycle() }
            , {'releaseDate', date() }
            , {'eol', openapi_cycle_eol:openapi_cycle_eol() }
            , {'latest', binary(1) }
            , {'link', binary(1) }
            , {'lts', openapi_cycle_lts:openapi_cycle_lts() }
            , {'support', openapi_cycle_support:openapi_cycle_support() }
            , {'discontinued', openapi_cycle_discontinued:openapi_cycle_discontinued() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

