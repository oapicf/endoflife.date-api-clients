@isTest
private class OASDefaultApiTest {
    /**
     * All Products
     *
     * Return a list of all products. Each of these can be used for the other API endpoints.
     */
    @isTest
    private static void getApiAllJsonTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASDefaultApi api;
        oas_any_type_not_mapped response;
        oas_any_type_not_mapped expectedResponse;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.getApiAllJson();
    }

    /**
     * Single cycle details
     *
     * Gets details of a single cycle
     */
    @isTest
    private static void getApiProductCycleJsonTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'product' => '',
            'cycle' => ''
        };

        OASClient client;
        OASDefaultApi api;
        OASCycle response;
        OASCycle expectedResponse;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        js = JSON.serialize(OASCycle.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCycle.getExample();
        response = (OASCycle) api.getApiProductCycleJson(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get All Details
     *
     * Get EoL dates of all cycles of a given product.
     */
    @isTest
    private static void getApiProductJsonTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'product' => ''
        };

        OASClient client;
        OASDefaultApi api;
        oas_any_type_not_mapped response;
        oas_any_type_not_mapped expectedResponse;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        api.getApiProductJson(params);
    }
}