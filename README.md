# Read Me First
Pollinate Prime example demonstrates and calculates the list of prime number that are present between the number provided.

# Getting Started
You can clone this public repo for using git clone.

## Running the application.
* After cloning please move to Pollinate folder.
* Do mvn clean install to install the maven dependencies
* mvn spring-boot:run to run the application.
* The service would be running by default at port 8080.
* Url to test - it only supports GET method. localhost:8080/primes/10

## Running via docker image.


## Using postman collection
* Postman collection has been kept in Pollinate folder which can be imported to test the application
* A request with name 'Get Primes ' has been added to this collection. It has two requests: 1. Get Primes - JSON 2. Get Primes - XML.

## Logs
* application logs can be accessed inside application logs folder. File name primeslogs has been created.
