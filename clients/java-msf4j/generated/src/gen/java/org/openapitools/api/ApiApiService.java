package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.Cycle;
import java.util.List;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-11-03T06:09:28.889077580Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public abstract class ApiApiService {
    public abstract Response getApiAllJson() throws NotFoundException;
    public abstract Response getApiProductCycleJson(String product
 ,String cycle
 ) throws NotFoundException;
    public abstract Response getApiProductJson(String product
 ) throws NotFoundException;
}
