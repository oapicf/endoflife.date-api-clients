package org.openapitools.model;

import java.util.Objects;
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

/**
 * Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
 */
@ApiModel(description = "Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-04T23:47:53.594677761Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class Cycle   {
  @JsonProperty("cycle")
  private CycleCycle cycle;

  @JsonProperty("releaseDate")
  private Date releaseDate;

  @JsonProperty("eol")
  private CycleEol eol;

  @JsonProperty("latest")
  private String latest;

  @JsonProperty("link")
  private String link;

  @JsonProperty("lts")
  private CycleLts lts;

  @JsonProperty("support")
  private CycleSupport support;

  @JsonProperty("discontinued")
  private CycleDiscontinued discontinued;

  public Cycle cycle(CycleCycle cycle) {
    this.cycle = cycle;
    return this;
  }

   /**
   * Get cycle
   * @return cycle
  **/
  @ApiModelProperty(value = "")
  public CycleCycle getCycle() {
    return cycle;
  }

  public void setCycle(CycleCycle cycle) {
    this.cycle = cycle;
  }

  public Cycle releaseDate(Date releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

   /**
   * Release Date for the first release in this cycle
   * @return releaseDate
  **/
  @ApiModelProperty(value = "Release Date for the first release in this cycle")
  public Date getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(Date releaseDate) {
    this.releaseDate = releaseDate;
  }

  public Cycle eol(CycleEol eol) {
    this.eol = eol;
    return this;
  }

   /**
   * Get eol
   * @return eol
  **/
  @ApiModelProperty(value = "")
  public CycleEol getEol() {
    return eol;
  }

  public void setEol(CycleEol eol) {
    this.eol = eol;
  }

  public Cycle latest(String latest) {
    this.latest = latest;
    return this;
  }

   /**
   * Latest release in this cycle
   * @return latest
  **/
  @ApiModelProperty(value = "Latest release in this cycle")
  public String getLatest() {
    return latest;
  }

  public void setLatest(String latest) {
    this.latest = latest;
  }

  public Cycle link(String link) {
    this.link = link;
    return this;
  }

   /**
   * Link to changelog for the latest release, if available
   * @return link
  **/
  @ApiModelProperty(value = "Link to changelog for the latest release, if available")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public Cycle lts(CycleLts lts) {
    this.lts = lts;
    return this;
  }

   /**
   * Get lts
   * @return lts
  **/
  @ApiModelProperty(value = "")
  public CycleLts getLts() {
    return lts;
  }

  public void setLts(CycleLts lts) {
    this.lts = lts;
  }

  public Cycle support(CycleSupport support) {
    this.support = support;
    return this;
  }

   /**
   * Get support
   * @return support
  **/
  @ApiModelProperty(value = "")
  public CycleSupport getSupport() {
    return support;
  }

  public void setSupport(CycleSupport support) {
    this.support = support;
  }

  public Cycle discontinued(CycleDiscontinued discontinued) {
    this.discontinued = discontinued;
    return this;
  }

   /**
   * Get discontinued
   * @return discontinued
  **/
  @ApiModelProperty(value = "")
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
