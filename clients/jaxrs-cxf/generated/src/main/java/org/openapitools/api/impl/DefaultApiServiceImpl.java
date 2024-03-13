package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.Cycle;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * endoflife.date
 *
 * <p>Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)
 *
 */
public class DefaultApiServiceImpl implements DefaultApi {
    /**
     * All Products
     *
     * Return a list of all products. Each of these can be used for the other API endpoints.
     *
     */
    public List<String> getApiAllJson() {
        // TODO: Implement...

        return null;
    }

    /**
     * Single cycle details
     *
     * Gets details of a single cycle
     *
     */
    public Cycle getApiProductCycleJson(String product, String cycle) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get All Details
     *
     * Get EoL dates of all cycles of a given product.
     *
     */
    public List<Cycle> getApiProductJson(String product) {
        // TODO: Implement...

        return null;
    }

}
