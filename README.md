Employee Management REST API
Overview

This project provides a simple REST API built with Spring Boot for managing employee records. It supports basic CRUD operations: creating, reading, updating, and deleting employee information.
Technologies Used

    Java 23
    Spring Boot 2.x
    Spring Data JPA
    SQL Database (in-memory)
    Maven

Prerequisites

    JDK 17 or later
    Maven

Getting Started
1. Clone the Repository

bash

git clone https://github.com/theprajwalm/employeeManagementAPI.git

2. Build the Project

Use Maven to build the project:

bash

mvn clean install

3. Run the Application

You can run the application using the following command:

bash

mvn spring-boot:run

The API will be available at http://localhost:8080.
API Endpoints
Create Employee

    POST /employees
    Request Body: JSON object representing an employee (e.g., { "name": "John Doe", "position": "Developer" })
    Response: Created employee object with ID.

Get All Employees

    GET /employees
    Response: List of all employee objects.

Get Employee by ID

    GET /employees/{id}
    Response: Employee object with the specified ID.

Update Employee

    PUT /employees/{id}
    Request Body: Updated employee JSON object.
    Response: Updated employee object.

Delete Employee

    DELETE /employees/{id}
    Response: No content (204) if successful.

Database

This API uses an MySQL database for quick setup. You can view the database using the SQL console at http://localhost:8080.
Application Properties

You can configure the database in src/main/resources/application.properties:

properties

spring.application.name=demo

#db
spring.datasource.url=jdbc:mysql://127.0.0.1:3306/employee_directory
spring.datasource.password=springstudent
spring.datasource.username=springstudent

Testing

You can test the API using tools like Postman or cURL.
License

This project is licensed under the MIT License.

Author
Prajwal Mishra
