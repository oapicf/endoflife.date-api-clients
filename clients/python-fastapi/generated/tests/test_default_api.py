# coding: utf-8

from fastapi.testclient import TestClient


from openapi_server.models.cycle import Cycle  # noqa: F401


def test_get_api_all_json(client: TestClient):
    """Test case for get_api_all_json

    All Products
    """

    headers = {
    }
    response = client.request(
        "GET",
        "/api/all.json",
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_api_product_cycle_json(client: TestClient):
    """Test case for get_api_product_cycle_json

    Single cycle details
    """

    headers = {
    }
    response = client.request(
        "GET",
        "/api/{product}/{cycle}.json".format(product=None, cycle=None),
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_get_api_product_json(client: TestClient):
    """Test case for get_api_product_json

    Get All Details
    """

    headers = {
    }
    response = client.request(
        "GET",
        "/api/{product}.json".format(product=None),
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

