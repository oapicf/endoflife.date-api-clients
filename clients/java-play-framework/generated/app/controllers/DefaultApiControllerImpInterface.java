package controllers;

import apimodels.Cycle;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public abstract class DefaultApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result getApiAllJsonHttp(Http.Request request) throws Exception {
        Object obj = getApiAllJson(request);
        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Object getApiAllJson(Http.Request request) throws Exception;

    public Result getApiProductCycleJsonHttp(Http.Request request, Object product, Object cycle) throws Exception {
        Cycle obj = getApiProductCycleJson(request, product, cycle);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Cycle getApiProductCycleJson(Http.Request request, Object product, Object cycle) throws Exception;

    public Result getApiProductJsonHttp(Http.Request request, Object product) throws Exception {
        Object obj = getApiProductJson(request, product);
        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Object getApiProductJson(Http.Request request, Object product) throws Exception;

}
