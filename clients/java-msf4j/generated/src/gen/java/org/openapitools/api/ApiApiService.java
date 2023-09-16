package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.Cycle;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2023-09-16T14:43:17.968520Z[Etc/UTC]")
public abstract class ApiApiService {
    public abstract Response getApiAllJson() throws NotFoundException;
    public abstract Response getApiProductCycleJson(Object product
 ,Object cycle
 ) throws NotFoundException;
    public abstract Response getApiProductJson(Object product
 ) throws NotFoundException;
}
