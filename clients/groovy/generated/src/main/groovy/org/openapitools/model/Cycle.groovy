package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class Cycle {
    /* Release Cycle */
    Object cycle = null
    /* Release Date for the first release in this cycle */
    Object releaseDate = null
    /* End of Life Date for this release cycle */
    Object eol = null
    /* Latest release in this cycle */
    Object latest = null
    /* Link to changelog for the latest release, if available */
    Object link = null
    /* Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date.  */
    Object lts = null
    /* Whether this release cycle has active support */
    Object support = null
    /* Whether this cycle is now discontinued. */
    Object discontinued = null
}
