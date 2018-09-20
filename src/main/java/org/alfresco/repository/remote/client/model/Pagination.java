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

/**
 * Pagination
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-20T09:14:31.122Z")
public class Pagination {
  @SerializedName("count")
  private Long count = null;

  @SerializedName("hasMoreItems")
  private Boolean hasMoreItems = null;

  @SerializedName("totalItems")
  private Long totalItems = null;

  @SerializedName("skipCount")
  private Long skipCount = null;

  @SerializedName("maxItems")
  private Long maxItems = null;

  public Pagination count(Long count) {
    this.count = count;
    return this;
  }

   /**
   * The number of objects in the entries array. 
   * @return count
  **/
  @ApiModelProperty(required = true, value = "The number of objects in the entries array. ")
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public Pagination hasMoreItems(Boolean hasMoreItems) {
    this.hasMoreItems = hasMoreItems;
    return this;
  }

   /**
   * A boolean value which is **true** if there are more entities in the collection beyond those in this response. A true value means a request with a larger value for the **skipCount** or the **maxItems** parameter will return more entities. 
   * @return hasMoreItems
  **/
  @ApiModelProperty(required = true, value = "A boolean value which is **true** if there are more entities in the collection beyond those in this response. A true value means a request with a larger value for the **skipCount** or the **maxItems** parameter will return more entities. ")
  public Boolean isHasMoreItems() {
    return hasMoreItems;
  }

  public void setHasMoreItems(Boolean hasMoreItems) {
    this.hasMoreItems = hasMoreItems;
  }

  public Pagination totalItems(Long totalItems) {
    this.totalItems = totalItems;
    return this;
  }

   /**
   * An integer describing the total number of entities in the collection. The API might not be able to determine this value, in which case this property will not be present. 
   * @return totalItems
  **/
  @ApiModelProperty(value = "An integer describing the total number of entities in the collection. The API might not be able to determine this value, in which case this property will not be present. ")
  public Long getTotalItems() {
    return totalItems;
  }

  public void setTotalItems(Long totalItems) {
    this.totalItems = totalItems;
  }

  public Pagination skipCount(Long skipCount) {
    this.skipCount = skipCount;
    return this;
  }

   /**
   * An integer describing how many entities exist in the collection before those included in this list. If there was no **skipCount** parameter then the  default value is 0. 
   * @return skipCount
  **/
  @ApiModelProperty(required = true, value = "An integer describing how many entities exist in the collection before those included in this list. If there was no **skipCount** parameter then the  default value is 0. ")
  public Long getSkipCount() {
    return skipCount;
  }

  public void setSkipCount(Long skipCount) {
    this.skipCount = skipCount;
  }

  public Pagination maxItems(Long maxItems) {
    this.maxItems = maxItems;
    return this;
  }

   /**
   * The value of the **maxItems** parameter used to generate this list. If there was no **maxItems** parameter then the default value is 100. 
   * @return maxItems
  **/
  @ApiModelProperty(required = true, value = "The value of the **maxItems** parameter used to generate this list. If there was no **maxItems** parameter then the default value is 100. ")
  public Long getMaxItems() {
    return maxItems;
  }

  public void setMaxItems(Long maxItems) {
    this.maxItems = maxItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pagination pagination = (Pagination) o;
    return Objects.equals(this.count, pagination.count) &&
        Objects.equals(this.hasMoreItems, pagination.hasMoreItems) &&
        Objects.equals(this.totalItems, pagination.totalItems) &&
        Objects.equals(this.skipCount, pagination.skipCount) &&
        Objects.equals(this.maxItems, pagination.maxItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, hasMoreItems, totalItems, skipCount, maxItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pagination {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    hasMoreItems: ").append(toIndentedString(hasMoreItems)).append("\n");
    sb.append("    totalItems: ").append(toIndentedString(totalItems)).append("\n");
    sb.append("    skipCount: ").append(toIndentedString(skipCount)).append("\n");
    sb.append("    maxItems: ").append(toIndentedString(maxItems)).append("\n");
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
