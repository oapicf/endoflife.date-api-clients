package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CycleCycle;
import org.openapitools.model.CycleDiscontinued;
import org.openapitools.model.CycleEol;
import org.openapitools.model.CycleLts;
import org.openapitools.model.CycleSupport;

@Canonical
class Cycle {
    
    CycleCycle cycle
    /* Release date for the first release in this cycle. */
    Date releaseDate
    
    CycleEol eol
    /* Latest release in this cycle. */
    String latest
    /* Link to changelog for the latest release in this cycle, or null if unavailable. */
    String link
    
    CycleLts lts
    
    CycleSupport support
    
    CycleDiscontinued discontinued
}
