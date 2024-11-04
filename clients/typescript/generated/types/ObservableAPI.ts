import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration} from '../configuration'
import { Observable, of, from } from '../rxjsStub';
import {mergeMap, map} from  '../rxjsStub';
import { Cycle } from '../models/Cycle';
import { CycleCycle } from '../models/CycleCycle';
import { CycleDiscontinued } from '../models/CycleDiscontinued';
import { CycleEol } from '../models/CycleEol';
import { CycleLts } from '../models/CycleLts';
import { CycleSupport } from '../models/CycleSupport';

import { DefaultApiRequestFactory, DefaultApiResponseProcessor} from "../apis/DefaultApi";
export class ObservableDefaultApi {
    private requestFactory: DefaultApiRequestFactory;
    private responseProcessor: DefaultApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: DefaultApiRequestFactory,
        responseProcessor?: DefaultApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new DefaultApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new DefaultApiResponseProcessor();
    }

    /**
     * Return a list of all products. Each of these can be used for the other API endpoints.
     * All Products
     */
    public getApiAllJsonWithHttpInfo(_options?: Configuration): Observable<HttpInfo<Array<string>>> {
        const requestContextPromise = this.requestFactory.getApiAllJson(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getApiAllJsonWithHttpInfo(rsp)));
            }));
    }

    /**
     * Return a list of all products. Each of these can be used for the other API endpoints.
     * All Products
     */
    public getApiAllJson(_options?: Configuration): Observable<Array<string>> {
        return this.getApiAllJsonWithHttpInfo(_options).pipe(map((apiResponse: HttpInfo<Array<string>>) => apiResponse.data));
    }

    /**
     * Gets details of a single cycle
     * Single cycle details
     * @param product Product URL as per the canonical URL on the endofife.date website
     * @param cycle Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD\&#39;s releng/14.0 becomes releng-14.0.
     */
    public getApiProductCycleJsonWithHttpInfo(product: string, cycle: string, _options?: Configuration): Observable<HttpInfo<Cycle>> {
        const requestContextPromise = this.requestFactory.getApiProductCycleJson(product, cycle, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getApiProductCycleJsonWithHttpInfo(rsp)));
            }));
    }

    /**
     * Gets details of a single cycle
     * Single cycle details
     * @param product Product URL as per the canonical URL on the endofife.date website
     * @param cycle Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD\&#39;s releng/14.0 becomes releng-14.0.
     */
    public getApiProductCycleJson(product: string, cycle: string, _options?: Configuration): Observable<Cycle> {
        return this.getApiProductCycleJsonWithHttpInfo(product, cycle, _options).pipe(map((apiResponse: HttpInfo<Cycle>) => apiResponse.data));
    }

    /**
     * Get EoL dates of all cycles of a given product.
     * Get All Details
     * @param product Product URL as per the canonical URL on the endofife.date website
     */
    public getApiProductJsonWithHttpInfo(product: string, _options?: Configuration): Observable<HttpInfo<Array<Cycle>>> {
        const requestContextPromise = this.requestFactory.getApiProductJson(product, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getApiProductJsonWithHttpInfo(rsp)));
            }));
    }

    /**
     * Get EoL dates of all cycles of a given product.
     * Get All Details
     * @param product Product URL as per the canonical URL on the endofife.date website
     */
    public getApiProductJson(product: string, _options?: Configuration): Observable<Array<Cycle>> {
        return this.getApiProductJsonWithHttpInfo(product, _options).pipe(map((apiResponse: HttpInfo<Array<Cycle>>) => apiResponse.data));
    }

}
