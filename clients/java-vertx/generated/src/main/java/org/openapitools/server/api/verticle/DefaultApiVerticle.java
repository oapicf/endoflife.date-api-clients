package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.Cycle;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class DefaultApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(DefaultApiVerticle.class);

    static final String GET-API-ALL.JSON_SERVICE_ID = "get-api-all.json";
    static final String GET-API-:PRODUCT-:CYCLE.JSON_SERVICE_ID = "get-api-:product-:cycle.json";
    static final String GET-API-:PRODUCT.JSON_SERVICE_ID = "get-api-:product.json";
    
    final DefaultApi service;

    public DefaultApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.DefaultApiImpl");
            service = (DefaultApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("DefaultApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for get-api-all.json
        vertx.eventBus().<JsonObject> consumer(GET-API-ALL.JSON_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get-api-all.json";
                service.getApiAllJson(result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get-api-all.json");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get-api-all.json", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get-api-:product-:cycle.json
        vertx.eventBus().<JsonObject> consumer(GET-API-:PRODUCT-:CYCLE.JSON_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get-api-:product-:cycle.json";
                JsonObject productParam = message.body().getJsonObject("product");
                if (productParam == null) {
                    manageError(message, new MainApiException(400, "product is required"), serviceId);
                    return;
                }
                Object product = Json.mapper.readValue(productParam.encode(), Object.class);
                JsonObject cycleParam = message.body().getJsonObject("cycle");
                if (cycleParam == null) {
                    manageError(message, new MainApiException(400, "cycle is required"), serviceId);
                    return;
                }
                Object cycle = Json.mapper.readValue(cycleParam.encode(), Object.class);
                service.getApiProductCycleJson(product, cycle, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get-api-:product-:cycle.json");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get-api-:product-:cycle.json", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for get-api-:product.json
        vertx.eventBus().<JsonObject> consumer(GET-API-:PRODUCT.JSON_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "get-api-:product.json";
                JsonObject productParam = message.body().getJsonObject("product");
                if (productParam == null) {
                    manageError(message, new MainApiException(400, "product is required"), serviceId);
                    return;
                }
                Object product = Json.mapper.readValue(productParam.encode(), Object.class);
                service.getApiProductJson(product, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "get-api-:product.json");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("get-api-:product.json", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
    }

    private void manageError(Message<JsonObject> message, Throwable cause, String serviceName) {
        int code = MainApiException.INTERNAL_SERVER_ERROR.getStatusCode();
        String statusMessage = MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage();
        if (cause instanceof MainApiException) {
            code = ((MainApiException)cause).getStatusCode();
            statusMessage = ((MainApiException)cause).getStatusMessage();
        } else {
            logUnexpectedError(serviceName, cause);
        }

        message.fail(code, statusMessage);
    }

    private void logUnexpectedError(String serviceName, Throwable cause) {
        LOGGER.error("Unexpected error in "+ serviceName, cause);
    }
}
