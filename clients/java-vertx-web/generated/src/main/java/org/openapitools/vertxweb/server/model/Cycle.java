package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CycleCycle;
import org.openapitools.vertxweb.server.model.CycleDiscontinued;
import org.openapitools.vertxweb.server.model.CycleEol;
import org.openapitools.vertxweb.server.model.CycleLts;
import org.openapitools.vertxweb.server.model.CycleSupport;

/**
 * Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Cycle   {
  
  private CycleCycle cycle;
  private LocalDate releaseDate;
  private CycleEol eol;
  private String latest;
  private String link;
  private CycleLts lts;
  private CycleSupport support;
  private CycleDiscontinued discontinued;

  public Cycle () {

  }

  public Cycle (CycleCycle cycle, LocalDate releaseDate, CycleEol eol, String latest, String link, CycleLts lts, CycleSupport support, CycleDiscontinued discontinued) {
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
  public CycleCycle getCycle() {
    return cycle;
  }
  public void setCycle(CycleCycle cycle) {
    this.cycle = cycle;
  }

    
  @JsonProperty("releaseDate")
  public LocalDate getReleaseDate() {
    return releaseDate;
  }
  public void setReleaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
  }

    
  @JsonProperty("eol")
  public CycleEol getEol() {
    return eol;
  }
  public void setEol(CycleEol eol) {
    this.eol = eol;
  }

    
  @JsonProperty("latest")
  public String getLatest() {
    return latest;
  }
  public void setLatest(String latest) {
    this.latest = latest;
  }

    
  @JsonProperty("link")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }

    
  @JsonProperty("lts")
  public CycleLts getLts() {
    return lts;
  }
  public void setLts(CycleLts lts) {
    this.lts = lts;
  }

    
  @JsonProperty("support")
  public CycleSupport getSupport() {
    return support;
  }
  public void setSupport(CycleSupport support) {
    this.support = support;
  }

    
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
