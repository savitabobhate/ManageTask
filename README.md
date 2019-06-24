# REST-Simple-Messages - 
NO UI - REST Support Only <br/>

A Demo of this application is deployed at: 
https://rest-simple-message.herokuapp.com/api/1.0/message/0 <br/>

##Create A Resource:<br/>
How to build:<br/>
Clone/Download this application and execute 'mvn package'

##Create A Resource:<br/>
curl -d "{\"id\":1,\"message\":\"Prashant\"}" -H "Content-Type: application/json" -X POST http://localhost:8888/api/1.0/message

##Read All Resources:<br/>
curl http://localhost:8888/api/1.0/message

##Read Resource for the given ID: <br/>
curl http://localhost:8888/api/1.0/message/1

##Update Resource for the given ID: <br/>
curl -d "{\"id\":2,\"message\":\"Japan\"}" -H "Content-Type: application/json" -X PUT http://localhost:8888/api/1.0/message

##Delete the Resource ID: <br/>
curl -X DELETE http://localhost:8888/api/1.0/message/9
