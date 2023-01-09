# Read Me First
Pollinate Prime example demonstrates and calculates the list of prime number that are present between the number provided.

# Getting Started
You can clone this public repo for using git clone.

## System Requirement
* Maven
* JDK 11 or above
* Docker
* Git

## Running the application.
* After cloning please move to **Pollinate** folder.
* Run `mvn clean install` to install the maven dependencies
* Run `mvn spring-boot:run` to run the application.
* The service would be running by default at port 8080.
* Url to test - it only supports GET method. `localhost:8080/primes/10`

## Running via docker image.
* A docker image has been published publically to dockerhub.
* you need a local docker daemon running and then pull the image
* Use command: `docker pull ateev99/primes:production`
* Once image is pulled then you can run a container using
`docker container run -it -d --name primesrvscntr -p 8080:8080 ateev99/primes:production`
* Application would be up and running on localhost:8080/primes/10


## Using postman collection
* Postman collection has been kept in Pollinate folder which can be imported to test the application
* A request with name `Get Primes` has been added to this collection. It has two requests: 1. Get Primes - JSON 2. Get Primes - XML.

## Logs
* application logs can be accessed inside `applicationLogs` folder. File name primeslogs has been created.
