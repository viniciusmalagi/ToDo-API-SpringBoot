# TODO App API using Spring Boot

This is an API for a TODO list application created using the Spring Boot framework. The API allows users to manage their tasks by adding, updating, and deleting items from the task list.

## Technologies Used

- Spring Boot
- Spring MVC
- Spring Data JPA
- SpringDoc OpenAPI 3
- MySQL

## Practices Adopted

Several software development practices were followed during the development of this API to improve code quality, maintainability, and scalability.

- **SOLID**: SOLID principles were followed to create more modular and flexible code, making it easier to maintain and evolve the system.

- **DRY (Don't Repeat Yourself)**: Code duplication was avoided, promoting code reuse and efficient code organization.

- **YAGNI (You Aren't Gonna Need It)**: Non-essential features and functionalities were not implemented, keeping the code lean and focused on current needs.

- **KISS (Keep It Simple, Stupid)**: Simplicity was prioritized when designing and implementing the API, keeping it easy to understand and maintain.

- **RESTful API**: The API follows RESTful API design principles and best practices, making it intuitive for developers who want to consume it.

- **Queries with Spring Data JPA**: Spring Data JPA queries were used to interact with the database efficiently and elegantly.

- **Dependency Injection**: Spring Boot manages dependency injection, allowing for more decoupled and testable code.

- **Error Response Handling**: Mechanisms for error handling were implemented, providing clear and meaningful responses in case of failures.

- **Automatic Swagger Documentation with OpenAPI 3**: API documentation is automatically generated using SpringDoc OpenAPI 3, making it easy to understand and use the API.

## Database Configuration

This API uses MySQL as the database. Make sure to configure the database access credentials in the `application.properties` or `application.yml` file.

Example configuration in `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/todolist
spring.datasource.username=your_username
spring.datasource.password=your_password
```



## API Documentation

The API documentation is automatically generated and can be accessed at `/swagger-ui.html` after starting the application.


---

*Remember to keep this README file up to date as the project evolves.*