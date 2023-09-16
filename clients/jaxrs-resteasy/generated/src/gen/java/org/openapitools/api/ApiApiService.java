package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.Cycle;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2023-09-16T14:44:02.559095Z[Etc/UTC]")
public interface ApiApiService {
      Response getApiAllJson(SecurityContext securityContext)
      throws NotFoundException;
      Response getApiProductCycleJson(Object product,Object cycle,SecurityContext securityContext)
      throws NotFoundException;
      Response getApiProductJson(Object product,SecurityContext securityContext)
      throws NotFoundException;
}
