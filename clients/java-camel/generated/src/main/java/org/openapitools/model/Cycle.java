package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
 */

@Schema(name = "cycle", description = "Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.")
@JsonTypeName("cycle")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2023-09-16T14:43:43.404676Z[Etc/UTC]")
public class Cycle {

  private JsonNullable<Object> cycle = JsonNullable.undefined();

  private JsonNullable<Object> releaseDate = JsonNullable.undefined();

  private JsonNullable<Object> eol = JsonNullable.undefined();

  private JsonNullable<Object> latest = JsonNullable.undefined();

  private JsonNullable<Object> link = JsonNullable.undefined();

  private JsonNullable<Object> lts = JsonNullable.undefined();

  private JsonNullable<Object> support = JsonNullable.undefined();

  private JsonNullable<Object> discontinued = JsonNullable.undefined();

  public Cycle cycle(Object cycle) {
    this.cycle = JsonNullable.of(cycle);
    return this;
  }

  /**
   * Release Cycle
   * @return cycle
  */
  
  @Schema(name = "cycle", description = "Release Cycle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cycle")
  public JsonNullable<Object> getCycle() {
    return cycle;
  }

  public void setCycle(JsonNullable<Object> cycle) {
    this.cycle = cycle;
  }

  public Cycle releaseDate(Object releaseDate) {
    this.releaseDate = JsonNullable.of(releaseDate);
    return this;
  }

  /**
   * Release Date for the first release in this cycle
   * @return releaseDate
  */
  @Size(min = 10, max = 10) 
  @Schema(name = "releaseDate", description = "Release Date for the first release in this cycle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("releaseDate")
  public JsonNullable<Object> getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(JsonNullable<Object> releaseDate) {
    this.releaseDate = releaseDate;
  }

  public Cycle eol(Object eol) {
    this.eol = JsonNullable.of(eol);
    return this;
  }

  /**
   * End of Life Date for this release cycle
   * @return eol
  */
  @Size(min = 1) 
  @Schema(name = "eol", description = "End of Life Date for this release cycle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eol")
  public JsonNullable<Object> getEol() {
    return eol;
  }

  public void setEol(JsonNullable<Object> eol) {
    this.eol = eol;
  }

  public Cycle latest(Object latest) {
    this.latest = JsonNullable.of(latest);
    return this;
  }

  /**
   * Latest release in this cycle
   * @return latest
  */
  @Size(min = 1) 
  @Schema(name = "latest", description = "Latest release in this cycle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latest")
  public JsonNullable<Object> getLatest() {
    return latest;
  }

  public void setLatest(JsonNullable<Object> latest) {
    this.latest = latest;
  }

  public Cycle link(Object link) {
    this.link = JsonNullable.of(link);
    return this;
  }

  /**
   * Link to changelog for the latest release, if available
   * @return link
  */
  @Size(min = 1) 
  @Schema(name = "link", description = "Link to changelog for the latest release, if available", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("link")
  public JsonNullable<Object> getLink() {
    return link;
  }

  public void setLink(JsonNullable<Object> link) {
    this.link = link;
  }

  public Cycle lts(Object lts) {
    this.lts = JsonNullable.of(lts);
    return this;
  }

  /**
   * Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date. 
   * @return lts
  */
  
  @Schema(name = "lts", description = "Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lts")
  public JsonNullable<Object> getLts() {
    return lts;
  }

  public void setLts(JsonNullable<Object> lts) {
    this.lts = lts;
  }

  public Cycle support(Object support) {
    this.support = JsonNullable.of(support);
    return this;
  }

  /**
   * Whether this release cycle has active support
   * @return support
  */
  @Size(min = 10, max = 10) 
  @Schema(name = "support", description = "Whether this release cycle has active support", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("support")
  public JsonNullable<Object> getSupport() {
    return support;
  }

  public void setSupport(JsonNullable<Object> support) {
    this.support = support;
  }

  public Cycle discontinued(Object discontinued) {
    this.discontinued = JsonNullable.of(discontinued);
    return this;
  }

  /**
   * Whether this cycle is now discontinued.
   * @return discontinued
  */
  @Size(min = 10, max = 10) 
  @Schema(name = "discontinued", description = "Whether this cycle is now discontinued.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("discontinued")
  public JsonNullable<Object> getDiscontinued() {
    return discontinued;
  }

  public void setDiscontinued(JsonNullable<Object> discontinued) {
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
    return equalsNullable(this.cycle, cycle.cycle) &&
        equalsNullable(this.releaseDate, cycle.releaseDate) &&
        equalsNullable(this.eol, cycle.eol) &&
        equalsNullable(this.latest, cycle.latest) &&
        equalsNullable(this.link, cycle.link) &&
        equalsNullable(this.lts, cycle.lts) &&
        equalsNullable(this.support, cycle.support) &&
        equalsNullable(this.discontinued, cycle.discontinued);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(cycle), hashCodeNullable(releaseDate), hashCodeNullable(eol), hashCodeNullable(latest), hashCodeNullable(link), hashCodeNullable(lts), hashCodeNullable(support), hashCodeNullable(discontinued));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

