const assert = require('assert');
var EndoflifeDate = require('endoflife-date');

describe('getApi', function() {

  describe('getApiAllJson', function() {
    it('should respond with a large number of products', function(done) {
      var callback = function(error, data, response) {
        assert.equal(error, undefined);
        assert.equal(typeof data, 'object');
        assert.equal(Array.isArray(data), true);
        assert.equal(data.length > 50, true);
        assert.equal(response.res.statusCode, 200);
        done();
      };
      const api = new EndoflifeDate.DefaultApi();
      api.getApiAllJson(callback);
    });
  });

  describe('getApiProductCycleJson', function() {
    it('should respond with product cycle information', function(done) {
      var callback = function(error, data, response) {
        assert.equal(error, undefined);
        assert.equal(typeof data, 'object');
        assert.equal(data.constructor.name, 'Cycle');
        assert.equal(response.res.statusCode, 200);
        done();
      };
      const api = new EndoflifeDate.DefaultApi();
      api.getApiProductCycleJson('kubernetes', '1.28', callback);
    });
  });

  describe('getApiProductJson', function() {
    it('should respond with product cycle information', function(done) {
      var callback = function(error, data, response) {
        assert.equal(error, undefined);
        assert.equal(typeof data, 'object');
        assert.equal(Array.isArray(data), true);
        assert.equal(response.res.statusCode, 200);
        done();
      };
      const api = new EndoflifeDate.DefaultApi();
      api.getApiProductJson('kubernetes', callback);
    });
  });

});