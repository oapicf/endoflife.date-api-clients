/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* All Products
* Return a list of all products. Each of these can be used for the other API endpoints.
*
* returns oas_any_type_not_mapped
* */
const getApiAll.json = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get All Details
* Get EoL dates of all cycles of a given product.
*
* product oas_any_type_not_mapped Product URL as per the canonical URL on the endofife.date website
* returns oas_any_type_not_mapped
* */
const getApiProduct.json = ({ product }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        product,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Single cycle details
* Gets details of a single cycle
*
* product oas_any_type_not_mapped Product URL as per the canonical URL on the endofife.date website
* cycle oas_any_type_not_mapped Release Cycle for which the details must be fetched
* returns cycle
* */
const getApiProductCycle.json = ({ product, cycle }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        product,
        cycle,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  getApiAll.json,
  getApiProduct.json,
  getApiProductCycle.json,
};
