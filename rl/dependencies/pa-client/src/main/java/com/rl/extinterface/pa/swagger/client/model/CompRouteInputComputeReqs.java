/*
 * 5GT-MTP PA API
 * REST-API for the MTP PA. Find more at http://5g-transformer.eu
 *
 * OpenAPI spec version: 0.0.0
 * Contact: cnd@lists.cttc.es
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.rl.extinterface.pa.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * CompRouteInputComputeReqs
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-02T08:45:54.546Z")
public class CompRouteInputComputeReqs {
  @SerializedName("cpuCons")
  private String cpuCons = null;

  @SerializedName("cpuConsValue")
  private BigDecimal cpuConsValue = null;

  @SerializedName("memoryCons")
  private String memoryCons = null;

  @SerializedName("delayConsValue")
  private BigDecimal delayConsValue = null;

  public CompRouteInputComputeReqs cpuCons(String cpuCons) {
    this.cpuCons = cpuCons;
    return this;
  }

   /**
   * required CPU
   * @return cpuCons
  **/
  @ApiModelProperty(required = true, value = "required CPU")
  public String getCpuCons() {
    return cpuCons;
  }

  public void setCpuCons(String cpuCons) {
    this.cpuCons = cpuCons;
  }

  public CompRouteInputComputeReqs cpuConsValue(BigDecimal cpuConsValue) {
    this.cpuConsValue = cpuConsValue;
    return this;
  }

   /**
   * Value of required CPU
   * @return cpuConsValue
  **/
  @ApiModelProperty(required = true, value = "Value of required CPU")
  public BigDecimal getCpuConsValue() {
    return cpuConsValue;
  }

  public void setCpuConsValue(BigDecimal cpuConsValue) {
    this.cpuConsValue = cpuConsValue;
  }

  public CompRouteInputComputeReqs memoryCons(String memoryCons) {
    this.memoryCons = memoryCons;
    return this;
  }

   /**
   * Required memory
   * @return memoryCons
  **/
  @ApiModelProperty(required = true, value = "Required memory")
  public String getMemoryCons() {
    return memoryCons;
  }

  public void setMemoryCons(String memoryCons) {
    this.memoryCons = memoryCons;
  }

  public CompRouteInputComputeReqs delayConsValue(BigDecimal delayConsValue) {
    this.delayConsValue = delayConsValue;
    return this;
  }

   /**
   * Value of required memory
   * @return delayConsValue
  **/
  @ApiModelProperty(value = "Value of required memory")
  public BigDecimal getDelayConsValue() {
    return delayConsValue;
  }

  public void setDelayConsValue(BigDecimal delayConsValue) {
    this.delayConsValue = delayConsValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompRouteInputComputeReqs compRouteInputComputeReqs = (CompRouteInputComputeReqs) o;
    return Objects.equals(this.cpuCons, compRouteInputComputeReqs.cpuCons) &&
        Objects.equals(this.cpuConsValue, compRouteInputComputeReqs.cpuConsValue) &&
        Objects.equals(this.memoryCons, compRouteInputComputeReqs.memoryCons) &&
        Objects.equals(this.delayConsValue, compRouteInputComputeReqs.delayConsValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpuCons, cpuConsValue, memoryCons, delayConsValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompRouteInputComputeReqs {\n");
    
    sb.append("    cpuCons: ").append(toIndentedString(cpuCons)).append("\n");
    sb.append("    cpuConsValue: ").append(toIndentedString(cpuConsValue)).append("\n");
    sb.append("    memoryCons: ").append(toIndentedString(memoryCons)).append("\n");
    sb.append("    delayConsValue: ").append(toIndentedString(delayConsValue)).append("\n");
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

