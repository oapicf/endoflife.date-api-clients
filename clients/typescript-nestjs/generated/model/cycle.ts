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
import { CycleLts } from './cycleLts';
import { CycleDiscontinued } from './cycleDiscontinued';
import { CycleSupport } from './cycleSupport';
import { CycleCycle } from './cycleCycle';
import { CycleEol } from './cycleEol';


/**
 * Details of a single release cycle of a given product. There might be some slight variations to this depending on the product.
 */
export interface Cycle { 
    cycle?: CycleCycle;
    /**
     * Release Date for the first release in this cycle
     */
    releaseDate?: string;
    eol?: CycleEol;
    /**
     * Latest release in this cycle
     */
    latest?: string;
    /**
     * Link to changelog for the latest release, if available
     */
    link?: string | null;
    lts?: CycleLts;
    support?: CycleSupport;
    discontinued?: CycleDiscontinued;
}
