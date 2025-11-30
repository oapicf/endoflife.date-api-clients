package org.openapitools.api;

import org.openapitools.model.Cycle;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * endoflife.date
 *
 * <p>The endoflife.date v0 API is currently deprecated, please [use the endoflife.date v1 API](https://endoflife.date/docs/api/v1/).
 *
 */
@Path("/api")
@Api(value = "/", description = "")
public interface DefaultApi  {

    /**
     * All Products
     *
     * Return a list of all products. Each of these can be used for the other API endpoints.
     *
     */
    @GET
    @Path("/all.json")
    @Produces({ "application/json" })
    @ApiOperation(value = "All Products", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class, responseContainer = "List") })
    public List<String> getApiAllJson();

    /**
     * Single cycle details
     *
     * Gets details of a single cycle.
     *
     */
    @GET
    @Path("/{product}/{cycle}.json")
    @Produces({ "application/json" })
    @ApiOperation(value = "Single cycle details", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Cycle.class) })
    public Cycle getApiProductCycleJson(@PathParam("product") String product, @PathParam("cycle") String cycle);

    /**
     * Get All Details
     *
     * Get EoL dates of all cycles of a given product.
     *
     */
    @GET
    @Path("/{product}.json")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get All Details", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Cycle.class, responseContainer = "List") })
    public List<Cycle> getApiProductJson(@PathParam("product") String product);
}
