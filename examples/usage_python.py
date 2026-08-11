import endoflifedate
from endoflifedate.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://endoflife.date
# See configuration.py for a list of all supported configuration parameters.
configuration = endoflifedate.Configuration(
    host = "https://endoflife.date"
)

# Enter a context with an instance of the API client
with endoflifedate.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = endoflifedate.DefaultApi(api_client)

    try:
        # Get all products
        api_response = api_instance.get_api_all_json()
        print("The response of DefaultApi->get_api_all_json:\n")
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling DefaultApi->get_api_all_json: %s\n" % e)
        raise
