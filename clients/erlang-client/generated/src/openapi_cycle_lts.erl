-module(openapi_cycle_lts).

-export([encode/1]).

-export_type([openapi_cycle_lts/0]).

-type openapi_cycle_lts() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
