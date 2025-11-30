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
        List<String> response;
        List<String> expectedResponse;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        js = JSON.serialize(new List<String>{''});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<String>{''};
        response = (List<String>) api.getApiAllJson();
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Single cycle details
     *
     * Gets details of a single cycle.
     */
    @isTest
    private static void getApiProductCycleJsonTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'product' => 'null',
            'cycle' => 'null'
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
            'product' => 'null'
        };

        OASClient client;
        OASDefaultApi api;
        List<OASCycle> response;
        List<OASCycle> expectedResponse;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        js = JSON.serialize(new List<OASCycle>{OASCycle.getExample()});
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = new List<OASCycle>{OASCycle.getExample()};
        response = (List<OASCycle>) api.getApiProductJson(params);
        System.assertEquals(expectedResponse, response);
    }
}