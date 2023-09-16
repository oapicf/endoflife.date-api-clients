package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;
import javax.validation.Valid;

@ApiModel(description="Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2023-09-16T14:44:02.559095Z[Etc/UTC]")
public class Cycle   {
  
  private Object cycle = null;
  private Object releaseDate = null;
  private Object eol = null;
  private Object latest = null;
  private Object link = null;
  private Object lts = null;
  private Object support = null;
  private Object discontinued = null;

  /**
   * Release Cycle
   **/
  
  @ApiModelProperty(value = "Release Cycle")
  @JsonProperty("cycle")
  public Object getCycle() {
    return cycle;
  }
  public void setCycle(Object cycle) {
    this.cycle = cycle;
  }

  /**
   * Release Date for the first release in this cycle
   **/
  
  @ApiModelProperty(value = "Release Date for the first release in this cycle")
  @JsonProperty("releaseDate")
 @Size(min=10,max=10)  public Object getReleaseDate() {
    return releaseDate;
  }
  public void setReleaseDate(Object releaseDate) {
    this.releaseDate = releaseDate;
  }

  /**
   * End of Life Date for this release cycle
   **/
  
  @ApiModelProperty(value = "End of Life Date for this release cycle")
  @JsonProperty("eol")
 @Size(min=1)  public Object getEol() {
    return eol;
  }
  public void setEol(Object eol) {
    this.eol = eol;
  }

  /**
   * Latest release in this cycle
   **/
  
  @ApiModelProperty(value = "Latest release in this cycle")
  @JsonProperty("latest")
 @Size(min=1)  public Object getLatest() {
    return latest;
  }
  public void setLatest(Object latest) {
    this.latest = latest;
  }

  /**
   * Link to changelog for the latest release, if available
   **/
  
  @ApiModelProperty(value = "Link to changelog for the latest release, if available")
  @JsonProperty("link")
 @Size(min=1)  public Object getLink() {
    return link;
  }
  public void setLink(Object link) {
    this.link = link;
  }

  /**
   * Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date. 
   **/
  
  @ApiModelProperty(value = "Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date. ")
  @JsonProperty("lts")
  public Object getLts() {
    return lts;
  }
  public void setLts(Object lts) {
    this.lts = lts;
  }

  /**
   * Whether this release cycle has active support
   **/
  
  @ApiModelProperty(value = "Whether this release cycle has active support")
  @JsonProperty("support")
 @Size(min=10,max=10)  public Object getSupport() {
    return support;
  }
  public void setSupport(Object support) {
    this.support = support;
  }

  /**
   * Whether this cycle is now discontinued.
   **/
  
  @ApiModelProperty(value = "Whether this cycle is now discontinued.")
  @JsonProperty("discontinued")
 @Size(min=10,max=10)  public Object getDiscontinued() {
    return discontinued;
  }
  public void setDiscontinued(Object discontinued) {
    this.discontinued = discontinued;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cycle cycle = (Cycle) o;
    return Objects.equals(cycle, cycle.cycle) &&
        Objects.equals(releaseDate, cycle.releaseDate) &&
        Objects.equals(eol, cycle.eol) &&
        Objects.equals(latest, cycle.latest) &&
        Objects.equals(link, cycle.link) &&
        Objects.equals(lts, cycle.lts) &&
        Objects.equals(support, cycle.support) &&
        Objects.equals(discontinued, cycle.discontinued);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cycle, releaseDate, eol, latest, link, lts, support, discontinued);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cycle {\n");
    
    sb.append("    cycle: ").append(toIndentedString(cycle)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    eol: ").append(toIndentedString(eol)).append("\n");
    sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    lts: ").append(toIndentedString(lts)).append("\n");
    sb.append("    support: ").append(toIndentedString(support)).append("\n");
    sb.append("    discontinued: ").append(toIndentedString(discontinued)).append("\n");
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

