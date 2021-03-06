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
 * PermissionElement
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-20T09:14:31.122Z")
public class PermissionElement {
  @SerializedName("authorityId")
  private String authorityId = null;

  @SerializedName("name")
  private String name = null;

  /**
   * Gets or Sets accessStatus
   */
  @JsonAdapter(AccessStatusEnum.Adapter.class)
  public enum AccessStatusEnum {
    ALLOWED("ALLOWED"),
    
    DENIED("DENIED");

    private String value;

    AccessStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccessStatusEnum fromValue(String text) {
      for (AccessStatusEnum b : AccessStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AccessStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccessStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccessStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AccessStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("accessStatus")
  private AccessStatusEnum accessStatus = AccessStatusEnum.ALLOWED;

  public PermissionElement authorityId(String authorityId) {
    this.authorityId = authorityId;
    return this;
  }

   /**
   * Get authorityId
   * @return authorityId
  **/
  @ApiModelProperty(value = "")
  public String getAuthorityId() {
    return authorityId;
  }

  public void setAuthorityId(String authorityId) {
    this.authorityId = authorityId;
  }

  public PermissionElement name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PermissionElement accessStatus(AccessStatusEnum accessStatus) {
    this.accessStatus = accessStatus;
    return this;
  }

   /**
   * Get accessStatus
   * @return accessStatus
  **/
  @ApiModelProperty(value = "")
  public AccessStatusEnum getAccessStatus() {
    return accessStatus;
  }

  public void setAccessStatus(AccessStatusEnum accessStatus) {
    this.accessStatus = accessStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionElement permissionElement = (PermissionElement) o;
    return Objects.equals(this.authorityId, permissionElement.authorityId) &&
        Objects.equals(this.name, permissionElement.name) &&
        Objects.equals(this.accessStatus, permissionElement.accessStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorityId, name, accessStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionElement {\n");
    
    sb.append("    authorityId: ").append(toIndentedString(authorityId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accessStatus: ").append(toIndentedString(accessStatus)).append("\n");
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

