
package org.openapitools.client.model


case class Cycle (
    /* Release Cycle */
    _cycle: Option[AnyType],
    /* Release Date for the first release in this cycle */
    _releaseDate: Option[AnyType],
    /* End of Life Date for this release cycle */
    _eol: Option[AnyType],
    /* Latest release in this cycle */
    _latest: Option[AnyType],
    /* Link to changelog for the latest release, if available */
    _link: Option[AnyType],
    /* Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date.  */
    _lts: Option[AnyType],
    /* Whether this release cycle has active support */
    _support: Option[AnyType],
    /* Whether this cycle is now discontinued. */
    _discontinued: Option[AnyType]
)
object Cycle {
    def toStringBody(var_cycle: Object, var_releaseDate: Object, var_eol: Object, var_latest: Object, var_link: Object, var_lts: Object, var_support: Object, var_discontinued: Object) =
        s"""
        | {
        | "cycle":$var_cycle,"releaseDate":$var_releaseDate,"eol":$var_eol,"latest":$var_latest,"link":$var_link,"lts":$var_lts,"support":$var_support,"discontinued":$var_discontinued
        | }
        """.stripMargin
}
