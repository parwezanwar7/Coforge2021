var httpdemo = require("http");//dependencies

httpdemo.createServer(function (request, response) {
   // Send the HTTP header 
   // HTTP Status: 200 : OK
   // Content Type: text/plain
   response.writeHead(200, {'Content-Type': 'text/plain'});
   
   // Send the response body as "Hello World"
   response.end('Hello World...raju\n');
   console.log("**********"+response)
}).listen(1000);

// Console will print the message
console.log('Server running at http://localhost:1000/');