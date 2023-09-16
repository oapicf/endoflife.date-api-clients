package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
 **/
@ApiModel(description = "Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.")
@JsonTypeName("cycle")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-09-16T14:44:10.332276Z[Etc/UTC]")
public class Cycle   {
  private @Valid Object cycle = null;
  private @Valid Object releaseDate = null;
  private @Valid Object eol = null;
  private @Valid Object latest = null;
  private @Valid Object link = null;
  private @Valid Object lts = null;
  private @Valid Object support = null;
  private @Valid Object discontinued = null;

  /**
   * Release Cycle
   **/
  public Cycle cycle(Object cycle) {
    this.cycle = cycle;
    return this;
  }

  
  @ApiModelProperty(value = "Release Cycle")
  @JsonProperty("cycle")
  public Object getCycle() {
    return cycle;
  }

  @JsonProperty("cycle")
  public void setCycle(Object cycle) {
    this.cycle = cycle;
  }

  /**
   * Release Date for the first release in this cycle
   **/
  public Cycle releaseDate(Object releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

  
  @ApiModelProperty(value = "Release Date for the first release in this cycle")
  @JsonProperty("releaseDate")
 @Size(min=10,max=10)  public Object getReleaseDate() {
    return releaseDate;
  }

  @JsonProperty("releaseDate")
  public void setReleaseDate(Object releaseDate) {
    this.releaseDate = releaseDate;
  }

  /**
   * End of Life Date for this release cycle
   **/
  public Cycle eol(Object eol) {
    this.eol = eol;
    return this;
  }

  
  @ApiModelProperty(value = "End of Life Date for this release cycle")
  @JsonProperty("eol")
 @Size(min=1)  public Object getEol() {
    return eol;
  }

  @JsonProperty("eol")
  public void setEol(Object eol) {
    this.eol = eol;
  }

  /**
   * Latest release in this cycle
   **/
  public Cycle latest(Object latest) {
    this.latest = latest;
    return this;
  }

  
  @ApiModelProperty(value = "Latest release in this cycle")
  @JsonProperty("latest")
 @Size(min=1)  public Object getLatest() {
    return latest;
  }

  @JsonProperty("latest")
  public void setLatest(Object latest) {
    this.latest = latest;
  }

  /**
   * Link to changelog for the latest release, if available
   **/
  public Cycle link(Object link) {
    this.link = link;
    return this;
  }

  
  @ApiModelProperty(value = "Link to changelog for the latest release, if available")
  @JsonProperty("link")
 @Size(min=1)  public Object getLink() {
    return link;
  }

  @JsonProperty("link")
  public void setLink(Object link) {
    this.link = link;
  }

  /**
   * Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date. 
   **/
  public Cycle lts(Object lts) {
    this.lts = lts;
    return this;
  }

  
  @ApiModelProperty(value = "Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date. ")
  @JsonProperty("lts")
  public Object getLts() {
    return lts;
  }

  @JsonProperty("lts")
  public void setLts(Object lts) {
    this.lts = lts;
  }

  /**
   * Whether this release cycle has active support
   **/
  public Cycle support(Object support) {
    this.support = support;
    return this;
  }

  
  @ApiModelProperty(value = "Whether this release cycle has active support")
  @JsonProperty("support")
 @Size(min=10,max=10)  public Object getSupport() {
    return support;
  }

  @JsonProperty("support")
  public void setSupport(Object support) {
    this.support = support;
  }

  /**
   * Whether this cycle is now discontinued.
   **/
  public Cycle discontinued(Object discontinued) {
    this.discontinued = discontinued;
    return this;
  }

  
  @ApiModelProperty(value = "Whether this cycle is now discontinued.")
  @JsonProperty("discontinued")
 @Size(min=10,max=10)  public Object getDiscontinued() {
    return discontinued;
  }

  @JsonProperty("discontinued")
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

