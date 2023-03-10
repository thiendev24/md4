// const require = createRequire(import.meta.url);

const https = require('https');

https.get('https://vapi.vnappmob.com/api/province/', (resp) => {
  let data = '';

  // A chunk of data has been received.
  resp.on('data', (chunk) => {
    data += chunk;
  });

  // The whole response has been received. Print out the result.
  resp.on('end', () => {
    console.log(JSON.parse(data).explanation);
  });

}).on("error", (err) => {
  console.log("Error: " + err.message);
});

module.exports.callApi = callExternalApiUsingHttp;