# Load the gem
require 'endoflife_date'

api_instance = EndOfLifeDateApiClient::DefaultApi.new

begin
  # Get all products
  result = api_instance.get_api_all_json
  p result
rescue EndOfLifeDateApiClient::ApiError => e
  puts "Exception when calling DefaultApi->get_api_all_json: #{e}"
  raise
end
