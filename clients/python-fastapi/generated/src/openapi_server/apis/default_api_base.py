# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from openapi_server.models.cycle import Cycle


class BaseDefaultApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseDefaultApi.subclasses = BaseDefaultApi.subclasses + (cls,)
    def get_api_all_json(
        self,
    ) -> object:
        """Return a list of all products. Each of these can be used for the other API endpoints."""
        ...


    def get_api_product_cycle_json(
        self,
        product: ,
        cycle: ,
    ) -> Cycle:
        """Gets details of a single cycle"""
        ...


    def get_api_product_json(
        self,
        product: ,
    ) -> object:
        """Get EoL dates of all cycles of a given product."""
        ...
