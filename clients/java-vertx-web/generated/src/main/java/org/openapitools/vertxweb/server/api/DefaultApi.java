package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Cycle;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface DefaultApi  {
    Future<ApiResponse<List<String>>> getApiAllJson();
    Future<ApiResponse<Cycle>> getApiProductCycleJson(String product, String cycle);
    Future<ApiResponse<List<Cycle>>> getApiProductJson(String product);
}
