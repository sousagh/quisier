var express = require('express')
var bodyParser = require('body-parser')

let app = express()
app.use(bodyParser.json())

app.use(function(req, res, next) {
  res.header("Access-Control-Allow-Origin", "*");
  res.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
  next();
});

var user = require('./routes/user')

app.get('/', function (req, res) {
  res.send('Hello World!')
})

app.use('/user', user)

app.listen(8081, function () {
  console.log('Stub app listening on port 8081!')
})