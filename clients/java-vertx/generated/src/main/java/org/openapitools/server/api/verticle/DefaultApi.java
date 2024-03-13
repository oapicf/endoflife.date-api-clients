package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Cycle;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface DefaultApi  {
    //get-api-all.json
    void getApiAllJson(Handler<AsyncResult<List<String>>> handler);

    //get-api-:product-:cycle.json
    void getApiProductCycleJson(String product, String cycle, Handler<AsyncResult<Cycle>> handler);

    //get-api-:product.json
    void getApiProductJson(String product, Handler<AsyncResult<List<Cycle>>> handler);

}
