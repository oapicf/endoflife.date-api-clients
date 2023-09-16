package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import org.openapitools.jackson.nullable.JsonNullable;
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
  
 /**
  * Release Cycle
  */
  @ApiModelProperty(value = "Release Cycle")
  private Object cycle = null;

 /**
  * Release Date for the first release in this cycle
  */
  @ApiModelProperty(value = "Release Date for the first release in this cycle")
  private Object releaseDate = null;

 /**
  * End of Life Date for this release cycle
  */
  @ApiModelProperty(value = "End of Life Date for this release cycle")
  private Object eol = null;

 /**
  * Latest release in this cycle
  */
  @ApiModelProperty(value = "Latest release in this cycle")
  private Object latest = null;

 /**
  * Link to changelog for the latest release, if available
  */
  @ApiModelProperty(value = "Link to changelog for the latest release, if available")
  private Object link = null;

 /**
  * Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date. 
  */
  @ApiModelProperty(value = "Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date. ")
  private Object lts = null;

 /**
  * Whether this release cycle has active support
  */
  @ApiModelProperty(value = "Whether this release cycle has active support")
  private Object support = null;

 /**
  * Whether this cycle is now discontinued.
  */
  @ApiModelProperty(value = "Whether this cycle is now discontinued.")
  private Object discontinued = null;
 /**
  * Release Cycle
  * @return cycle
  */
  @JsonProperty("cycle")
  public Object getCycle() {
    return cycle;
  }

  /**
   * Sets the <code>cycle</code> property.
   */
 public void setCycle(Object cycle) {
    this.cycle = cycle;
  }

  /**
   * Sets the <code>cycle</code> property.
   */
  public Cycle cycle(Object cycle) {
    this.cycle = cycle;
    return this;
  }

 /**
  * Release Date for the first release in this cycle
  * @return releaseDate
  */
  @JsonProperty("releaseDate")
 @Size(min=10,max=10)  public Object getReleaseDate() {
    return releaseDate;
  }

  /**
   * Sets the <code>releaseDate</code> property.
   */
 public void setReleaseDate(Object releaseDate) {
    this.releaseDate = releaseDate;
  }

  /**
   * Sets the <code>releaseDate</code> property.
   */
  public Cycle releaseDate(Object releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

 /**
  * End of Life Date for this release cycle
  * @return eol
  */
  @JsonProperty("eol")
 @Size(min=1)  public Object getEol() {
    return eol;
  }

  /**
   * Sets the <code>eol</code> property.
   */
 public void setEol(Object eol) {
    this.eol = eol;
  }

  /**
   * Sets the <code>eol</code> property.
   */
  public Cycle eol(Object eol) {
    this.eol = eol;
    return this;
  }

 /**
  * Latest release in this cycle
  * @return latest
  */
  @JsonProperty("latest")
 @Size(min=1)  public Object getLatest() {
    return latest;
  }

  /**
   * Sets the <code>latest</code> property.
   */
 public void setLatest(Object latest) {
    this.latest = latest;
  }

  /**
   * Sets the <code>latest</code> property.
   */
  public Cycle latest(Object latest) {
    this.latest = latest;
    return this;
  }

 /**
  * Link to changelog for the latest release, if available
  * @return link
  */
  @JsonProperty("link")
 @Size(min=1)  public Object getLink() {
    return link;
  }

  /**
   * Sets the <code>link</code> property.
   */
 public void setLink(Object link) {
    this.link = link;
  }

  /**
   * Sets the <code>link</code> property.
   */
  public Cycle link(Object link) {
    this.link = link;
    return this;
  }

 /**
  * Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date. 
  * @return lts
  */
  @JsonProperty("lts")
  public Object getLts() {
    return lts;
  }

  /**
   * Sets the <code>lts</code> property.
   */
 public void setLts(Object lts) {
    this.lts = lts;
  }

  /**
   * Sets the <code>lts</code> property.
   */
  public Cycle lts(Object lts) {
    this.lts = lts;
    return this;
  }

 /**
  * Whether this release cycle has active support
  * @return support
  */
  @JsonProperty("support")
 @Size(min=10,max=10)  public Object getSupport() {
    return support;
  }

  /**
   * Sets the <code>support</code> property.
   */
 public void setSupport(Object support) {
    this.support = support;
  }

  /**
   * Sets the <code>support</code> property.
   */
  public Cycle support(Object support) {
    this.support = support;
    return this;
  }

 /**
  * Whether this cycle is now discontinued.
  * @return discontinued
  */
  @JsonProperty("discontinued")
 @Size(min=10,max=10)  public Object getDiscontinued() {
    return discontinued;
  }

  /**
   * Sets the <code>discontinued</code> property.
   */
 public void setDiscontinued(Object discontinued) {
    this.discontinued = discontinued;
  }

  /**
   * Sets the <code>discontinued</code> property.
   */
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

