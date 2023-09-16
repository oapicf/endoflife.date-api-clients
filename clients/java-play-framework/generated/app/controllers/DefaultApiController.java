package controllers;

import apimodels.Cycle;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-09-16T14:43:28.067343Z[Etc/UTC]")
public class DefaultApiController extends Controller {
    private final DefaultApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private DefaultApiController(Config configuration, DefaultApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result getApiAllJson(Http.Request request) throws Exception {
        return imp.getApiAllJsonHttp(request);
    }

    @ApiAction
    public Result getApiProductCycleJson(Http.Request request, Object product,Object cycle) throws Exception {
        return imp.getApiProductCycleJsonHttp(request, product, cycle);
    }

    @ApiAction
    public Result getApiProductJson(Http.Request request, Object product) throws Exception {
        return imp.getApiProductJsonHttp(request, product);
    }

}
