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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-11-03T10:23:07.914255426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public interface ApiApiService {
      Response getApiAllJson(SecurityContext securityContext)
      throws NotFoundException;
      Response getApiProductCycleJson(String product,String cycle,SecurityContext securityContext)
      throws NotFoundException;
      Response getApiProductJson(String product,SecurityContext securityContext)
      throws NotFoundException;
}
