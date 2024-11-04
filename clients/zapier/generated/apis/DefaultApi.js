const samples = require('../samples/DefaultApi');
const cycle = require('../models/cycle');
const utils = require('../utils/utils');

module.exports = {
    getApiAll.json: {
        key: 'getApiAll.json',
        noun: 'default',
        display: {
            label: 'All Products',
            description: 'Return a list of all products. Each of these can be used for the other API endpoints.',
            hidden: false,
        },
        operation: {
            inputFields: [
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://endoflife.date/api/all.json'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'getApiAll.json', response.json);
                    return { data: results };
                })
            },
            sample: { data: {} }
        }
    },
    getApiProduct.json: {
        key: 'getApiProduct.json',
        noun: 'default',
        display: {
            label: 'Get All Details',
            description: 'Get EoL dates of all cycles of a given product.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'product',
                    label: 'Product URL as per the canonical URL on the endofife.date website',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://endoflife.date/api/{product}.json'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'getApiProduct.json', response.json);
                    return results;
                })
            },
            sample: samples['cycleSample']
        }
    },
    getApiProductCycle.json: {
        key: 'getApiProductCycle.json',
        noun: 'default',
        display: {
            label: 'Single cycle details',
            description: 'Gets details of a single cycle',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'product',
                    label: 'Product URL as per the canonical URL on the endofife.date website',
                    type: 'string',
                    required: true,
                },
                {
                    key: 'cycle',
                    label: 'Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD&#39;s releng/14.0 becomes releng-14.0.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...cycle.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://endoflife.date/api/{product}/{cycle}.json'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'getApiProductCycle.json', response.json);
                    return results;
                })
            },
            sample: samples['cycleSample']
        }
    },
}
