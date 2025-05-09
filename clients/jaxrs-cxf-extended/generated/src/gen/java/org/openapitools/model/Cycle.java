package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import org.joda.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CycleCycle;
import org.openapitools.model.CycleDiscontinued;
import org.openapitools.model.CycleEol;
import org.openapitools.model.CycleLts;
import org.openapitools.model.CycleSupport;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
 */
@ApiModel(description="Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.")

public class Cycle  {
  
  @ApiModelProperty(value = "")
  @Valid
  private CycleCycle cycle;

 /**
  * Release date for the first release in this cycle.
  */
  @ApiModelProperty(value = "Release date for the first release in this cycle.")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate releaseDate;

  @ApiModelProperty(value = "")
  @Valid
  private CycleEol eol;

 /**
  * Latest release in this cycle.
  */
  @ApiModelProperty(value = "Latest release in this cycle.")
  private String latest;

 /**
  * Link to changelog for the latest release in this cycle, or null if unavailable.
  */
  @ApiModelProperty(value = "Link to changelog for the latest release in this cycle, or null if unavailable.")
  private String link;

  @ApiModelProperty(value = "")
  @Valid
  private CycleLts lts;

  @ApiModelProperty(value = "")
  @Valid
  private CycleSupport support;

  @ApiModelProperty(value = "")
  @Valid
  private CycleDiscontinued discontinued;
 /**
  * Get cycle
  * @return cycle
  */
  @JsonProperty("cycle")
  public CycleCycle getCycle() {
    return cycle;
  }

  /**
   * Sets the <code>cycle</code> property.
   */
 public void setCycle(CycleCycle cycle) {
    this.cycle = cycle;
  }

  /**
   * Sets the <code>cycle</code> property.
   */
  public Cycle cycle(CycleCycle cycle) {
    this.cycle = cycle;
    return this;
  }

 /**
  * Release date for the first release in this cycle.
  * @return releaseDate
  */
  @JsonProperty("releaseDate")
 @Size(min=10,max=10)  public LocalDate getReleaseDate() {
    return releaseDate;
  }

  /**
   * Sets the <code>releaseDate</code> property.
   */
 public void setReleaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
  }

  /**
   * Sets the <code>releaseDate</code> property.
   */
  public Cycle releaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

 /**
  * Get eol
  * @return eol
  */
  @JsonProperty("eol")
  public CycleEol getEol() {
    return eol;
  }

  /**
   * Sets the <code>eol</code> property.
   */
 public void setEol(CycleEol eol) {
    this.eol = eol;
  }

  /**
   * Sets the <code>eol</code> property.
   */
  public Cycle eol(CycleEol eol) {
    this.eol = eol;
    return this;
  }

 /**
  * Latest release in this cycle.
  * @return latest
  */
  @JsonProperty("latest")
 @Size(min=1)  public String getLatest() {
    return latest;
  }

  /**
   * Sets the <code>latest</code> property.
   */
 public void setLatest(String latest) {
    this.latest = latest;
  }

  /**
   * Sets the <code>latest</code> property.
   */
  public Cycle latest(String latest) {
    this.latest = latest;
    return this;
  }

 /**
  * Link to changelog for the latest release in this cycle, or null if unavailable.
  * @return link
  */
  @JsonProperty("link")
 @Size(min=1)  public String getLink() {
    return link;
  }

  /**
   * Sets the <code>link</code> property.
   */
 public void setLink(String link) {
    this.link = link;
  }

  /**
   * Sets the <code>link</code> property.
   */
  public Cycle link(String link) {
    this.link = link;
    return this;
  }

 /**
  * Get lts
  * @return lts
  */
  @JsonProperty("lts")
  public CycleLts getLts() {
    return lts;
  }

  /**
   * Sets the <code>lts</code> property.
   */
 public void setLts(CycleLts lts) {
    this.lts = lts;
  }

  /**
   * Sets the <code>lts</code> property.
   */
  public Cycle lts(CycleLts lts) {
    this.lts = lts;
    return this;
  }

 /**
  * Get support
  * @return support
  */
  @JsonProperty("support")
  public CycleSupport getSupport() {
    return support;
  }

  /**
   * Sets the <code>support</code> property.
   */
 public void setSupport(CycleSupport support) {
    this.support = support;
  }

  /**
   * Sets the <code>support</code> property.
   */
  public Cycle support(CycleSupport support) {
    this.support = support;
    return this;
  }

 /**
  * Get discontinued
  * @return discontinued
  */
  @JsonProperty("discontinued")
  public CycleDiscontinued getDiscontinued() {
    return discontinued;
  }

  /**
   * Sets the <code>discontinued</code> property.
   */
 public void setDiscontinued(CycleDiscontinued discontinued) {
    this.discontinued = discontinued;
  }

  /**
   * Sets the <code>discontinued</code> property.
   */
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

