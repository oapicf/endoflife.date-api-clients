# #endoflife.date
#
##Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)
#
#The version of the OpenAPI document: 0.0.1
#Contact: blah+oapicf@cliffano.com
#Generated by: https://openapi-generator.tech
#Generator version: 7.4.0
#

require "../spec_helper"
require "json"
require "time"

# Unit tests for OpenAPIClient::DefaultApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe "DefaultApi" do
  describe "test an instance of DefaultApi" do
    it "should create an instance of DefaultApi" do
      api_instance = OpenAPIClient::DefaultApi.new
      # TODO expect(api_instance).to be_instance_of(OpenAPIClient::DefaultApi)
    end
  end

  # unit tests for get_api_all_json
  # All Products
  # Return a list of all products. Each of these can be used for the other API endpoints.
  # @param [Hash] opts the optional parameters
  # @return [Array(String)]
  describe "get_api_all_json test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_api_product_cycle_json
  # Single cycle details
  # Gets details of a single cycle
  # @param product Product URL as per the canonical URL on the endofife.date website
  # @param cycle Release Cycle for which the details must be fetched
  # @param [Hash] opts the optional parameters
  # @return [Cycle]
  describe "get_api_product_cycle_json test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for get_api_product_json
  # Get All Details
  # Get EoL dates of all cycles of a given product.
  # @param product Product URL as per the canonical URL on the endofife.date website
  # @param [Hash] opts the optional parameters
  # @return [Array(Cycle)]
  describe "get_api_product_json test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

end
