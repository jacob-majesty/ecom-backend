# Shopping Cart Backend with Spring Boot

## Introduction
This project is a backend implementation of a shopping cart system using Spring Boot. It provides RESTful APIs to manage products, users, and shopping cart operations such as adding/removing items, viewing the cart, and checking out. The application is designed to be scalable, secure, and easy to integrate with frontend systems or mobile applications.

## Tech Stack
- **Framework**: Spring Boot
- **Language**: Java
- **Database**: MySQL (or any relational database supported by Spring Data JPA)
- **API Documentation**: Swagger/OpenAPI
- **Build Tool**: Maven
- **Authentication**: Spring Security (JWT for stateless authentication)
- **Version Control**: Git

## How to Run the Application

### Prerequisites
- Java 17 or higher
- Maven 3.x
- MySQL or any preferred relational database
- (Optional) Docker for containerized deployment

### Steps to Run

1. **Clone the Repository**:
   ```bash
   git clone <repository-url>
   cd <repository-name>
   ```

2. **Configure the Database**:
   - Update the `application.properties` file with your database credentials:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/shopping_cart_db
     spring.datasource.username=root
     spring.datasource.password=yourpassword
     spring.jpa.hibernate.ddl-auto=update
     ```

3. **Build the Application**:
   ```bash
   mvn clean install
   ```

4. **Run the Application**:
   ```bash
   mvn spring-boot:run
   ```
   The application will start on `http://localhost:8080`.

5. **Access API Documentation**:
   - Open your browser and navigate to `http://localhost:8080/swagger-ui.html` to view the Swagger API documentation.

---
