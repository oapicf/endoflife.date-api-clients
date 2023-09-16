package org.openapitools.api;

import org.openapitools.model.Cycle;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;

/**
 * endoflife.date
 *
 * <p>Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)
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
        @ApiResponse(code = 200, message = "OK", response = Object.class) })
    public Object getApiAllJson();

    /**
     * Single cycle details
     *
     * Gets details of a single cycle
     *
     */
    @GET
    @Path("/{product}/{cycle}.json")
    @Produces({ "application/json" })
    @ApiOperation(value = "Single cycle details", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Cycle.class) })
    public Cycle getApiProductCycleJson(@PathParam("product") Object product, @PathParam("cycle") Object cycle);

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
        @ApiResponse(code = 200, message = "OK", response = Object.class) })
    public Object getApiProductJson(@PathParam("product") Object product);
}
