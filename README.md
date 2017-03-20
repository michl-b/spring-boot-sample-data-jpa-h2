# spring-boot-sample-data-jpa-h2
Demo project for Spring Boot with JPA and persisting H2 database

## Requirements
- Java 8

## Includes
- Spring Boot 1.3.3
  - spring-boot-starter-web: basic web starter
  - spring-boot-starter-thymeleaf: for templating
  - spring-boot-starter-data-jpa: JPA witth Hibernate for DB communication
  - com.h2database:h2: H2 DB connector
- Bootstrap 3.3.6
- JQuery 1.11.3

## Important properties
application.properties
```properties
# JDBC Url to use H2 DB File for persisting
spring.datasource.url:jdbc:h2:./database/samspledb;AUTO_SERVER=TRUE

# Use H2 DB Driver
spring.datasource.driverClassName:org.h2.Driver

# Disable Thymeleaf cache for development
spring.thymeleaf.cache=false
```


## concourse
fly -t example login -c http://localhost:8080

fly -t example set-pipeline --pipeline spring-boot-sample-data-jpa-h2 --config concourse-pipeline.yml   
