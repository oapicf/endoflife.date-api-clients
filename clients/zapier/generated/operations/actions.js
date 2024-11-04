const DefaultApi = require('../apis/DefaultApi');
const { triggerMiddleware, isTrigger, searchMiddleware, hasSearchRequisites, isSearchAction, isCreateAction } = require('../utils/utils');

const actions = {
    [DefaultApi.getApiAll.json.key]: DefaultApi.getApiAll.json,
    [DefaultApi.getApiProduct.json.key]: DefaultApi.getApiProduct.json,
    [DefaultApi.getApiProductCycle.json.key]: DefaultApi.getApiProductCycle.json,
}

module.exports = {
    searchActions: () => Object.entries(actions).reduce((actions, [key, value]) => isSearchAction(key) && hasSearchRequisites(value) ? {...actions, [key]: searchMiddleware(value)} : actions, {}),
    createActions: () => Object.entries(actions).reduce((actions, [key, value]) => isCreateAction(key) ? {...actions, [key]: value} : actions, {}),
    triggers: () => Object.entries(actions).reduce((actions, [key, value]) => isTrigger(key) ? {...actions, [key]: triggerMiddleware(value)} : actions, {}),
}
