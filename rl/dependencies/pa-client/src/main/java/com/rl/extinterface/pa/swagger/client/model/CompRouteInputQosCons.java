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
 * CompRouteInputQosCons
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-02T08:45:54.546Z")
public class CompRouteInputQosCons {
  @SerializedName("bandwidthCons")
  private String bandwidthCons = null;

  @SerializedName("bandwidthConsValue")
  private BigDecimal bandwidthConsValue = null;

  @SerializedName("delayCons")
  private String delayCons = null;

  @SerializedName("delayConsValue")
  private BigDecimal delayConsValue = null;

  public CompRouteInputQosCons bandwidthCons(String bandwidthCons) {
    this.bandwidthCons = bandwidthCons;
    return this;
  }

   /**
   * required bandwidth for the interNfviPop connection
   * @return bandwidthCons
  **/
  @ApiModelProperty(required = true, value = "required bandwidth for the interNfviPop connection")
  public String getBandwidthCons() {
    return bandwidthCons;
  }

  public void setBandwidthCons(String bandwidthCons) {
    this.bandwidthCons = bandwidthCons;
  }

  public CompRouteInputQosCons bandwidthConsValue(BigDecimal bandwidthConsValue) {
    this.bandwidthConsValue = bandwidthConsValue;
    return this;
  }

   /**
   * Value of required bandwidth for the interNfviPop connection(expressed in Mbps)
   * @return bandwidthConsValue
  **/
  @ApiModelProperty(required = true, value = "Value of required bandwidth for the interNfviPop connection(expressed in Mbps)")
  public BigDecimal getBandwidthConsValue() {
    return bandwidthConsValue;
  }

  public void setBandwidthConsValue(BigDecimal bandwidthConsValue) {
    this.bandwidthConsValue = bandwidthConsValue;
  }

  public CompRouteInputQosCons delayCons(String delayCons) {
    this.delayCons = delayCons;
    return this;
  }

   /**
   * required e2e delay for the interNfviPop connection
   * @return delayCons
  **/
  @ApiModelProperty(required = true, value = "required e2e delay for the interNfviPop connection")
  public String getDelayCons() {
    return delayCons;
  }

  public void setDelayCons(String delayCons) {
    this.delayCons = delayCons;
  }

  public CompRouteInputQosCons delayConsValue(BigDecimal delayConsValue) {
    this.delayConsValue = delayConsValue;
    return this;
  }

   /**
   * Maximum tolerated value of required e2e delay for the interNfviPop connection (expressed in ms)
   * @return delayConsValue
  **/
  @ApiModelProperty(required = true, value = "Maximum tolerated value of required e2e delay for the interNfviPop connection (expressed in ms)")
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
    CompRouteInputQosCons compRouteInputQosCons = (CompRouteInputQosCons) o;
    return Objects.equals(this.bandwidthCons, compRouteInputQosCons.bandwidthCons) &&
        Objects.equals(this.bandwidthConsValue, compRouteInputQosCons.bandwidthConsValue) &&
        Objects.equals(this.delayCons, compRouteInputQosCons.delayCons) &&
        Objects.equals(this.delayConsValue, compRouteInputQosCons.delayConsValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bandwidthCons, bandwidthConsValue, delayCons, delayConsValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompRouteInputQosCons {\n");
    
    sb.append("    bandwidthCons: ").append(toIndentedString(bandwidthCons)).append("\n");
    sb.append("    bandwidthConsValue: ").append(toIndentedString(bandwidthConsValue)).append("\n");
    sb.append("    delayCons: ").append(toIndentedString(delayCons)).append("\n");
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

