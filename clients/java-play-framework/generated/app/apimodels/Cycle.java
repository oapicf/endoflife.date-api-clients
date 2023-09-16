package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-09-16T14:43:28.067343Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Cycle   {
  @JsonProperty("cycle")
  
  private Object cycle = null;

  @JsonProperty("releaseDate")
  @Size(min=10,max=10)

  private Object releaseDate = null;

  @JsonProperty("eol")
  @Size(min=1)

  private Object eol = null;

  @JsonProperty("latest")
  @Size(min=1)

  private Object latest = null;

  @JsonProperty("link")
  @Size(min=1)

  private Object link = null;

  @JsonProperty("lts")
  
  private Object lts = null;

  @JsonProperty("support")
  @Size(min=10,max=10)

  private Object support = null;

  @JsonProperty("discontinued")
  @Size(min=10,max=10)

  private Object discontinued = null;

  public Cycle cycle(Object cycle) {
    this.cycle = cycle;
    return this;
  }

   /**
   * Release Cycle
   * @return cycle
  **/
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

