# coding: utf-8

"""
    endoflife.date

    Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)

    The version of the OpenAPI document: 0.0.1
    Contact: blah+oapicf@cliffano.com
    Generated by: https://openapi-generator.tech
"""


from fastapi import FastAPI

from openapi_server.apis.default_api import router as DefaultApiRouter

app = FastAPI(
    title="endoflife.date",
    description="Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)",
    version="0.0.1",
)

app.include_router(DefaultApiRouter)
