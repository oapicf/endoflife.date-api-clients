package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.openapitools.model.Cycle;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-11-03T06:09:45.925088872Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public interface ApiApiService {
      public Response getApiAllJson(SecurityContext securityContext);
      public Response getApiProductCycleJson(String product, String cycle, SecurityContext securityContext);
      public Response getApiProductJson(String product, SecurityContext securityContext);
}
