package org.openapitools.api;

import org.openapitools.api.ApiApiService;
import org.openapitools.api.factories.ApiApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Cycle;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/api")


@io.swagger.annotations.Api(description = "the api API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2023-09-16T14:43:59.034891Z[Etc/UTC]")
public class ApiApi  {
   private final ApiApiService delegate;

   public ApiApi(@Context ServletConfig servletContext) {
      ApiApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ApiApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ApiApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = ApiApiServiceFactory.getApiApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.GET
    @Path("/all.json")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "All Products", notes = "Return a list of all products. Each of these can be used for the other API endpoints.", response = Object.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Object.class)
    })
    public Response getApiAllJson(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getApiAllJson(securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{product}/{cycle}.json")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Single cycle details", notes = "Gets details of a single cycle", response = Cycle.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Cycle.class)
    })
    public Response getApiProductCycleJson(@ApiParam(value = "Product URL as per the canonical URL on the endofife.date website", required = true) @PathParam("product") @NotNull @Valid  Object product,@ApiParam(value = "Release Cycle for which the details must be fetched", required = true) @PathParam("cycle") @NotNull @Valid  Object cycle,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getApiProductCycleJson(product, cycle, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{product}.json")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get All Details", notes = "Get EoL dates of all cycles of a given product.", response = Object.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Object.class)
    })
    public Response getApiProductJson(@ApiParam(value = "Product URL as per the canonical URL on the endofife.date website", required = true) @PathParam("product") @NotNull @Valid  Object product,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getApiProductJson(product, securityContext);
    }
}
