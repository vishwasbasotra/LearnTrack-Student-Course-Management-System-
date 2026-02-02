Design Notes
============

## Why you used ArrayList instead of array?
1. ### Dynamic Resizing (The Biggest Reason)
* Array: You must define the size at the moment of creation (e.g., Student[] s = new Student[10];). If the 11th student tries to enroll, your program crashes with an ArrayIndexOutOfBoundsException.

* ArrayList: It grows and shrinks automatically. When you add a new student using .add(), the ArrayList handles the memory expansion behind the scenes. You don't need to know how many students you'll have in advance.

2. ### Built-in Methods (Ease of Development)
* Arrays are "dumb"—they store data but don't help you manage it. ArrayList comes with a massive toolkit:

* Searching: list.contains(studentObject) checks if a student is already enrolled.

* Removal: list.remove(5) or list.remove(studentObject) shifts all other elements automatically to fill the gap. In a standard array, removing an item leaves a "hole" (null) that you have to manage manually.

* Information: list.size() gives you the count instantly, whereas for an array, you'd have to write a loop to count how many non-null spots exist.

3. ### Type Safety with Generics
    Using ArrayList<Student> ensures that your list only accepts Student objects. If you try to add a Course object into your student list by mistake, the compiler will catch the error before you even run the program.

## Where you used static members and why?
For Unique ID Generation (Static Variables)
In the Student or Course entities, we used a static counter to ensure every new object gets a unique, incremental ID automatically.

```java
public class Student {
    private static int nextID = 1001; // Shared across ALL student objects
    private int studentId;               // Unique to EACH student object
    private String name;

    public Student(String name) {
        this.name = name;
        this.studentId = ++nextID; // Increment the shared counter and assign
    }
}
```
### Why?
If nextID were not static, every time you created a new Student(), the counter would reset to 1000. By making it static, the variable "lives" in the class memory. All students share that one counter, so Student A gets 1001, Student B gets 1002, and so on.

## Where you used inheritance and what you gained from it?
In your LearnTrack system, inheritance was primarily used in the Entity Layer to establish a relationship between the Person class and the Student class.

1. ### Where it was used: The "Person" Hierarchy:
    You created a parent class called Person and a child class called Student. Because a student is a person, it makes sense for Student to inherit all the general traits of a person.

    * Parent Class (Person): Stores general attributes like firstName, lastName, and sex.

    * Child Class (Student): Inherits those general attributes and adds student-specific data like batch, enrollmentDate, and status.

2. ### What you gained from it
    Inheritance isn't just a fancy way to organize files; it provided three major technical advantages to your project:

    #### Code Reusability (Avoided "Copy-Paste"):
    * Without inheritance, if you decided to add a Teacher class or a Staff class later, you would have to manually type firstName, lastName, and sex into every single class.

    * With Inheritance: You write that code once in the Person class. Every other class simply "borrows" it.
