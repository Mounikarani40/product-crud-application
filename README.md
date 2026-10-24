Product CRUD Application

📌 Project Overview

The Product CRUD Application is a Java-based web application developed using Spring Boot. It is designed to manage product information and demonstrates the basic operations involved in backend application development.

CRUD stands for Create, Read, Update, and Delete.

🛠️ Technologies Used

- Java – Programming language
- Spring Boot – Framework for developing Java applications
- Spring Data JPA – Simplifies database operations
- Hibernate – ORM framework for mapping Java objects to database tables
- Maven – Dependency management and build tool
- Database – Specify the database configured in the project

✨ Features

- Create and manage product information
- Store product details such as ID, name, price, and quantity
- Retrieve product information
- Update existing product details
- Delete product records
- Use a layered architecture to organize application logic

Note: Keep only the features that are implemented and tested in your application.

📂 Project Structure

productCRUD/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/demo/
│   │   │       ├── Product.java
│   │   │       ├── Product1.java
│   │   │       ├── ProductController.java
│   │   │       ├── ProductCrudApplication.java
│   │   │       ├── ProductDAO.java
│   │   │       └── ProductService.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── pom.xml
└── README.md

📖 Class Responsibilities

- Product.java / Product1.java: Product-related entity or model classes.
- ProductController.java: Handles incoming application requests.
- ProductCrudApplication.java: Main class used to start the Spring Boot application.
- ProductDAO.java: Handles data access operations.
- ProductService.java: Contains the business logic.

The exact responsibilities depend on the implementation of each class.

⚙️ Prerequisites

Install the following software before running the application:

- Java Development Kit (JDK)
- Spring Tools for Eclipse or another Java IDE
- Maven
- The database configured in the application

🚀 How to Run the Project

1. Clone or download this repository.
2. Open the project in Spring Tools for Eclipse.
3. Allow Maven to download the required dependencies.
4. Configure the database connection in "src/main/resources/application.properties".
5. Open "ProductCrudApplication.java".
6. Right-click the file and select Run As → Spring Boot App.
7. Check the console to verify that the application starts successfully.

🧪 Testing

Test the implemented product operations using the API testing tool or interface configured for the project.

Verify that product information can be created, retrieved, updated, and deleted as applicable.

🎯 Learning Outcomes

- Understanding Spring Boot application structure
- Learning the purpose of controller, service, and DAO layers
- Working with Java classes and product entities
- Understanding JPA and Hibernate integration
- Managing project dependencies with Maven
- Practicing backend application development

👩‍💻 Author

Mounika Rani

📄 License

This project is intended for learning and educational purposes.