import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.cycle import Cycle  # noqa: E501
from openapi_server import util


def get_api_all_json():  # noqa: E501
    """All Products

    Return a list of all products. Each of these can be used for the other API endpoints. # noqa: E501


    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_api_product_cycle_json(product, cycle):  # noqa: E501
    """Single cycle details

    Gets details of a single cycle # noqa: E501

    :param product: Product URL as per the canonical URL on the endofife.date website
    :type product: dict | bytes
    :param cycle: Release Cycle for which the details must be fetched
    :type cycle: dict | bytes

    :rtype: Union[Cycle, Tuple[Cycle, int], Tuple[Cycle, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        product =  object.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        cycle =  object.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_api_product_json(product):  # noqa: E501
    """Get All Details

    Get EoL dates of all cycles of a given product. # noqa: E501

    :param product: Product URL as per the canonical URL on the endofife.date website
    :type product: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        product =  object.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
