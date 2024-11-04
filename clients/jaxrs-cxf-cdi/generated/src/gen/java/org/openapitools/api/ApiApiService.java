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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-11-03T10:23:00.577481880Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public interface ApiApiService {
      public Response getApiAllJson(SecurityContext securityContext);
      public Response getApiProductCycleJson(String product, String cycle, SecurityContext securityContext);
      public Response getApiProductJson(String product, SecurityContext securityContext);
}
