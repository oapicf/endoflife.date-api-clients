-module(openapi_cycle_cycle).

-export([encode/1]).

-export_type([openapi_cycle_cycle/0]).

-type openapi_cycle_cycle() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
