# Payment Type Service

## 🚀 Overview

The **Payment Type Service** is a RESTful API designed to manage different payment methods within a system. This service allows the creation, retrieval, update, and deletion of payment methods, which is essential for platforms that support multiple payment types such as e-commerce platforms, point-of-sale systems, and more.

Built with **Spring Boot** and **JPA**, this service simplifies the handling of various payment methods in a centralized manner.

## 🌟 Key Features

- **RESTful API**: Exposes endpoints to create, retrieve, update, and delete payment methods.
- **JPA Integration**: Utilizes Java Persistence API for data handling, allowing easy database interaction.
- **Payment Method Management**: Support for adding, editing, and removing different payment methods.

## 🔑 API Endpoints

### 1. **POST** `/payment/create`
Creates a new payment method.

**Request Body**:
- `paymentType`: The name of the payment method (e.g., "Credit Card", "PayPal").

**Response**:
- Returns a success message: "Payment method created successfully".

### 2. **GET** `/payment/bringAll`
Retrieves a list of all payment methods.

**Response**:
- A list of `PaymentType` objects, each containing `paymentId` and `paymentType`.

### 3. **GET** `/payment/bring/{paymentId}`
Retrieves the details of a specific payment method by its ID.

**Response**:
- A `PaymentType` object with the details of the payment method.

### 4. **PUT** `/payment/edit/{paymentId}`
Updates the details of an existing payment method.

**Request Body**:
- `paymentType`: The new name of the payment method.

**Response**:
- Returns a success message: "Payment method edited correctly".

### 5. **DELETE** `/payment/delete/{paymentId}`
Deletes a specific payment method by its ID.

**Response**:
- Returns a success message: "Payment method deleted correctly".

## 🔧 Technologies Used

- **Spring Boot**: Framework used to build the application.
- **JPA** (Java Persistence API): Manages the database interactions.
- **H2 Database** (or any relational database): Stores payment method data.
- **Java**: The programming language used to develop the service.

## 💡 Use Case

This service is essential for systems that need to manage various types of payments. It’s useful for e-commerce platforms, POS systems, subscription services, or any system that integrates different payment gateways or methods.



