package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.Cycle;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-13T10:45:57.432198931Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public interface ApiApiService {
      Response getApiAllJson(SecurityContext securityContext)
      throws NotFoundException;
      Response getApiProductCycleJson(String product,String cycle,SecurityContext securityContext)
      throws NotFoundException;
      Response getApiProductJson(String product,SecurityContext securityContext)
      throws NotFoundException;
}
