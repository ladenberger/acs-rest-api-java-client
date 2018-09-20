/*
 * Alfresco Content Services REST API
 * **Core API**  Provides access to the core features of Alfresco Content Services. 
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.alfresco.repository.remote.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.repository.remote.client.model.Pagination;
import org.alfresco.repository.remote.client.model.SiteEntry;

/**
 * SitePagingList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-20T09:14:31.122Z")
public class SitePagingList {
  @SerializedName("entries")
  private List<SiteEntry> entries = new ArrayList<SiteEntry>();

  @SerializedName("pagination")
  private Pagination pagination = null;

  public SitePagingList entries(List<SiteEntry> entries) {
    this.entries = entries;
    return this;
  }

  public SitePagingList addEntriesItem(SiteEntry entriesItem) {
    this.entries.add(entriesItem);
    return this;
  }

   /**
   * Get entries
   * @return entries
  **/
  @ApiModelProperty(required = true, value = "")
  public List<SiteEntry> getEntries() {
    return entries;
  }

  public void setEntries(List<SiteEntry> entries) {
    this.entries = entries;
  }

  public SitePagingList pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @ApiModelProperty(required = true, value = "")
  public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SitePagingList sitePagingList = (SitePagingList) o;
    return Objects.equals(this.entries, sitePagingList.entries) &&
        Objects.equals(this.pagination, sitePagingList.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entries, pagination);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SitePagingList {\n");
    
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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
