package org.openapitools.vertxweb.server.model;

import java.util.Objects;

/**
 * Whether this release cycle has active support
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CycleSupport   {
  

  public CycleSupport () {

  }

  public CycleSupport () {
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CycleSupport cycleSupport = (CycleSupport) o;return true;
  }

  @Override
  public int hashCode() {
    return 1;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CycleSupport {\n");
    
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
