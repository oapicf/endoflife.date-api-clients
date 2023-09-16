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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2023-09-16T14:43:59.034891Z[Etc/UTC]")
public abstract class ApiApiService {
    public abstract Response getApiAllJson(SecurityContext securityContext) throws NotFoundException;
    public abstract Response getApiProductCycleJson(Object product,Object cycle,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getApiProductJson(Object product,SecurityContext securityContext) throws NotFoundException;
}
