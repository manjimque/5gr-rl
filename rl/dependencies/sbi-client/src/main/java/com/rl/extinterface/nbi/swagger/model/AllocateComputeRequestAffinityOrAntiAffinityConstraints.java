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
import io.swagger.annotations.ApiModelProperty;

/**
 * AllocateComputeRequestAffinityOrAntiAffinityConstraints
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-08T16:03:30.222Z")
public class AllocateComputeRequestAffinityOrAntiAffinityConstraints {
  @SerializedName("affinityAntiAffinityResourceGroup")
  private String affinityAntiAffinityResourceGroup = null;

  @SerializedName("affinityAntiAffinityResourceList")
  private AllocateComputeRequestAffinityAntiAffinityResourceList affinityAntiAffinityResourceList = null;

  @SerializedName("scope")
  private String scope = null;

  @SerializedName("type")
  private String type = null;

  public AllocateComputeRequestAffinityOrAntiAffinityConstraints affinityAntiAffinityResourceGroup(String affinityAntiAffinityResourceGroup) {
    this.affinityAntiAffinityResourceGroup = affinityAntiAffinityResourceGroup;
    return this;
  }

   /**
   * Identifier of the producer-managed group of virtualised resources with which the actual resource is requested to be affine or anti-affine. Either affinityAntiAffinityResourceList or affinityAntiAffinityResourceGroup but not both shall be present.
   * @return affinityAntiAffinityResourceGroup
  **/
  @ApiModelProperty(required = true, value = "Identifier of the producer-managed group of virtualised resources with which the actual resource is requested to be affine or anti-affine. Either affinityAntiAffinityResourceList or affinityAntiAffinityResourceGroup but not both shall be present.")
  public String getAffinityAntiAffinityResourceGroup() {
    return affinityAntiAffinityResourceGroup;
  }

  public void setAffinityAntiAffinityResourceGroup(String affinityAntiAffinityResourceGroup) {
    this.affinityAntiAffinityResourceGroup = affinityAntiAffinityResourceGroup;
  }

  public AllocateComputeRequestAffinityOrAntiAffinityConstraints affinityAntiAffinityResourceList(AllocateComputeRequestAffinityAntiAffinityResourceList affinityAntiAffinityResourceList) {
    this.affinityAntiAffinityResourceList = affinityAntiAffinityResourceList;
    return this;
  }

   /**
   * Get affinityAntiAffinityResourceList
   * @return affinityAntiAffinityResourceList
  **/
  @ApiModelProperty(required = true, value = "")
  public AllocateComputeRequestAffinityAntiAffinityResourceList getAffinityAntiAffinityResourceList() {
    return affinityAntiAffinityResourceList;
  }

  public void setAffinityAntiAffinityResourceList(AllocateComputeRequestAffinityAntiAffinityResourceList affinityAntiAffinityResourceList) {
    this.affinityAntiAffinityResourceList = affinityAntiAffinityResourceList;
  }

  public AllocateComputeRequestAffinityOrAntiAffinityConstraints scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Qualifies the scope of the constraint. In case of compute resource: e.g. \&quot;NFVI-PoP\&quot; or \&quot;NFVI Node\&quot;. In case of ports: e.g. \&quot;virtual switch or router\&quot; or \&quot;physical NIC\&quot;, or \&quot;physical network\&quot; or \&quot;NFVI Node\&quot;. In case of networks: e.g. \&quot;physical NIC\&quot;, \&quot;physical network\&quot; or \&quot;NFVI Node\&quot;. In case of subnets: it should be ignored. Defaults to \&quot;NFVI Node\&quot; if absent.
   * @return scope
  **/
  @ApiModelProperty(required = true, value = "Qualifies the scope of the constraint. In case of compute resource: e.g. \"NFVI-PoP\" or \"NFVI Node\". In case of ports: e.g. \"virtual switch or router\" or \"physical NIC\", or \"physical network\" or \"NFVI Node\". In case of networks: e.g. \"physical NIC\", \"physical network\" or \"NFVI Node\". In case of subnets: it should be ignored. Defaults to \"NFVI Node\" if absent.")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public AllocateComputeRequestAffinityOrAntiAffinityConstraints type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Indicates whether this is an affinity or anti-affinity constraint.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Indicates whether this is an affinity or anti-affinity constraint.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllocateComputeRequestAffinityOrAntiAffinityConstraints allocateComputeRequestAffinityOrAntiAffinityConstraints = (AllocateComputeRequestAffinityOrAntiAffinityConstraints) o;
    return Objects.equals(this.affinityAntiAffinityResourceGroup, allocateComputeRequestAffinityOrAntiAffinityConstraints.affinityAntiAffinityResourceGroup) &&
        Objects.equals(this.affinityAntiAffinityResourceList, allocateComputeRequestAffinityOrAntiAffinityConstraints.affinityAntiAffinityResourceList) &&
        Objects.equals(this.scope, allocateComputeRequestAffinityOrAntiAffinityConstraints.scope) &&
        Objects.equals(this.type, allocateComputeRequestAffinityOrAntiAffinityConstraints.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affinityAntiAffinityResourceGroup, affinityAntiAffinityResourceList, scope, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllocateComputeRequestAffinityOrAntiAffinityConstraints {\n");
    
    sb.append("    affinityAntiAffinityResourceGroup: ").append(toIndentedString(affinityAntiAffinityResourceGroup)).append("\n");
    sb.append("    affinityAntiAffinityResourceList: ").append(toIndentedString(affinityAntiAffinityResourceList)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

