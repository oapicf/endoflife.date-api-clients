# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.cycle import Cycle  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDefaultController(BaseTestCase):
    """DefaultController integration test stubs"""

    def test_get_api_all_json(self):
        """Test case for get_api_all_json

        All Products
        """
        response = self.client.open(
            '/api/all.json',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_api_product_cycle_json(self):
        """Test case for get_api_product_cycle_json

        Single cycle details
        """
        response = self.client.open(
            '/api/{product}/{cycle_jso}'.format(product='product_example', cycle='cycle_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_api_product_json(self):
        """Test case for get_api_product_json

        Get All Details
        """
        response = self.client.open(
            '/api/{product_jso}'.format(product='product_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
