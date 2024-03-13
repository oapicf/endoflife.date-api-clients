/*
 * endoflife.date
 * Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.CycleCycle;
import org.openapitools.model.CycleDiscontinued;
import org.openapitools.model.CycleEol;
import org.openapitools.model.CycleLts;
import org.openapitools.model.CycleSupport;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
 */
@ApiModel(description = "Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.")
@JsonPropertyOrder({
  Cycle.JSON_PROPERTY_CYCLE,
  Cycle.JSON_PROPERTY_RELEASE_DATE,
  Cycle.JSON_PROPERTY_EOL,
  Cycle.JSON_PROPERTY_LATEST,
  Cycle.JSON_PROPERTY_LINK,
  Cycle.JSON_PROPERTY_LTS,
  Cycle.JSON_PROPERTY_SUPPORT,
  Cycle.JSON_PROPERTY_DISCONTINUED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-03-13T10:45:52.103127445Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Cycle   {
  public static final String JSON_PROPERTY_CYCLE = "cycle";
  @JsonProperty(JSON_PROPERTY_CYCLE)
  private CycleCycle cycle;

  public static final String JSON_PROPERTY_RELEASE_DATE = "releaseDate";
  @JsonProperty(JSON_PROPERTY_RELEASE_DATE)
  private Date releaseDate;

  public static final String JSON_PROPERTY_EOL = "eol";
  @JsonProperty(JSON_PROPERTY_EOL)
  private CycleEol eol;

  public static final String JSON_PROPERTY_LATEST = "latest";
  @JsonProperty(JSON_PROPERTY_LATEST)
  private String latest;

  public static final String JSON_PROPERTY_LINK = "link";
  @JsonProperty(JSON_PROPERTY_LINK)
  private String link;

  public static final String JSON_PROPERTY_LTS = "lts";
  @JsonProperty(JSON_PROPERTY_LTS)
  private CycleLts lts;

  public static final String JSON_PROPERTY_SUPPORT = "support";
  @JsonProperty(JSON_PROPERTY_SUPPORT)
  private CycleSupport support;

  public static final String JSON_PROPERTY_DISCONTINUED = "discontinued";
  @JsonProperty(JSON_PROPERTY_DISCONTINUED)
  private CycleDiscontinued discontinued;

  public Cycle cycle(CycleCycle cycle) {
    this.cycle = cycle;
    return this;
  }

  /**
   * Get cycle
   * @return cycle
   **/
  @JsonProperty(value = "cycle")
  @ApiModelProperty(value = "")
  @Valid 
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
  @JsonProperty(value = "releaseDate")
  @ApiModelProperty(value = "Release Date for the first release in this cycle")
   @Size(min=10,max=10)
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
  @JsonProperty(value = "eol")
  @ApiModelProperty(value = "")
  @Valid 
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
  @JsonProperty(value = "latest")
  @ApiModelProperty(value = "Latest release in this cycle")
   @Size(min=1)
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
  @JsonProperty(value = "link")
  @ApiModelProperty(value = "Link to changelog for the latest release, if available")
   @Size(min=1)
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
  @JsonProperty(value = "lts")
  @ApiModelProperty(value = "")
  @Valid 
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
  @JsonProperty(value = "support")
  @ApiModelProperty(value = "")
  @Valid 
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
  @JsonProperty(value = "discontinued")
  @ApiModelProperty(value = "")
  @Valid 
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

