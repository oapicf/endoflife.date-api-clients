# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.default_api_base import BaseDefaultApi
import openapi_server.impl

from fastapi import (  # noqa: F401
    APIRouter,
    Body,
    Cookie,
    Depends,
    Form,
    Header,
    Path,
    Query,
    Response,
    Security,
    status,
)

from openapi_server.models.extra_models import TokenModel  # noqa: F401
from openapi_server.models.cycle import Cycle


router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/api/all.json",
    responses={
        200: {"model": object, "description": "OK"},
    },
    tags=["default"],
    summary="All Products",
    response_model_by_alias=True,
)
async def get_api_all_json(
) -> object:
    """Return a list of all products. Each of these can be used for the other API endpoints."""
    return BaseDefaultApi.subclasses[0]().get_api_all_json()


@router.get(
    "/api/{product}/{cycle}.json",
    responses={
        200: {"model": Cycle, "description": "OK"},
    },
    tags=["default"],
    summary="Single cycle details",
    response_model_by_alias=True,
)
async def get_api_product_cycle_json(
    product:  = Path(None, description="Product URL as per the canonical URL on the endofife.date website"),
    cycle:  = Path(None, description="Release Cycle for which the details must be fetched"),
) -> Cycle:
    """Gets details of a single cycle"""
    return BaseDefaultApi.subclasses[0]().get_api_product_cycle_json(product, cycle)


@router.get(
    "/api/{product}.json",
    responses={
        200: {"model": object, "description": "OK"},
    },
    tags=["default"],
    summary="Get All Details",
    response_model_by_alias=True,
)
async def get_api_product_json(
    product:  = Path(None, description="Product URL as per the canonical URL on the endofife.date website"),
) -> object:
    """Get EoL dates of all cycles of a given product."""
    return BaseDefaultApi.subclasses[0]().get_api_product_json(product)
