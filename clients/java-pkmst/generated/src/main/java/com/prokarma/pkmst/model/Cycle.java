package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
 */
@ApiModel(description = "Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2023-09-16T14:43:23.018220Z[Etc/UTC]")
public class Cycle   {
  @JsonProperty("cycle")
  private Object cycle = null;

  @JsonProperty("releaseDate")
  private Object releaseDate = null;

  @JsonProperty("eol")
  private Object eol = null;

  @JsonProperty("latest")
  private Object latest = null;

  @JsonProperty("link")
  private Object link = null;

  @JsonProperty("lts")
  private Object lts = null;

  @JsonProperty("support")
  private Object support = null;

  @JsonProperty("discontinued")
  private Object discontinued = null;

  public Cycle cycle(Object cycle) {
    this.cycle = cycle;
    return this;
  }

   /**
   * Release Cycle
   * @return cycle
  **/
  @ApiModelProperty(value = "Release Cycle")
  public Object getCycle() {
    return cycle;
  }

  public void setCycle(Object cycle) {
    this.cycle = cycle;
  }

  public Cycle releaseDate(Object releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

   /**
   * Release Date for the first release in this cycle
   * @return releaseDate
  **/
  @ApiModelProperty(value = "Release Date for the first release in this cycle")
  public Object getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(Object releaseDate) {
    this.releaseDate = releaseDate;
  }

  public Cycle eol(Object eol) {
    this.eol = eol;
    return this;
  }

   /**
   * End of Life Date for this release cycle
   * @return eol
  **/
  @ApiModelProperty(value = "End of Life Date for this release cycle")
  public Object getEol() {
    return eol;
  }

  public void setEol(Object eol) {
    this.eol = eol;
  }

  public Cycle latest(Object latest) {
    this.latest = latest;
    return this;
  }

   /**
   * Latest release in this cycle
   * @return latest
  **/
  @ApiModelProperty(value = "Latest release in this cycle")
  public Object getLatest() {
    return latest;
  }

  public void setLatest(Object latest) {
    this.latest = latest;
  }

  public Cycle link(Object link) {
    this.link = link;
    return this;
  }

   /**
   * Link to changelog for the latest release, if available
   * @return link
  **/
  @ApiModelProperty(value = "Link to changelog for the latest release, if available")
  public Object getLink() {
    return link;
  }

  public void setLink(Object link) {
    this.link = link;
  }

  public Cycle lts(Object lts) {
    this.lts = lts;
    return this;
  }

   /**
   * Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date. 
   * @return lts
  **/
  @ApiModelProperty(value = "Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date. ")
  public Object getLts() {
    return lts;
  }

  public void setLts(Object lts) {
    this.lts = lts;
  }

  public Cycle support(Object support) {
    this.support = support;
    return this;
  }

   /**
   * Whether this release cycle has active support
   * @return support
  **/
  @ApiModelProperty(value = "Whether this release cycle has active support")
  public Object getSupport() {
    return support;
  }

  public void setSupport(Object support) {
    this.support = support;
  }

  public Cycle discontinued(Object discontinued) {
    this.discontinued = discontinued;
    return this;
  }

   /**
   * Whether this cycle is now discontinued.
   * @return discontinued
  **/
  @ApiModelProperty(value = "Whether this cycle is now discontinued.")
  public Object getDiscontinued() {
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

