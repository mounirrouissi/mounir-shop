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



## Order API Endpoints

- **Create Order**:
    - **Endpoint**: `POST ${api.prefix}/orders/order`
    - **Description**: Create a new order for a specific user.
    - **Response**: Returns the created order details if successful, otherwise returns a `500 Internal Server Error` status if an error occurs.

- **Get Order by ID**:
    - **Endpoint**: `GET ${api.prefix}/orders/{orderId}/order`
    - **Description**: Retrieve the details of a specific order by its ID.
    - **Response**: Returns the order details if found, otherwise returns a `404 Not Found` status.

- **Get User Orders**:
    - **Endpoint**: `GET ${api.prefix}/orders/{userId}/order`
    - **Description**: Retrieve all orders for a specific user.
    - **Response**: Returns the list of orders if found, otherwise returns a `404 Not Found` status.


 ## User API Endpoints

- **Get User by ID**:
    - **Endpoint**: `GET ${api.prefix}/users/{userId}/user`
    - **Description**: Retrieve the details of a specific user by their ID.
    - **Response**: Returns the user details if found, otherwise returns a `404 Not Found` status.

- **Create User**:
    - **Endpoint**: `POST ${api.prefix}/users/add`
    - **Description**: Create a new user with the provided details.
    - **Response**: Returns the created user details if successful, otherwise returns a `409 Conflict` status if the user already exists.

- **Update User**:
    - **Endpoint**: `PUT ${api.prefix}/users/{userId}/update`
    - **Description**: Update the details of an existing user by their ID.
    - **Response**: Returns the updated user details if successful, otherwise returns a `404 Not Found` status if the user is not found.

- **Delete User**:
    - **Endpoint**: `DELETE ${api.prefix}/users/{userId}/delete`
    - **Description**: Delete a specific user by their ID.
    - **Response**: Returns a success message if the user is deleted, otherwise returns a `404 Not Found` status if the user is not found.


 ## Cart API Endpoints

- **Get Cart**:
    - **Endpoint**: `GET ${api.prefix}/carts/{cartId}/my-cart`
    - **Description**: Retrieve the details of a specific cart.
    - **Response**: Returns the cart details if found, otherwise returns a `404 Not Found` status.

- **Clear Cart**:
    - **Endpoint**: `DELETE ${api.prefix}/carts/{cartId}/clear`
    - **Description**: Clear all items from a specific cart.
    - **Response**: Returns a success message if the cart is cleared, otherwise returns a `404 Not Found` status.

- **Get Total Price**:
    - **Endpoint**: `GET ${api.prefix}/carts/{cartId}/cart/total-price`
    - **Description**: Retrieve the total price of items in a specific cart.
    - **Response**: Returns the total price if the cart is found, otherwise returns a `404 Not Found` status.

  
## other  API Endpoints
- **Categories**:

- **Cart Items**:

- **Sales**:

- **Images**:
 
## Contributing
Contributions are welcome! Please fork the repository and submit a pull request.

## License
This project is licensed under the MIT License.
