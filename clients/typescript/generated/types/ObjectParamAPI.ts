import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration} from '../configuration'

import { Cycle } from '../models/Cycle';
import { CycleCycle } from '../models/CycleCycle';
import { CycleDiscontinued } from '../models/CycleDiscontinued';
import { CycleEol } from '../models/CycleEol';
import { CycleLts } from '../models/CycleLts';
import { CycleSupport } from '../models/CycleSupport';

import { ObservableDefaultApi } from "./ObservableAPI";
import { DefaultApiRequestFactory, DefaultApiResponseProcessor} from "../apis/DefaultApi";

export interface DefaultApiGetApiAllJsonRequest {
}

export interface DefaultApiGetApiProductCycleJsonRequest {
    /**
     * Product URL as per the canonical URL on the endofife.date website
     * @type string
     * @memberof DefaultApigetApiProductCycleJson
     */
    product: string
    /**
     * Release Cycle for which the details must be fetched
     * @type string
     * @memberof DefaultApigetApiProductCycleJson
     */
    cycle: string
}

export interface DefaultApiGetApiProductJsonRequest {
    /**
     * Product URL as per the canonical URL on the endofife.date website
     * @type string
     * @memberof DefaultApigetApiProductJson
     */
    product: string
}

export class ObjectDefaultApi {
    private api: ObservableDefaultApi

    public constructor(configuration: Configuration, requestFactory?: DefaultApiRequestFactory, responseProcessor?: DefaultApiResponseProcessor) {
        this.api = new ObservableDefaultApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Return a list of all products. Each of these can be used for the other API endpoints.
     * All Products
     * @param param the request object
     */
    public getApiAllJsonWithHttpInfo(param: DefaultApiGetApiAllJsonRequest = {}, options?: Configuration): Promise<HttpInfo<Array<string>>> {
        return this.api.getApiAllJsonWithHttpInfo( options).toPromise();
    }

    /**
     * Return a list of all products. Each of these can be used for the other API endpoints.
     * All Products
     * @param param the request object
     */
    public getApiAllJson(param: DefaultApiGetApiAllJsonRequest = {}, options?: Configuration): Promise<Array<string>> {
        return this.api.getApiAllJson( options).toPromise();
    }

    /**
     * Gets details of a single cycle
     * Single cycle details
     * @param param the request object
     */
    public getApiProductCycleJsonWithHttpInfo(param: DefaultApiGetApiProductCycleJsonRequest, options?: Configuration): Promise<HttpInfo<Cycle>> {
        return this.api.getApiProductCycleJsonWithHttpInfo(param.product, param.cycle,  options).toPromise();
    }

    /**
     * Gets details of a single cycle
     * Single cycle details
     * @param param the request object
     */
    public getApiProductCycleJson(param: DefaultApiGetApiProductCycleJsonRequest, options?: Configuration): Promise<Cycle> {
        return this.api.getApiProductCycleJson(param.product, param.cycle,  options).toPromise();
    }

    /**
     * Get EoL dates of all cycles of a given product.
     * Get All Details
     * @param param the request object
     */
    public getApiProductJsonWithHttpInfo(param: DefaultApiGetApiProductJsonRequest, options?: Configuration): Promise<HttpInfo<Array<Cycle>>> {
        return this.api.getApiProductJsonWithHttpInfo(param.product,  options).toPromise();
    }

    /**
     * Get EoL dates of all cycles of a given product.
     * Get All Details
     * @param param the request object
     */
    public getApiProductJson(param: DefaultApiGetApiProductJsonRequest, options?: Configuration): Promise<Array<Cycle>> {
        return this.api.getApiProductJson(param.product,  options).toPromise();
    }

}
