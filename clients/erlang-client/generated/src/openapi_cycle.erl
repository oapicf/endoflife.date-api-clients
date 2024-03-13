-module(openapi_cycle).

-export([encode/1]).

-export_type([openapi_cycle/0]).

-type openapi_cycle() ::
    #{ 'cycle' => openapi_cycle_cycle:openapi_cycle_cycle(),
       'releaseDate' => calendar:date(),
       'eol' => openapi_cycle_eol:openapi_cycle_eol(),
       'latest' => binary(),
       'link' => binary(),
       'lts' => openapi_cycle_lts:openapi_cycle_lts(),
       'support' => openapi_cycle_support:openapi_cycle_support(),
       'discontinued' => openapi_cycle_discontinued:openapi_cycle_discontinued()
     }.

encode(#{ 'cycle' := Cycle,
          'releaseDate' := ReleaseDate,
          'eol' := Eol,
          'latest' := Latest,
          'link' := Link,
          'lts' := Lts,
          'support' := Support,
          'discontinued' := Discontinued
        }) ->
    #{ 'cycle' => Cycle,
       'releaseDate' => ReleaseDate,
       'eol' => Eol,
       'latest' => Latest,
       'link' => Link,
       'lts' => Lts,
       'support' => Support,
       'discontinued' => Discontinued
     }.
