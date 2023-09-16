package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Cycle;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface DefaultApi  {
    Future<ApiResponse<Object>> getApiAllJson();
    Future<ApiResponse<Cycle>> getApiProductCycleJson(Object product, Object cycle);
    Future<ApiResponse<Object>> getApiProductJson(Object product);
}
