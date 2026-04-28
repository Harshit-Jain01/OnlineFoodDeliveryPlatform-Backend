# QuickBite - Order Service

The **Order Service** is the central hub for handling customer orders on the QuickBite platform.

## Features
- **Order Creation**: Processes new orders received from the cart.
- **Order State Machine**: Manages order statuses (Pending, Accepted, Preparing, Out for Delivery, Delivered, Cancelled).
- **Service Orchestration**: Communicates with the Payment, Restaurant, and Delivery services via events and REST clients.

## Technologies Used
- Java 17 & Spring Boot 3
- Spring Data JPA
- Apache Kafka (Event-Driven Architecture)
- OpenFeign (Inter-service communication)
