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

/**
 * Information specifying additional attributes of the compute resource to be reserved.
 */
@ApiModel(description = "Information specifying additional attributes of the compute resource to be reserved.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-08T16:03:30.222Z")
public class CreateComputeResourceReservationRequestComputePoolReservationComputeAttributes {
  @SerializedName("accelerationCapability")
  private String accelerationCapability = null;

  @SerializedName("cpuArchitecture")
  private String cpuArchitecture = null;

  @SerializedName("virtualCpuOversubscriptionPolicy")
  private String virtualCpuOversubscriptionPolicy = null;

  public CreateComputeResourceReservationRequestComputePoolReservationComputeAttributes accelerationCapability(String accelerationCapability) {
    this.accelerationCapability = accelerationCapability;
    return this;
  }

   /**
   * Selected acceleration capabilities (e.g. crypto, GPU) from the set of capabilities offered by the compute node acceleration resources. The cardinality can be 0, if no particular acceleration capability is requested.
   * @return accelerationCapability
  **/
  @ApiModelProperty(required = true, value = "Selected acceleration capabilities (e.g. crypto, GPU) from the set of capabilities offered by the compute node acceleration resources. The cardinality can be 0, if no particular acceleration capability is requested.")
  public String getAccelerationCapability() {
    return accelerationCapability;
  }

  public void setAccelerationCapability(String accelerationCapability) {
    this.accelerationCapability = accelerationCapability;
  }

  public CreateComputeResourceReservationRequestComputePoolReservationComputeAttributes cpuArchitecture(String cpuArchitecture) {
    this.cpuArchitecture = cpuArchitecture;
    return this;
  }

   /**
   * CPU architecture type. Examples are \&quot;x86\&quot;, \&quot;ARM\&quot;. The cardinality can be 0, if no particular CPU architecture type is requested.
   * @return cpuArchitecture
  **/
  @ApiModelProperty(required = true, value = "CPU architecture type. Examples are \"x86\", \"ARM\". The cardinality can be 0, if no particular CPU architecture type is requested.")
  public String getCpuArchitecture() {
    return cpuArchitecture;
  }

  public void setCpuArchitecture(String cpuArchitecture) {
    this.cpuArchitecture = cpuArchitecture;
  }

  public CreateComputeResourceReservationRequestComputePoolReservationComputeAttributes virtualCpuOversubscriptionPolicy(String virtualCpuOversubscriptionPolicy) {
    this.virtualCpuOversubscriptionPolicy = virtualCpuOversubscriptionPolicy;
    return this;
  }

   /**
   * The CPU core oversubscription policy in terms of virtual CPU cores to physical CPU cores/threads on the platform. The cardinality can be 0, if no particular value is requested.
   * @return virtualCpuOversubscriptionPolicy
  **/
  @ApiModelProperty(required = true, value = "The CPU core oversubscription policy in terms of virtual CPU cores to physical CPU cores/threads on the platform. The cardinality can be 0, if no particular value is requested.")
  public String getVirtualCpuOversubscriptionPolicy() {
    return virtualCpuOversubscriptionPolicy;
  }

  public void setVirtualCpuOversubscriptionPolicy(String virtualCpuOversubscriptionPolicy) {
    this.virtualCpuOversubscriptionPolicy = virtualCpuOversubscriptionPolicy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateComputeResourceReservationRequestComputePoolReservationComputeAttributes createComputeResourceReservationRequestComputePoolReservationComputeAttributes = (CreateComputeResourceReservationRequestComputePoolReservationComputeAttributes) o;
    return Objects.equals(this.accelerationCapability, createComputeResourceReservationRequestComputePoolReservationComputeAttributes.accelerationCapability) &&
        Objects.equals(this.cpuArchitecture, createComputeResourceReservationRequestComputePoolReservationComputeAttributes.cpuArchitecture) &&
        Objects.equals(this.virtualCpuOversubscriptionPolicy, createComputeResourceReservationRequestComputePoolReservationComputeAttributes.virtualCpuOversubscriptionPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accelerationCapability, cpuArchitecture, virtualCpuOversubscriptionPolicy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateComputeResourceReservationRequestComputePoolReservationComputeAttributes {\n");
    
    sb.append("    accelerationCapability: ").append(toIndentedString(accelerationCapability)).append("\n");
    sb.append("    cpuArchitecture: ").append(toIndentedString(cpuArchitecture)).append("\n");
    sb.append("    virtualCpuOversubscriptionPolicy: ").append(toIndentedString(virtualCpuOversubscriptionPolicy)).append("\n");
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

