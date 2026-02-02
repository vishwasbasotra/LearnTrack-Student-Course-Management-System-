# LearnTrack Student Course Management System
## Project Overview:
LearnTrack is a robust, console-based management architecture developed in Core Java. It serves as a comprehensive tool for educational administrators to oversee the lifecycle of students, the organization of course curriculam, and the complexities of the enrollment process. The primary focus of this project was to implement a modular, scalable design that adheres to professional software development standards and Object-Oriented best practices.

### Core Functionality
* Student Administration: Enables dynamic creation and tracking of student profiles, including personal demographics and unique identification.

* Course Management: Facilitates the cataloging of academic courses, allowing for structured data management of curriculam.

* Enrollment Logic: Orchestrates the relationship between Students and Enrollment, featuring validation logic to manage status transitions (Active, Completed, Cancelled).

* Data Persistence (In-Memory): Utilizes the Java Collections Framework to maintain a dynamic database of all entities during the application's runtime.

### Technical Implementation & OOP Excellence
**To ensure the system is "future-proof" and maintainable, the following technical pillars were implemented:**

1. Encapsulation: All sensitive data (names, IDs, statuses) are protected using private access modifiers, with access controlled via public getters and custom validation setters.

2. Inheritance & Abstraction: Utilized to create a clean hierarchy, reducing code redundancy by sharing common traits across administrative entities.

3. Polymorphism: Applied to handle various entity types through generic references, allowing for flexible system expansion (e.g., adding different types of Courses).

4. Static vs. Instance Members: Strategically used static counters for unique ID generation and instance members for specific object data.

5. Collection Framework: Leveraged ArrayList for high-performance, dynamic object storage and retrieval.

6. Robust Exception Handling: Integrated custom error-handling blocks to manage invalid user inputs and prevent system crashes during the enrollment flow.

### Key Learning Outcomes
Developing LearnTrack provided deep practical experience in:

* Modular Design: Separating concerns by moving input logic into "Management" classes.

* Logic Validation: Implementing complex conditional checks (AND/OR gates) to ensure data integrity.

* Memory Management: Understanding how the JVM allocates objects on the Heap and manages references within Collections.

## Suggested Directory Structure
### 📂 Project Structure

```bash
src
└── com
    └── vishwas
        ├── constants   # Application-wide constants
        │   └── MenuOptions.java
        ├── entity      # Data models (POJOs)
        │   ├── Course.java
        │   ├── Enrollment.java
        │   ├── Person.java
        │   └── Student.java
        ├── exception   # Custom error handling
        │   ├── CustomException.java
        │   └── EntityNotFoundException.java
        ├── service     # Business logic layer
        │   ├── CourseService.java
        │   ├── EnrollmentService.java
        │   └── StudentService.java
        ├── ui          # Application entry point
        │   └── Main.java
        └── util        # Helper classes & Validation
            └── InputValidator.java