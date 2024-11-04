package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Arrays;
import java.util.Date;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CycleCycle;
import org.openapitools.model.CycleDiscontinued;
import org.openapitools.model.CycleEol;
import org.openapitools.model.CycleLts;
import org.openapitools.model.CycleSupport;
import org.springframework.format.annotation.DateTimeFormat;
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
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-03T10:22:48.933929989Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class Cycle {

  private CycleCycle cycle;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private Date releaseDate;

  private CycleEol eol;

  private String latest;

  private JsonNullable<@Size(min = 1) String> link = JsonNullable.<String>undefined();

  private CycleLts lts;

  private CycleSupport support;

  private CycleDiscontinued discontinued;

  public Cycle cycle(CycleCycle cycle) {
    this.cycle = cycle;
    return this;
  }

  /**
   * Get cycle
   * @return cycle
   */
  @Valid 
  @Schema(name = "cycle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cycle")
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
   */
  @Valid @Size(min = 10, max = 10) 
  @Schema(name = "releaseDate", description = "Release Date for the first release in this cycle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("releaseDate")
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
   */
  @Valid 
  @Schema(name = "eol", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("eol")
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
   */
  @Size(min = 1) 
  @Schema(name = "latest", description = "Latest release in this cycle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latest")
  public String getLatest() {
    return latest;
  }

  public void setLatest(String latest) {
    this.latest = latest;
  }

  public Cycle link(String link) {
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
  public JsonNullable<@Size(min = 1) String> getLink() {
    return link;
  }

  public void setLink(JsonNullable<String> link) {
    this.link = link;
  }

  public Cycle lts(CycleLts lts) {
    this.lts = lts;
    return this;
  }

  /**
   * Get lts
   * @return lts
   */
  @Valid 
  @Schema(name = "lts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lts")
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
   */
  @Valid 
  @Schema(name = "support", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("support")
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
   */
  @Valid 
  @Schema(name = "discontinued", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    return Objects.equals(this.cycle, cycle.cycle) &&
        Objects.equals(this.releaseDate, cycle.releaseDate) &&
        Objects.equals(this.eol, cycle.eol) &&
        Objects.equals(this.latest, cycle.latest) &&
        equalsNullable(this.link, cycle.link) &&
        Objects.equals(this.lts, cycle.lts) &&
        Objects.equals(this.support, cycle.support) &&
        Objects.equals(this.discontinued, cycle.discontinued);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cycle, releaseDate, eol, latest, hashCodeNullable(link), lts, support, discontinued);
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

