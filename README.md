# MidTermProject 51900850-PhaoRathana
# SpringCommerce - Online Shopping Application

## Software Development Principles, Patterns, and Practices

### Principles Applied:
- **Dependency Injection (DI):** Spring Boot utilizes dependency injection, making the code more modular and testable.
- **Separation of Concerns (SoC):** The application is structured to separate concerns such as presentation, business logic, and data access.
- **Model-View-Controller (MVC):** The application follows the MVC pattern for organizing code and handling user interactions.

### Code Structure:
The project follows a standard Spring Boot project structure:

|-- src/
| |-- main/
| |-- java/
| |-- com.gk/
| |-- config/ # Configuration classes
| |-- controller/ # MVC Controllers
| |-- model/ # Entity classes
| |-- repository/ # Spring Data JPA Repositories
| |-- service/ # Business logic and services
| |-- SpringCommerceApplication.java
| |-- resources/
| |-- application.properties # Application configuration
| |-- templates/ # HTML templates (if using Thymeleaf)
|-- pom.xml

1. src/main/java/com/gk/config/
Purpose: Contains configuration classes for the application.
Examples:
AppConfig.java: Spring configuration class defining beans and necessary configurations.
2. src/main/java/com/gk/controller/
Purpose: Contains MVC controllers handling HTTP requests and responses.
Examples:
ProductController.java: Handles product-related requests.
ShoppingCartController.java: Manages shopping cart interactions.
3. src/main/java/com/gk/model/
Purpose: Houses entity classes representing data structures in the application.
Examples:
Product.java: Represents a product with attributes like name, price, etc.
4. src/main/java/com/gk/repository/
Purpose: Spring Data JPA repositories for database interaction.
Examples:
ProductRepository.java: Defines methods for querying the Product entity.
5. src/main/java/com/gk/service/
Purpose: Business logic and services reside here.
Examples:
ShoppingCartService.java: Implements shopping cart-related business logic.
6. src/main/resources/
Purpose: Configuration files and resources.
Examples:
application.properties: Contains application-level configurations, including database settings.
templates/: If using Thymeleaf, this folder may contain HTML templates.
7. src/test/
Purpose: Houses test classes for unit and integration testing.
Examples:
ProductControllerTest.java: Tests for the product controller.
ShoppingCartServiceTest.java: Tests for shopping cart service.
8. pom.xml
Purpose: Maven project configuration file specifying dependencies, build settings, etc.
Key Points:
Dependency Injection (DI): Utilized by Spring Boot, promoting modular and testable code.
MVC (Model-View-Controller): Organizes code to separate concerns and handle user interactions effectively.
Spring Data JPA Repositories: Used for database interaction, reducing boilerplate code.
Configuration Classes: Centralized in the config package to manage application-wide settings.
Test Directory: Encourages the implementation of unit and integration tests for robust code.
