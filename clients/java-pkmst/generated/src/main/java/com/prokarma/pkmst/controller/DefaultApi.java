/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.9.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.Cycle;
import java.util.List;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

import java.util.List;
/**
 * Provides the info about api methods
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-03T10:22:27.837551129Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Api(value = "Default", description = "the Default API")
public interface DefaultApi {

    @ApiOperation(value = "All Products", notes = "Return a list of all products. Each of these can be used for the other API endpoints.", response = String.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class, responseContainer = "List") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/all.json",
        produces = { "application/json" }
    )
    ResponseEntity<List<String>> getApiAllJson( @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Single cycle details", notes = "Gets details of a single cycle", response = Cycle.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Cycle.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/{product}/{cycle}.json",
        produces = { "application/json" }
    )
    ResponseEntity<Cycle> getApiProductCycleJson(@ApiParam(value = "Product URL as per the canonical URL on the endofife.date website",required=true ) @PathVariable("product") String product,@ApiParam(value = "Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD's releng/14.0 becomes releng-14.0.",required=true ) @PathVariable("cycle") String cycle, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Get All Details", notes = "Get EoL dates of all cycles of a given product.", response = Cycle.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Cycle.class, responseContainer = "List") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/{product}.json",
        produces = { "application/json" }
    )
    ResponseEntity<List<Cycle>> getApiProductJson(@ApiParam(value = "Product URL as per the canonical URL on the endofife.date website",required=true ) @PathVariable("product") String product, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;

}
