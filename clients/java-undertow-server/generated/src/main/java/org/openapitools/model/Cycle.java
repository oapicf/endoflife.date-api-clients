/*
 * endoflife.date
 *
 * Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)
 *
 * OpenAPI document version: 0.0.1
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CycleCycle;
import org.openapitools.model.CycleDiscontinued;
import org.openapitools.model.CycleEol;
import org.openapitools.model.CycleLts;
import org.openapitools.model.CycleSupport;



/**
 * Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
 */

@ApiModel(description = "Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-07-10T09:07:44.671462021Z[Etc/UTC]", comments = "Generator version: 7.6.0")
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
   */
  public Cycle cycle(CycleCycle cycle) {
    this.cycle = cycle;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cycle")
  public CycleCycle getCycle() {
    return cycle;
  }
  public void setCycle(CycleCycle cycle) {
    this.cycle = cycle;
  }

  /**
   * Release Date for the first release in this cycle
   */
  public Cycle releaseDate(Date releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

  
  @ApiModelProperty(value = "Release Date for the first release in this cycle")
  @JsonProperty("releaseDate")
  public Date getReleaseDate() {
    return releaseDate;
  }
  public void setReleaseDate(Date releaseDate) {
    this.releaseDate = releaseDate;
  }

  /**
   */
  public Cycle eol(CycleEol eol) {
    this.eol = eol;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("eol")
  public CycleEol getEol() {
    return eol;
  }
  public void setEol(CycleEol eol) {
    this.eol = eol;
  }

  /**
   * Latest release in this cycle
   */
  public Cycle latest(String latest) {
    this.latest = latest;
    return this;
  }

  
  @ApiModelProperty(value = "Latest release in this cycle")
  @JsonProperty("latest")
  public String getLatest() {
    return latest;
  }
  public void setLatest(String latest) {
    this.latest = latest;
  }

  /**
   * Link to changelog for the latest release, if available
   */
  public Cycle link(String link) {
    this.link = link;
    return this;
  }

  
  @ApiModelProperty(value = "Link to changelog for the latest release, if available")
  @JsonProperty("link")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }

  /**
   */
  public Cycle lts(CycleLts lts) {
    this.lts = lts;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("lts")
  public CycleLts getLts() {
    return lts;
  }
  public void setLts(CycleLts lts) {
    this.lts = lts;
  }

  /**
   */
  public Cycle support(CycleSupport support) {
    this.support = support;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("support")
  public CycleSupport getSupport() {
    return support;
  }
  public void setSupport(CycleSupport support) {
    this.support = support;
  }

  /**
   */
  public Cycle discontinued(CycleDiscontinued discontinued) {
    this.discontinued = discontinued;
    return this;
  }

  
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

