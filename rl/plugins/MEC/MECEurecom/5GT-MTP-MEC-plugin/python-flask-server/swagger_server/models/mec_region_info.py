# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server.models.mec_region_info_mec_region_info import MECRegionInfoMECRegionInfo  # noqa: F401,E501
from swagger_server import util


class MECRegionInfo(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, mec_region_info: MECRegionInfoMECRegionInfo=None):  # noqa: E501
        """MECRegionInfo - a model defined in Swagger

        :param mec_region_info: The mec_region_info of this MECRegionInfo.  # noqa: E501
        :type mec_region_info: MECRegionInfoMECRegionInfo
        """
        self.swagger_types = {
            'mec_region_info': MECRegionInfoMECRegionInfo
        }

        self.attribute_map = {
            'mec_region_info': 'MECRegionInfo'
        }

        self._mec_region_info = mec_region_info

    @classmethod
    def from_dict(cls, dikt) -> 'MECRegionInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The MECRegionInfo of this MECRegionInfo.  # noqa: E501
        :rtype: MECRegionInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def mec_region_info(self) -> MECRegionInfoMECRegionInfo:
        """Gets the mec_region_info of this MECRegionInfo.


        :return: The mec_region_info of this MECRegionInfo.
        :rtype: MECRegionInfoMECRegionInfo
        """
        return self._mec_region_info

    @mec_region_info.setter
    def mec_region_info(self, mec_region_info: MECRegionInfoMECRegionInfo):
        """Sets the mec_region_info of this MECRegionInfo.


        :param mec_region_info: The mec_region_info of this MECRegionInfo.
        :type mec_region_info: MECRegionInfoMECRegionInfo
        """

        self._mec_region_info = mec_region_info
