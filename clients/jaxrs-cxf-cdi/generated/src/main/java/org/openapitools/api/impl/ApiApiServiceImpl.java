package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import org.openapitools.model.Cycle;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2025-11-30T06:33:55.251274667Z[Etc/UTC]", comments = "Generator version: 7.17.0")
public class ApiApiServiceImpl implements ApiApiService {
      @Override
      public Response getApiAllJson(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getApiProductCycleJson(String product, String cycle, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getApiProductJson(String product, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
}
