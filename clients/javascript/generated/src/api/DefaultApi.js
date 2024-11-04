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
 *
 */


import ApiClient from "../ApiClient";
import Cycle from '../model/Cycle';

/**
* Default service.
* @module api/DefaultApi
* @version 1.0.1-pre.0
*/
export default class DefaultApi {

    /**
    * Constructs a new DefaultApi. 
    * @alias module:api/DefaultApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the getApiAllJson operation.
     * @callback module:api/DefaultApi~getApiAllJsonCallback
     * @param {String} error Error message, if any.
     * @param {Array.<String>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * All Products
     * Return a list of all products. Each of these can be used for the other API endpoints.
     * @param {module:api/DefaultApi~getApiAllJsonCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<String>}
     */
    getApiAllJson(callback) {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = ['String'];
      return this.apiClient.callApi(
        '/api/all.json', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getApiProductCycleJson operation.
     * @callback module:api/DefaultApi~getApiProductCycleJsonCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Cycle} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Single cycle details
     * Gets details of a single cycle
     * @param {String} product Product URL as per the canonical URL on the endofife.date website
     * @param {String} cycle Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD's releng/14.0 becomes releng-14.0.
     * @param {module:api/DefaultApi~getApiProductCycleJsonCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Cycle}
     */
    getApiProductCycleJson(product, cycle, callback) {
      let postBody = null;
      // verify the required parameter 'product' is set
      if (product === undefined || product === null) {
        throw new Error("Missing the required parameter 'product' when calling getApiProductCycleJson");
      }
      // verify the required parameter 'cycle' is set
      if (cycle === undefined || cycle === null) {
        throw new Error("Missing the required parameter 'cycle' when calling getApiProductCycleJson");
      }

      let pathParams = {
        'product': product,
        'cycle': cycle
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = Cycle;
      return this.apiClient.callApi(
        '/api/{product}/{cycle}.json', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getApiProductJson operation.
     * @callback module:api/DefaultApi~getApiProductJsonCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/Cycle>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get All Details
     * Get EoL dates of all cycles of a given product.
     * @param {String} product Product URL as per the canonical URL on the endofife.date website
     * @param {module:api/DefaultApi~getApiProductJsonCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/Cycle>}
     */
    getApiProductJson(product, callback) {
      let postBody = null;
      // verify the required parameter 'product' is set
      if (product === undefined || product === null) {
        throw new Error("Missing the required parameter 'product' when calling getApiProductJson");
      }

      let pathParams = {
        'product': product
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = [Cycle];
      return this.apiClient.callApi(
        '/api/{product}.json', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
