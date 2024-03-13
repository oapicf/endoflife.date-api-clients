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

import { autoinject } from 'aurelia-framework';
import { HttpClient } from 'aurelia-http-client';
import { Api } from './Api';
import { AuthStorage } from './AuthStorage';
import {
  Cycle,
} from './models';

/**
 * getApiAllJson - parameters interface
 */
export interface IGetApiAllJsonParams {
}

/**
 * getApiProductCycleJson - parameters interface
 */
export interface IGetApiProductCycleJsonParams {
  product: any;
  cycle: any;
}

/**
 * getApiProductJson - parameters interface
 */
export interface IGetApiProductJsonParams {
  product: any;
}

/**
 * DefaultApi - API class
 */
@autoinject()
export class DefaultApi extends Api {

  /**
   * Creates a new DefaultApi class.
   *
   * @param httpClient The Aurelia HTTP client to be injected.
   * @param authStorage A storage for authentication data.
   */
  constructor(httpClient: HttpClient, authStorage: AuthStorage) {
    super(httpClient, authStorage);
  }

  /**
   * All Products
   * Return a list of all products. Each of these can be used for the other API endpoints.
   */
  async getApiAllJson(): Promise<any> {
    // Verify required parameters are set

    // Create URL to call
    const url = `${this.basePath}/api/all.json`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Single cycle details
   * Gets details of a single cycle
   * @param params.product Product URL as per the canonical URL on the endofife.date website
   * @param params.cycle Release Cycle for which the details must be fetched
   */
  async getApiProductCycleJson(params: IGetApiProductCycleJsonParams): Promise<Cycle> {
    // Verify required parameters are set
    this.ensureParamIsSet('getApiProductCycleJson', params, 'product');
    this.ensureParamIsSet('getApiProductCycleJson', params, 'cycle');

    // Create URL to call
    const url = `${this.basePath}/api/{product}/{cycle}.json`
      .replace(`{${'product'}}`, encodeURIComponent(`${params['product']}`))
      .replace(`{${'cycle'}}`, encodeURIComponent(`${params['cycle']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Get All Details
   * Get EoL dates of all cycles of a given product.
   * @param params.product Product URL as per the canonical URL on the endofife.date website
   */
  async getApiProductJson(params: IGetApiProductJsonParams): Promise<any> {
    // Verify required parameters are set
    this.ensureParamIsSet('getApiProductJson', params, 'product');

    // Create URL to call
    const url = `${this.basePath}/api/{product}.json`
      .replace(`{${'product'}}`, encodeURIComponent(`${params['product']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

}

