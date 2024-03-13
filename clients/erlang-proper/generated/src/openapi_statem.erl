-module(openapi_statem).

-behaviour(proper_statem).

-include("openapi.hrl").
-include_lib("proper/include/proper_common.hrl").
-include_lib("stdlib/include/assert.hrl").

-compile(export_all).
-compile(nowarn_export_all).

-include("openapi_statem.hrl").

%%==============================================================================
%% The statem's property
%%==============================================================================

prop_main() ->
  setup(),
  ?FORALL( Cmds
         , proper_statem:commands(?MODULE)
         , begin
             cleanup(),
             { History
             , State
             , Result
             } = proper_statem:run_commands(?MODULE, Cmds),
             ?WHENFAIL(
                io:format("History: ~p\nState: ~p\nResult: ~p\nCmds: ~p\n",
                          [ History
                          , State
                          , Result
                          , proper_statem:command_names(Cmds)
                          ]),
                proper:aggregate( proper_statem:command_names(Cmds)
                                , Result =:= ok
                                )
               )
           end
         ).

%%==============================================================================
%% Setup
%%==============================================================================

setup() -> ok.

%%==============================================================================
%% Cleanup
%%==============================================================================

cleanup() -> ok.

%%==============================================================================
%% Initial State
%%==============================================================================

initial_state() -> #{}.

%%==============================================================================
%% get_api_all_json
%%==============================================================================

get_api_all_json() ->
  openapi_api:get_api_all_json().

get_api_all_json_args(_S) ->
  [].

%%==============================================================================
%% get_api_product_cycle_json
%%==============================================================================

get_api_product_cycle_json(Product, Cycle) ->
  openapi_api:get_api_product_cycle_json(Product, Cycle).

get_api_product_cycle_json_args(_S) ->
  [binary(), binary()].

%%==============================================================================
%% get_api_product_json
%%==============================================================================

get_api_product_json(Product) ->
  openapi_api:get_api_product_json(Product).

get_api_product_json_args(_S) ->
  [binary()].

