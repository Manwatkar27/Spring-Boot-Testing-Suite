# 🧪 Spring Boot Testing Suite

![Java](https://img.shields.io/badge/Java-17%2B-orange) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen) ![MySQL](https://img.shields.io/badge/Database-MySQL-blue) ![Build](https://img.shields.io/badge/Build-Maven-red)

A comprehensive Spring Boot application designed to demonstrate **Unit Testing** best practices. This project implements a full CRUD REST API for managing a `Person` directory, featuring isolated unit tests for the **Service layer (using Mockito)** and integration tests for the **Repository layer (using H2/MySQL)**.

## 🚀 Technologies Used

* **Framework:** Spring Boot 3 🍃
* **Language:** Java 17 / 21 ☕
* **Database:** MySQL 🐬
* **ORM:** Spring Data JPA 🗄️
* **Testing:** JUnit 5 & Mockito 🦜
* **Tooling:** Lombok, Maven 🛠️

## 📂 Project Structure

```text
src/
├── main/
│   ├── java/com/aman/Spring_Boot_Testing_Suite/
│   │   ├── controller/   # REST Controllers (API Endpoints)
│   │   ├── entities/     # JPA Entities (Database Tables)
│   │   ├── repo/         # Repository Interfaces
│   │   └── service/      # Business Logic
│   └── resources/
│       └── application.properties # Database Config
└── test/
    └── java/com/aman/Spring_Boot_Testing_Suite/
        ├── repo/         # @DataJpaTest for Repository Layer
        └── service/      # @Mock & @InjectMocks for Service Layer

⚙️ Getting Started
1. Prerequisites
Ensure you have the following installed:

Java Development Kit (JDK) 17 or higher

Maven

MySQL Server

2. Database Setup
Create a local database named schooldb in your MySQL instance:

CREATE DATABASE schooldb;

3. Configuration
Update src/main/resources/application.properties with your credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/schooldb
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

4. Installation
Clone the repository and install dependencies:

git clone [https://github.com/YOUR_USERNAME/Spring-Boot-Testing-Suite.git](https://github.com/YOUR_USERNAME/Spring-Boot-Testing-Suite.git)
cd Spring-Boot-Testing-Suite
mvn clean install

🧪 Running Tests
This project focuses on high test coverage.

Run all tests:

mvn test

Here is a professional, emoji-rich README.md file for your project. You can copy the code block below and paste it directly into a file named README.md in your project folder.

I have customized it to match the Spring Boot + MySQL + JUnit + Mockito stack we built.

Markdown

# 🧪 Spring Boot Testing Suite

![Java](https://img.shields.io/badge/Java-17%2B-orange) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen) ![MySQL](https://img.shields.io/badge/Database-MySQL-blue) ![Build](https://img.shields.io/badge/Build-Maven-red)

A comprehensive Spring Boot application designed to demonstrate **Unit Testing** best practices. This project implements a full CRUD REST API for managing a `Person` directory, featuring isolated unit tests for the **Service layer (using Mockito)** and integration tests for the **Repository layer (using H2/MySQL)**.

## 🚀 Technologies Used

* **Framework:** Spring Boot 3 🍃
* **Language:** Java 17 / 21 ☕
* **Database:** MySQL 🐬
* **ORM:** Spring Data JPA 🗄️
* **Testing:** JUnit 5 & Mockito 🦜
* **Tooling:** Lombok, Maven 🛠️

## 📂 Project Structure

```text
src/
├── main/
│   ├── java/com/aman/Spring_Boot_Testing_Suite/
│   │   ├── controller/   # REST Controllers (API Endpoints)
│   │   ├── entities/     # JPA Entities (Database Tables)
│   │   ├── repo/         # Repository Interfaces
│   │   └── service/      # Business Logic
│   └── resources/
│       └── application.properties # Database Config
└── test/
    └── java/com/aman/Spring_Boot_Testing_Suite/
        ├── repo/         # @DataJpaTest for Repository Layer
        └── service/      # @Mock & @InjectMocks for Service Layer
⚙️ Getting Started
1. Prerequisites
Ensure you have the following installed:

Java Development Kit (JDK) 17 or higher

Maven

MySQL Server

2. Database Setup
Create a local database named schooldb in your MySQL instance:

SQL

CREATE DATABASE schooldb;
3. Configuration
Update src/main/resources/application.properties with your credentials:

Properties

spring.datasource.url=jdbc:mysql://localhost:3306/schooldb
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD
4. Installation
Clone the repository and install dependencies:

Bash

git clone [https://github.com/YOUR_USERNAME/Spring-Boot-Testing-Suite.git](https://github.com/YOUR_USERNAME/Spring-Boot-Testing-Suite.git)
cd Spring-Boot-Testing-Suite
mvn clean install
🧪 Running Tests
This project focuses on high test coverage.

Run all tests:
Bash

mvn test
What is tested?
Repository Layer (PersonRepoTest):

Verifies that custom queries (like existsById) work correctly with the database context.

Service Layer (PersonServiceTest):

Uses Mockito to mock the Repository.

Tests business logic in isolation without hitting the actual database.

🔌 API Endpoints
Once the application is running (mvn spring-boot:run), you can access:

Method,Endpoint,Description
GET,/persons,Fetch all persons
POST,/persons,Add a new person

Example JSON for POST:

{
    "personName": "Aman",
    "personCity": "Nagpur"
}

👤 Author
Aman Manwatkar
