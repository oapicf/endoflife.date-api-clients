const assert = require('assert');
var EndoflifeDate = require('endoflife-date');

describe('getApi', function() {

  // Commented out for now due to issue

  describe('getApiAllJson', function() {
    it('should respond without error', function(done) {
      var callback = function(error, data, response) {
        if (error) {
          console.error(error);
        } else {
          assert.equal(error, undefined);
          assert.equal(typeof data, 'object');
          // console.dir(data);
          assert.equal(Array.isArray(data), true);
          assert.equal(data.includes('nodejs'), true);
          assert.equal(data.includes('python'), true);
          assert.equal(data.includes('ruby'), true);
          assert.equal(response.res.statusCode, 200);
        }
        done(error);
      };
      const api = new EndoflifeDate.DefaultApi();
      api.getApiAllJson(callback);
    });
  });

  describe('getApiProductCycleJson', function() {
    it('should respond without error', function(done) {
      done();
      // Disabled due to https://github.com/oapicf/endoflife.date-api-clients/issues/1
      // var callback = function(error, data, response) {
      //   if (error) {
      //     console.error(error);
      //   } else {
      //     assert.equal(error, undefined);
      //     assert.equal(typeof data, 'object');
      //     console.dir(data);
      //     assert.equal(data.eol, '2028-10-31');
      //     assert.equal(response.res.statusCode, 200);
      //   }
      //   done(error);
      // };
      // const api = new EndoflifeDate.DefaultApi();
      // api.getApiProductCycleJson('python', '3.12', callback);
    });
  });

  describe('getApiProductJson', function() {
    it('should respond without error', function(done) {
      done();
      // Disabled due to https://github.com/oapicf/endoflife.date-api-clients/issues/1
      // var callback = function(error, data, response) {
      //   if (error) {
      //     console.error(error);
      //     done(error);
      //   } else {
      //     assert.equal(error, undefined);
      //     assert.equal(typeof data, 'object');
      //     console.dir(data);
      //     assert.equal(Array.isArray(data.cycles), true);
      //     let found = false;
      //     for (let i = 0; i < data.cycles.length; i++) {
      //       if (data.cycles[i].cycle === '3.12') {
      //         found = true;
      //         break;
      //       }
      //     }
      //     assert.equal(found, true);
      //     assert.equal(response.res.statusCode, 200);
      //   }
      //   done(error);
      // };
      // const api = new EndoflifeDate.DefaultApi();
      // api.getApiProductJson('python', callback);
    });
  });

});