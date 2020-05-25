# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from mtp_plugin_kubernetes.models.base_model_ import Model
from mtp_plugin_kubernetes.models.create_compute_resource_reservation_request_container_flavour_storage_attributes import CreateComputeResourceReservationRequestContainerFlavourStorageAttributes  # noqa: F401,E501
from mtp_plugin_kubernetes.models.create_compute_resource_reservation_request_container_flavour_virtual_cpu import CreateComputeResourceReservationRequestContainerFlavourVirtualCpu  # noqa: F401,E501
from mtp_plugin_kubernetes.models.create_compute_resource_reservation_request_container_flavour_virtual_memory import CreateComputeResourceReservationRequestContainerFlavourVirtualMemory  # noqa: F401,E501
from mtp_plugin_kubernetes.models.create_compute_resource_reservation_request_container_flavour_virtual_network_interface import CreateComputeResourceReservationRequestContainerFlavourVirtualNetworkInterface  # noqa: F401,E501
from mtp_plugin_kubernetes import util


class CreateComputeResourceReservationRequestContainerFlavour(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, acceleration_capability: str=None, flavour_id: str=None, storage_attributes: List[CreateComputeResourceReservationRequestContainerFlavourStorageAttributes]=None, virtual_cpu: List[CreateComputeResourceReservationRequestContainerFlavourVirtualCpu]=None, virtual_memory: CreateComputeResourceReservationRequestContainerFlavourVirtualMemory=None, virtual_network_interface: CreateComputeResourceReservationRequestContainerFlavourVirtualNetworkInterface=None):  # noqa: E501
        """CreateComputeResourceReservationRequestContainerFlavour - a model defined in Swagger

        :param acceleration_capability: The acceleration_capability of this CreateComputeResourceReservationRequestContainerFlavour.  # noqa: E501
        :type acceleration_capability: str
        :param flavour_id: The flavour_id of this CreateComputeResourceReservationRequestContainerFlavour.  # noqa: E501
        :type flavour_id: str
        :param storage_attributes: The storage_attributes of this CreateComputeResourceReservationRequestContainerFlavour.  # noqa: E501
        :type storage_attributes: List[CreateComputeResourceReservationRequestContainerFlavourStorageAttributes]
        :param virtual_cpu: The virtual_cpu of this CreateComputeResourceReservationRequestContainerFlavour.  # noqa: E501
        :type virtual_cpu: List[CreateComputeResourceReservationRequestContainerFlavourVirtualCpu]
        :param virtual_memory: The virtual_memory of this CreateComputeResourceReservationRequestContainerFlavour.  # noqa: E501
        :type virtual_memory: CreateComputeResourceReservationRequestContainerFlavourVirtualMemory
        :param virtual_network_interface: The virtual_network_interface of this CreateComputeResourceReservationRequestContainerFlavour.  # noqa: E501
        :type virtual_network_interface: CreateComputeResourceReservationRequestContainerFlavourVirtualNetworkInterface
        """
        self.swagger_types = {
            'acceleration_capability': str,
            'flavour_id': str,
            'storage_attributes': List[CreateComputeResourceReservationRequestContainerFlavourStorageAttributes],
            'virtual_cpu': List[CreateComputeResourceReservationRequestContainerFlavourVirtualCpu],
            'virtual_memory': CreateComputeResourceReservationRequestContainerFlavourVirtualMemory,
            'virtual_network_interface': CreateComputeResourceReservationRequestContainerFlavourVirtualNetworkInterface
        }

        self.attribute_map = {
            'acceleration_capability': 'accelerationCapability',
            'flavour_id': 'flavourId',
            'storage_attributes': 'storageAttributes',
            'virtual_cpu': 'virtualCpu',
            'virtual_memory': 'virtualMemory',
            'virtual_network_interface': 'virtualNetworkInterface'
        }

        self._acceleration_capability = acceleration_capability
        self._flavour_id = flavour_id
        self._storage_attributes = storage_attributes
        self._virtual_cpu = virtual_cpu
        self._virtual_memory = virtual_memory
        self._virtual_network_interface = virtual_network_interface

    @classmethod
    def from_dict(cls, dikt) -> 'CreateComputeResourceReservationRequestContainerFlavour':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CreateComputeResourceReservationRequest_containerFlavour of this CreateComputeResourceReservationRequestContainerFlavour.  # noqa: E501
        :rtype: CreateComputeResourceReservationRequestContainerFlavour
        """
        return util.deserialize_model(dikt, cls)

    @property
    def acceleration_capability(self) -> str:
        """Gets the acceleration_capability of this CreateComputeResourceReservationRequestContainerFlavour.

        Selected acceleration capabilities (e.g. crypto, GPU) from the set of capabilities offered by the compute node acceleration resources. The cardinality can be 0, if no particular acceleration capability is requested.  # noqa: E501

        :return: The acceleration_capability of this CreateComputeResourceReservationRequestContainerFlavour.
        :rtype: str
        """
        return self._acceleration_capability

    @acceleration_capability.setter
    def acceleration_capability(self, acceleration_capability: str):
        """Sets the acceleration_capability of this CreateComputeResourceReservationRequestContainerFlavour.

        Selected acceleration capabilities (e.g. crypto, GPU) from the set of capabilities offered by the compute node acceleration resources. The cardinality can be 0, if no particular acceleration capability is requested.  # noqa: E501

        :param acceleration_capability: The acceleration_capability of this CreateComputeResourceReservationRequestContainerFlavour.
        :type acceleration_capability: str
        """
        if acceleration_capability is None:
            raise ValueError("Invalid value for `acceleration_capability`, must not be `None`")  # noqa: E501

        self._acceleration_capability = acceleration_capability

    @property
    def flavour_id(self) -> str:
        """Gets the flavour_id of this CreateComputeResourceReservationRequestContainerFlavour.

        Identifier given to the compute flavour.  # noqa: E501

        :return: The flavour_id of this CreateComputeResourceReservationRequestContainerFlavour.
        :rtype: str
        """
        return self._flavour_id

    @flavour_id.setter
    def flavour_id(self, flavour_id: str):
        """Sets the flavour_id of this CreateComputeResourceReservationRequestContainerFlavour.

        Identifier given to the compute flavour.  # noqa: E501

        :param flavour_id: The flavour_id of this CreateComputeResourceReservationRequestContainerFlavour.
        :type flavour_id: str
        """
        if flavour_id is None:
            raise ValueError("Invalid value for `flavour_id`, must not be `None`")  # noqa: E501

        self._flavour_id = flavour_id

    @property
    def storage_attributes(self) -> List[CreateComputeResourceReservationRequestContainerFlavourStorageAttributes]:
        """Gets the storage_attributes of this CreateComputeResourceReservationRequestContainerFlavour.

        Element containing information about the size of virtualised storage resources (e.g. size of volume, in GB), the type of storage (e.g. volume, object).  # noqa: E501

        :return: The storage_attributes of this CreateComputeResourceReservationRequestContainerFlavour.
        :rtype: List[CreateComputeResourceReservationRequestContainerFlavourStorageAttributes]
        """
        return self._storage_attributes

    @storage_attributes.setter
    def storage_attributes(self, storage_attributes: List[CreateComputeResourceReservationRequestContainerFlavourStorageAttributes]):
        """Sets the storage_attributes of this CreateComputeResourceReservationRequestContainerFlavour.

        Element containing information about the size of virtualised storage resources (e.g. size of volume, in GB), the type of storage (e.g. volume, object).  # noqa: E501

        :param storage_attributes: The storage_attributes of this CreateComputeResourceReservationRequestContainerFlavour.
        :type storage_attributes: List[CreateComputeResourceReservationRequestContainerFlavourStorageAttributes]
        """
        if storage_attributes is None:
            raise ValueError("Invalid value for `storage_attributes`, must not be `None`")  # noqa: E501

        self._storage_attributes = storage_attributes

    @property
    def virtual_cpu(self) -> List[CreateComputeResourceReservationRequestContainerFlavourVirtualCpu]:
        """Gets the virtual_cpu of this CreateComputeResourceReservationRequestContainerFlavour.

        The virtual CPU(s) of the virtualised compute.  # noqa: E501

        :return: The virtual_cpu of this CreateComputeResourceReservationRequestContainerFlavour.
        :rtype: List[CreateComputeResourceReservationRequestContainerFlavourVirtualCpu]
        """
        return self._virtual_cpu

    @virtual_cpu.setter
    def virtual_cpu(self, virtual_cpu: List[CreateComputeResourceReservationRequestContainerFlavourVirtualCpu]):
        """Sets the virtual_cpu of this CreateComputeResourceReservationRequestContainerFlavour.

        The virtual CPU(s) of the virtualised compute.  # noqa: E501

        :param virtual_cpu: The virtual_cpu of this CreateComputeResourceReservationRequestContainerFlavour.
        :type virtual_cpu: List[CreateComputeResourceReservationRequestContainerFlavourVirtualCpu]
        """
        if virtual_cpu is None:
            raise ValueError("Invalid value for `virtual_cpu`, must not be `None`")  # noqa: E501

        self._virtual_cpu = virtual_cpu

    @property
    def virtual_memory(self) -> CreateComputeResourceReservationRequestContainerFlavourVirtualMemory:
        """Gets the virtual_memory of this CreateComputeResourceReservationRequestContainerFlavour.


        :return: The virtual_memory of this CreateComputeResourceReservationRequestContainerFlavour.
        :rtype: CreateComputeResourceReservationRequestContainerFlavourVirtualMemory
        """
        return self._virtual_memory

    @virtual_memory.setter
    def virtual_memory(self, virtual_memory: CreateComputeResourceReservationRequestContainerFlavourVirtualMemory):
        """Sets the virtual_memory of this CreateComputeResourceReservationRequestContainerFlavour.


        :param virtual_memory: The virtual_memory of this CreateComputeResourceReservationRequestContainerFlavour.
        :type virtual_memory: CreateComputeResourceReservationRequestContainerFlavourVirtualMemory
        """
        if virtual_memory is None:
            raise ValueError("Invalid value for `virtual_memory`, must not be `None`")  # noqa: E501

        self._virtual_memory = virtual_memory

    @property
    def virtual_network_interface(self) -> CreateComputeResourceReservationRequestContainerFlavourVirtualNetworkInterface:
        """Gets the virtual_network_interface of this CreateComputeResourceReservationRequestContainerFlavour.


        :return: The virtual_network_interface of this CreateComputeResourceReservationRequestContainerFlavour.
        :rtype: CreateComputeResourceReservationRequestContainerFlavourVirtualNetworkInterface
        """
        return self._virtual_network_interface

    @virtual_network_interface.setter
    def virtual_network_interface(self, virtual_network_interface: CreateComputeResourceReservationRequestContainerFlavourVirtualNetworkInterface):
        """Sets the virtual_network_interface of this CreateComputeResourceReservationRequestContainerFlavour.


        :param virtual_network_interface: The virtual_network_interface of this CreateComputeResourceReservationRequestContainerFlavour.
        :type virtual_network_interface: CreateComputeResourceReservationRequestContainerFlavourVirtualNetworkInterface
        """
        if virtual_network_interface is None:
            raise ValueError("Invalid value for `virtual_network_interface`, must not be `None`")  # noqa: E501

        self._virtual_network_interface = virtual_network_interface
