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
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-04T23:48:13.967501037Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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
    public Result getApiProductCycleJson(Http.Request request, String product,String cycle) throws Exception {
        return imp.getApiProductCycleJsonHttp(request, product, cycle);
    }

    @ApiAction
    public Result getApiProductJson(Http.Request request, String product) throws Exception {
        return imp.getApiProductJsonHttp(request, product);
    }

}
