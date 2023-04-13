var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/', function(req, res) {
  //console.log("loginUser : "+JSON.stringify(req.session.loginUser));
  res.render('index', { title: 'Express', loginUser:req.session.loginUser });
});

module.exports = router;
