-module(openapi_default_api).

-export([get_api_all_json/1, get_api_all_json/2,
         get_api_product_cycle_json/3, get_api_product_cycle_json/4,
         get_api_product_json/2, get_api_product_json/3]).

-define(BASE_URL, <<"">>).

%% @doc All Products
%% Return a list of all products. Each of these can be used for the other API endpoints.
-spec get_api_all_json(ctx:ctx()) -> {ok, [binary()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_api_all_json(Ctx) ->
    get_api_all_json(Ctx, #{}).

-spec get_api_all_json(ctx:ctx(), maps:map()) -> {ok, [binary()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_api_all_json(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/all.json"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Single cycle details
%% Gets details of a single cycle
-spec get_api_product_cycle_json(ctx:ctx(), binary(), binary()) -> {ok, openapi_cycle:openapi_cycle(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_api_product_cycle_json(Ctx, Product, Cycle) ->
    get_api_product_cycle_json(Ctx, Product, Cycle, #{}).

-spec get_api_product_cycle_json(ctx:ctx(), binary(), binary(), maps:map()) -> {ok, openapi_cycle:openapi_cycle(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_api_product_cycle_json(Ctx, Product, Cycle, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/", Product, "/", Cycle, ".json"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get All Details
%% Get EoL dates of all cycles of a given product.
-spec get_api_product_json(ctx:ctx(), binary()) -> {ok, [openapi_cycle:openapi_cycle()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_api_product_json(Ctx, Product) ->
    get_api_product_json(Ctx, Product, #{}).

-spec get_api_product_json(ctx:ctx(), binary(), maps:map()) -> {ok, [openapi_cycle:openapi_cycle()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_api_product_json(Ctx, Product, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/", Product, ".json"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


