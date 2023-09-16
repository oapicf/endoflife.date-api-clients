package org.openapitools.api

import org.openapitools.model.Cycle
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class ApiApiTest {

    private val api: ApiApiController = ApiApiController()

    /**
     * To test ApiApiController.getApiAllJson
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getApiAllJsonTest() {
        val response: ResponseEntity<kotlin.Any> = api.getApiAllJson()

        // TODO: test validations
    }

    /**
     * To test ApiApiController.getApiProductCycleJson
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getApiProductCycleJsonTest() {
        val product: kotlin.Any = TODO()
        val cycle: kotlin.Any = TODO()
        val response: ResponseEntity<Cycle> = api.getApiProductCycleJson(product, cycle)

        // TODO: test validations
    }

    /**
     * To test ApiApiController.getApiProductJson
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getApiProductJsonTest() {
        val product: kotlin.Any = TODO()
        val response: ResponseEntity<kotlin.Any> = api.getApiProductJson(product)

        // TODO: test validations
    }
}
