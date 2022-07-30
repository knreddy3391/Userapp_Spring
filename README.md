# UsersApp

This is a Demo Spring boot app which has a two endpoints 
`/GetUsers` 

- Used to Fetch all the users from the LocalDb

`/AddUser`
- Add a user to Local Db

**Note** This is localdb the data will be stored in the session once a restart is happened the Db will lose the data

## Dockerfile

I am using a jar file which will be created once the maven build happens . we can generate using maven goals `mvn clean package` 

Copying the jar to container and run on port 9090 
