
let http = require("http");

let servicesHostName = 'localhost'
let servicesPort = 8081
let jsonHeader = {'Content-Type': 'application/json' }

export const sendPost = (path, payload, onData, onError) =>{

var options = {
  hostname: servicesHostName,
  port: servicesPort,
  path: path,
  method: 'POST',
  headers: jsonHeader
}

var req = http.request(options, function(res) {
  console.log('Status: ' + res.statusCode)
  console.log('Headers: ' + JSON.stringify(res.headers))
  res.setEncoding('utf8')
  res.on('data', 
        function (body) {
            onData(JSON.parse(body))
        })
})
req.on('error', onError)

req.write(JSON.stringify(payload));
req.end();

}