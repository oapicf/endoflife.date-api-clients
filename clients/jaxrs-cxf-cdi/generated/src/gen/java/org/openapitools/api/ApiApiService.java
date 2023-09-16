package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.openapitools.model.Cycle;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2023-09-16T14:43:55.215930Z[Etc/UTC]")
public interface ApiApiService {
      public Response getApiAllJson(SecurityContext securityContext);
      public Response getApiProductCycleJson(Object product, Object cycle, SecurityContext securityContext);
      public Response getApiProductJson(Object product, SecurityContext securityContext);
}
