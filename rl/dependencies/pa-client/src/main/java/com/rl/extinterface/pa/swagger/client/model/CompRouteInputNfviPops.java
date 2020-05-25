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
import com.rl.extinterface.pa.swagger.client.model.CompRouteInputResourceZoneAttributes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CompRouteInputNfviPops
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-02T08:45:54.546Z")
public class CompRouteInputNfviPops {
  @SerializedName("vimId")
  private String vimId = null;

  @SerializedName("nfviPopId")
  private String nfviPopId = null;

  @SerializedName("netGwIpAddress")
  private String netGwIpAddress = null;

  @SerializedName("attachedPeId")
  private String attachedPeId = null;

  @SerializedName("resourceZoneAttributes")
  private List<CompRouteInputResourceZoneAttributes> resourceZoneAttributes = new ArrayList<CompRouteInputResourceZoneAttributes>();

  public CompRouteInputNfviPops vimId(String vimId) {
    this.vimId = vimId;
    return this;
  }

   /**
   * Identifier of VIM
   * @return vimId
  **/
  @ApiModelProperty(required = true, value = "Identifier of VIM")
  public String getVimId() {
    return vimId;
  }

  public void setVimId(String vimId) {
    this.vimId = vimId;
  }

  public CompRouteInputNfviPops nfviPopId(String nfviPopId) {
    this.nfviPopId = nfviPopId;
    return this;
  }

   /**
   * Identifier of Nfvi-Pop
   * @return nfviPopId
  **/
  @ApiModelProperty(required = true, value = "Identifier of Nfvi-Pop")
  public String getNfviPopId() {
    return nfviPopId;
  }

  public void setNfviPopId(String nfviPopId) {
    this.nfviPopId = nfviPopId;
  }

  public CompRouteInputNfviPops netGwIpAddress(String netGwIpAddress) {
    this.netGwIpAddress = netGwIpAddress;
    return this;
  }

   /**
   * Nfvi-Pop Gw IP Address
   * @return netGwIpAddress
  **/
  @ApiModelProperty(required = true, value = "Nfvi-Pop Gw IP Address")
  public String getNetGwIpAddress() {
    return netGwIpAddress;
  }

  public void setNetGwIpAddress(String netGwIpAddress) {
    this.netGwIpAddress = netGwIpAddress;
  }

  public CompRouteInputNfviPops attachedPeId(String attachedPeId) {
    this.attachedPeId = attachedPeId;
    return this;
  }

   /**
   * WAN PE Id attached to the Nfvi-Pop Gw
   * @return attachedPeId
  **/
  @ApiModelProperty(required = true, value = "WAN PE Id attached to the Nfvi-Pop Gw")
  public String getAttachedPeId() {
    return attachedPeId;
  }

  public void setAttachedPeId(String attachedPeId) {
    this.attachedPeId = attachedPeId;
  }

  public CompRouteInputNfviPops resourceZoneAttributes(List<CompRouteInputResourceZoneAttributes> resourceZoneAttributes) {
    this.resourceZoneAttributes = resourceZoneAttributes;
    return this;
  }

  public CompRouteInputNfviPops addResourceZoneAttributesItem(CompRouteInputResourceZoneAttributes resourceZoneAttributesItem) {
    this.resourceZoneAttributes.add(resourceZoneAttributesItem);
    return this;
  }

   /**
   * Get resourceZoneAttributes
   * @return resourceZoneAttributes
  **/
  @ApiModelProperty(required = true, value = "")
  public List<CompRouteInputResourceZoneAttributes> getResourceZoneAttributes() {
    return resourceZoneAttributes;
  }

  public void setResourceZoneAttributes(List<CompRouteInputResourceZoneAttributes> resourceZoneAttributes) {
    this.resourceZoneAttributes = resourceZoneAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompRouteInputNfviPops compRouteInputNfviPops = (CompRouteInputNfviPops) o;
    return Objects.equals(this.vimId, compRouteInputNfviPops.vimId) &&
        Objects.equals(this.nfviPopId, compRouteInputNfviPops.nfviPopId) &&
        Objects.equals(this.netGwIpAddress, compRouteInputNfviPops.netGwIpAddress) &&
        Objects.equals(this.attachedPeId, compRouteInputNfviPops.attachedPeId) &&
        Objects.equals(this.resourceZoneAttributes, compRouteInputNfviPops.resourceZoneAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vimId, nfviPopId, netGwIpAddress, attachedPeId, resourceZoneAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompRouteInputNfviPops {\n");
    
    sb.append("    vimId: ").append(toIndentedString(vimId)).append("\n");
    sb.append("    nfviPopId: ").append(toIndentedString(nfviPopId)).append("\n");
    sb.append("    netGwIpAddress: ").append(toIndentedString(netGwIpAddress)).append("\n");
    sb.append("    attachedPeId: ").append(toIndentedString(attachedPeId)).append("\n");
    sb.append("    resourceZoneAttributes: ").append(toIndentedString(resourceZoneAttributes)).append("\n");
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

