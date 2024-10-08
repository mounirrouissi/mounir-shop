# Shop Management System

## Overview
This project is a comprehensive Shop Management System developed using Spring Boot, Spring Security, JWT, and JPA. It handles various aspects of shop management including inventory, sales, and customer management.

## Features
- **Inventory Management**: Efficiently track and manage inventory levels.
- **Sales Management**: Handle sales transactions and maintain records.
- **Customer Management**: Manage customer information and interactions.
- **User Authentication and Authorization**: Secure user access using Spring Security and JWT.
- **Database Interaction**: Utilize JPA for seamless and efficient database operations.
- **RESTful API**: Provide a RESTful API for integration with third-party services.

## Technologies Used
- **Spring Boot**: Framework for building the application.
- **Spring Security**: For implementing authentication and authorization.
- **JWT (JSON Web Token)**: For secure token-based authentication.
- **JPA (Java Persistence API)**: For database interaction and management.

## Setup and Installation
1. **Clone the repository**:
    ```bash
    git clone https://github.com/yourusername/shop-management-system.git
    cd shop-management-system
    ```

2. **Configure the database**:
    - Update the `application.properties` file with your database configuration.
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/yourdatabase
    spring.datasource.username=yourusername
    spring.datasource.password=yourpassword
    spring.jpa.hibernate.ddl-auto=update
    ```

3. **Build and run the application**:
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

## API Endpoints
- **Authentication**:
    - `POST /api/auth/login`: Authenticate user and return JWT.
- **Inventory**:
    - `GET /api/inventory`: Get all inventory items.
    - `POST /api/inventory`: Add a new inventory item.
- **Sales**:
    - `GET /api/sales`: Get all sales records.
    - `POST /api/sales`: Record a new sale.
- **Customers**:
    - `GET /api/customers`: Get all customers.
    - `POST /api/customers`: Add a new customer.

## Contributing
Contributions are welcome! Please fork the repository and submit a pull request.

## License
This project is licensed under the MIT License.
