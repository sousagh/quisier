var express = require('express')
var router = express.Router()

/*
    URL: http://localhost:8081/user/create

    body:

CASE 1:
    request:
{
	"firstName": "John",
	"lastName": "Doe",
	"email": "sousagh@gmail.com",
	"type": "STUDENT",
	"password": "mypass"
}
    response:
{
  "success": false,
  "message": "User with email sousagh@gmail.com already exists"
}
-----------------------------------------------------
CASE 2:
    request:
{
	"firstName": "John",
	"lastName": "Doe",
	"email": "joedoe@gmail.com",
	"type": "STUDENT",
	"password": "mypass"
}
    response:
{
  "success": true,
  "data": {
    "firstName": "John",
    "lastName": "Doe",
    "email": "souasdsagh@gmail.com",
    "type": "STUDENT",
    "password": "mypass"
  }
}

*/
router.post('/create', function (req, res) {
    
    let userData = req.body
    let myResponse
    
    if(userData.email == 'sousagh@gmail.com'){
        myResponse = {
            success: false,
            message: 'User with email sousagh@gmail.com already exists'
        }
    } else {
        myResponse = {
            success: true,
            data: req.body
        }
    }
    res.send(myResponse);
})

module.exports = router