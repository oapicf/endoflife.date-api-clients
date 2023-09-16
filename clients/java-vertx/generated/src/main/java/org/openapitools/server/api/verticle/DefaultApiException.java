package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Cycle;
import org.openapitools.server.api.MainApiException;

public final class DefaultApiException extends MainApiException {
    public DefaultApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final DefaultApiException Default_getApiAllJson_200_Exception = new DefaultApiException(200, "OK");
    public static final DefaultApiException Default_getApiProductCycleJson_200_Exception = new DefaultApiException(200, "OK");
    public static final DefaultApiException Default_getApiProductJson_200_Exception = new DefaultApiException(200, "OK");
    

}