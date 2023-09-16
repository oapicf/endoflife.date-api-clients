package org.openapitools.controller;

import org.openapitools.model.Cycle;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.uri.UriTemplate;
import io.micronaut.http.cookie.Cookie;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.core.type.Argument;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for DefaultController
 */
@MicronautTest
public class DefaultControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    DefaultController controller;

    /**
     * This test is used to validate the implementation of getApiAllJson() method
     *
     * The method should: All Products
     *
     * Return a list of all products. Each of these can be used for the other API endpoints.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getApiAllJsonMethodTest() {
        // given

        // when
        Object result = controller.getApiAllJson().block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/all.json' to the features of getApiAllJson() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getApiAllJsonClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/all.json").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Object.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getApiProductCycleJson() method
     *
     * The method should: Single cycle details
     *
     * Gets details of a single cycle
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getApiProductCycleJsonMethodTest() {
        // given
        Object product = null;
        Object cycle = null;

        // when
        Cycle result = controller.getApiProductCycleJson(product, cycle).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/{product}/{cycle}.json' to the features of getApiProductCycleJson() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getApiProductCycleJsonClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/{product}/{cycle}.json").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("product", null);
            put("cycle", null);
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Cycle.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getApiProductJson() method
     *
     * The method should: Get All Details
     *
     * Get EoL dates of all cycles of a given product.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getApiProductJsonMethodTest() {
        // given
        Object product = null;

        // when
        Object result = controller.getApiProductJson(product).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/api/{product}.json' to the features of getApiProductJson() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getApiProductJsonClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/api/{product}.json").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("product", null);
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Object.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
