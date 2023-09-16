package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.ApiApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Cycle;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/api")


@io.swagger.annotations.Api(description = "the api API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2023-09-16T14:44:02.559095Z[Etc/UTC]")
public class ApiApi  {

    @Inject ApiApiService service;

    @GET
    @Path("/all.json")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "All Products", notes = "Return a list of all products. Each of these can be used for the other API endpoints.", response = Object.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Object.class) })
    public Response getApiAllJson(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getApiAllJson(securityContext);
    }
    @GET
    @Path("/{product}/{cycle}.json")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Single cycle details", notes = "Gets details of a single cycle", response = Cycle.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Cycle.class) })
    public Response getApiProductCycleJson( @PathParam("product") Object product, @PathParam("cycle") Object cycle,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getApiProductCycleJson(product,cycle,securityContext);
    }
    @GET
    @Path("/{product}.json")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get All Details", notes = "Get EoL dates of all cycles of a given product.", response = Object.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Object.class) })
    public Response getApiProductJson( @PathParam("product") Object product,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getApiProductJson(product,securityContext);
    }
}
