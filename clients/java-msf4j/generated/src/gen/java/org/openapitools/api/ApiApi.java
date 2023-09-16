package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.ApiApiService;
import org.openapitools.api.factories.ApiApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Cycle;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/api")


@io.swagger.annotations.Api(description = "the api API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2023-09-16T14:43:17.968520Z[Etc/UTC]")
public class ApiApi  {
   private final ApiApiService delegate = ApiApiServiceFactory.getApiApi();

    @GET
    @Path("/all.json")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "All Products", notes = "Return a list of all products. Each of these can be used for the other API endpoints.", response = Object.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Object.class) })
    public Response getApiAllJson()
    throws NotFoundException {
        return delegate.getApiAllJson();
    }
    @GET
    @Path("/{product}/{cycle}.json")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Single cycle details", notes = "Gets details of a single cycle", response = Cycle.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Cycle.class) })
    public Response getApiProductCycleJson(@ApiParam(value = "Product URL as per the canonical URL on the endofife.date website",required=true) @PathParam("product") Object product
,@ApiParam(value = "Release Cycle for which the details must be fetched",required=true) @PathParam("cycle") Object cycle
)
    throws NotFoundException {
        return delegate.getApiProductCycleJson(product,cycle);
    }
    @GET
    @Path("/{product}.json")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get All Details", notes = "Get EoL dates of all cycles of a given product.", response = Object.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Object.class) })
    public Response getApiProductJson(@ApiParam(value = "Product URL as per the canonical URL on the endofife.date website",required=true) @PathParam("product") Object product
)
    throws NotFoundException {
        return delegate.getApiProductJson(product);
    }
}
