-module(openapi_api).

-export([ get_api_all_json/0
        , get_api_product_cycle_json/2
        , get_api_product_json/1
        ]).

-define(BASE_URL, "").

%% @doc All Products
%% Return a list of all products. Each of these can be used for the other API endpoints.
-spec get_api_all_json() ->
  openapi_utils:response().
get_api_all_json() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/api/all.json"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Single cycle details
%% Gets details of a single cycle.
-spec get_api_product_cycle_json(binary(), binary()) ->
  openapi_utils:response().
get_api_product_cycle_json(Product, Cycle) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/api/", Product, "/", Cycle, ".json"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

%% @doc Get All Details
%% Get EoL dates of all cycles of a given product.
-spec get_api_product_json(binary()) ->
  openapi_utils:response().
get_api_product_json(Product) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/api/", Product, ".json"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

