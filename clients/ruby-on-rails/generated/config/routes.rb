=begin
endoflife.date

Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)

The version of the OpenAPI document: 0.0.1
Contact: blah+oapicf@cliffano.com
Generated by: https://github.com/openapitools/openapi-generator.git

=end
Rails.application.routes.draw do

  def add_openapi_route http_method, path, opts = {}
    full_path = path.gsub(/{(.*?)}/, ':\1')
    match full_path, to: "#{opts.fetch(:controller_name)}##{opts[:action_name]}", via: http_method
  end

  add_openapi_route 'GET', '/api/all.json', controller_name: 'default', action_name: 'get_api_all/json'
  add_openapi_route 'GET', '/api/{product}.json', controller_name: 'default', action_name: 'get_api_product/json'
  add_openapi_route 'GET', '/api/{product}/{cycle}.json', controller_name: 'default', action_name: 'get_api_product_cycle/json'
end
