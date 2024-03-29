/**
 * endoflife.date
 * Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.api;

import org.openapitools.model.Cycle;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.fasterxml.jackson.jaxrs.xml.JacksonXMLProvider;
import org.apache.cxf.jaxrs.provider.MultipartProvider;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * endoflife.date
 *
 * <p>Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)
 *
 * API tests for DefaultApi.
 */
public class DefaultApiTest {

    private DefaultApi api;

    @Before
    public void setup() {
        List<?> providers = Arrays.asList(new JacksonJsonProvider(), new JacksonXMLProvider(), new MultipartProvider());

        api = JAXRSClientFactory.create("https://endoflife.date", DefaultApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);

        ClientConfiguration config = WebClient.getConfig(client);
    }

    
    /**
     * All Products
     *
     * Return a list of all products. Each of these can be used for the other API endpoints.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void getApiAllJsonTest() throws Exception {

        // TODO: delete this line and uncomment the next
        // List<String> response = api.getApiAllJson();
        // TODO: complete test assertions
    }
    
    /**
     * Single cycle details
     *
     * Gets details of a single cycle
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void getApiProductCycleJsonTest() throws Exception {
        // TODO: assign appropriate parameter values
        String product = null;
        String cycle = null;

        // TODO: delete this line and uncomment the next
        // Cycle response = api.getApiProductCycleJson(product, cycle);
        // TODO: complete test assertions
    }
    
    /**
     * Get All Details
     *
     * Get EoL dates of all cycles of a given product.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void getApiProductJsonTest() throws Exception {
        // TODO: assign appropriate parameter values
        String product = null;

        // TODO: delete this line and uncomment the next
        // List<Cycle> response = api.getApiProductJson(product);
        // TODO: complete test assertions
    }
    
}
