# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.cycle import Cycle


pytestmark = pytest.mark.asyncio

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


pytestmark = pytest.mark.asyncio

async def test_get_api_product_cycle_json(client):
    """Test case for get_api_product_cycle_json

    Single cycle details
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/api/{product}/{cycle_jso}'.format(product='product_example', cycle='cycle_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_api_product_json(client):
    """Test case for get_api_product_json

    Get All Details
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/api/{product_jso}'.format(product='product_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

