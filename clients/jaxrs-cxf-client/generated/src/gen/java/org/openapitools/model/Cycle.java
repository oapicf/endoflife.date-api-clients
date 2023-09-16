package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.jackson.nullable.JsonNullable;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
 **/
@ApiModel(description="Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.")

public class Cycle  {
  
  @ApiModelProperty(value = "Release Cycle")
 /**
   * Release Cycle
  **/
  private Object cycle = null;

  @ApiModelProperty(value = "Release Date for the first release in this cycle")
 /**
   * Release Date for the first release in this cycle
  **/
  private Object releaseDate = null;

  @ApiModelProperty(value = "End of Life Date for this release cycle")
 /**
   * End of Life Date for this release cycle
  **/
  private Object eol = null;

  @ApiModelProperty(value = "Latest release in this cycle")
 /**
   * Latest release in this cycle
  **/
  private Object latest = null;

  @ApiModelProperty(value = "Link to changelog for the latest release, if available")
 /**
   * Link to changelog for the latest release, if available
  **/
  private Object link = null;

  @ApiModelProperty(value = "Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date. ")
 /**
   * Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date. 
  **/
  private Object lts = null;

  @ApiModelProperty(value = "Whether this release cycle has active support")
 /**
   * Whether this release cycle has active support
  **/
  private Object support = null;

  @ApiModelProperty(value = "Whether this cycle is now discontinued.")
 /**
   * Whether this cycle is now discontinued.
  **/
  private Object discontinued = null;
 /**
   * Release Cycle
   * @return cycle
  **/
  @JsonProperty("cycle")
  public Object getCycle() {
    return cycle;
  }

  public void setCycle(Object cycle) {
    this.cycle = cycle;
  }

  public Cycle cycle(Object cycle) {
    this.cycle = cycle;
    return this;
  }

 /**
   * Release Date for the first release in this cycle
   * @return releaseDate
  **/
  @JsonProperty("releaseDate")
  public Object getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(Object releaseDate) {
    this.releaseDate = releaseDate;
  }

  public Cycle releaseDate(Object releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

 /**
   * End of Life Date for this release cycle
   * @return eol
  **/
  @JsonProperty("eol")
  public Object getEol() {
    return eol;
  }

  public void setEol(Object eol) {
    this.eol = eol;
  }

  public Cycle eol(Object eol) {
    this.eol = eol;
    return this;
  }

 /**
   * Latest release in this cycle
   * @return latest
  **/
  @JsonProperty("latest")
  public Object getLatest() {
    return latest;
  }

  public void setLatest(Object latest) {
    this.latest = latest;
  }

  public Cycle latest(Object latest) {
    this.latest = latest;
    return this;
  }

 /**
   * Link to changelog for the latest release, if available
   * @return link
  **/
  @JsonProperty("link")
  public Object getLink() {
    return link;
  }

  public void setLink(Object link) {
    this.link = link;
  }

  public Cycle link(Object link) {
    this.link = link;
    return this;
  }

 /**
   * Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date. 
   * @return lts
  **/
  @JsonProperty("lts")
  public Object getLts() {
    return lts;
  }

  public void setLts(Object lts) {
    this.lts = lts;
  }

  public Cycle lts(Object lts) {
    this.lts = lts;
    return this;
  }

 /**
   * Whether this release cycle has active support
   * @return support
  **/
  @JsonProperty("support")
  public Object getSupport() {
    return support;
  }

  public void setSupport(Object support) {
    this.support = support;
  }

  public Cycle support(Object support) {
    this.support = support;
    return this;
  }

 /**
   * Whether this cycle is now discontinued.
   * @return discontinued
  **/
  @JsonProperty("discontinued")
  public Object getDiscontinued() {
    return discontinued;
  }

  public void setDiscontinued(Object discontinued) {
    this.discontinued = discontinued;
  }

  public Cycle discontinued(Object discontinued) {
    this.discontinued = discontinued;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

