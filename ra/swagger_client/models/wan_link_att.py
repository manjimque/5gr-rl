# coding: utf-8

"""
    5Growth RL RA API

    RESTful API for the 5Gr RL RA. Find more at http://5growth.eu  # noqa: E501

    OpenAPI spec version: 1.1.1
    Contact: cnd@lists.cttc.es
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six


class WanLinkAtt(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'a_node_id': 'str',
        'z_node_id': 'str',
        'a_link_id': 'int',
        'z_link_id': 'int'
    }

    attribute_map = {
        'a_node_id': 'aNodeId',
        'z_node_id': 'zNodeId',
        'a_link_id': 'aLinkId',
        'z_link_id': 'zLinkId'
    }

    def __init__(self, a_node_id=None, z_node_id=None, a_link_id=None, z_link_id=None):  # noqa: E501
        """WanLinkAtt - a model defined in Swagger"""  # noqa: E501

        self._a_node_id = None
        self._z_node_id = None
        self._a_link_id = None
        self._z_link_id = None
        self.discriminator = None

        self.a_node_id = a_node_id
        self.z_node_id = z_node_id
        self.a_link_id = a_link_id
        self.z_link_id = z_link_id

    @property
    def a_node_id(self):
        """Gets the a_node_id of this WanLinkAtt.  # noqa: E501

        outgoing Node Id  # noqa: E501

        :return: The a_node_id of this WanLinkAtt.  # noqa: E501
        :rtype: str
        """
        return self._a_node_id

    @a_node_id.setter
    def a_node_id(self, a_node_id):
        """Sets the a_node_id of this WanLinkAtt.

        outgoing Node Id  # noqa: E501

        :param a_node_id: The a_node_id of this WanLinkAtt.  # noqa: E501
        :type: str
        """
        if a_node_id is None:
            raise ValueError("Invalid value for `a_node_id`, must not be `None`")  # noqa: E501

        self._a_node_id = a_node_id

    @property
    def z_node_id(self):
        """Gets the z_node_id of this WanLinkAtt.  # noqa: E501

        incoming Node Id  # noqa: E501

        :return: The z_node_id of this WanLinkAtt.  # noqa: E501
        :rtype: str
        """
        return self._z_node_id

    @z_node_id.setter
    def z_node_id(self, z_node_id):
        """Sets the z_node_id of this WanLinkAtt.

        incoming Node Id  # noqa: E501

        :param z_node_id: The z_node_id of this WanLinkAtt.  # noqa: E501
        :type: str
        """
        if z_node_id is None:
            raise ValueError("Invalid value for `z_node_id`, must not be `None`")  # noqa: E501

        self._z_node_id = z_node_id

    @property
    def a_link_id(self):
        """Gets the a_link_id of this WanLinkAtt.  # noqa: E501

        Link Id. attached to the aNodeId  # noqa: E501

        :return: The a_link_id of this WanLinkAtt.  # noqa: E501
        :rtype: int
        """
        return self._a_link_id

    @a_link_id.setter
    def a_link_id(self, a_link_id):
        """Sets the a_link_id of this WanLinkAtt.

        Link Id. attached to the aNodeId  # noqa: E501

        :param a_link_id: The a_link_id of this WanLinkAtt.  # noqa: E501
        :type: int
        """
        if a_link_id is None:
            raise ValueError("Invalid value for `a_link_id`, must not be `None`")  # noqa: E501

        self._a_link_id = a_link_id

    @property
    def z_link_id(self):
        """Gets the z_link_id of this WanLinkAtt.  # noqa: E501

        Link Id. attached to the zNodeId  # noqa: E501

        :return: The z_link_id of this WanLinkAtt.  # noqa: E501
        :rtype: int
        """
        return self._z_link_id

    @z_link_id.setter
    def z_link_id(self, z_link_id):
        """Sets the z_link_id of this WanLinkAtt.

        Link Id. attached to the zNodeId  # noqa: E501

        :param z_link_id: The z_link_id of this WanLinkAtt.  # noqa: E501
        :type: int
        """
        if z_link_id is None:
            raise ValueError("Invalid value for `z_link_id`, must not be `None`")  # noqa: E501

        self._z_link_id = z_link_id

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(WanLinkAtt, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, WanLinkAtt):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
