# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from mtp_plugin_kubernetes.models.base_model_ import Model
from mtp_plugin_kubernetes.models.create_network_resource_quota_request_virtual_compute_quota import CreateNetworkResourceQuotaRequestVirtualComputeQuota  # noqa: F401,E501
from mtp_plugin_kubernetes import util


class CreateNetworkResourceQuotaRequest(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, resource_group_id: str=None, virtual_compute_quota: CreateNetworkResourceQuotaRequestVirtualComputeQuota=None):  # noqa: E501
        """CreateNetworkResourceQuotaRequest - a model defined in Swagger

        :param resource_group_id: The resource_group_id of this CreateNetworkResourceQuotaRequest.  # noqa: E501
        :type resource_group_id: str
        :param virtual_compute_quota: The virtual_compute_quota of this CreateNetworkResourceQuotaRequest.  # noqa: E501
        :type virtual_compute_quota: CreateNetworkResourceQuotaRequestVirtualComputeQuota
        """
        self.swagger_types = {
            'resource_group_id': str,
            'virtual_compute_quota': CreateNetworkResourceQuotaRequestVirtualComputeQuota
        }

        self.attribute_map = {
            'resource_group_id': 'resourceGroupId',
            'virtual_compute_quota': 'virtualComputeQuota'
        }

        self._resource_group_id = resource_group_id
        self._virtual_compute_quota = virtual_compute_quota

    @classmethod
    def from_dict(cls, dikt) -> 'CreateNetworkResourceQuotaRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CreateNetworkResourceQuotaRequest of this CreateNetworkResourceQuotaRequest.  # noqa: E501
        :rtype: CreateNetworkResourceQuotaRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def resource_group_id(self) -> str:
        """Gets the resource_group_id of this CreateNetworkResourceQuotaRequest.

        Unique identifier of the \"infrastructure resource group\", logical grouping of virtual resources assigned to a tenant within an Infrastructure Domain.  # noqa: E501

        :return: The resource_group_id of this CreateNetworkResourceQuotaRequest.
        :rtype: str
        """
        return self._resource_group_id

    @resource_group_id.setter
    def resource_group_id(self, resource_group_id: str):
        """Sets the resource_group_id of this CreateNetworkResourceQuotaRequest.

        Unique identifier of the \"infrastructure resource group\", logical grouping of virtual resources assigned to a tenant within an Infrastructure Domain.  # noqa: E501

        :param resource_group_id: The resource_group_id of this CreateNetworkResourceQuotaRequest.
        :type resource_group_id: str
        """
        if resource_group_id is None:
            raise ValueError("Invalid value for `resource_group_id`, must not be `None`")  # noqa: E501

        self._resource_group_id = resource_group_id

    @property
    def virtual_compute_quota(self) -> CreateNetworkResourceQuotaRequestVirtualComputeQuota:
        """Gets the virtual_compute_quota of this CreateNetworkResourceQuotaRequest.


        :return: The virtual_compute_quota of this CreateNetworkResourceQuotaRequest.
        :rtype: CreateNetworkResourceQuotaRequestVirtualComputeQuota
        """
        return self._virtual_compute_quota

    @virtual_compute_quota.setter
    def virtual_compute_quota(self, virtual_compute_quota: CreateNetworkResourceQuotaRequestVirtualComputeQuota):
        """Sets the virtual_compute_quota of this CreateNetworkResourceQuotaRequest.


        :param virtual_compute_quota: The virtual_compute_quota of this CreateNetworkResourceQuotaRequest.
        :type virtual_compute_quota: CreateNetworkResourceQuotaRequestVirtualComputeQuota
        """
        if virtual_compute_quota is None:
            raise ValueError("Invalid value for `virtual_compute_quota`, must not be `None`")  # noqa: E501

        self._virtual_compute_quota = virtual_compute_quota
