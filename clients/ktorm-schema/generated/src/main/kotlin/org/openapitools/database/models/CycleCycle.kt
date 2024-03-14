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
 * Release Cycle
 */
object CycleCycles : BaseTable<CycleCycle>("cycle_cycle") {

    /**
     * Create an entity of type CycleCycle from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CycleCycle(
    )

    /**
    * Assign all the columns from the entity of type CycleCycle to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CycleCycle()
    * database.update(CycleCycles, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CycleCycle) {
        this.apply {
        }
    }

}


