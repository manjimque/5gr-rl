/*
 * WIM Manager API
 * WIM Manager API
 *
 * OpenAPI spec version: 0.0.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * VirtualNetworkNetworkPort
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-02T11:54:01.688+01:00")
public class VirtualNetworkNetworkPort   {
  @JsonProperty("portType")
  private String portType = null;

  @JsonProperty("attachedResourceId")
  private String attachedResourceId = null;

  @JsonProperty("networkId")
  private String networkId = null;

  @JsonProperty("resourceId")
  private String resourceId = null;

  public VirtualNetworkNetworkPort portType(String portType) {
    this.portType = portType;
    return this;
  }

  /**
   * Type of network port. Examples of types are access ports (layer 2 or 3), or trunk ports (layer 1) that become transport for multiple layer 2 or layer 3 networks.
   * @return portType
   **/
  @JsonProperty("portType")
  @ApiModelProperty(required = true, value = "Type of network port. Examples of types are access ports (layer 2 or 3), or trunk ports (layer 1) that become transport for multiple layer 2 or layer 3 networks.")
  @NotNull
  public String getPortType() {
    return portType;
  }

  public void setPortType(String portType) {
    this.portType = portType;
  }

  public VirtualNetworkNetworkPort attachedResourceId(String attachedResourceId) {
    this.attachedResourceId = attachedResourceId;
    return this;
  }

  /**
   * Identifier of the attached resource to the network port (e.g. a virtualised compute resource, or identifier of the virtual network interface). The cardinality can be \&quot;0\&quot; if there is no specific resource connected to the network port.
   * @return attachedResourceId
   **/
  @JsonProperty("attachedResourceId")
  @ApiModelProperty(required = true, value = "Identifier of the attached resource to the network port (e.g. a virtualised compute resource, or identifier of the virtual network interface). The cardinality can be \"0\" if there is no specific resource connected to the network port.")
  @NotNull
  public String getAttachedResourceId() {
    return attachedResourceId;
  }

  public void setAttachedResourceId(String attachedResourceId) {
    this.attachedResourceId = attachedResourceId;
  }

  public VirtualNetworkNetworkPort networkId(String networkId) {
    this.networkId = networkId;
    return this;
  }

  /**
   * Identifier of the network that the port belongs to. When creating a port, such port needs to be part of a network.
   * @return networkId
   **/
  @JsonProperty("networkId")
  @ApiModelProperty(required = true, value = "Identifier of the network that the port belongs to. When creating a port, such port needs to be part of a network.")
  @NotNull
  public String getNetworkId() {
    return networkId;
  }

  public void setNetworkId(String networkId) {
    this.networkId = networkId;
  }

  public VirtualNetworkNetworkPort resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * Identifier of the virtual network port.
   * @return resourceId
   **/
  @JsonProperty("resourceId")
  @ApiModelProperty(required = true, value = "Identifier of the virtual network port.")
  @NotNull
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualNetworkNetworkPort virtualNetworkNetworkPort = (VirtualNetworkNetworkPort) o;
    return Objects.equals(this.portType, virtualNetworkNetworkPort.portType) &&
        Objects.equals(this.attachedResourceId, virtualNetworkNetworkPort.attachedResourceId) &&
        Objects.equals(this.networkId, virtualNetworkNetworkPort.networkId) &&
        Objects.equals(this.resourceId, virtualNetworkNetworkPort.resourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portType, attachedResourceId, networkId, resourceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualNetworkNetworkPort {\n");
    
    sb.append("    portType: ").append(toIndentedString(portType)).append("\n");
    sb.append("    attachedResourceId: ").append(toIndentedString(attachedResourceId)).append("\n");
    sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

