-module(openapi_cycle_discontinued).

-export([encode/1]).

-export_type([openapi_cycle_discontinued/0]).

-type openapi_cycle_discontinued() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
