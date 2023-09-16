package org.openapitools.api

import org.openapitools.model.Cycle
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:}")
class ApiApiController() {

    @Operation(
        summary = "All Products",
        operationId = "getApiAllJson",
        description = """Return a list of all products. Each of these can be used for the other API endpoints.""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = kotlin.Any::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/all.json"],
        produces = ["application/json"]
    )
    fun getApiAllJson(): ResponseEntity<kotlin.Any> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Single cycle details",
        operationId = "getApiProductCycleJson",
        description = """Gets details of a single cycle""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = Cycle::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/{product}/{cycle}.json"],
        produces = ["application/json"]
    )
    fun getApiProductCycleJson(@Parameter(description = "Product URL as per the canonical URL on the endofife.date website", required = true) @PathVariable("product") product: kotlin.Any,@Parameter(description = "Release Cycle for which the details must be fetched", required = true) @PathVariable("cycle") cycle: kotlin.Any): ResponseEntity<Cycle> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get All Details",
        operationId = "getApiProductJson",
        description = """Get EoL dates of all cycles of a given product.""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = kotlin.Any::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/api/{product}.json"],
        produces = ["application/json"]
    )
    fun getApiProductJson(@Parameter(description = "Product URL as per the canonical URL on the endofife.date website", required = true) @PathVariable("product") product: kotlin.Any): ResponseEntity<kotlin.Any> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
