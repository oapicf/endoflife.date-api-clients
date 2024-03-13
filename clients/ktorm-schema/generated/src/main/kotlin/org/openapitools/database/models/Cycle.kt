/**
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
package org.openapitools.database.models

import org.ktorm.dsl.*
import org.ktorm.schema.*
import org.ktorm.database.Database
import .*


/**
 * Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
 * @param cycle Release Cycle
 * @param releaseDate Release Date for the first release in this cycle
 * @param eol End of Life Date for this release cycle
 * @param latest Latest release in this cycle
 * @param link Link to changelog for the latest release, if available
 * @param lts Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date.
 * @param support Whether this release cycle has active support
 * @param discontinued Whether this cycle is now discontinued.
 */
object Cycles : BaseTable<Cycle>("cycle") {
    val cycle = blob("cycle") /* null */ /* Release Cycle */
    val releaseDate = blob("releaseDate") /* null */ /* Release Date for the first release in this cycle */
    val eol = blob("eol") /* null */ /* End of Life Date for this release cycle */
    val latest = blob("latest") /* null */ /* Latest release in this cycle */
    val link = blob("link") /* null */ /* Link to changelog for the latest release, if available */
    val lts = blob("lts") /* null */ /* Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date.  */
    val support = blob("support") /* null */ /* Whether this release cycle has active support */
    val discontinued = blob("discontinued") /* null */ /* Whether this cycle is now discontinued. */

    /**
     * Create an entity of type Cycle from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = Cycle(
        cycle = row[cycle]  /* kotlin.Any? */ /* Release Cycle */,
        releaseDate = row[releaseDate]  /* kotlin.Any? */ /* Release Date for the first release in this cycle */,
        eol = row[eol]  /* kotlin.Any? */ /* End of Life Date for this release cycle */,
        latest = row[latest]  /* kotlin.Any? */ /* Latest release in this cycle */,
        link = row[link]  /* kotlin.Any? */ /* Link to changelog for the latest release, if available */,
        lts = row[lts]  /* kotlin.Any? */ /* Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date.  */,
        support = row[support]  /* kotlin.Any? */ /* Whether this release cycle has active support */,
        discontinued = row[discontinued]  /* kotlin.Any? */ /* Whether this cycle is now discontinued. */
    )

    /**
    * Assign all the columns from the entity of type Cycle to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = Cycle()
    * database.update(Cycles, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: Cycle) {
        this.apply {
            set(Cycles.cycle, entity.cycle)
            set(Cycles.releaseDate, entity.releaseDate)
            set(Cycles.eol, entity.eol)
            set(Cycles.latest, entity.latest)
            set(Cycles.link, entity.link)
            set(Cycles.lts, entity.lts)
            set(Cycles.support, entity.support)
            set(Cycles.discontinued, entity.discontinued)
        }
    }

}


