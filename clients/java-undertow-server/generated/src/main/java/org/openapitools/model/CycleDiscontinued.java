/*
 * endoflife.date
 *
 * The endoflife.date v0 API is currently deprecated, please [use the endoflife.date v1 API](https://endoflife.date/docs/api/v1/).
 *
 * OpenAPI document version: 0.0.1
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;



/**
 * Whether this device version is no longer in production.
 */

@ApiModel(description = "Whether this device version is no longer in production.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2025-11-30T06:33:46.822618837Z[Etc/UTC]", comments = "Generator version: 7.17.0")
public class CycleDiscontinued   {
  


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CycleDiscontinued cycleDiscontinued = (CycleDiscontinued) o;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CycleDiscontinued {\n");
    
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

