package org.openapitools.api;

import org.openapitools.model.Cycle;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/api")
@Api(description = "the api API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-09-16T14:44:10.332276Z[Etc/UTC]")
public class ApiApi {

    @GET
    @Path("/all.json")
    @Produces({ "application/json" })
    @ApiOperation(value = "All Products", notes = "Return a list of all products. Each of these can be used for the other API endpoints.", response = Object.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Object.class)
    })
    public Response getApiAllJson() {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{product}/{cycle}.json")
    @Produces({ "application/json" })
    @ApiOperation(value = "Single cycle details", notes = "Gets details of a single cycle", response = Cycle.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Cycle.class)
    })
    public Response getApiProductCycleJson(@PathParam("product") @ApiParam("Product URL as per the canonical URL on the endofife.date website") Object product,@PathParam("cycle") @ApiParam("Release Cycle for which the details must be fetched") Object cycle) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{product}.json")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get All Details", notes = "Get EoL dates of all cycles of a given product.", response = Object.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Object.class)
    })
    public Response getApiProductJson(@PathParam("product") @ApiParam("Product URL as per the canonical URL on the endofife.date website") Object product) {
        return Response.ok().entity("magic!").build();
    }
}
