# mongo-employee
CRUD Operations with Mongo DB

Steps to Create Mongo DB

```
1. docker pull mongo

2.docker run -d  --name mongo-on-docker  -p 27888:27017 -e MONGO_INITDB_ROOT_USERNAME=mongoadmin -e MONGO_INITDB_ROOT_PASSWORD=secret mongo

3.Create database using 'use employee_db'

```

```
1.Clean build using gradle wrapper '.\gradlew clean build'

2.Run the application and hit the end point

```
