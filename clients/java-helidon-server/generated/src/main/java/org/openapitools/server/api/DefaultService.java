package org.openapitools.server.api;

import org.openapitools.server.model.Cycle;
import java.util.HexFormat;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Default'",
                             version = "7.12.0")
public interface DefaultService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/all.json", this::getApiAllJson);
        rules.get("/{product}/{cycle}.json", this::getApiProductCycleJson);
        rules.get("/{product}.json", this::getApiProductJson);
    }


    /**
     * GET /api/all.json : All Products.
     *
     * @param request the server request
     * @param response the server response
     */
    void getApiAllJson(ServerRequest request, ServerResponse response);
    /**
     * GET /api/{product}/{cycle}.json : Single cycle details.
     *
     * @param request the server request
     * @param response the server response
     */
    void getApiProductCycleJson(ServerRequest request, ServerResponse response);
    /**
     * GET /api/{product}.json : Get All Details.
     *
     * @param request the server request
     * @param response the server response
     */
    void getApiProductJson(ServerRequest request, ServerResponse response);
}
