
package org.openapitools.client.model

import java.time.LocalDate

case class Cycle (
    _cycle: Option[CycleCycle],
    /* Release Date for the first release in this cycle */
    _releaseDate: Option[LocalDate],
    _eol: Option[CycleEol],
    /* Latest release in this cycle */
    _latest: Option[String],
    /* Link to changelog for the latest release, if available */
    _link: Option[String],
    _lts: Option[CycleLts],
    _support: Option[CycleSupport],
    _discontinued: Option[CycleDiscontinued]
)
object Cycle {
    def toStringBody(var_cycle: Object, var_releaseDate: Object, var_eol: Object, var_latest: Object, var_link: Object, var_lts: Object, var_support: Object, var_discontinued: Object) =
        s"""
        | {
        | "cycle":$var_cycle,"releaseDate":$var_releaseDate,"eol":$var_eol,"latest":$var_latest,"link":$var_link,"lts":$var_lts,"support":$var_support,"discontinued":$var_discontinued
        | }
        """.stripMargin
}
