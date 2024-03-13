# coding: utf-8

"""
    endoflife.date

    Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)

    The version of the OpenAPI document: 0.0.1
    Contact: blah+oapicf@cliffano.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from endoflifedate.api.default_api import DefaultApi


class TestDefaultApi(unittest.TestCase):
    """DefaultApi unit test stubs"""

    def setUp(self) -> None:
        self.api = DefaultApi()

    def tearDown(self) -> None:
        pass

    def test_get_api_all_json(self) -> None:
        """Test case for get_api_all_json

        All Products
        """
        pass

    def test_get_api_product_cycle_json(self) -> None:
        """Test case for get_api_product_cycle_json

        Single cycle details
        """
        pass

    def test_get_api_product_json(self) -> None:
        """Test case for get_api_product_json

        Get All Details
        """
        pass


if __name__ == '__main__':
    unittest.main()
