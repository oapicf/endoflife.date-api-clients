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
 * Whether this release cycle has long-term-support (LTS). Can be a date instead in YYYY-MM-DD format as well if the release enters LTS status on a given date.
 * 
 * @export
 * @interface CycleLts
 */
export interface CycleLts {
}

/**
 * Check if a given object implements the CycleLts interface.
 */
export function instanceOfCycleLts(value: object): boolean {
    return true;
}

export function CycleLtsFromJSON(json: any): CycleLts {
    return CycleLtsFromJSONTyped(json, false);
}

export function CycleLtsFromJSONTyped(json: any, ignoreDiscriminator: boolean): CycleLts {
    return json;
}

export function CycleLtsToJSON(value?: CycleLts | null): any {
    return value;
}

