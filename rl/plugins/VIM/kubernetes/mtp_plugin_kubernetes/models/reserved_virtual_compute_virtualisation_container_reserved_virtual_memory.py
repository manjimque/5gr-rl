# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from mtp_plugin_kubernetes.models.base_model_ import Model
from mtp_plugin_kubernetes import util


class ReservedVirtualComputeVirtualisationContainerReservedVirtualMemory(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, numa_enabled: bool=None, virtual_mem_oversubscription_policy: str=None, virtual_mem_size: float=None):  # noqa: E501
        """ReservedVirtualComputeVirtualisationContainerReservedVirtualMemory - a model defined in Swagger

        :param numa_enabled: The numa_enabled of this ReservedVirtualComputeVirtualisationContainerReservedVirtualMemory.  # noqa: E501
        :type numa_enabled: bool
        :param virtual_mem_oversubscription_policy: The virtual_mem_oversubscription_policy of this ReservedVirtualComputeVirtualisationContainerReservedVirtualMemory.  # noqa: E501
        :type virtual_mem_oversubscription_policy: str
        :param virtual_mem_size: The virtual_mem_size of this ReservedVirtualComputeVirtualisationContainerReservedVirtualMemory.  # noqa: E501
        :type virtual_mem_size: float
        """
        self.swagger_types = {
            'numa_enabled': bool,
            'virtual_mem_oversubscription_policy': str,
            'virtual_mem_size': float
        }

        self.attribute_map = {
            'numa_enabled': 'numaEnabled',
            'virtual_mem_oversubscription_policy': 'virtualMemOversubscriptionPolicy',
            'virtual_mem_size': 'virtualMemSize'
        }

        self._numa_enabled = numa_enabled
        self._virtual_mem_oversubscription_policy = virtual_mem_oversubscription_policy
        self._virtual_mem_size = virtual_mem_size

    @classmethod
    def from_dict(cls, dikt) -> 'ReservedVirtualComputeVirtualisationContainerReservedVirtualMemory':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ReservedVirtualCompute_virtualisationContainerReserved_virtualMemory of this ReservedVirtualComputeVirtualisationContainerReservedVirtualMemory.  # noqa: E501
        :rtype: ReservedVirtualComputeVirtualisationContainerReservedVirtualMemory
        """
        return util.deserialize_model(dikt, cls)

    @property
    def numa_enabled(self) -> bool:
        """Gets the numa_enabled of this ReservedVirtualComputeVirtualisationContainerReservedVirtualMemory.

        It specifies the memory allocation to be cognisant of the relevant process/core allocation.  # noqa: E501

        :return: The numa_enabled of this ReservedVirtualComputeVirtualisationContainerReservedVirtualMemory.
        :rtype: bool
        """
        return self._numa_enabled

    @numa_enabled.setter
    def numa_enabled(self, numa_enabled: bool):
        """Sets the numa_enabled of this ReservedVirtualComputeVirtualisationContainerReservedVirtualMemory.

        It specifies the memory allocation to be cognisant of the relevant process/core allocation.  # noqa: E501

        :param numa_enabled: The numa_enabled of this ReservedVirtualComputeVirtualisationContainerReservedVirtualMemory.
        :type numa_enabled: bool
        """
        if numa_enabled is None:
            raise ValueError("Invalid value for `numa_enabled`, must not be `None`")  # noqa: E501

        self._numa_enabled = numa_enabled

    @property
    def virtual_mem_oversubscription_policy(self) -> str:
        """Gets the virtual_mem_oversubscription_policy of this ReservedVirtualComputeVirtualisationContainerReservedVirtualMemory.

        The memory core oversubscription policy in terms of virtual memory to physical memory on the platform. The cardinality can be 0 if no policy has been defined during the allocation request.  # noqa: E501

        :return: The virtual_mem_oversubscription_policy of this ReservedVirtualComputeVirtualisationContainerReservedVirtualMemory.
        :rtype: str
        """
        return self._virtual_mem_oversubscription_policy

    @virtual_mem_oversubscription_policy.setter
    def virtual_mem_oversubscription_policy(self, virtual_mem_oversubscription_policy: str):
        """Sets the virtual_mem_oversubscription_policy of this ReservedVirtualComputeVirtualisationContainerReservedVirtualMemory.

        The memory core oversubscription policy in terms of virtual memory to physical memory on the platform. The cardinality can be 0 if no policy has been defined during the allocation request.  # noqa: E501

        :param virtual_mem_oversubscription_policy: The virtual_mem_oversubscription_policy of this ReservedVirtualComputeVirtualisationContainerReservedVirtualMemory.
        :type virtual_mem_oversubscription_policy: str
        """
        if virtual_mem_oversubscription_policy is None:
            raise ValueError("Invalid value for `virtual_mem_oversubscription_policy`, must not be `None`")  # noqa: E501

        self._virtual_mem_oversubscription_policy = virtual_mem_oversubscription_policy

    @property
    def virtual_mem_size(self) -> float:
        """Gets the virtual_mem_size of this ReservedVirtualComputeVirtualisationContainerReservedVirtualMemory.

        Amount of virtual Memory (e.g. in MB).  # noqa: E501

        :return: The virtual_mem_size of this ReservedVirtualComputeVirtualisationContainerReservedVirtualMemory.
        :rtype: float
        """
        return self._virtual_mem_size

    @virtual_mem_size.setter
    def virtual_mem_size(self, virtual_mem_size: float):
        """Sets the virtual_mem_size of this ReservedVirtualComputeVirtualisationContainerReservedVirtualMemory.

        Amount of virtual Memory (e.g. in MB).  # noqa: E501

        :param virtual_mem_size: The virtual_mem_size of this ReservedVirtualComputeVirtualisationContainerReservedVirtualMemory.
        :type virtual_mem_size: float
        """
        if virtual_mem_size is None:
            raise ValueError("Invalid value for `virtual_mem_size`, must not be `None`")  # noqa: E501

        self._virtual_mem_size = virtual_mem_size
