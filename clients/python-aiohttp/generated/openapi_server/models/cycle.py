# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server import util


class Cycle(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, cycle: object=None, release_date: object=None, eol: object=None, latest: object=None, link: object=None, lts: object=None, support: object=None, discontinued: object=None):
        """Cycle - a model defined in OpenAPI

        :param cycle: The cycle of this Cycle.
        :param release_date: The release_date of this Cycle.
        :param eol: The eol of this Cycle.
        :param latest: The latest of this Cycle.
        :param link: The link of this Cycle.
        :param lts: The lts of this Cycle.
        :param support: The support of this Cycle.
        :param discontinued: The discontinued of this Cycle.
        """
        self.openapi_types = {
            'cycle': object,
            'release_date': object,
            'eol': object,
            'latest': object,
            'link': object,
            'lts': object,
            'support': object,
            'discontinued': object
        }

        self.attribute_map = {
            'cycle': 'cycle',
            'release_date': 'releaseDate',
            'eol': 'eol',
            'latest': 'latest',
            'link': 'link',
            'lts': 'lts',
            'support': 'support',
            'discontinued': 'discontinued'
        }

        self._cycle = cycle
        self._release_date = release_date
        self._eol = eol
        self._latest = latest
        self._link = link
        self._lts = lts
        self._support = support
        self._discontinued = discontinued

    @classmethod
    def from_dict(cls, dikt: dict) -> 'Cycle':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The cycle of this Cycle.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def cycle(self):
        """Gets the cycle of this Cycle.

        Release Cycle

        :return: The cycle of this Cycle.
        :rtype: object
        """
        return self._cycle

    @cycle.setter
    def cycle(self, cycle):
        """Sets the cycle of this Cycle.

        Release Cycle

        :param cycle: The cycle of this Cycle.
        :type cycle: object
        """

        self._cycle = cycle

    @property
    def release_date(self):
        """Gets the release_date of this Cycle.

        Release Date for the first release in this cycle

        :return: The release_date of this Cycle.
        :rtype: object
        """
        return self._release_date

    @release_date.setter
    def release_date(self, release_date):
        """Sets the release_date of this Cycle.

        Release Date for the first release in this cycle

        :param release_date: The release_date of this Cycle.
        :type release_date: object
        """
        if release_date is not None and len(release_date) > 10:
            raise ValueError("Invalid value for `release_date`, length must be less than or equal to `10`")
        if release_date is not None and len(release_date) < 10:
            raise ValueError("Invalid value for `release_date`, length must be greater than or equal to `10`")

        self._release_date = release_date

    @property
    def eol(self):
        """Gets the eol of this Cycle.

        End of Life Date for this release cycle

        :return: The eol of this Cycle.
        :rtype: object
        """
        return self._eol

    @eol.setter
    def eol(self, eol):
        """Sets the eol of this Cycle.

        End of Life Date for this release cycle

        :param eol: The eol of this Cycle.
        :type eol: object
        """
        if eol is not None and len(eol) < 1:
            raise ValueError("Invalid value for `eol`, length must be greater than or equal to `1`")

        self._eol = eol

    @property
    def latest(self):
        """Gets the latest of this Cycle.

        Latest release in this cycle

        :return: The latest of this Cycle.
        :rtype: object
        """
        return self._latest

    @latest.setter
    def latest(self, latest):
        """Sets the latest of this Cycle.

        Latest release in this cycle

        :param latest: The latest of this Cycle.
        :type latest: object
        """
        if latest is not None and len(latest) < 1:
            raise ValueError("Invalid value for `latest`, length must be greater than or equal to `1`")

        self._latest = latest

    @property
    def link(self):
        """Gets the link of this Cycle.

        Link to changelog for the latest release, if available

        :return: The link of this Cycle.
        :rtype: object
        """
        return self._link

    @link.setter
    def link(self, link):
        """Sets the link of this Cycle.

        Link to changelog for the latest release, if available

        :param link: The link of this Cycle.
        :type link: object
        """
        if link is not None and len(link) < 1:
            raise ValueError("Invalid value for `link`, length must be greater than or equal to `1`")

        self._link = link

    @property
    def lts(self):
        """Gets the lts of this Cycle.

        Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date. 

        :return: The lts of this Cycle.
        :rtype: object
        """
        return self._lts

    @lts.setter
    def lts(self, lts):
        """Sets the lts of this Cycle.

        Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date. 

        :param lts: The lts of this Cycle.
        :type lts: object
        """

        self._lts = lts

    @property
    def support(self):
        """Gets the support of this Cycle.

        Whether this release cycle has active support

        :return: The support of this Cycle.
        :rtype: object
        """
        return self._support

    @support.setter
    def support(self, support):
        """Sets the support of this Cycle.

        Whether this release cycle has active support

        :param support: The support of this Cycle.
        :type support: object
        """
        if support is not None and len(support) > 10:
            raise ValueError("Invalid value for `support`, length must be less than or equal to `10`")
        if support is not None and len(support) < 10:
            raise ValueError("Invalid value for `support`, length must be greater than or equal to `10`")

        self._support = support

    @property
    def discontinued(self):
        """Gets the discontinued of this Cycle.

        Whether this cycle is now discontinued.

        :return: The discontinued of this Cycle.
        :rtype: object
        """
        return self._discontinued

    @discontinued.setter
    def discontinued(self, discontinued):
        """Sets the discontinued of this Cycle.

        Whether this cycle is now discontinued.

        :param discontinued: The discontinued of this Cycle.
        :type discontinued: object
        """
        if discontinued is not None and len(discontinued) > 10:
            raise ValueError("Invalid value for `discontinued`, length must be less than or equal to `10`")
        if discontinued is not None and len(discontinued) < 10:
            raise ValueError("Invalid value for `discontinued`, length must be greater than or equal to `10`")

        self._discontinued = discontinued