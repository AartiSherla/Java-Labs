/*
To Create   user management system CRUD RESTFul API using Spring Boot, Hibernate, JPA, Maven, and MySQL database . 
*/
package com.companyname.springbootcrudrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

// Annotating the class with @SpringBootApplication to enable Spring Boot features
@SpringBootApplication
// Enabling JPA Auditing for automatically populating created_at and updated_at fields
@EnableJpaAuditing
public class SpringBootCrudRestApplication {

    // Main method to start the Spring Boot application
    public static void main(String[] args) {
        SpringApplication.run(SpringBootCrudRestApplication.class, args);
    }
}
