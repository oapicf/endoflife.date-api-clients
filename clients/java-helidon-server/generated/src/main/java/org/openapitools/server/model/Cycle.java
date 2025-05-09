package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.CycleCycle;
import org.openapitools.server.model.CycleDiscontinued;
import org.openapitools.server.model.CycleEol;
import org.openapitools.server.model.CycleLts;
import org.openapitools.server.model.CycleSupport;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
 */
public class Cycle   {

    private CycleCycle cycle;
    private LocalDate releaseDate;
    private CycleEol eol;
    private String latest;
    private String link;
    private CycleLts lts;
    private CycleSupport support;
    private CycleDiscontinued discontinued;

    /**
     * Default constructor.
     */
    public Cycle() {
    // JSON-B / Jackson
    }

    /**
     * Create Cycle.
     *
     * @param cycle cycle
     * @param releaseDate Release date for the first release in this cycle.
     * @param eol eol
     * @param latest Latest release in this cycle.
     * @param link Link to changelog for the latest release in this cycle, or null if unavailable.
     * @param lts lts
     * @param support support
     * @param discontinued discontinued
     */
    public Cycle(
        CycleCycle cycle, 
        LocalDate releaseDate, 
        CycleEol eol, 
        String latest, 
        String link, 
        CycleLts lts, 
        CycleSupport support, 
        CycleDiscontinued discontinued
    ) {
        this.cycle = cycle;
        this.releaseDate = releaseDate;
        this.eol = eol;
        this.latest = latest;
        this.link = link;
        this.lts = lts;
        this.support = support;
        this.discontinued = discontinued;
    }



    /**
     * Get cycle
     * @return cycle
     */
    public CycleCycle getCycle() {
        return cycle;
    }

    public void setCycle(CycleCycle cycle) {
        this.cycle = cycle;
    }

    /**
     * Release date for the first release in this cycle.
     * @return releaseDate
     */
    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * Get eol
     * @return eol
     */
    public CycleEol getEol() {
        return eol;
    }

    public void setEol(CycleEol eol) {
        this.eol = eol;
    }

    /**
     * Latest release in this cycle.
     * @return latest
     */
    public String getLatest() {
        return latest;
    }

    public void setLatest(String latest) {
        this.latest = latest;
    }

    /**
     * Link to changelog for the latest release in this cycle, or null if unavailable.
     * @return link
     */
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    /**
     * Get lts
     * @return lts
     */
    public CycleLts getLts() {
        return lts;
    }

    public void setLts(CycleLts lts) {
        this.lts = lts;
    }

    /**
     * Get support
     * @return support
     */
    public CycleSupport getSupport() {
        return support;
    }

    public void setSupport(CycleSupport support) {
        this.support = support;
    }

    /**
     * Get discontinued
     * @return discontinued
     */
    public CycleDiscontinued getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(CycleDiscontinued discontinued) {
        this.discontinued = discontinued;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

