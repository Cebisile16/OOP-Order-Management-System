# Order Management System

## Overview

The Order Management System allows a business to manage customer orders and inventory stock.

The system supports:

- Creating orders
- Adding products to orders
- Calculating order totals
- Managing inventory stock
- Checking product availability
- Reducing stock after sales
- Tracking order status
- Generating invoices

---

## Features

### Order Item Management

Each order item contains:

- Product ID
- Product Name
- Quantity
- Price

The system can calculate the total cost of an item.

---

### Order Management

Orders can:

- Store multiple order items
- Calculate total order value
- Track order status
- Generate invoices

Order statuses:

- PENDING
- SHIPPED
- DELIVERED

---

### Inventory Management

Inventory can:

- Add stock
- Check stock availability
- Reduce stock when products are sold

---

## Classes

### OrderItem

Represents a single product in an order.

#### Attributes

- productId
- productName
- quantity
- price

#### Methods

- getTotal()
- toString()

---

### Order

Represents a customer order.

#### Attributes

- orderId
- items
- status
- orderDate

#### Methods

- addItem()
- getTotalAmount()
- updateStatus()
- generateInvoice()

---

### Inventory

Manages stock levels.

#### Attributes

- stock

#### Methods

- addStock()
- checkAvailability()
- reduceStock()

---

## Project Structure

order-management-system/
│
├── src
│   ├── main
│   │   └── java
│   │       ├── Main.java
│   │       ├── Order.java
│   │       ├── OrderItem.java
│   │       └── Inventory.java
│   │
│   └── test
│       └── java
│           ├── OrderItemTest.java
│           ├── OrderTest.java
│           └── InventoryTest.java
│
├── README.md
└── pom.xml

---

## Example Workflow

1. Create inventory
2. Add stock
3. Create order
4. Add products to order
5. Calculate order total
6. Update order status
7. Generate invoice

---

## Running Tests

mvn test

---

## Future Improvements

- Customer class
- Product class
- Order cancellation
- Inventory reports
- Invoice export
