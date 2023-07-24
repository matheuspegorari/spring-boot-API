# Voll.med Spring Boot REST API

## Overview

REST API developed in Spring Boot to be used in conjunction with the following frontend design shown in this Figma file: [Voll.med](https://www.figma.com/file/N4CgpJqsg7gjbKuDmra3EV/Voll.med?type=design&node-id=2-1007&mode=design).

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

- Java 17 or later
- Maven
- Spring Boot 3.1.2

### Installation

1. Clone the repository
    ```sh
    git clone https://github.com/matheuspegorari/spring-boot-API.git
    ```

2. Navigate to the project directory
    ```sh
    cd spring-boot-API
    ```

3. Build the project using Maven
    ```sh
    mvn clean install
    ```

4. Run the application
    ```sh
    mvn spring-boot:run
    ```

## API Endpoints

Here is a list of the API endpoints and their purposes. Please replace `{base_url}` with your server address (for local development, typically `http://localhost:8080/`).
- POST `{base_url}/medicos` - Creates a new register for doctors.
- GET `{base_url}/medicos` - Retrieve the list of all doctors, paginated by default.
- PUT `{base_url}/medicos` - Update a doctor by id.
- DELETE `{base_url}/medicos/{doc_id}` - Logical Delete a doctor from db by id.


## Built With

- [Java](https://www.java.com/) - Programming Language
- [Spring Boot](https://spring.io/projects/spring-boot) - Framework
- [Maven](https://maven.apache.org/) - Dependency Management
- [MySQL](https://www.mysql.com/) - Database
- [FlywayMigration](https://flywaydb.org/) - Schema Version Management

## License

This project is licensed under the MIT License.

_I want to thank Jetbrains for providing IntelliJ Idea Ultimate for free. (Student license)_

## Contact

Matheus Pegorari - [pegorari42@gmail.com](mailto:pegorari42@gmail.com)

Project Link: [https://github.com/matheuspegorari/spring-boot-API/](https://github.com/matheuspegorari/spring-boot-API/)

---
