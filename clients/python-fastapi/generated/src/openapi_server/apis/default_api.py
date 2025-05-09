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
    HTTPException,
    Path,
    Query,
    Response,
    Security,
    status,
)

from openapi_server.models.extra_models import TokenModel  # noqa: F401
from pydantic import Field, StrictStr
from typing import List
from typing_extensions import Annotated
from openapi_server.models.cycle import Cycle


router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/api/all.json",
    responses={
        200: {"model": List[str], "description": "OK"},
    },
    tags=["default"],
    summary="All Products",
    response_model_by_alias=True,
)
async def get_api_all_json(
) -> List[str]:
    """Return a list of all products. Each of these can be used for the other API endpoints."""
    if not BaseDefaultApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseDefaultApi.subclasses[0]().get_api_all_json()


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
    product: Annotated[StrictStr, Field(description="Product URL as per the canonical URL on the endofife.date website.")] = Path(..., description="Product URL as per the canonical URL on the endofife.date website."),
    cycle: Annotated[StrictStr, Field(description="Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD's releng/14.0 becomes releng-14.0.")] = Path(..., description="Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD&#39;s releng/14.0 becomes releng-14.0."),
) -> Cycle:
    """Gets details of a single cycle."""
    if not BaseDefaultApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseDefaultApi.subclasses[0]().get_api_product_cycle_json(product, cycle)


@router.get(
    "/api/{product}.json",
    responses={
        200: {"model": List[Cycle], "description": "OK"},
    },
    tags=["default"],
    summary="Get All Details",
    response_model_by_alias=True,
)
async def get_api_product_json(
    product: Annotated[StrictStr, Field(description="Product URL as per the canonical URL on the endofife.date website.")] = Path(..., description="Product URL as per the canonical URL on the endofife.date website."),
) -> List[Cycle]:
    """Get EoL dates of all cycles of a given product."""
    if not BaseDefaultApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseDefaultApi.subclasses[0]().get_api_product_json(product)
