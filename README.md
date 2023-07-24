# Voll.med Spring Boot REST API

## Overview

This REST API was developed in Spring Boot to be used in conjunction with the frontend design shown in this Figma file: [Voll.med](https://www.figma.com/file/N4CgpJqsg7gjbKuDmra3EV/Voll.med?type=design&node-id=2-1007&mode=design).

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

## API Endpoints - WIP

Here is a list of the API endpoints and their purposes. Please replace `{base_url}` with your server address (for local development, typically `http://localhost:8080/`).
- POST `{base_url}/api/v1/medicos` - Creates a new register for doctors.
- _GET - WIP_
- _PUT - WIP_
- _DELETE - WIP_


## Testing

- WIP

## Built With

- [Spring Boot](https://spring.io/projects/spring-boot) - The framework used
- [Maven](https://maven.apache.org/) - Dependency Management
- [Java](https://www.java.com/) - The language used
- [MySQL](https://www.mysql.com/) - The database used
- [FlywayMigration](https://flywaydb.org/) - For schema version management

## License

This project is licensed under the MIT License

## Contact

Matheus Pegorari - pegorari42@gmail.com

Project Link: [https://github.com/matheuspegorari/spring-boot-API/](https://github.com/matheuspegorari/spring-boot-API/)

---
