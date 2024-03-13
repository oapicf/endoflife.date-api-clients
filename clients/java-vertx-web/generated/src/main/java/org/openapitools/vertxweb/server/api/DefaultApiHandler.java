package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Cycle;

import com.fasterxml.jackson.core.type.TypeReference;
import io.vertx.core.json.jackson.DatabindCodec;
import io.vertx.ext.web.openapi.RouterBuilder;
import io.vertx.ext.web.validation.RequestParameters;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.validation.ValidationHandler;
import io.vertx.ext.web.RoutingContext;
import io.vertx.core.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class DefaultApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(DefaultApiHandler.class);

    private final DefaultApi api;

    public DefaultApiHandler(DefaultApi api) {
        this.api = api;
    }

    @Deprecated
    public DefaultApiHandler() {
        this(new DefaultApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("getApiAllJson").handler(this::getApiAllJson);
        builder.operation("getApiProductCycleJson").handler(this::getApiProductCycleJson);
        builder.operation("getApiProductJson").handler(this::getApiProductJson);
    }

    private void getApiAllJson(RoutingContext routingContext) {
        logger.info("getApiAllJson()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);



        api.getApiAllJson()
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getApiProductCycleJson(RoutingContext routingContext) {
        logger.info("getApiProductCycleJson()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String product = requestParameters.pathParameter("product") != null ? requestParameters.pathParameter("product").getString() : null;
        String cycle = requestParameters.pathParameter("cycle") != null ? requestParameters.pathParameter("cycle").getString() : null;

        logger.debug("Parameter product is {}", product);
        logger.debug("Parameter cycle is {}", cycle);

        api.getApiProductCycleJson(product, cycle)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

    private void getApiProductJson(RoutingContext routingContext) {
        logger.info("getApiProductJson()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        String product = requestParameters.pathParameter("product") != null ? requestParameters.pathParameter("product").getString() : null;

        logger.debug("Parameter product is {}", product);

        api.getApiProductJson(product)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

}
