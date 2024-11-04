import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration} from '../configuration'

import { Cycle } from '../models/Cycle';
import { CycleCycle } from '../models/CycleCycle';
import { CycleDiscontinued } from '../models/CycleDiscontinued';
import { CycleEol } from '../models/CycleEol';
import { CycleLts } from '../models/CycleLts';
import { CycleSupport } from '../models/CycleSupport';
import { ObservableDefaultApi } from './ObservableAPI';

import { DefaultApiRequestFactory, DefaultApiResponseProcessor} from "../apis/DefaultApi";
export class PromiseDefaultApi {
    private api: ObservableDefaultApi

    public constructor(
        configuration: Configuration,
        requestFactory?: DefaultApiRequestFactory,
        responseProcessor?: DefaultApiResponseProcessor
    ) {
        this.api = new ObservableDefaultApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Return a list of all products. Each of these can be used for the other API endpoints.
     * All Products
     */
    public getApiAllJsonWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Array<string>>> {
        const result = this.api.getApiAllJsonWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Return a list of all products. Each of these can be used for the other API endpoints.
     * All Products
     */
    public getApiAllJson(_options?: Configuration): Promise<Array<string>> {
        const result = this.api.getApiAllJson(_options);
        return result.toPromise();
    }

    /**
     * Gets details of a single cycle
     * Single cycle details
     * @param product Product URL as per the canonical URL on the endofife.date website
     * @param cycle Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD\&#39;s releng/14.0 becomes releng-14.0.
     */
    public getApiProductCycleJsonWithHttpInfo(product: string, cycle: string, _options?: Configuration): Promise<HttpInfo<Cycle>> {
        const result = this.api.getApiProductCycleJsonWithHttpInfo(product, cycle, _options);
        return result.toPromise();
    }

    /**
     * Gets details of a single cycle
     * Single cycle details
     * @param product Product URL as per the canonical URL on the endofife.date website
     * @param cycle Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD\&#39;s releng/14.0 becomes releng-14.0.
     */
    public getApiProductCycleJson(product: string, cycle: string, _options?: Configuration): Promise<Cycle> {
        const result = this.api.getApiProductCycleJson(product, cycle, _options);
        return result.toPromise();
    }

    /**
     * Get EoL dates of all cycles of a given product.
     * Get All Details
     * @param product Product URL as per the canonical URL on the endofife.date website
     */
    public getApiProductJsonWithHttpInfo(product: string, _options?: Configuration): Promise<HttpInfo<Array<Cycle>>> {
        const result = this.api.getApiProductJsonWithHttpInfo(product, _options);
        return result.toPromise();
    }

    /**
     * Get EoL dates of all cycles of a given product.
     * Get All Details
     * @param product Product URL as per the canonical URL on the endofife.date website
     */
    public getApiProductJson(product: string, _options?: Configuration): Promise<Array<Cycle>> {
        const result = this.api.getApiProductJson(product, _options);
        return result.toPromise();
    }


}



