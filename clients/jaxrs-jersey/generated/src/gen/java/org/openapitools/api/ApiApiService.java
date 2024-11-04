package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.Cycle;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-03T10:23:04.199052282Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public abstract class ApiApiService {
    public abstract Response getApiAllJson(SecurityContext securityContext) throws NotFoundException;
    public abstract Response getApiProductCycleJson(String product,String cycle,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getApiProductJson(String product,SecurityContext securityContext) throws NotFoundException;
}
