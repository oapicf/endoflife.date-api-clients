/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.12.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Cycle;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-09T11:50:43.381361653Z[Etc/UTC]", comments = "Generator version: 7.12.0")
@Validated
@Tag(name = "api", description = "the api API")
public interface ApiApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /api/all.json : All Products
     * Return a list of all products. Each of these can be used for the other API endpoints.
     *
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getApiAllJson",
        summary = "All Products",
        description = "Return a list of all products. Each of these can be used for the other API endpoints.",
        tags = {  },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = String.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/all.json",
        produces = { "application/json" }
    )
    
    default ResponseEntity<List<String>> getApiAllJson(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ \"\", \"\" ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/{product}/{cycle}.json : Single cycle details
     * Gets details of a single cycle.
     *
     * @param product Product URL as per the canonical URL on the endofife.date website. (required)
     * @param cycle Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD&#39;s releng/14.0 becomes releng-14.0. (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getApiProductCycleJson",
        summary = "Single cycle details",
        description = "Gets details of a single cycle.",
        tags = {  },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Cycle.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/{product}/{cycle}.json",
        produces = { "application/json" }
    )
    
    default ResponseEntity<Cycle> getApiProductCycleJson(
        @Parameter(name = "product", description = "Product URL as per the canonical URL on the endofife.date website.", required = true, in = ParameterIn.PATH) @PathVariable("product") String product,
        @Parameter(name = "cycle", description = "Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD's releng/14.0 becomes releng-14.0.", required = true, in = ParameterIn.PATH) @PathVariable("cycle") String cycle
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"eol\" : \"cycle_eol\", \"releaseDate\" : \"2000-01-23\", \"link\" : \"link\", \"lts\" : \"cycle_lts\", \"discontinued\" : \"cycle_discontinued\", \"cycle\" : 0.8008281904610115, \"support\" : \"cycle_support\", \"latest\" : \"latest\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/{product}.json : Get All Details
     * Get EoL dates of all cycles of a given product.
     *
     * @param product Product URL as per the canonical URL on the endofife.date website. (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getApiProductJson",
        summary = "Get All Details",
        description = "Get EoL dates of all cycles of a given product.",
        tags = {  },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Cycle.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/{product}.json",
        produces = { "application/json" }
    )
    
    default ResponseEntity<List<Cycle>> getApiProductJson(
        @Parameter(name = "product", description = "Product URL as per the canonical URL on the endofife.date website.", required = true, in = ParameterIn.PATH) @PathVariable("product") String product
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"eol\" : \"cycle_eol\", \"releaseDate\" : \"2000-01-23\", \"link\" : \"link\", \"lts\" : \"cycle_lts\", \"discontinued\" : \"cycle_discontinued\", \"cycle\" : 0.8008281904610115, \"support\" : \"cycle_support\", \"latest\" : \"latest\" }, { \"eol\" : \"cycle_eol\", \"releaseDate\" : \"2000-01-23\", \"link\" : \"link\", \"lts\" : \"cycle_lts\", \"discontinued\" : \"cycle_discontinued\", \"cycle\" : 0.8008281904610115, \"support\" : \"cycle_support\", \"latest\" : \"latest\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
