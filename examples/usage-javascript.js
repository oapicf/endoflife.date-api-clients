var EndoflifeDate = require('endoflife-date');

var api = new EndoflifeDate.DefaultApi();
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
    process.exitCode = 1;
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
api.getApiAllJson(callback);
