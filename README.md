# 🚀 SwiftCart - Scalable E-Commerce Platform
SwiftCart is a high-performance, microservices-based e-commerce platform designed to provide seamless shopping experiences with powerful features like product discovery, secure payments, and scalable infrastructure.

### 🔥 Key Features
* Microservices Architecture - Modular design with separate services for Product Catalog, Order Management, Payment Gateway, Notifications, and more.
* Event-Driven Email Service - Large-scale email dispatch using Kafka for real-time notifications.
* Advanced Product Discovery - High-performance sorting & filtering powered by Elasticsearch.
* Optimized Database Operations - Uses Spring Data JPA for efficient MySQL integration.
* Ultra-Fast API Response Times - Optimized from ~800ms to ~50ms using Redis Caching.
* Cloud-Optimized - Built on AWS, leveraging EC2, RDS, and Elastic Beanstalk for scalability.
* Secure Payments - Razorpay payment gateway integration for seamless transactions.
  
### 🛠️ Tech Stack
* Backend: Spring Boot, Spring Cloud, MySQL, Redis, Kafka, JUnit
* Search & Caching: Elasticsearch, Redis
* Cloud & Deployment: AWS (EC2, RDS, Elastic Beanstalk)
* Payments: Razorpay Payment Gateway
 
### 📌 Setup Instructions
1. Clone the repository
```
git clone https://github.com/yourusername/swiftcart.git
cd swiftcart
```
2. Configure MySQL, Redis, and Kafka
3. Set up environment variables for AWS, Razorpay, and Database credentials
4. Run the application
```
mvn spring-boot:run
```

------
Other Services:
* User Service : https://github.com/ramuannam/UserService
* Email Service: https://github.com/ramuannam/EmailService
* Service Discovery: https://github.com/ramuannam/ServiceDiscovery

