# REST-Simple-Messages
##Create A Resource:
curl -d "{\"id\":1,\"message\":\"Prashant\"}" -H "Content-Type: application/json" -X POST http://localhost:8888/api/1.0/message

##Read All Resources:
curl http://localhost:8888/api/1.0/message

##Read Resource for the given ID:
curl http://localhost:8888/api/1.0/message/1

##Update Resource for the give ID:
curl -d "{\"id\":2,\"message\":\"Japan\"}" -H "Content-Type: application/json" -X PUT http://localhost:8888/api/1.0/message

##Delete the Resource ID:
curl -X DELETE http://localhost:8888/api/1.0/message/9


The Application is deployed at - NO UI - REST Support Only
https://rest-simple-message.herokuapp.com/api/1.0/message/0
