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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AddressData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-08T16:03:30.222Z")
public class AddressData {
  /**
   * Describes the type of the address to be assigned to the CP instantiated from the parent CPD. The content type shall be aligned with the address type supported by the layerProtocol attribute of the parent CPD.
   */
  @JsonAdapter(AddressTypeEnum.Adapter.class)
  public enum AddressTypeEnum {
    MAC("MAC"),
    
    IPV4("IPV4"),
    
    IPV6("IPV6");

    private String value;

    AddressTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AddressTypeEnum fromValue(String text) {
      for (AddressTypeEnum b : AddressTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AddressTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AddressTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AddressTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AddressTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("addressType")
  private AddressTypeEnum addressType = null;

  @SerializedName("l2AddressData")
  private Object l2AddressData = null;

  @SerializedName("l3AddressData")
  private Object l3AddressData = null;

  public AddressData addressType(AddressTypeEnum addressType) {
    this.addressType = addressType;
    return this;
  }

   /**
   * Describes the type of the address to be assigned to the CP instantiated from the parent CPD. The content type shall be aligned with the address type supported by the layerProtocol attribute of the parent CPD.
   * @return addressType
  **/
  @ApiModelProperty(required = true, value = "Describes the type of the address to be assigned to the CP instantiated from the parent CPD. The content type shall be aligned with the address type supported by the layerProtocol attribute of the parent CPD.")
  public AddressTypeEnum getAddressType() {
    return addressType;
  }

  public void setAddressType(AddressTypeEnum addressType) {
    this.addressType = addressType;
  }

  public AddressData l2AddressData(Object l2AddressData) {
    this.l2AddressData = l2AddressData;
    return this;
  }

   /**
   * Provides the information on the MAC addresses to be assigned to the CP(s) instantiated from the parent CPD. Shall be present when the addressType is MAC address.
   * @return l2AddressData
  **/
  @ApiModelProperty(value = "Provides the information on the MAC addresses to be assigned to the CP(s) instantiated from the parent CPD. Shall be present when the addressType is MAC address.")
  public Object getL2AddressData() {
    return l2AddressData;
  }

  public void setL2AddressData(Object l2AddressData) {
    this.l2AddressData = l2AddressData;
  }

  public AddressData l3AddressData(Object l3AddressData) {
    this.l3AddressData = l3AddressData;
    return this;
  }

   /**
   * Provides the information on the IP addresses to be assigned to the CP instantiated from the parent CPD. Shall be present when the addressType is IP address.
   * @return l3AddressData
  **/
  @ApiModelProperty(value = "Provides the information on the IP addresses to be assigned to the CP instantiated from the parent CPD. Shall be present when the addressType is IP address.")
  public Object getL3AddressData() {
    return l3AddressData;
  }

  public void setL3AddressData(Object l3AddressData) {
    this.l3AddressData = l3AddressData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressData addressData = (AddressData) o;
    return Objects.equals(this.addressType, addressData.addressType) &&
        Objects.equals(this.l2AddressData, addressData.l2AddressData) &&
        Objects.equals(this.l3AddressData, addressData.l3AddressData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressType, l2AddressData, l3AddressData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressData {\n");
    
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    l2AddressData: ").append(toIndentedString(l2AddressData)).append("\n");
    sb.append("    l3AddressData: ").append(toIndentedString(l3AddressData)).append("\n");
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

