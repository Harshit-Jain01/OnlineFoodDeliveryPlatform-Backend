# QuickBite - Tracking Service

The **Tracking Service** provides real-time tracking capabilities for active orders on the QuickBite platform.

## Features
- **Real-Time Updates**: Pushes live location and status updates to the customer's application.
- **WebSocket Integration**: Uses WebSockets to maintain a persistent connection with the frontend for instant updates.
- **Event Consumer**: Consumes location updates from the Delivery Service via Kafka.

## Technologies Used
- Java 17 & Spring Boot 3
- Spring WebSockets
- Apache Kafka
