# REST-Simple-ManageTask API program
NO UI - REST Support Only <br/>

#This is simple spring-boot application created to manage task list. In this application CURD operations will be performed on task list.<br/>

#A Code of this application is uploaded on https://43725588@stash.hk.hsbc/scm/managetask/managetask_rest.git <br/>





# How to build :<br/>
#Clone/Download this application and execute 'mvn package' <br/>
#Once project build successfully messages-0.0.1-SNAPSHOT.jar will be created along with target folder <br/>

# How to run jar file :<br/>
java -jar messages-0.0.1-SNAPSHOT.jar

#Above command will help to start application using messages-0.0.1-SNAPSHOT.jar <br/>
#Once you see application is started successfully, Application is ready to use <br/>

#Below are the 2 ways we can run application
# 1) Postman and 2) CRUL commands

#Basic check if GET method is working on not
#Open any browser and hit below link, to see all listed tasks
http://localhost:8888/api/1.0/message

## Testing through CURL

## Create A Resource:<br/>
curl -d "{\"id\":1,\"message\":\"Create Jira Ticket\"}" -H "Content-Type: application/json" -X POST http://localhost:8888/api/1.0/message

## Read All Resources:<br/>
curl http://localhost:8888/api/1.0/message

## Read Resource for the given ID: <br/>
curl http://localhost:8888/api/1.0/message/1

## Update Resource for the given ID: <br/>
curl -d "{\"id\":2,\"message\":\"Mark All Open Items close\"}" -H "Content-Type: application/json" -X PUT http://localhost:8888/api/1.0/message

## Delete the Resource ID: <br/>
curl -X DELETE http://localhost:8888/api/1.0/message/2


# Test through POSTMAN

#Launch POSTMAN and try with below CURD operations

## To get complete list of tasks
Set operation to "GET"  and URL  : http://localhost:8888/api/1.0/message

## To get specific task, use ID in URL
Set operations to "GET" and URL  : http://localhost:8888/api/1.0/message/3

## To Create new task 
Set Operations to POST and URL : http://localhost:8888/api/1.0/message/ and  BODY:{"id":1,"message":"Create Jira Ticket"}

## To update existing task
 Set Operations to "PUT" , URL : http://localhost:8888/api/1.0/message/ and BODY : {"id":2,"message":"Mark All Open Items close"}

 ## TO delete existing task 
Set Operations to "DELETE", URL : http://localhost:8888/api/1.0/message/3
#3rd record will get deleted
