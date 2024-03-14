-module(openapi_cycle_support).

-export([encode/1]).

-export_type([openapi_cycle_support/0]).

-type openapi_cycle_support() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
