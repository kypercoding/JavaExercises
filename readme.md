# Overview

This repository contains a series of coding exercises intended to test basic programming concepts in the Java language.

# Requirements

Please ensure that you have at least JDK 17.0.2 installed on your system. No other libraries or dependencies are necessary
for these exercises.

# Installing

## Obtaining Code

To use the exercises, simply clone the Git repository to a local computer. After this, navigate to the destination of this cloning process through the command line.

Alternatively, you may also download the source code as a zip, extracting it to a destination of your choice. Then, navigate to the destination through the command line.

## Compiling / Running the Program

To run the program, perform the following steps:

1. Compile with the following command:  ***javac -d out Main.java***
2. Run with the following command:  ***java -cp out -ea Main***
    - The -ea tag ensures that any assertions present in the Java code will not be ignored during runtime.

# Usage

When running Main.java, the user will be greeted with the following:

> What would you like to do?

Please type in the corresponding exercise for which you wish to check a student's implementation, or press Enter without typing anything to quit. If the student manages to match the output of the solution, then the terminal will print "Done!" Otherwise, an AssertionError will occur. Current exercises (case-sensitive) are listed below:

## BallSorter

The BallSorter exercise aims to test a student's knowledge in the following general concepts:
- Functions
- For loops
- Conditionals
- Classes and their features (i.e. instance variables)

## Mathematics

The Mathematics exercise aims to test a student's knowledge in the following general concepts:
- Recursion
- Basic arithmetic in Java
- For loops
- Conditionals
- Java's built-in Math library

### AssertionErrors
Assertion statements are intentionally placed in the validation package Java files to help instructors locate the source of error. For instance, an AssertionError occurring at the line comparing the student's mean to the solution's mean indicates that something may have gone wrong in the student solution.

### Solutions
Sometimes, there are multiple ways of solving the problem outlined in the exercises, perhaps more efficient than those of the solution. Instructors are encouraged to allow students to think outside the box regarding such solutions.