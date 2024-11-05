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
import type { CycleLts } from './CycleLts';
import {
    CycleLtsFromJSON,
    CycleLtsFromJSONTyped,
    CycleLtsToJSON,
    CycleLtsToJSONTyped,
} from './CycleLts';
import type { CycleDiscontinued } from './CycleDiscontinued';
import {
    CycleDiscontinuedFromJSON,
    CycleDiscontinuedFromJSONTyped,
    CycleDiscontinuedToJSON,
    CycleDiscontinuedToJSONTyped,
} from './CycleDiscontinued';
import type { CycleSupport } from './CycleSupport';
import {
    CycleSupportFromJSON,
    CycleSupportFromJSONTyped,
    CycleSupportToJSON,
    CycleSupportToJSONTyped,
} from './CycleSupport';
import type { CycleCycle } from './CycleCycle';
import {
    CycleCycleFromJSON,
    CycleCycleFromJSONTyped,
    CycleCycleToJSON,
    CycleCycleToJSONTyped,
} from './CycleCycle';
import type { CycleEol } from './CycleEol';
import {
    CycleEolFromJSON,
    CycleEolFromJSONTyped,
    CycleEolToJSON,
    CycleEolToJSONTyped,
} from './CycleEol';

/**
 * Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
 * @export
 * @interface Cycle
 */
export interface Cycle {
    /**
     * 
     * @type {CycleCycle}
     * @memberof Cycle
     */
    cycle?: CycleCycle;
    /**
     * Release Date for the first release in this cycle
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
     * Latest release in this cycle
     * @type {string}
     * @memberof Cycle
     */
    latest?: string;
    /**
     * Link to changelog for the latest release, if available
     * @type {string}
     * @memberof Cycle
     */
    link?: string | null;
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
 * Check if a given object implements the Cycle interface.
 */
export function instanceOfCycle(value: object): value is Cycle {
    return true;
}

export function CycleFromJSON(json: any): Cycle {
    return CycleFromJSONTyped(json, false);
}

export function CycleFromJSONTyped(json: any, ignoreDiscriminator: boolean): Cycle {
    if (json == null) {
        return json;
    }
    return {
        
        'cycle': json['cycle'] == null ? undefined : CycleCycleFromJSON(json['cycle']),
        'releaseDate': json['releaseDate'] == null ? undefined : (new Date(json['releaseDate'])),
        'eol': json['eol'] == null ? undefined : CycleEolFromJSON(json['eol']),
        'latest': json['latest'] == null ? undefined : json['latest'],
        'link': json['link'] == null ? undefined : json['link'],
        'lts': json['lts'] == null ? undefined : CycleLtsFromJSON(json['lts']),
        'support': json['support'] == null ? undefined : CycleSupportFromJSON(json['support']),
        'discontinued': json['discontinued'] == null ? undefined : CycleDiscontinuedFromJSON(json['discontinued']),
    };
}

  export function CycleToJSON(json: any): Cycle {
      return CycleToJSONTyped(json, false);
  }

  export function CycleToJSONTyped(value?: Cycle | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'cycle': CycleCycleToJSON(value['cycle']),
        'releaseDate': value['releaseDate'] == null ? undefined : ((value['releaseDate']).toISOString().substring(0,10)),
        'eol': CycleEolToJSON(value['eol']),
        'latest': value['latest'],
        'link': value['link'],
        'lts': CycleLtsToJSON(value['lts']),
        'support': CycleSupportToJSON(value['support']),
        'discontinued': CycleDiscontinuedToJSON(value['discontinued']),
    };
}
