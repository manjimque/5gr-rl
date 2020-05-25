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
 * Info of MF
 */
@ApiModel(description = "Info of MF")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-08T16:03:30.222Z")
public class MFInfo {
  @SerializedName("pnfid")
  private String pnfid = null;

  @SerializedName("vnfid")
  private String vnfid = null;

  @SerializedName("mflist")
  private List<MFInfoMflist> mflist = null;

  public MFInfo pnfid(String pnfid) {
    this.pnfid = pnfid;
    return this;
  }

   /**
   * Get pnfid
   * @return pnfid
  **/
  @ApiModelProperty(value = "")
  public String getPnfid() {
    return pnfid;
  }

  public void setPnfid(String pnfid) {
    this.pnfid = pnfid;
  }

  public MFInfo vnfid(String vnfid) {
    this.vnfid = vnfid;
    return this;
  }

   /**
   * Get vnfid
   * @return vnfid
  **/
  @ApiModelProperty(value = "")
  public String getVnfid() {
    return vnfid;
  }

  public void setVnfid(String vnfid) {
    this.vnfid = vnfid;
  }

  public MFInfo mflist(List<MFInfoMflist> mflist) {
    this.mflist = mflist;
    return this;
  }

  public MFInfo addMflistItem(MFInfoMflist mflistItem) {
    if (this.mflist == null) {
      this.mflist = new ArrayList<MFInfoMflist>();
    }
    this.mflist.add(mflistItem);
    return this;
  }

   /**
   * Get mflist
   * @return mflist
  **/
  @ApiModelProperty(value = "")
  public List<MFInfoMflist> getMflist() {
    return mflist;
  }

  public void setMflist(List<MFInfoMflist> mflist) {
    this.mflist = mflist;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MFInfo mfInfo = (MFInfo) o;
    return Objects.equals(this.pnfid, mfInfo.pnfid) &&
        Objects.equals(this.vnfid, mfInfo.vnfid) &&
        Objects.equals(this.mflist, mfInfo.mflist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pnfid, vnfid, mflist);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MFInfo {\n");
    
    sb.append("    pnfid: ").append(toIndentedString(pnfid)).append("\n");
    sb.append("    vnfid: ").append(toIndentedString(vnfid)).append("\n");
    sb.append("    mflist: ").append(toIndentedString(mflist)).append("\n");
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

