package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.joda.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CycleCycle;
import org.openapitools.model.CycleDiscontinued;
import org.openapitools.model.CycleEol;
import org.openapitools.model.CycleLts;
import org.openapitools.model.CycleSupport;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
 **/
@ApiModel(description="Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.")

public class Cycle  {
  
  @ApiModelProperty(value = "")
  private CycleCycle cycle;

  @ApiModelProperty(value = "Release date for the first release in this cycle.")
 /**
   * Release date for the first release in this cycle.
  **/
  private LocalDate releaseDate;

  @ApiModelProperty(value = "")
  private CycleEol eol;

  @ApiModelProperty(value = "Latest release in this cycle.")
 /**
   * Latest release in this cycle.
  **/
  private String latest;

  @ApiModelProperty(value = "Link to changelog for the latest release in this cycle, or null if unavailable.")
 /**
   * Link to changelog for the latest release in this cycle, or null if unavailable.
  **/
  private String link;

  @ApiModelProperty(value = "")
  private CycleLts lts;

  @ApiModelProperty(value = "")
  private CycleSupport support;

  @ApiModelProperty(value = "")
  private CycleDiscontinued discontinued;
 /**
   * Get cycle
   * @return cycle
  **/
  @JsonProperty("cycle")
  public CycleCycle getCycle() {
    return cycle;
  }

  public void setCycle(CycleCycle cycle) {
    this.cycle = cycle;
  }

  public Cycle cycle(CycleCycle cycle) {
    this.cycle = cycle;
    return this;
  }

 /**
   * Release date for the first release in this cycle.
   * @return releaseDate
  **/
  @JsonProperty("releaseDate")
  public LocalDate getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
  }

  public Cycle releaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

 /**
   * Get eol
   * @return eol
  **/
  @JsonProperty("eol")
  public CycleEol getEol() {
    return eol;
  }

  public void setEol(CycleEol eol) {
    this.eol = eol;
  }

  public Cycle eol(CycleEol eol) {
    this.eol = eol;
    return this;
  }

 /**
   * Latest release in this cycle.
   * @return latest
  **/
  @JsonProperty("latest")
  public String getLatest() {
    return latest;
  }

  public void setLatest(String latest) {
    this.latest = latest;
  }

  public Cycle latest(String latest) {
    this.latest = latest;
    return this;
  }

 /**
   * Link to changelog for the latest release in this cycle, or null if unavailable.
   * @return link
  **/
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public Cycle link(String link) {
    this.link = link;
    return this;
  }

 /**
   * Get lts
   * @return lts
  **/
  @JsonProperty("lts")
  public CycleLts getLts() {
    return lts;
  }

  public void setLts(CycleLts lts) {
    this.lts = lts;
  }

  public Cycle lts(CycleLts lts) {
    this.lts = lts;
    return this;
  }

 /**
   * Get support
   * @return support
  **/
  @JsonProperty("support")
  public CycleSupport getSupport() {
    return support;
  }

  public void setSupport(CycleSupport support) {
    this.support = support;
  }

  public Cycle support(CycleSupport support) {
    this.support = support;
    return this;
  }

 /**
   * Get discontinued
   * @return discontinued
  **/
  @JsonProperty("discontinued")
  public CycleDiscontinued getDiscontinued() {
    return discontinued;
  }

  public void setDiscontinued(CycleDiscontinued discontinued) {
    this.discontinued = discontinued;
  }

  public Cycle discontinued(CycleDiscontinued discontinued) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

