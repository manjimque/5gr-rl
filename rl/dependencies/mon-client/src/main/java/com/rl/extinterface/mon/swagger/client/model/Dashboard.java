/*
 * Prometheus Manager API
 * The API of the Prometheus Manager.
 *
 * OpenAPI spec version: 0.1
 * Contact: m.capitani@nextworks.it
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.rl.extinterface.mon.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.rl.extinterface.mon.swagger.client.model.DashboardPanel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Dashboard
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-06T07:52:18.537Z")
public class Dashboard {
  @SerializedName("dashboardId")
  private String dashboardId = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("panels")
  private List<DashboardPanel> panels = null;

  @SerializedName("users")
  private List<String> users = null;

  @SerializedName("plottedTime")
  private Integer plottedTime = null;

  /**
   * the time interval to wait before refreshing the graphs
   */
  @JsonAdapter(RefreshTimeEnum.Adapter.class)
  public enum RefreshTimeEnum {
    OFF("off"),
    
    _5S("5s"),
    
    _10S("10s"),
    
    _30S("30s"),
    
    _1M("1m"),
    
    _5M("5m"),
    
    _15M("15m"),
    
    _30M("30m"),
    
    _1H("1h"),
    
    _2H("2h"),
    
    _1D("1d");

    private String value;

    RefreshTimeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RefreshTimeEnum fromValue(String text) {
      for (RefreshTimeEnum b : RefreshTimeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RefreshTimeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RefreshTimeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RefreshTimeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RefreshTimeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("refreshTime")
  private RefreshTimeEnum refreshTime = null;

  public Dashboard dashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

   /**
   * the ID assigned to the dashboard
   * @return dashboardId
  **/
  @ApiModelProperty(value = "the ID assigned to the dashboard")
  public String getDashboardId() {
    return dashboardId;
  }

  public void setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
  }

  public Dashboard url(String url) {
    this.url = url;
    return this;
  }

   /**
   * the URL through which the dashboard is reachable
   * @return url
  **/
  @ApiModelProperty(value = "the URL through which the dashboard is reachable")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Dashboard name(String name) {
    this.name = name;
    return this;
  }

   /**
   * the name of the dashboard
   * @return name
  **/
  @ApiModelProperty(value = "the name of the dashboard")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Dashboard panels(List<DashboardPanel> panels) {
    this.panels = panels;
    return this;
  }

  public Dashboard addPanelsItem(DashboardPanel panelsItem) {
    if (this.panels == null) {
      this.panels = new ArrayList<DashboardPanel>();
    }
    this.panels.add(panelsItem);
    return this;
  }

   /**
   * the panels to be included in the dashboard
   * @return panels
  **/
  @ApiModelProperty(value = "the panels to be included in the dashboard")
  public List<DashboardPanel> getPanels() {
    return panels;
  }

  public void setPanels(List<DashboardPanel> panels) {
    this.panels = panels;
  }

  public Dashboard users(List<String> users) {
    this.users = users;
    return this;
  }

  public Dashboard addUsersItem(String usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<String>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * the users which should be allowed to see this dashboard
   * @return users
  **/
  @ApiModelProperty(value = "the users which should be allowed to see this dashboard")
  public List<String> getUsers() {
    return users;
  }

  public void setUsers(List<String> users) {
    this.users = users;
  }

  public Dashboard plottedTime(Integer plottedTime) {
    this.plottedTime = plottedTime;
    return this;
  }

   /**
   * the time interval to be shown on the graphs, in minutes
   * @return plottedTime
  **/
  @ApiModelProperty(value = "the time interval to be shown on the graphs, in minutes")
  public Integer getPlottedTime() {
    return plottedTime;
  }

  public void setPlottedTime(Integer plottedTime) {
    this.plottedTime = plottedTime;
  }

  public Dashboard refreshTime(RefreshTimeEnum refreshTime) {
    this.refreshTime = refreshTime;
    return this;
  }

   /**
   * the time interval to wait before refreshing the graphs
   * @return refreshTime
  **/
  @ApiModelProperty(value = "the time interval to wait before refreshing the graphs")
  public RefreshTimeEnum getRefreshTime() {
    return refreshTime;
  }

  public void setRefreshTime(RefreshTimeEnum refreshTime) {
    this.refreshTime = refreshTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dashboard dashboard = (Dashboard) o;
    return Objects.equals(this.dashboardId, dashboard.dashboardId) &&
        Objects.equals(this.url, dashboard.url) &&
        Objects.equals(this.name, dashboard.name) &&
        Objects.equals(this.panels, dashboard.panels) &&
        Objects.equals(this.users, dashboard.users) &&
        Objects.equals(this.plottedTime, dashboard.plottedTime) &&
        Objects.equals(this.refreshTime, dashboard.refreshTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, url, name, panels, users, plottedTime, refreshTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dashboard {\n");
    
    sb.append("    dashboardId: ").append(toIndentedString(dashboardId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    panels: ").append(toIndentedString(panels)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    plottedTime: ").append(toIndentedString(plottedTime)).append("\n");
    sb.append("    refreshTime: ").append(toIndentedString(refreshTime)).append("\n");
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

