-module(openapi_cycle).

-export([encode/1]).

-export_type([openapi_cycle/0]).

-type openapi_cycle() ::
    #{ 'cycle' => openapi_any_type:openapi_any_type(),
       'releaseDate' => openapi_any_type:openapi_any_type(),
       'eol' => openapi_any_type:openapi_any_type(),
       'latest' => openapi_any_type:openapi_any_type(),
       'link' => openapi_any_type:openapi_any_type(),
       'lts' => openapi_any_type:openapi_any_type(),
       'support' => openapi_any_type:openapi_any_type(),
       'discontinued' => openapi_any_type:openapi_any_type()
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
