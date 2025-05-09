/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* All Products
* Return a list of all products. Each of these can be used for the other API endpoints.
*
* returns List
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
* product String Product URL as per the canonical URL on the endofife.date website.
* returns List
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
* Gets details of a single cycle.
*
* product String Product URL as per the canonical URL on the endofife.date website.
* cycle String Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD's releng/14.0 becomes releng-14.0.
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
