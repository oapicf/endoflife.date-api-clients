# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.cycle import Cycle


async def test_get_api_all_json(client):
    """Test case for get_api_all_json

    All Products
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/api/all.json',
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_api_product_cycle_json(client):
    """Test case for get_api_product_cycle_json

    Single cycle details
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/api/{product}/{cycle_jso}'.format(product=None, cycle=None),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_get_api_product_json(client):
    """Test case for get_api_product_json

    Get All Details
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/api/{product_jso}'.format(product=None),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

