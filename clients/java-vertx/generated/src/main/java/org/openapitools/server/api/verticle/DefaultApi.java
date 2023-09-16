package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Cycle;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface DefaultApi  {
    //get-api-all.json
    void getApiAllJson(Handler<AsyncResult<Object>> handler);

    //get-api-:product-:cycle.json
    void getApiProductCycleJson(Object product, Object cycle, Handler<AsyncResult<Cycle>> handler);

    //get-api-:product.json
    void getApiProductJson(Object product, Handler<AsyncResult<Object>> handler);

}
