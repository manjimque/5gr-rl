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
 * InlineResponse2002
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-08T16:03:30.222Z")
public class InlineResponse2002 {
  @SerializedName("pnfList")
  private PNFlist pnfList = null;

  public InlineResponse2002 pnFList(PNFlist pnFList) {
    this.pnfList = pnFList;
    return this;
  }

   /**
   * Get pnFList
   * @return pnFList
  **/
  @ApiModelProperty(value = "")
  public PNFlist getPnFList() {
    return pnfList;
  }

  public void setPnFList(PNFlist pnFList) {
    this.pnfList = pnFList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002 inlineResponse2002 = (InlineResponse2002) o;
    return Objects.equals(this.pnfList, inlineResponse2002.pnfList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pnfList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002 {\n");
    
    sb.append("    pnfList: ").append(toIndentedString(pnfList)).append("\n");
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

