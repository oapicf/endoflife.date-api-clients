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
        val response: ResponseEntity<List<kotlin.String>> = api.getApiAllJson()

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
        val product: kotlin.String = TODO()
        val cycle: kotlin.String = TODO()
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
        val product: kotlin.String = TODO()
        val response: ResponseEntity<List<Cycle>> = api.getApiProductJson(product)

        // TODO: test validations
    }
}
