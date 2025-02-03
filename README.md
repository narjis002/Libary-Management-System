# Library Management System - 2nd Semester Project

## Table of Contents
1. [Project Overview](#project-overview)
2. [Technologies Used](#technologies-used)
3. [Features of the System](#features-of-the-system)
4. [System Architecture](#system-architecture)
5. [Installation Instructions](#installation-instructions)
6. [Database Configuration](#database-configuration)
7. [How to Use](#how-to-use)
8. [Conclusion](#conclusion)

---

## Project Overview

The **Library Management System** is a simple yet highly effective application designed to manage and streamline the operations of a library. Developed as a part of my **2nd Semester** project, this system is built using **Java Swing** for the graphical user interface (GUI) and connected to a **MySQL** database for seamless data management. This system performs all the essential functions required by a library management system, including managing books, users, and transactions, such as book issues and returns.

The goal of this project is to design a user-friendly and efficient library system that can automate day-to-day library tasks, improve user experience, and minimize administrative work. The system is intended for libraries of any scale, from small to medium, and can be expanded with additional features as needed.

---

## Technologies Used

The following technologies were used to develop this project:

- **Java**: The core programming language used for writing the logic and creating the graphical user interface (GUI) with Java Swing.
- **Java Swing**: A GUI toolkit for building window-based applications.
- **MySQL**: A relational database management system used to store all library data such as books, members, and transactions.
- **JDBC (Java Database Connectivity)**: Used for connecting the Java application to the MySQL database for CRUD operations.
- **NetBeans IDE**: The integrated development environment used to develop and test the application.

---

## Features of the System

The Library Management System provides the following key features:

### 1. **User Management**
- **Register New Users**: Allows librarians to add new members to the library.
- **Delete Users**: Removes users from the system.
- **Update User Information**: Enables modification of existing user data (e.g., contact details).

### 2. **Book Management**
- **Add New Books**: Librarians can add new books to the system with details such as title, author, ISBN, and quantity.
- **Delete Books**: Removes books from the system.
- **Update Book Information**: Allows modification of book details.
- **View Books**: Provides a list of all available books, including their status (available or issued).

### 3. **Book Issuance and Return**
- **Issue Books**: Enables the librarian to issue books to users, recording the issue date and due date.
- **Return Books**: Marks the return of books, updating the availability status in the system.
- **Fine Calculation**: Calculates and adds a fine if the book is returned after the due date.

### 4. **Search Functionality**
- **Search Books**: Search for books by title, author, or ISBN.
- **Search Users**: Search for users by name or membership ID.

### 5. **Reports and Analytics**
- **View Issued Books**: Displays a list of currently issued books.
- **Generate Reports**: Generate reports for issued books, due books, and user activity.

---

## System Architecture

The architecture of the Library Management System is based on a **Client-Server** model. The client-side application is built with **Java Swing**, which communicates with the **MySQL** database server using **JDBC** for CRUD operations.

The system is divided into three main layers:
1. **Presentation Layer**: Java Swing provides a user-friendly interface where the librarian can interact with the system.
2. **Business Logic Layer**: Contains all the logic to handle user requests, validate data, and communicate with the database.
3. **Data Layer**: The **MySQL** database stores all the library-related data, including books, users, and transactions.

---

## Installation Instructions

To run the Library Management System on your machine, follow these steps:

### Prerequisites
- **JDK (Java Development Kit)** installed on your computer. You can download it from the [official Oracle website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
- **MySQL** installed on your system. You can download it from the [official MySQL website](https://dev.mysql.com/downloads/).
- **NetBeans IDE** or any Java IDE for running the code.

### Steps to Install:
1. **Clone or Download the Project**
   - You can either clone the repository from GitHub (if available) or download the project folder and unzip it.

2. **Set Up the MySQL Database**
   - Open MySQL Workbench or your MySQL client.
   - Create a new database by running the following SQL command:
     ```sql
     CREATE DATABASE library_management;
     ```
   - Use the provided SQL file (`library_management.sql`) to create the necessary tables and insert sample data:
     ```sql
     source path_to_sql_file/library_management.sql;
     ```

3. **Configure Database Connection**
   - In the project code, modify the database connection parameters (username, password, and database name) to match your MySQL setup.
   - The database connection is handled in the `DatabaseConnection.java` file, so update the credentials accordingly.

4. **Run the Project**
   - Open the project in your IDE (e.g., NetBeans).
   - Compile and run the `Main.java` file to launch the application.

---

## Database Configuration

The application is connected to a **MySQL** database for managing data. The following tables are used in the database:

1. **Users**: Stores information about library members (ID, name, contact details).
2. **Books**: Stores information about books (book ID, title, author, ISBN, quantity).
3. **Transactions**: Records book issue and return transactions (transaction ID, book ID, user ID, issue date, return date, fine).
   
Example of the SQL code for creating the **Books** table:
```sql
CREATE TABLE books (
    book_id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255),
    author VARCHAR(255),
    isbn VARCHAR(20),
    quantity INT
);
