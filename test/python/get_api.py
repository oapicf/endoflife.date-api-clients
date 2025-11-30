import unittest
import endoflifedate
from endoflifedate.rest import ApiException
from pprint import pprint

class TestEndOfLifeDateGetApi(unittest.TestCase):

    def test_get_api_all_json(self):

      configuration = endoflifedate.Configuration(
        host = "https://endoflife.date"
      )

      with endoflifedate.ApiClient(configuration) as api_client:

          api_instance = endoflifedate.DefaultApi(api_client)

          try:
              api_response = api_instance.get_api_all_json()
              print("The response of DefaultApi->get_api_all_json:\n")
              # pprint(api_response)
              all_products = api_response
              assert 'nodejs' in all_products
              assert 'python' in all_products
              assert 'ruby' in all_products

          except ApiException as e:
              self.fail('Exception when calling DefaultApi->get_api_all_json: %s\n' % e)

    def test_get_api_product_cycle_json(self):

      configuration = endoflifedate.Configuration(
        host = "https://endoflife.date"
      )

      with endoflifedate.ApiClient(configuration) as api_client:

          api_instance = endoflifedate.DefaultApi(api_client)

          try:
              api_response = api_instance.get_api_product_cycle_json('python', '3.12')
              print("The response of DefaultApi->get_api_product_cycle_json:\n")
              # pprint(api_response)
              product_cycle = api_response
              assert product_cycle.eol.to_dict() == '2028-10-31'

          except ApiException as e:
              self.fail('Exception when calling DefaultApi->get_api_all_json: %s\n' % e)

    def test_get_api_product_json(self):

      configuration = endoflifedate.Configuration(
        host = "https://endoflife.date"
      )

      with endoflifedate.ApiClient(configuration) as api_client:

          api_instance = endoflifedate.DefaultApi(api_client)

          try:
              api_response = api_instance.get_api_product_json('python')
              print("The response of DefaultApi->get_api_product_json:\n")
              # pprint(api_response)
              product_all_cycles = api_response
              python_3_12_cycle = None
              for cycle in product_all_cycles:
                # print(cycle.cycle)
                if cycle.cycle.to_dict() == '3.12':
                  python_3_12_cycle = cycle
                  break
              if python_3_12_cycle is None:
                self.fail('3.12 cycle not found in python product cycles')
              assert python_3_12_cycle.eol.to_dict() == '2028-10-31'

          except ApiException as e:
              self.fail('Exception when calling DefaultApi->get_api_all_json: %s\n' % e)
