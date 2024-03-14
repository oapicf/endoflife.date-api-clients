const utils = require('../utils/utils');
const cycle_cycle = require('../models/cycle_cycle');
const cycle_discontinued = require('../models/cycle_discontinued');
const cycle_eol = require('../models/cycle_eol');
const cycle_lts = require('../models/cycle_lts');
const cycle_support = require('../models/cycle_support');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...cycle_cycle.fields(`${keyPrefix}cycle`, isInput),
            {
                key: `${keyPrefix}releaseDate`,
                label: `Release Date for the first release in this cycle - [${labelPrefix}releaseDate]`,
                type: 'string',
            },
            ...cycle_eol.fields(`${keyPrefix}eol`, isInput),
            {
                key: `${keyPrefix}latest`,
                label: `Latest release in this cycle - [${labelPrefix}latest]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}link`,
                label: `Link to changelog for the latest release, if available - [${labelPrefix}link]`,
                type: 'string',
            },
            ...cycle_lts.fields(`${keyPrefix}lts`, isInput),
            ...cycle_support.fields(`${keyPrefix}support`, isInput),
            ...cycle_discontinued.fields(`${keyPrefix}discontinued`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cycle': utils.removeIfEmpty(cycle_cycle.mapping(bundle, `${keyPrefix}cycle`)),
            'releaseDate': bundle.inputData?.[`${keyPrefix}releaseDate`],
            'eol': utils.removeIfEmpty(cycle_eol.mapping(bundle, `${keyPrefix}eol`)),
            'latest': bundle.inputData?.[`${keyPrefix}latest`],
            'link': bundle.inputData?.[`${keyPrefix}link`],
            'lts': utils.removeIfEmpty(cycle_lts.mapping(bundle, `${keyPrefix}lts`)),
            'support': utils.removeIfEmpty(cycle_support.mapping(bundle, `${keyPrefix}support`)),
            'discontinued': utils.removeIfEmpty(cycle_discontinued.mapping(bundle, `${keyPrefix}discontinued`)),
        }
    },
}
