// @flow
/* eslint-disable no-use-before-define */
/**
 * endoflife.date
 * Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki).
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import * as url from "url";
import * as portableFetch from "portable-fetch";
import { Configuration } from "./configuration";

const BASE_PATH: string = "https://endoflife.date".replace(/\/+$/, "");

/**
 *
 * @export
 */
export const COLLECTION_FORMATS = {
    csv: ",",
    ssv: " ",
    tsv: "\t",
    pipes: "|",
};

/**
 *
 * @export
 */
export type FetchAPI = {
    (url: string, init?: any): Promise<Response>;
}

/**
 *
 * @export
 */
export type FetchArgs = {
    url: string;
    options: {};
}

/**
 *
 * @export
 */
export type RequestOptions = {
    headers?: {};
    query?: {};
    body?: string | FormData;
}

/**
 * * @export
 * @class RequiredError
 * @extends {Error}
 */
export class RequiredError extends Error {
    name:string = "RequiredError"
    constructor(field: string, msg?: string) {
        super(msg);
    }
}

/**
 * Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
 * @export
 */
export type Cycle = {
    /**
     * 
     * @type {CycleCycle}
     * @memberof Cycle
     */
    cycle?: CycleCycle;
    /**
     * Release date for the first release in this cycle.
     * @type {Date}
     * @memberof Cycle
     */
    releaseDate?: Date;
    /**
     * 
     * @type {CycleEol}
     * @memberof Cycle
     */
    eol?: CycleEol;
    /**
     * Latest release in this cycle.
     * @type {string}
     * @memberof Cycle
     */
    latest?: string;
    /**
     * Link to changelog for the latest release in this cycle, or null if unavailable.
     * @type {string}
     * @memberof Cycle
     */
    link?: string;
    /**
     * 
     * @type {CycleLts}
     * @memberof Cycle
     */
    lts?: CycleLts;
    /**
     * 
     * @type {CycleSupport}
     * @memberof Cycle
     */
    support?: CycleSupport;
    /**
     * 
     * @type {CycleDiscontinued}
     * @memberof Cycle
     */
    discontinued?: CycleDiscontinued;
}

/**
 * The release cycle which this release is part of.
 * @export
 */
export type CycleCycle = {
}

/**
 * Whether this device version is no longer in production.
 * @export
 */
export type CycleDiscontinued = {
}

/**
 * End-of-Life date for this release cycle.
 * @export
 */
export type CycleEol = {
}

/**
 * Whether this release cycle has long-term-support (LTS), or the date it entered LTS status.
 * @export
 */
export type CycleLts = {
}

/**
 * Whether this release cycle has active support.
 * @export
 */
export type CycleSupport = {
}



/**
 * DefaultApi - fetch parameter creator
 * @export
 */
export const DefaultApiFetchParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Return a list of all products. Each of these can be used for the other API endpoints.
         * @summary All Products
         * @throws {RequiredError}
         */
        getApiAllJson(options: RequestOptions): FetchArgs {
            const localVarPath = `/api/all.json`;
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            localVarUrlObj.search = null;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Gets details of a single cycle.
         * @summary Single cycle details
         * @throws {RequiredError}
         */
        getApiProductCycleJson(product: string, cycle: string, options: RequestOptions): FetchArgs {
            // verify required parameter 'product' is not null or undefined
            if (product === null || product === undefined) {
                throw new RequiredError('product','Required parameter product was null or undefined when calling getApiProductCycleJson.');
            }
            // verify required parameter 'cycle' is not null or undefined
            if (cycle === null || cycle === undefined) {
                throw new RequiredError('cycle','Required parameter cycle was null or undefined when calling getApiProductCycleJson.');
            }
            const localVarPath = `/api/{product}/{cycle}.json`
                .replace(`{${"product"}}`, encodeURIComponent(String(product)))
                .replace(`{${"cycle"}}`, encodeURIComponent(String(cycle)));
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            localVarUrlObj.search = null;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Get EoL dates of all cycles of a given product.
         * @summary Get All Details
         * @throws {RequiredError}
         */
        getApiProductJson(product: string, options: RequestOptions): FetchArgs {
            // verify required parameter 'product' is not null or undefined
            if (product === null || product === undefined) {
                throw new RequiredError('product','Required parameter product was null or undefined when calling getApiProductJson.');
            }
            const localVarPath = `/api/{product}.json`
                .replace(`{${"product"}}`, encodeURIComponent(String(product)));
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            localVarUrlObj.search = null;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

export type DefaultApiType = { 
    getApiAllJson(options?: RequestOptions): Promise<Array<string>>,

    getApiProductCycleJson(product: string, cycle: string, options?: RequestOptions): Promise<Cycle>,

    getApiProductJson(product: string, options?: RequestOptions): Promise<Array<Cycle>>,
}

/**
 * DefaultApi - factory function to inject configuration 
 * @export
 */
export const DefaultApi = function(configuration?: Configuration, fetch: FetchAPI = portableFetch): DefaultApiType {
    const basePath: string = (configuration && configuration.basePath) || BASE_PATH;
    return {
        /**
         * Return a list of all products. Each of these can be used for the other API endpoints.
         * @summary All Products
         * @throws {RequiredError}
         */
        getApiAllJson(options?: RequestOptions = {}): Promise<Array<string>> {
            const localVarFetchArgs = DefaultApiFetchParamCreator(configuration).getApiAllJson(options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Gets details of a single cycle.
         * @summary Single cycle details
         * @throws {RequiredError}
         */
        getApiProductCycleJson(product: string, cycle: string, options?: RequestOptions = {}): Promise<Cycle> {
            const localVarFetchArgs = DefaultApiFetchParamCreator(configuration).getApiProductCycleJson(product, cycle, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
        /**
         * Get EoL dates of all cycles of a given product.
         * @summary Get All Details
         * @throws {RequiredError}
         */
        getApiProductJson(product: string, options?: RequestOptions = {}): Promise<Array<Cycle>> {
            const localVarFetchArgs = DefaultApiFetchParamCreator(configuration).getApiProductJson(product, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
    }
};


export type ApiTypes = { 
    DefaultApi: DefaultApiType,
 }
