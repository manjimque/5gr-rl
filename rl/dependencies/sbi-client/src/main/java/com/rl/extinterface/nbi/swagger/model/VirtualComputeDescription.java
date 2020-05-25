/*
 * MTP Manager API
 * MTP Manager API
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.rl.extinterface.nbi.swagger.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Describes CPU, Memory and acceleration requirements of the Virtualisation machine.
 */
@ApiModel(description = "Describes CPU, Memory and acceleration requirements of the Virtualisation machine.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-08T16:03:30.222Z")
public class VirtualComputeDescription {
  @SerializedName("virtualComputeDescId")
  private String virtualComputeDescId = null;

  @SerializedName("requestAdditionalCapabilities")
  private List<RequestAdditionalCapabilityData> requestAdditionalCapabilities = null;

  @SerializedName("virtualMemory")
  private VirtualMemoryData virtualMemory = null;

  @SerializedName("virtualCpu")
  private VirtualCpuData virtualCpu = null;

  public VirtualComputeDescription virtualComputeDescId(String virtualComputeDescId) {
    this.virtualComputeDescId = virtualComputeDescId;
    return this;
  }

   /**
   * Unique identifier of this VirtualComputeDescription in the appD.
   * @return virtualComputeDescId
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of this VirtualComputeDescription in the appD.")
  public String getVirtualComputeDescId() {
    return virtualComputeDescId;
  }

  public void setVirtualComputeDescId(String virtualComputeDescId) {
    this.virtualComputeDescId = virtualComputeDescId;
  }

  public VirtualComputeDescription requestAdditionalCapabilities(List<RequestAdditionalCapabilityData> requestAdditionalCapabilities) {
    this.requestAdditionalCapabilities = requestAdditionalCapabilities;
    return this;
  }

  public VirtualComputeDescription addRequestAdditionalCapabilitiesItem(RequestAdditionalCapabilityData requestAdditionalCapabilitiesItem) {
    if (this.requestAdditionalCapabilities == null) {
      this.requestAdditionalCapabilities = new ArrayList<RequestAdditionalCapabilityData>();
    }
    this.requestAdditionalCapabilities.add(requestAdditionalCapabilitiesItem);
    return this;
  }

   /**
   * Specifies requirements for additional  capabilities. These may be for a range of purposes. One example is acceleration related capabilities.
   * @return requestAdditionalCapabilities
  **/
  @ApiModelProperty(value = "Specifies requirements for additional  capabilities. These may be for a range of purposes. One example is acceleration related capabilities.")
  public List<RequestAdditionalCapabilityData> getRequestAdditionalCapabilities() {
    return requestAdditionalCapabilities;
  }

  public void setRequestAdditionalCapabilities(List<RequestAdditionalCapabilityData> requestAdditionalCapabilities) {
    this.requestAdditionalCapabilities = requestAdditionalCapabilities;
  }

  public VirtualComputeDescription virtualMemory(VirtualMemoryData virtualMemory) {
    this.virtualMemory = virtualMemory;
    return this;
  }

   /**
   * Get virtualMemory
   * @return virtualMemory
  **/
  @ApiModelProperty(required = true, value = "")
  public VirtualMemoryData getVirtualMemory() {
    return virtualMemory;
  }

  public void setVirtualMemory(VirtualMemoryData virtualMemory) {
    this.virtualMemory = virtualMemory;
  }

  public VirtualComputeDescription virtualCpu(VirtualCpuData virtualCpu) {
    this.virtualCpu = virtualCpu;
    return this;
  }

   /**
   * Get virtualCpu
   * @return virtualCpu
  **/
  @ApiModelProperty(required = true, value = "")
  public VirtualCpuData getVirtualCpu() {
    return virtualCpu;
  }

  public void setVirtualCpu(VirtualCpuData virtualCpu) {
    this.virtualCpu = virtualCpu;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualComputeDescription virtualComputeDescription = (VirtualComputeDescription) o;
    return Objects.equals(this.virtualComputeDescId, virtualComputeDescription.virtualComputeDescId) &&
        Objects.equals(this.requestAdditionalCapabilities, virtualComputeDescription.requestAdditionalCapabilities) &&
        Objects.equals(this.virtualMemory, virtualComputeDescription.virtualMemory) &&
        Objects.equals(this.virtualCpu, virtualComputeDescription.virtualCpu);
  }

  @Override
  public int hashCode() {
    return Objects.hash(virtualComputeDescId, requestAdditionalCapabilities, virtualMemory, virtualCpu);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualComputeDescription {\n");
    
    sb.append("    virtualComputeDescId: ").append(toIndentedString(virtualComputeDescId)).append("\n");
    sb.append("    requestAdditionalCapabilities: ").append(toIndentedString(requestAdditionalCapabilities)).append("\n");
    sb.append("    virtualMemory: ").append(toIndentedString(virtualMemory)).append("\n");
    sb.append("    virtualCpu: ").append(toIndentedString(virtualCpu)).append("\n");
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

