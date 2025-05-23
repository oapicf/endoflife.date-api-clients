/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.apis

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import org.openapitools.client.apis.DefaultApi
import org.openapitools.client.models.Cycle

class DefaultApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of DefaultApi
        //val apiInstance = DefaultApi()

        // to test getApiAllJson
        should("test getApiAllJson") {
            // uncomment below to test getApiAllJson
            //val result : kotlin.collections.List<kotlin.String> = apiInstance.getApiAllJson()
            //result shouldBe ("TODO")
        }

        // to test getApiProductCycleJson
        should("test getApiProductCycleJson") {
            // uncomment below to test getApiProductCycleJson
            //val product : kotlin.String = product_example // kotlin.String | Product URL as per the canonical URL on the endofife.date website
            //val cycle : kotlin.String = cycle_example // kotlin.String | Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD's releng/14.0 becomes releng-14.0.
            //val result : Cycle = apiInstance.getApiProductCycleJson(product, cycle)
            //result shouldBe ("TODO")
        }

        // to test getApiProductJson
        should("test getApiProductJson") {
            // uncomment below to test getApiProductJson
            //val product : kotlin.String = product_example // kotlin.String | Product URL as per the canonical URL on the endofife.date website
            //val result : kotlin.collections.List<Cycle> = apiInstance.getApiProductJson(product)
            //result shouldBe ("TODO")
        }

    }
}
