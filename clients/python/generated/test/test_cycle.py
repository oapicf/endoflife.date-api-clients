# coding: utf-8

"""
    endoflife.date

    Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)

    The version of the OpenAPI document: 0.0.1
    Contact: blah+oapicf@cliffano.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from endoflifedate.models.cycle import Cycle

class TestCycle(unittest.TestCase):
    """Cycle unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Cycle:
        """Test Cycle
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Cycle`
        """
        model = Cycle()
        if include_optional:
            return Cycle(
                cycle = 1.337,
                release_date = datetime.datetime.strptime('1975-12-30', '%Y-%m-%d').date(),
                eol = '0',
                latest = '0',
                link = '0',
                lts = True,
                support = datetime.datetime.strptime('1975-12-30', '%Y-%m-%d').date(),
                discontinued = datetime.datetime.strptime('1975-12-30', '%Y-%m-%d').date()
            )
        else:
            return Cycle(
        )
        """

    def testCycle(self):
        """Test Cycle"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
