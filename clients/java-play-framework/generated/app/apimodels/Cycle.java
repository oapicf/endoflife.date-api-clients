package apimodels;

import apimodels.CycleCycle;
import apimodels.CycleDiscontinued;
import apimodels.CycleEol;
import apimodels.CycleLts;
import apimodels.CycleSupport;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2025-05-09T11:49:18.178599199Z[Etc/UTC]", comments = "Generator version: 7.12.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Cycle   {
  @JsonProperty("cycle")
  @Valid

  private CycleCycle cycle;

  @JsonProperty("releaseDate")
  @Size(min=10,max=10)
@Valid

  private LocalDate releaseDate;

  @JsonProperty("eol")
  @Valid

  private CycleEol eol;

  @JsonProperty("latest")
  @Size(min=1)

  private String latest;

  @JsonProperty("link")
  @Size(min=1)

  private String link;

  @JsonProperty("lts")
  @Valid

  private CycleLts lts;

  @JsonProperty("support")
  @Valid

  private CycleSupport support;

  @JsonProperty("discontinued")
  @Valid

  private CycleDiscontinued discontinued;

  public Cycle cycle(CycleCycle cycle) {
    this.cycle = cycle;
    return this;
  }

   /**
   * Get cycle
   * @return cycle
  **/
  public CycleCycle getCycle() {
    return cycle;
  }

  public void setCycle(CycleCycle cycle) {
    this.cycle = cycle;
  }

  public Cycle releaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

   /**
   * Release date for the first release in this cycle.
   * @return releaseDate
  **/
  public LocalDate getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(LocalDate releaseDate) {
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
   * Latest release in this cycle.
   * @return latest
  **/
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
   * Link to changelog for the latest release in this cycle, or null if unavailable.
   * @return link
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

