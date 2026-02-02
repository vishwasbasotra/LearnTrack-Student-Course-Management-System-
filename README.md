# LearnTrack Student Course Management System
## Project Overview:
Project Summary:
LearnTrack is a robust, console-based management architecture developed in Core Java. It serves as a comprehensive tool for educational administrators to oversee the lifecycle of students, the organization of course curricula, and the complexities of the enrollment process. The primary focus of this project was to implement a modular, scalable design that adheres to professional software development standards and Object-Oriented best practices.

Core Functionality
Student Administration: Enables dynamic creation and tracking of student profiles, including personal demographics and unique identification.

Course Management: Facilitates the cataloging of academic courses, allowing for structured data management of curricula.

Enrollment Logic: Orchestrates the relationship between Students and Courses, featuring validation logic to manage status transitions (Active, Completed, Cancelled).

Data Persistence (In-Memory): Utilizes the Java Collections Framework to maintain a dynamic database of all entities during the application's runtime.

Technical Implementation & OOP Excellence
To ensure the system is "future-proof" and maintainable, the following technical pillars were implemented:

Encapsulation: All sensitive data (names, IDs, statuses) are protected using private access modifiers, with access controlled via public getters and custom validation setters.

Inheritance & Abstraction: Utilized to create a clean hierarchy, reducing code redundancy by sharing common traits across administrative entities.

Polymorphism: Applied to handle various entity types through generic references, allowing for flexible system expansion (e.g., adding different types of Courses or Payment methods).

Static vs. Instance Members: Strategically used static counters for unique ID generation and instance members for specific object data.

Collection Framework: Leveraged ArrayList for high-performance, dynamic object storage and retrieval.

Robust Exception Handling: Integrated custom error-handling blocks to manage invalid user inputs and prevent system crashes during the enrollment flow.

Key Learning Outcomes
Developing LearnTrack provided deep practical experience in:

Modular Design: Separating concerns by moving input logic into "Manager" classes and data into "Model" classes.

Logic Validation: Implementing complex conditional checks (AND/OR gates) to ensure data integrity.

Memory Management: Understanding how the JVM allocates objects on the Heap and manages references within Collections.