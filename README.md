# Spring Boot BDD Demo

This project demonstrates a simple Spring Boot application tested with Cucumber BDD.

## Endpoints

- `GET /hello` – returns `Hello World`
- `GET /greet/{name}` – returns `Hello {name}`
- `GET /status` – returns `OK`

Each endpoint prints a message to the console when it is invoked.

## Build and Run

```bash
mvn spring-boot:run
```

## Run Tests

```bash
mvn test
```
