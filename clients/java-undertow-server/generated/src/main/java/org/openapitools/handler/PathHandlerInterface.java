/*
 * endoflife.date
 *
 * Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)
 *
 * OpenAPI document version: 0.0.1
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.handler;

import io.undertow.server.*;
import io.undertow.util.*;

import org.openapitools.model.*;

@SuppressWarnings("TooManyFunctions")
public interface PathHandlerInterface {

    /**
     * <p>All Products</p>
     *
     * <p>Return a list of all products. Each of these can be used for the other API endpoints.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/all.json" (<i>privileged: false</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.List List} of {@link String}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getApiAllJson();

    /**
     * <p>Single cycle details</p>
     *
     * <p>Gets details of a single cycle</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/{product}/{cycle}.json" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>product</b>"
     * <p>Product URL as per the canonical URL on the endofife.date website</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>cycle</b>"
     * <p>Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD's releng/14.0 becomes releng-14.0.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Cycle}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getApiProductCycleJson();

    /**
     * <p>Get All Details</p>
     *
     * <p>Get EoL dates of all cycles of a given product.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/api/{product}.json" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>product</b>"
     * <p>Product URL as per the canonical URL on the endofife.date website</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.List List} of {@link Cycle}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: OK</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getApiProductJson();
}
