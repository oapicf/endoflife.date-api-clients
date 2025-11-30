package org.openapitools.api;

import org.openapitools.model.Cycle;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for DefaultApi
 */
@MicronautTest
public class DefaultApiTest {

    @Inject
    DefaultApi api;

    
    /**
     * All Products
     *
     * Return a list of all products. Each of these can be used for the other API endpoints.
     */
    @Test
    @Disabled("Not Implemented")
    public void getApiAllJsonTest() {
        // given

        // when
        List<String> body = api.getApiAllJson().block();

        // then
        // TODO implement the getApiAllJsonTest()
    }

    
    /**
     * Single cycle details
     *
     * Gets details of a single cycle.
     */
    @Test
    @Disabled("Not Implemented")
    public void getApiProductCycleJsonTest() {
        // given
        String product = "example";
        String cycle = "example";

        // when
        Cycle body = api.getApiProductCycleJson(product, cycle).block();

        // then
        // TODO implement the getApiProductCycleJsonTest()
    }

    
    /**
     * Get All Details
     *
     * Get EoL dates of all cycles of a given product.
     */
    @Test
    @Disabled("Not Implemented")
    public void getApiProductJsonTest() {
        // given
        String product = "example";

        // when
        List<Cycle> body = api.getApiProductJson(product).block();

        // then
        // TODO implement the getApiProductJsonTest()
    }

    
}
