# Food Delivery Management System

## Overview
The **Food Delivery Management System** is a Spring Boot project built using **Maven** and deployed on a **Tomcat server**.  
It provides RESTful API endpoints to manage **customers, chefs, delivery drivers, and orders** with asynchronous processing for order assignment and completion.  

This project demonstrates:
- Spring Boot / Spring MVC  
- Spring Data JPA / Hibernate  
- Maven for dependency management  
- Tomcat Server for deployment  
- Entity-Relationship Management (Customer ↔ Orders ↔ Chef ↔ Delivery Driver)  
- Asynchronous APIs using `CompletableFuture`  

---

## Features
- Customer Management – Manage customers who place food orders  
- Chef Management – Assign chefs to prepare meals, handle order completion asynchronously  
- Delivery Driver Management – Assign drivers to deliver food asynchronously  
- Order Management – Place new orders, update order status, list all orders  
- REST API Endpoints – JSON-based requests and responses  

---

## Project Structure
```bash
Food-Delivery-Management-System/
│── src/main/java/com/fooddelivery/
│   ├── entity/
│   │   ├── Customer.java
│   │   ├── Chef.java
│   │   ├── DeliveryDriver.java
│   │   └── Order.java
│   │
│   ├── controller/
│   │   ├── CustomerController.java
│   │   ├── ChefController.java
│   │   ├── DeliveryDriverController.java
│   │   ├── OrderController.java
│   │   └── HomeController.java
│   │
│   ├── repository/
│   │   ├── CustomerRepository.java
│   │   ├── ChefRepository.java
│   │   ├── DeliveryDriverRepository.java
│   │   └── OrderRepository.java
│   │
│   ├── service/
│   │   ├── CustomerService.java
│   │   ├── ChefService.java
│   │   ├── DeliveryDriverService.java
│   │   └── OrderService.java
│   │
│   └── FoodDeliveryApplication.java
│
├── src/main/resources/
│   └── application.properties
│
├── pom.xml
└── README.md


---
## Technologies Used
- Java 17+  
- Spring Boot (MVC, Data JPA, Async)  
- Maven  
- Tomcat Server  
- MySQL (configurable in `application.properties`)  

---

## API Endpoints

### Home
- `GET /` → Welcome message or project home  

### Chefs
- `POST /chefs/create?name={chefName}` → Create a new chef  
- `PUT /chefs/assign/{chefId}/toOrder/{orderId}` → Assign chef asynchronously to an order  
- `PUT /chefs/completeOrder/{orderId}` → Mark order as completed (chef available again)  

### Delivery Drivers
- `POST /drivers/create?name={driverName}` → Create a new delivery driver  
- `GET /drivers/available` → List all available drivers  
- `PUT /drivers/assign/{driverId}/toOrder/{orderId}` → Assign driver asynchronously to an order  
- `PUT /drivers/completeDelivery/{orderId}` → Mark delivery completed (driver available again)  

### Orders
- `POST /orders/place?customerName={name}&items={items}` → Place a new order asynchronously  
- `GET /orders/allorder` → Fetch all orders  
- `PUT /orders/updateorder/{orderId}?status={status}` → Update order status  

---

## Setup & Installation (Run on Local Machine)

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/Food-Delivery-Management-System.git
   cd Food-Delivery-Management-System

2. **Configure Database in src/main/resources/application.properties**
- `spring.datasource.url=jdbc:mysql://localhost:3306/food_delivery`
- `spring.datasource.username=root`
- `spring.datasource.password=yourpassword`
- `spring.jpa.hibernate.ddl-auto=update`
- `spring.jpa.show-sql=true`

3. **Build and run the project**
  ```bash
  mvn clean install
  mvn spring-boot:run



