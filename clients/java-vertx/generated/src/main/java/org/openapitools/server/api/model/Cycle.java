package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Cycle   {
  
  private Object cycle = null;
  private Object releaseDate = null;
  private Object eol = null;
  private Object latest = null;
  private Object link = null;
  private Object lts = null;
  private Object support = null;
  private Object discontinued = null;

  public Cycle () {

  }

  public Cycle (Object cycle, Object releaseDate, Object eol, Object latest, Object link, Object lts, Object support, Object discontinued) {
    this.cycle = cycle;
    this.releaseDate = releaseDate;
    this.eol = eol;
    this.latest = latest;
    this.link = link;
    this.lts = lts;
    this.support = support;
    this.discontinued = discontinued;
  }

    
  @JsonProperty("cycle")
  public Object getCycle() {
    return cycle;
  }
  public void setCycle(Object cycle) {
    this.cycle = cycle;
  }

    
  @JsonProperty("releaseDate")
  public Object getReleaseDate() {
    return releaseDate;
  }
  public void setReleaseDate(Object releaseDate) {
    this.releaseDate = releaseDate;
  }

    
  @JsonProperty("eol")
  public Object getEol() {
    return eol;
  }
  public void setEol(Object eol) {
    this.eol = eol;
  }

    
  @JsonProperty("latest")
  public Object getLatest() {
    return latest;
  }
  public void setLatest(Object latest) {
    this.latest = latest;
  }

    
  @JsonProperty("link")
  public Object getLink() {
    return link;
  }
  public void setLink(Object link) {
    this.link = link;
  }

    
  @JsonProperty("lts")
  public Object getLts() {
    return lts;
  }
  public void setLts(Object lts) {
    this.lts = lts;
  }

    
  @JsonProperty("support")
  public Object getSupport() {
    return support;
  }
  public void setSupport(Object support) {
    this.support = support;
  }

    
  @JsonProperty("discontinued")
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
