package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CycleCycle;
import org.openapitools.model.CycleDiscontinued;
import org.openapitools.model.CycleEol;
import org.openapitools.model.CycleLts;
import org.openapitools.model.CycleSupport;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2025-05-09T11:49:30.480064684Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class Cycle   {
  
  private CycleCycle cycle;
  private Date releaseDate;
  private CycleEol eol;
  private String latest;
  private String link;
  private CycleLts lts;
  private CycleSupport support;
  private CycleDiscontinued discontinued;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cycle")
  public CycleCycle getCycle() {
    return cycle;
  }
  public void setCycle(CycleCycle cycle) {
    this.cycle = cycle;
  }

  /**
   * Release date for the first release in this cycle.
   **/
  
  @ApiModelProperty(value = "Release date for the first release in this cycle.")
  @JsonProperty("releaseDate")
 @Size(min=10,max=10)  public Date getReleaseDate() {
    return releaseDate;
  }
  public void setReleaseDate(Date releaseDate) {
    this.releaseDate = releaseDate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("eol")
  public CycleEol getEol() {
    return eol;
  }
  public void setEol(CycleEol eol) {
    this.eol = eol;
  }

  /**
   * Latest release in this cycle.
   **/
  
  @ApiModelProperty(value = "Latest release in this cycle.")
  @JsonProperty("latest")
 @Size(min=1)  public String getLatest() {
    return latest;
  }
  public void setLatest(String latest) {
    this.latest = latest;
  }

  /**
   * Link to changelog for the latest release in this cycle, or null if unavailable.
   **/
  
  @ApiModelProperty(value = "Link to changelog for the latest release in this cycle, or null if unavailable.")
  @JsonProperty("link")
 @Size(min=1)  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("lts")
  public CycleLts getLts() {
    return lts;
  }
  public void setLts(CycleLts lts) {
    this.lts = lts;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("support")
  public CycleSupport getSupport() {
    return support;
  }
  public void setSupport(CycleSupport support) {
    this.support = support;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("discontinued")
  public CycleDiscontinued getDiscontinued() {
    return discontinued;
  }
  public void setDiscontinued(CycleDiscontinued discontinued) {
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
    return Objects.equals(this.cycle, cycle.cycle) &&
        Objects.equals(this.releaseDate, cycle.releaseDate) &&
        Objects.equals(this.eol, cycle.eol) &&
        Objects.equals(this.latest, cycle.latest) &&
        Objects.equals(this.link, cycle.link) &&
        Objects.equals(this.lts, cycle.lts) &&
        Objects.equals(this.support, cycle.support) &&
        Objects.equals(this.discontinued, cycle.discontinued);
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

