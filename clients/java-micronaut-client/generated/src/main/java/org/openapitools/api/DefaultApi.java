/*
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

package org.openapitools.api;

import io.micronaut.http.annotation.*;
import io.micronaut.core.annotation.*;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.core.convert.format.Format;
import reactor.core.publisher.Mono;
import org.openapitools.model.Cycle;
import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-07-10T09:07:23.610199357Z[Etc/UTC]", comments = "Generator version: 7.6.0")
@Client("${openapi-micronaut-client-base-path}")
public interface DefaultApi {
    /**
     * All Products
     * Return a list of all products. Each of these can be used for the other API endpoints.
     *
     * @return List&lt;String&gt;
     */
    @Get(uri="/api/all.json")
    @Consumes({"application/json"})
    Mono<List<String>> getApiAllJson();

    /**
     * Single cycle details
     * Gets details of a single cycle
     *
     * @param product Product URL as per the canonical URL on the endofife.date website (required)
     * @param cycle Release Cycle for which the details must be fetched (required)
     * @return Cycle
     */
    @Get(uri="/api/{product}/{cycle}.json")
    @Consumes({"application/json"})
    Mono<Cycle> getApiProductCycleJson(
        @PathVariable(name="product") @NotNull String product, 
        @PathVariable(name="cycle") @NotNull String cycle
    );

    /**
     * Get All Details
     * Get EoL dates of all cycles of a given product.
     *
     * @param product Product URL as per the canonical URL on the endofife.date website (required)
     * @return List&lt;Cycle&gt;
     */
    @Get(uri="/api/{product}.json")
    @Consumes({"application/json"})
    Mono<List<Cycle>> getApiProductJson(
        @PathVariable(name="product") @NotNull String product
    );

}
