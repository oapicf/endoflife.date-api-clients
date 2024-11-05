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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CycleCycle;
import org.openapitools.model.CycleDiscontinued;
import org.openapitools.model.CycleEol;
import org.openapitools.model.CycleLts;
import org.openapitools.model.CycleSupport;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
 */
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
@JsonTypeName("cycle")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-04T23:47:32.920889301Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class Cycle {
    public static final String JSON_PROPERTY_CYCLE = "cycle";
    private CycleCycle cycle;

    public static final String JSON_PROPERTY_RELEASE_DATE = "releaseDate";
    private LocalDate releaseDate;

    public static final String JSON_PROPERTY_EOL = "eol";
    private CycleEol eol;

    public static final String JSON_PROPERTY_LATEST = "latest";
    private String latest;

    public static final String JSON_PROPERTY_LINK = "link";
    private String link;

    public static final String JSON_PROPERTY_LTS = "lts";
    private CycleLts lts;

    public static final String JSON_PROPERTY_SUPPORT = "support";
    private CycleSupport support;

    public static final String JSON_PROPERTY_DISCONTINUED = "discontinued";
    private CycleDiscontinued discontinued;

    public Cycle() {
    }

    public Cycle cycle(CycleCycle cycle) {
        this.cycle = cycle;
        return this;
    }

    /**
     * Get cycle
     * @return cycle
     */
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_CYCLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CycleCycle getCycle() {
        return cycle;
    }

    @JsonProperty(JSON_PROPERTY_CYCLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCycle(CycleCycle cycle) {
        this.cycle = cycle;
    }

    public Cycle releaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    /**
     * Release Date for the first release in this cycle
     * @return releaseDate
     */
    @Nullable
    @Size(min=10, max=10)
    @JsonProperty(JSON_PROPERTY_RELEASE_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    @JsonProperty(JSON_PROPERTY_RELEASE_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
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
     */
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_EOL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CycleEol getEol() {
        return eol;
    }

    @JsonProperty(JSON_PROPERTY_EOL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @Size(min=1)
    @JsonProperty(JSON_PROPERTY_LATEST)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getLatest() {
        return latest;
    }

    @JsonProperty(JSON_PROPERTY_LATEST)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     */
    @Nullable
    @Size(min=1)
    @JsonProperty(JSON_PROPERTY_LINK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getLink() {
        return link;
    }

    @JsonProperty(JSON_PROPERTY_LINK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     */
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_LTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CycleLts getLts() {
        return lts;
    }

    @JsonProperty(JSON_PROPERTY_LTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_SUPPORT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CycleSupport getSupport() {
        return support;
    }

    @JsonProperty(JSON_PROPERTY_SUPPORT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_DISCONTINUED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CycleDiscontinued getDiscontinued() {
        return discontinued;
    }

    @JsonProperty(JSON_PROPERTY_DISCONTINUED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
