/**
 * endoflife.date
 * Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki).
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The CycleDiscontinued model module.
 * @module model/CycleDiscontinued
 * @version 0.0.1
 */
class CycleDiscontinued {

    

    /**
     * Constructs a new <code>CycleDiscontinued</code>.
     * Whether this device version is no longer in production.
     * @alias module:model/CycleDiscontinued
     */
    constructor() { 
        
        CycleDiscontinued.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CycleDiscontinued</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CycleDiscontinued} obj Optional instance to populate.
     * @return {module:model/CycleDiscontinued} The populated <code>CycleDiscontinued</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CycleDiscontinued();

        }
        return obj;
    }
}



export default CycleDiscontinued;

