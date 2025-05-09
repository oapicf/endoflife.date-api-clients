package org.openapitools.api;

import org.openapitools.model.Cycle;
import org.openapitools.api.ApiApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.PATCH;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
@Path("/api")
@RequestScoped

@Api(description = "the api API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2025-05-09T11:49:26.502470538Z[Etc/UTC]", comments = "Generator version: 7.12.0")

public class ApiApi  {

  @Context SecurityContext securityContext;

  @Inject ApiApiService delegate;


    @GET
    @Path("/all.json")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "All Products", notes = "Return a list of all products. Each of these can be used for the other API endpoints.", response = String.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class, responseContainer = "List") })
    public Response getApiAllJson() {
        return delegate.getApiAllJson(securityContext);
    }

    @GET
    @Path("/{product}/{cycle}.json")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Single cycle details", notes = "Gets details of a single cycle.", response = Cycle.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Cycle.class) })
    public Response getApiProductCycleJson(@ApiParam(value = "Product URL as per the canonical URL on the endofife.date website.",required=true) @PathParam("product") String product, @ApiParam(value = "Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD's releng/14.0 becomes releng-14.0.",required=true) @PathParam("cycle") String cycle) {
        return delegate.getApiProductCycleJson(product, cycle, securityContext);
    }

    @GET
    @Path("/{product}.json")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get All Details", notes = "Get EoL dates of all cycles of a given product.", response = Cycle.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Cycle.class, responseContainer = "List") })
    public Response getApiProductJson(@ApiParam(value = "Product URL as per the canonical URL on the endofife.date website.",required=true) @PathParam("product") String product) {
        return delegate.getApiProductJson(product, securityContext);
    }
}
