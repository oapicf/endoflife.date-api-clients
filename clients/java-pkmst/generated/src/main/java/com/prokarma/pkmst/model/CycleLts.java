package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date. 
 */
@ApiModel(description = "Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date. ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-04T23:48:03.300575970Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CycleLts   {

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CycleLts {\n");
    
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

