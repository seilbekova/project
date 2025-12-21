Student Management System - README
A. Project Overview
Purpose: This project manages student academic records and course enrollments in a university system. It demonstrates object-oriented programming principles in Java.

Classes:

Student - represents individual students with academic data

course - manages course information and student enrollments

Main - demonstrates functionality with sample data

Java Topics Used:

Object-oriented design (classes, objects)

Encapsulation (private fields with public getters/setters)

Arrays and loops

Conditional logic

Constructors and method overloading

B. Class Descriptions
Student Class
The Student class models a university student with:

Personal information (name, ID, major)

Academic records (GPA, credits completed)

Methods to update GPA and credits, check honors status

All fields are private with public getter/setter methods

Course Class
The course class represents a university course with:

Course name and instructor

Array of enrolled Student objects

Methods to calculate average GPA and find the student with most credits

Composition Relationship: The course class contains an array of Student objects, demonstrating composition. Each course "has-a" collection of students,
but students exist independently of any single course.

C. How to Run
Save all files in the same directory

Compile the program:

bash
javac *.java
Run the main program:

bash
java Main
E. Reflection
This project taught me how to design multiple interacting classes in Java. I learned to create proper encapsulation with private fields and public interfaces, 
which protects data integrity. The main challenge was managing the relationship between Student and Course classes - deciding whether to use composition or association.

Object-oriented programming proved valuable because it models real-world entities naturally. Encapsulation is particularly useful as it prevents invalid data (like GPA outside 0.0-4.0 range) 
from being set directly. This project shows how OOP makes code more organized, maintainable, and scalable compared to procedural approaches.
