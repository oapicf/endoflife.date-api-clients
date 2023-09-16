-module(openapi_cycle).

-include("openapi.hrl").

-export([openapi_cycle/0]).

-export([openapi_cycle/1]).

-export_type([openapi_cycle/0]).

-type openapi_cycle() ::
  [ {'cycle', openapi_any_type:openapi_any_type() }
  | {'releaseDate', openapi_any_type:openapi_any_type() }
  | {'eol', openapi_any_type:openapi_any_type() }
  | {'latest', openapi_any_type:openapi_any_type() }
  | {'link', openapi_any_type:openapi_any_type() }
  | {'lts', openapi_any_type:openapi_any_type() }
  | {'support', openapi_any_type:openapi_any_type() }
  | {'discontinued', openapi_any_type:openapi_any_type() }
  ].


openapi_cycle() ->
    openapi_cycle([]).

openapi_cycle(Fields) ->
  Default = [ {'cycle', openapi_any_type:openapi_any_type() }
            , {'releaseDate', openapi_any_type:openapi_any_type() }
            , {'eol', openapi_any_type:openapi_any_type() }
            , {'latest', openapi_any_type:openapi_any_type() }
            , {'link', openapi_any_type:openapi_any_type() }
            , {'lts', openapi_any_type:openapi_any_type() }
            , {'support', openapi_any_type:openapi_any_type() }
            , {'discontinued', openapi_any_type:openapi_any_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

