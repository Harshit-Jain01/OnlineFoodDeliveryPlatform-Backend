# QuickBite - Delivery Service

The **Delivery Service** manages all aspects of order delivery for the QuickBite Online Food Delivery Platform.

## Features
- **Delivery Agent Management**: Handles delivery agent profiles and availability status.
- **Order Assignment**: Assigns pending orders to available delivery agents based on proximity and load.
- **Status Updates**: Allows delivery agents to update the delivery status (e.g., Picked Up, On the Way, Delivered).

## Technologies Used
- Java 17 & Spring Boot 3
- Spring Data JPA
- Kafka (for event-driven order assignments)
