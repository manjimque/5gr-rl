package com.ericsson.dummyplugin.nbi.swagger.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class VIMVirtualComputeVirtualNetworkInterface   {
  
  private @Valid String accelerationCapability = null;
  private @Valid String bandwidth = null;
  private @Valid List<String> ipAddress = new ArrayList<String>();
  private @Valid String macAddress = null;
  private @Valid String metadata = null;
  private @Valid String networkId = null;
  private @Valid String networkPortId = null;
  private @Valid String operationalState = null;
  private @Valid String ownerId = null;
  private @Valid String resourceId = null;
  private @Valid String typeConfiguration = null;
  private @Valid String typeVirtualNic = null;

  /**
   * Shows the acceleration capabilities utilized by the virtual network interface. The cardinality can be 0, if no acceleration capability is utilized.
   **/
  public VIMVirtualComputeVirtualNetworkInterface accelerationCapability(String accelerationCapability) {
    this.accelerationCapability = accelerationCapability;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Shows the acceleration capabilities utilized by the virtual network interface. The cardinality can be 0, if no acceleration capability is utilized.")
  @JsonProperty("accelerationCapability")
  @NotNull
  public String getAccelerationCapability() {
    return accelerationCapability;
  }
  public void setAccelerationCapability(String accelerationCapability) {
    this.accelerationCapability = accelerationCapability;
  }

  /**
   * The bandwidth of the virtual network interface (in Mbps).
   **/
  public VIMVirtualComputeVirtualNetworkInterface bandwidth(String bandwidth) {
    this.bandwidth = bandwidth;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The bandwidth of the virtual network interface (in Mbps).")
  @JsonProperty("bandwidth")
  @NotNull
  public String getBandwidth() {
    return bandwidth;
  }
  public void setBandwidth(String bandwidth) {
    this.bandwidth = bandwidth;
  }

  /**
   * The virtual network interface can be configured with specific IP address(es) associated to the network to be attached to. The cardinality can be 0 in the case that a network interface is created without being attached to any specific network, or when an IP address can be automatically configured, e.g. by DHCP.
   **/
  public VIMVirtualComputeVirtualNetworkInterface ipAddress(List<String> ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The virtual network interface can be configured with specific IP address(es) associated to the network to be attached to. The cardinality can be 0 in the case that a network interface is created without being attached to any specific network, or when an IP address can be automatically configured, e.g. by DHCP.")
  @JsonProperty("ipAddress")
  @NotNull
  public List<String> getIpAddress() {
    return ipAddress;
  }
  public void setIpAddress(List<String> ipAddress) {
    this.ipAddress = ipAddress;
  }

  /**
   * The MAC address of the virtual network interface.
   **/
  public VIMVirtualComputeVirtualNetworkInterface macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The MAC address of the virtual network interface.")
  @JsonProperty("macAddress")
  @NotNull
  public String getMacAddress() {
    return macAddress;
  }
  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }

  /**
   * List of metadata key-value pairs used by the consumer to associate meaningful metadata to the related virtualised resource.
   **/
  public VIMVirtualComputeVirtualNetworkInterface metadata(String metadata) {
    this.metadata = metadata;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of metadata key-value pairs used by the consumer to associate meaningful metadata to the related virtualised resource.")
  @JsonProperty("metadata")
  @NotNull
  public String getMetadata() {
    return metadata;
  }
  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }

  /**
   * In the case when the virtual network interface is attached to the network, it identifies such a network. The cardinality can be 0 in the case that a network interface is created without being attached to any specific network.
   **/
  public VIMVirtualComputeVirtualNetworkInterface networkId(String networkId) {
    this.networkId = networkId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "In the case when the virtual network interface is attached to the network, it identifies such a network. The cardinality can be 0 in the case that a network interface is created without being attached to any specific network.")
  @JsonProperty("networkId")
  @NotNull
  public String getNetworkId() {
    return networkId;
  }
  public void setNetworkId(String networkId) {
    this.networkId = networkId;
  }

  /**
   * If the virtual network interface is attached to a specific network port, it identifies such a network port. The cardinality can be 0 in the case that a network interface is created without any specific network port attachment.
   **/
  public VIMVirtualComputeVirtualNetworkInterface networkPortId(String networkPortId) {
    this.networkPortId = networkPortId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "If the virtual network interface is attached to a specific network port, it identifies such a network port. The cardinality can be 0 in the case that a network interface is created without any specific network port attachment.")
  @JsonProperty("networkPortId")
  @NotNull
  public String getNetworkPortId() {
    return networkPortId;
  }
  public void setNetworkPortId(String networkPortId) {
    this.networkPortId = networkPortId;
  }

  /**
   * The operational state of the virtual network interface.
   **/
  public VIMVirtualComputeVirtualNetworkInterface operationalState(String operationalState) {
    this.operationalState = operationalState;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The operational state of the virtual network interface.")
  @JsonProperty("operationalState")
  @NotNull
  public String getOperationalState() {
    return operationalState;
  }
  public void setOperationalState(String operationalState) {
    this.operationalState = operationalState;
  }

  /**
   * Identifier of the owner of the network interface (e.g. a virtualised compute resource). 
   **/
  public VIMVirtualComputeVirtualNetworkInterface ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Identifier of the owner of the network interface (e.g. a virtualised compute resource). ")
  @JsonProperty("ownerId")
  @NotNull
  public String getOwnerId() {
    return ownerId;
  }
  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  /**
   * Identifier of the virtual network interface.
   **/
  public VIMVirtualComputeVirtualNetworkInterface resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Identifier of the virtual network interface.")
  @JsonProperty("resourceId")
  @NotNull
  public String getResourceId() {
    return resourceId;
  }
  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  /**
   * Extra configuration that the virtual network interface supports based on the type of virtual network interface, including support for SR-IOV with configuration of virtual functions (VF).
   **/
  public VIMVirtualComputeVirtualNetworkInterface typeConfiguration(String typeConfiguration) {
    this.typeConfiguration = typeConfiguration;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Extra configuration that the virtual network interface supports based on the type of virtual network interface, including support for SR-IOV with configuration of virtual functions (VF).")
  @JsonProperty("typeConfiguration")
  @NotNull
  public String getTypeConfiguration() {
    return typeConfiguration;
  }
  public void setTypeConfiguration(String typeConfiguration) {
    this.typeConfiguration = typeConfiguration;
  }

  /**
   * Type of network interface. The type allows for defining how such interface is to be realized, e.g. normal virtual NIC, with direct PCI passthrough, etc.
   **/
  public VIMVirtualComputeVirtualNetworkInterface typeVirtualNic(String typeVirtualNic) {
    this.typeVirtualNic = typeVirtualNic;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Type of network interface. The type allows for defining how such interface is to be realized, e.g. normal virtual NIC, with direct PCI passthrough, etc.")
  @JsonProperty("typeVirtualNic")
  @NotNull
  public String getTypeVirtualNic() {
    return typeVirtualNic;
  }
  public void setTypeVirtualNic(String typeVirtualNic) {
    this.typeVirtualNic = typeVirtualNic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VIMVirtualComputeVirtualNetworkInterface viMVirtualComputeVirtualNetworkInterface = (VIMVirtualComputeVirtualNetworkInterface) o;
    return Objects.equals(accelerationCapability, viMVirtualComputeVirtualNetworkInterface.accelerationCapability) &&
        Objects.equals(bandwidth, viMVirtualComputeVirtualNetworkInterface.bandwidth) &&
        Objects.equals(ipAddress, viMVirtualComputeVirtualNetworkInterface.ipAddress) &&
        Objects.equals(macAddress, viMVirtualComputeVirtualNetworkInterface.macAddress) &&
        Objects.equals(metadata, viMVirtualComputeVirtualNetworkInterface.metadata) &&
        Objects.equals(networkId, viMVirtualComputeVirtualNetworkInterface.networkId) &&
        Objects.equals(networkPortId, viMVirtualComputeVirtualNetworkInterface.networkPortId) &&
        Objects.equals(operationalState, viMVirtualComputeVirtualNetworkInterface.operationalState) &&
        Objects.equals(ownerId, viMVirtualComputeVirtualNetworkInterface.ownerId) &&
        Objects.equals(resourceId, viMVirtualComputeVirtualNetworkInterface.resourceId) &&
        Objects.equals(typeConfiguration, viMVirtualComputeVirtualNetworkInterface.typeConfiguration) &&
        Objects.equals(typeVirtualNic, viMVirtualComputeVirtualNetworkInterface.typeVirtualNic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accelerationCapability, bandwidth, ipAddress, macAddress, metadata, networkId, networkPortId, operationalState, ownerId, resourceId, typeConfiguration, typeVirtualNic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VIMVirtualComputeVirtualNetworkInterface {\n");
    
    sb.append("    accelerationCapability: ").append(toIndentedString(accelerationCapability)).append("\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
    sb.append("    networkPortId: ").append(toIndentedString(networkPortId)).append("\n");
    sb.append("    operationalState: ").append(toIndentedString(operationalState)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    typeConfiguration: ").append(toIndentedString(typeConfiguration)).append("\n");
    sb.append("    typeVirtualNic: ").append(toIndentedString(typeVirtualNic)).append("\n");
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

