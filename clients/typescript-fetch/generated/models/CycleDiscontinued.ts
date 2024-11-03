/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
/**
 * Whether this cycle is now discontinued.
 * @export
 * @interface CycleDiscontinued
 */
export interface CycleDiscontinued {
}

/**
 * Check if a given object implements the CycleDiscontinued interface.
 */
export function instanceOfCycleDiscontinued(value: object): value is CycleDiscontinued {
    return true;
}

export function CycleDiscontinuedFromJSON(json: any): CycleDiscontinued {
    return CycleDiscontinuedFromJSONTyped(json, false);
}

export function CycleDiscontinuedFromJSONTyped(json: any, ignoreDiscriminator: boolean): CycleDiscontinued {
    return json;
}

export function CycleDiscontinuedToJSON(value?: CycleDiscontinued | null): any {
    return value;
}

