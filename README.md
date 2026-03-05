# Spring Boot CRUD API

## Overview

This project is a simple RESTful API built using **Spring Boot**.
It demonstrates basic backend development concepts such as:

* REST API design
* Controller → Service → Repository architecture
* Database interaction with JPA / Hibernate
* CRUD operations

The API manages a list of products with fields such as name, price, and quantity.

---

## Technologies Used

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* Hibernate
* PostgreSQL
* Maven

---

## Project Structure

```
src
 └── main
     └── java
         └── com.taha.backend
             ├── controller
             ├── service
             ├── repository
             └── model
```

---

## API Endpoints

### Get All Products

GET /products

Response example:

```
[
  {
    "id": 1,
    "name": "Keyboard",
    "quantity": 10,
    "price": 25.5
  }
]
```

---

### Get Product By ID

GET /products/{id}

Example:

```
GET /products/1
```

---

### Create Product

POST /products

Request body:

```
{
  "name": "Mouse",
  "quantity": 5,
  "price": 15
}
```

---

### Update Product

PUT /products/{id}

Request body:

```
{
  "name": "Updated Mouse",
  "quantity": 7,
  "price": 18
}
```

---

### Delete Product

DELETE /products/{id}

Example:

```
DELETE /products/1
```

---

## How to Run the Project

1. Clone the repository

```
git clone https://github.com/tahaalrahal1994-bit/SpringBoot-CURD-API.git
```

2. Navigate to the project folder

```
cd SpringBoot-CURD-API
```

3. Run the application

```
./mvnw spring-boot:run
```

Or run the main class:

```
BackendApplication.java
```

---



Taha Alrahal
