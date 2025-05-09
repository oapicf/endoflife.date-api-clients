# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictStr
from typing import List
from typing_extensions import Annotated
from openapi_server.models.cycle import Cycle


class BaseDefaultApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseDefaultApi.subclasses = BaseDefaultApi.subclasses + (cls,)
    async def get_api_all_json(
        self,
    ) -> List[str]:
        """Return a list of all products. Each of these can be used for the other API endpoints."""
        ...


    async def get_api_product_cycle_json(
        self,
        product: Annotated[StrictStr, Field(description="Product URL as per the canonical URL on the endofife.date website.")],
        cycle: Annotated[StrictStr, Field(description="Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD's releng/14.0 becomes releng-14.0.")],
    ) -> Cycle:
        """Gets details of a single cycle."""
        ...


    async def get_api_product_json(
        self,
        product: Annotated[StrictStr, Field(description="Product URL as per the canonical URL on the endofife.date website.")],
    ) -> List[Cycle]:
        """Get EoL dates of all cycles of a given product."""
        ...
