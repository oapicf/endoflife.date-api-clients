package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Cycle;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class DefaultApiImpl implements DefaultApi {
    public Future<ApiResponse<List<String>>> getApiAllJson() {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<Cycle>> getApiProductCycleJson(String product, String cycle) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<List<Cycle>>> getApiProductJson(String product) {
        return Future.failedFuture(new HttpException(501));
    }

}
