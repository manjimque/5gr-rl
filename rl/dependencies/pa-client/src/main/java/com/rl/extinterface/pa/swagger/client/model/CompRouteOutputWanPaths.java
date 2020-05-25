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
import com.rl.extinterface.pa.swagger.client.model.CompRouteOutputWanPathElements;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CompRouteOutputWanPaths
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-02T08:45:54.546Z")
public class CompRouteOutputWanPaths {
  @SerializedName("wimId")
  private String wimId = null;

  @SerializedName("wanPathElements")
  private List<CompRouteOutputWanPathElements> wanPathElements = new ArrayList<CompRouteOutputWanPathElements>();

  public CompRouteOutputWanPaths wimId(String wimId) {
    this.wimId = wimId;
    return this;
  }

   /**
   * Identifier of WIM related to the asbtracted WAN
   * @return wimId
  **/
  @ApiModelProperty(required = true, value = "Identifier of WIM related to the asbtracted WAN")
  public String getWimId() {
    return wimId;
  }

  public void setWimId(String wimId) {
    this.wimId = wimId;
  }

  public CompRouteOutputWanPaths wanPathElements(List<CompRouteOutputWanPathElements> wanPathElements) {
    this.wanPathElements = wanPathElements;
    return this;
  }

  public CompRouteOutputWanPaths addWanPathElementsItem(CompRouteOutputWanPathElements wanPathElementsItem) {
    this.wanPathElements.add(wanPathElementsItem);
    return this;
  }

   /**
   * Get wanPathElements
   * @return wanPathElements
  **/
  @ApiModelProperty(required = true, value = "")
  public List<CompRouteOutputWanPathElements> getWanPathElements() {
    return wanPathElements;
  }

  public void setWanPathElements(List<CompRouteOutputWanPathElements> wanPathElements) {
    this.wanPathElements = wanPathElements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompRouteOutputWanPaths compRouteOutputWanPaths = (CompRouteOutputWanPaths) o;
    return Objects.equals(this.wimId, compRouteOutputWanPaths.wimId) &&
        Objects.equals(this.wanPathElements, compRouteOutputWanPaths.wanPathElements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wimId, wanPathElements);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompRouteOutputWanPaths {\n");
    
    sb.append("    wimId: ").append(toIndentedString(wimId)).append("\n");
    sb.append("    wanPathElements: ").append(toIndentedString(wanPathElements)).append("\n");
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

