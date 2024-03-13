require 'json'


MyApp.add_route('GET', '/api/all.json', {
  "resourcePath" => "/Default",
  "summary" => "All Products",
  "nickname" => "get_api_all/json",
  "responseClass" => "Array<String>",
  "endpoint" => "/api/all.json",
  "notes" => "Return a list of all products. Each of these can be used for the other API endpoints.",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/{product}.json', {
  "resourcePath" => "/Default",
  "summary" => "Get All Details",
  "nickname" => "get_api_product/json",
  "responseClass" => "Array<cycle>",
  "endpoint" => "/api/{product}.json",
  "notes" => "Get EoL dates of all cycles of a given product.",
  "parameters" => [
    {
      "name" => "product",
      "description" => "Product URL as per the canonical URL on the endofife.date website",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/{product}/{cycle}.json', {
  "resourcePath" => "/Default",
  "summary" => "Single cycle details",
  "nickname" => "get_api_product_cycle/json",
  "responseClass" => "cycle",
  "endpoint" => "/api/{product}/{cycle}.json",
  "notes" => "Gets details of a single cycle",
  "parameters" => [
    {
      "name" => "product",
      "description" => "Product URL as per the canonical URL on the endofife.date website",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "cycle",
      "description" => "Release Cycle for which the details must be fetched",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

