# Spring MongoDb Example
Spring Boot Mongo Db Example Application

In order to run mongo db I put a docker compose file in to the repository. First you should run `docker-compose -f docker-compose.yml up` command and be sure mongo db and mongo express running at `http://localhost:8081`

After that run `mvn clean package` command. When maven command finished, you can go to the terminal and run `target/java -jar spring-mongo-db-example-1.0.jar`. I also put postman collections for saving and listing operations. You can import spring-mongo-example.postman_collection.json file. In requests getAll,getById,getByName and save methods are exists. In application yml file contains configuration for connecting mongodb. The property of authentication-database is basic auth. However you have to configure basic auth for MongoDb. If you want to disable basic auth you can edit docker-compose.yml file and remove environment variables.

###### Contact
For any question
 
Mail : karadenizfaruk28@gmail.com

Linkedin :  https://www.linkedin.com/in/faruk-karadeniz/ 
