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
/* tslint:disable:no-unused-variable member-ordering */

import { Observable } from 'rxjs/Observable';

import { map } from 'rxjs/operators';
import IHttpClient from '../IHttpClient';
import { inject, injectable } from 'inversify';
import { IAPIConfiguration } from '../IAPIConfiguration';
import { Headers } from '../Headers';
import HttpResponse from '../HttpResponse';

import { Cycle } from '../model/cycle';

import { COLLECTION_FORMATS }  from '../variables';



@injectable()
export class DefaultService {
    private basePath: string = 'https://endoflife.date';

    constructor(@inject('IApiHttpClient') private httpClient: IHttpClient,
        @inject('IAPIConfiguration') private APIConfiguration: IAPIConfiguration ) {
        if(this.APIConfiguration.basePath)
            this.basePath = this.APIConfiguration.basePath;
    }

    /**
     * All Products
     * Return a list of all products. Each of these can be used for the other API endpoints.
     
     */
    public getApiAllJson(observe?: 'body', headers?: Headers): Observable<Array<string>>;
    public getApiAllJson(observe?: 'response', headers?: Headers): Observable<HttpResponse<Array<string>>>;
    public getApiAllJson(observe: any = 'body', headers: Headers = {}): Observable<any> {
        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<Array<string>>> = this.httpClient.get(`${this.basePath}/api/all.json`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <Array<string>>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * Single cycle details
     * Gets details of a single cycle
     * @param product Product URL as per the canonical URL on the endofife.date website
     * @param cycle Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD\&#39;s releng/14.0 becomes releng-14.0.
     
     */
    public getApiProductCycleJson(product: string, cycle: string, observe?: 'body', headers?: Headers): Observable<Cycle>;
    public getApiProductCycleJson(product: string, cycle: string, observe?: 'response', headers?: Headers): Observable<HttpResponse<Cycle>>;
    public getApiProductCycleJson(product: string, cycle: string, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (product === null || product === undefined){
            throw new Error('Required parameter product was null or undefined when calling getApiProductCycleJson.');
        }

        if (cycle === null || cycle === undefined){
            throw new Error('Required parameter cycle was null or undefined when calling getApiProductCycleJson.');
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<Cycle>> = this.httpClient.get(`${this.basePath}/api/${encodeURIComponent(String(product))}/${encodeURIComponent(String(cycle))}.json`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <Cycle>(httpResponse.response))
               );
        }
        return response;
    }


    /**
     * Get All Details
     * Get EoL dates of all cycles of a given product.
     * @param product Product URL as per the canonical URL on the endofife.date website
     
     */
    public getApiProductJson(product: string, observe?: 'body', headers?: Headers): Observable<Array<Cycle>>;
    public getApiProductJson(product: string, observe?: 'response', headers?: Headers): Observable<HttpResponse<Array<Cycle>>>;
    public getApiProductJson(product: string, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (product === null || product === undefined){
            throw new Error('Required parameter product was null or undefined when calling getApiProductJson.');
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<Array<Cycle>>> = this.httpClient.get(`${this.basePath}/api/${encodeURIComponent(String(product))}.json`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <Array<Cycle>>(httpResponse.response))
               );
        }
        return response;
    }

}
