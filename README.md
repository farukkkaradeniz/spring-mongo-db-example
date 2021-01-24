# Spring MongoDb Example
Spring boot Mongo Db Example Application

For running mongo db i'm put a docker compose file inside the repository. First you should run `docker-compose -f docker-compose.yml` command and be sure mongo db and mongo express running at `http://localhost:8081`

Then run `mvn clean package` command. After maven command finished you can go to the target folder and run `java -jar spring-mongo-db-example-1.0.jar`. I also put an postman collection for saving and listing operations. You can import spring-mongo-example.postman_collection.json file to postman application. In the collection getAll,getById,getByName and save methods exist. At application yml file contains configuration for connecting mongodb. The authentication-database is meaning for mongo db's basic auth. If you want to close basic auth you can edit docker-compose.yml file and remove environment variables.

###### Contact
For any question
 
Mail : karadenizfaruk28@gmail.com

Linkedin :  https://www.linkedin.com/in/faruk-karadeniz/ 
