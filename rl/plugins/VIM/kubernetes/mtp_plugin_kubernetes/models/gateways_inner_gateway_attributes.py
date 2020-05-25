# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from mtp_plugin_kubernetes.models.base_model_ import Model
from mtp_plugin_kubernetes.models.gateways_inner_gateway_attributes_network_connectivity_endpoint import GatewaysInnerGatewayAttributesNetworkConnectivityEndpoint  # noqa: F401,E501
from mtp_plugin_kubernetes import util


class GatewaysInnerGatewayAttributes(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, geographical_location_info: str=None, wim_id: str=None, network_connectivity_endpoint: List[GatewaysInnerGatewayAttributesNetworkConnectivityEndpoint]=None, gateway_id: str=None):  # noqa: E501
        """GatewaysInnerGatewayAttributes - a model defined in Swagger

        :param geographical_location_info: The geographical_location_info of this GatewaysInnerGatewayAttributes.  # noqa: E501
        :type geographical_location_info: str
        :param wim_id: The wim_id of this GatewaysInnerGatewayAttributes.  # noqa: E501
        :type wim_id: str
        :param network_connectivity_endpoint: The network_connectivity_endpoint of this GatewaysInnerGatewayAttributes.  # noqa: E501
        :type network_connectivity_endpoint: List[GatewaysInnerGatewayAttributesNetworkConnectivityEndpoint]
        :param gateway_id: The gateway_id of this GatewaysInnerGatewayAttributes.  # noqa: E501
        :type gateway_id: str
        """
        self.swagger_types = {
            'geographical_location_info': str,
            'wim_id': str,
            'network_connectivity_endpoint': List[GatewaysInnerGatewayAttributesNetworkConnectivityEndpoint],
            'gateway_id': str
        }

        self.attribute_map = {
            'geographical_location_info': 'geographicalLocationInfo',
            'wim_id': 'wimId',
            'network_connectivity_endpoint': 'networkConnectivityEndpoint',
            'gateway_id': 'gatewayId'
        }

        self._geographical_location_info = geographical_location_info
        self._wim_id = wim_id
        self._network_connectivity_endpoint = network_connectivity_endpoint
        self._gateway_id = gateway_id

    @classmethod
    def from_dict(cls, dikt) -> 'GatewaysInnerGatewayAttributes':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Gateways_inner_gatewayAttributes of this GatewaysInnerGatewayAttributes.  # noqa: E501
        :rtype: GatewaysInnerGatewayAttributes
        """
        return util.deserialize_model(dikt, cls)

    @property
    def geographical_location_info(self) -> str:
        """Gets the geographical_location_info of this GatewaysInnerGatewayAttributes.

        It provides information about the geographic location (e.g. geographic coordinates or address of the building, etc.) of the NFVI resources that the VIM manages.  # noqa: E501

        :return: The geographical_location_info of this GatewaysInnerGatewayAttributes.
        :rtype: str
        """
        return self._geographical_location_info

    @geographical_location_info.setter
    def geographical_location_info(self, geographical_location_info: str):
        """Sets the geographical_location_info of this GatewaysInnerGatewayAttributes.

        It provides information about the geographic location (e.g. geographic coordinates or address of the building, etc.) of the NFVI resources that the VIM manages.  # noqa: E501

        :param geographical_location_info: The geographical_location_info of this GatewaysInnerGatewayAttributes.
        :type geographical_location_info: str
        """
        if geographical_location_info is None:
            raise ValueError("Invalid value for `geographical_location_info`, must not be `None`")  # noqa: E501

        self._geographical_location_info = geographical_location_info

    @property
    def wim_id(self) -> str:
        """Gets the wim_id of this GatewaysInnerGatewayAttributes.

        Identification of the WIM.  # noqa: E501

        :return: The wim_id of this GatewaysInnerGatewayAttributes.
        :rtype: str
        """
        return self._wim_id

    @wim_id.setter
    def wim_id(self, wim_id: str):
        """Sets the wim_id of this GatewaysInnerGatewayAttributes.

        Identification of the WIM.  # noqa: E501

        :param wim_id: The wim_id of this GatewaysInnerGatewayAttributes.
        :type wim_id: str
        """
        if wim_id is None:
            raise ValueError("Invalid value for `wim_id`, must not be `None`")  # noqa: E501

        self._wim_id = wim_id

    @property
    def network_connectivity_endpoint(self) -> List[GatewaysInnerGatewayAttributesNetworkConnectivityEndpoint]:
        """Gets the network_connectivity_endpoint of this GatewaysInnerGatewayAttributes.


        :return: The network_connectivity_endpoint of this GatewaysInnerGatewayAttributes.
        :rtype: List[GatewaysInnerGatewayAttributesNetworkConnectivityEndpoint]
        """
        return self._network_connectivity_endpoint

    @network_connectivity_endpoint.setter
    def network_connectivity_endpoint(self, network_connectivity_endpoint: List[GatewaysInnerGatewayAttributesNetworkConnectivityEndpoint]):
        """Sets the network_connectivity_endpoint of this GatewaysInnerGatewayAttributes.


        :param network_connectivity_endpoint: The network_connectivity_endpoint of this GatewaysInnerGatewayAttributes.
        :type network_connectivity_endpoint: List[GatewaysInnerGatewayAttributesNetworkConnectivityEndpoint]
        """
        if network_connectivity_endpoint is None:
            raise ValueError("Invalid value for `network_connectivity_endpoint`, must not be `None`")  # noqa: E501

        self._network_connectivity_endpoint = network_connectivity_endpoint

    @property
    def gateway_id(self) -> str:
        """Gets the gateway_id of this GatewaysInnerGatewayAttributes.

        Identification of the gateway in the format IPv4.  # noqa: E501

        :return: The gateway_id of this GatewaysInnerGatewayAttributes.
        :rtype: str
        """
        return self._gateway_id

    @gateway_id.setter
    def gateway_id(self, gateway_id: str):
        """Sets the gateway_id of this GatewaysInnerGatewayAttributes.

        Identification of the gateway in the format IPv4.  # noqa: E501

        :param gateway_id: The gateway_id of this GatewaysInnerGatewayAttributes.
        :type gateway_id: str
        """
        if gateway_id is None:
            raise ValueError("Invalid value for `gateway_id`, must not be `None`")  # noqa: E501

        self._gateway_id = gateway_id
