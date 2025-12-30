Vehicle Management System
A. Project Overview
Purpose and Description

This project is a Java console application that demonstrates the main concepts of Object-Oriented Programming (OOP).
The system manages vehicles and drivers.

Each vehicle can:

start its engine

stop its engine

display its information

Drivers can have multiple vehicles assigned to them.

OOP Concepts Used

Abstraction:
The abstract class Vehicle defines common behavior for all vehicles.

Inheritance:
Car, Motorcycle, and Truck inherit from Vehicle.

Composition:
A Driver contains a list of Vehicle objects.

Polymorphism:
Vehicles are treated as Vehicle but behave differently.

B. Class Hierarchy
Superclass

Vehicle (abstract class)

Common fields: brand, year

Abstract methods:

startEngine()

stopEngine()

Concrete method:

displayInfo()

This class cannot be instantiated directly.

Subclasses

Car

Fields: doors, fuelType

Motorcycle

Field: hasSidecar

Truck

Fields: capacity, numAxles

Each subclass overrides the engine methods to provide its own behavior.

Overridden Methods

All subclasses override:

startEngine()

stopEngine()

Access Modifiers

private is used for fields to protect data

public methods provide controlled access

C. Instructions to Compile and Run

Compile and run the program using:

javac *.java
java Main

D. Reflection Section

Inheritance made the code simpler by placing common logic in the Vehicle class. This reduced duplication and made the program easier to maintain.

Method overriding allowed each vehicle to have its own engine behavior while using the same method names. This demonstrates polymorphism in the program.

The main challenge was choosing the correct access modifiers. Using private fields improved encapsulation, while public methods allowed safe access from other classes.
