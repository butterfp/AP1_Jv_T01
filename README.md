# Project 01 — Java_Bootcamp

**Summary:**
In this project, you will get acquainted with the basic features of the Java language.

💡 [Click here](https://new.oprosso.net/p/4cb31ec3f47a4596bc758ea1861fb624) to share your feedback on this project. It’s anonymous and will help our team improve the course. We recommend filling out the survey immediately after completing the project.


## Contents

  - [Chapter I](#chapter-i)
    - [Instructions](#instructions)
  - [Chapter II](#chapter-ii)
    - [General Information](#general-information)
  - [Chapter III](#chapter-iii)
    - [Project: Smart Utilities](#project-smart-utilities)
    - [Task 0: Creating the Project](#task-0-creating-the-project)
    - [Task 1: Calculating the Perimeter of a Triangle](#task-1-calculating-the-perimeter-of-a-triangle)
    - [Task 2: Calculating Hours, Minutes, and Seconds](#task-2-calculating-hours-minutes-and-seconds)
    - [Task 3: Finding a Fibonacci Number](#task-3-finding-a-fibonacci-number)
    - [Task 4: Calculating the Arithmetic Mean of Negative Numbers](#task-4-calculating-the-arithmetic-mean-of-negative-numbers)
    - [Task 5: Finding Numbers with Matching First and Last Digits](#task-5-finding-numbers-with-matching-first-and-last-digits)
    - [Task 6: Selection Sort of an Array](#task-6-selection-sort-of-an-array)
    - [Task 7: Finding the Maximum and Minimum Values](#task-7-finding-the-maximum-and-minimum-values)
    - [Task 8: Ascending Order Sequence](#task-8-ascending-order-sequence)
    - [Task 9: String Filtering](#task-9-string-filtering)
    - [Task 10: Finding Names of Adult Users](#task-10-finding-names-of-adult-users)

## Chapter I

### Instructions

1. Throughout the course, you will experience uncertainty and a severe lack of information — this is normal. Remember that the repository and Google are always available to you, as are your peers and Rocket.Chat. Communicate. Search. Rely on common sense. Do not be afraid of making mistakes.
1. Pay attention to sources of information. Verify, think, analyze, compare.
1. Read the assignments carefully. Reread them several times.
1. It’s best to read the examples carefully as well. They may contain something not explicitly stated in the assignment itself.
1. You might encounter inconsistencies when something new in the task or example contradicts what you already know. If that happens, try to figure it out. If you fail, make a note under “open questions” and resolve it during your work. Do not leave open questions unresolved.
1. If a task seems unclear or unachievable, it only seems that way. Try decomposing it. Most likely, individual parts will become clearer.
1. Along the way, you’ll encounter many different tasks. Those marked with an asterisk (\*) are for more meticulous learners. They are of higher complexity and are not mandatory, but if you do them, you’ll gain additional experience and knowledge.
1. Do not try to fool the system or those around you. You’ll only be fooling yourself.
1. Have a question? Ask the neighbor on your right. If that doesn’t help, ask the neighbor on your left.
1. When using someone’s help, always make sure you understand why, how, and what for. Otherwise, that help is meaningless.
1. Always push only to the **develop** branch! The **master** branch will be ignored. Work in the **src** directory.
1. Your directory should not contain any files other than those specified in the tasks.

## Chapter II

### General Information

**Java** is a fast, secure, and reliable programming language for everything from mobile applications and enterprise software to big data applications and server technologies.

The history of Java began back in 1991 when Patrick Naughton, Bill Joy, and James Gosling started working on their own project. The main goal of the project was to create a next-generation hardware-software platform that would not require special knowledge to use. The idea was to create a "computer for people" that was highly reliable yet simple to operate. The project was named "Green." During the work, a need arose for a new programming language that was as universal as possible and could be used on any platform. Thus, "Oak" was born.

The Java programming language, as we know it today, did not appear immediately. For several years, developers attempted to implement the new technology in various fields, from interactive television to game consoles, but failed everywhere. The first breakthrough came with the creation of the "WebRunner" browser in 1994, which was capable of displaying interactive applets embedded directly into web pages.

As the new browser began to gain popularity, in 1995 "Oak" received a new name. Thus, the Java programming language was born, as we know it today. The browser was renamed "HotJava," though its existence soon came to an end. Meanwhile, Java began its triumphant march around the world: first, on May 23, 1995, it was officially introduced and integrated into the popular browser of the time, Netscape Navigator 2.0; in 1996, it began to be supported by what is now known to everyone as Microsoft Internet Explorer (then in version 3.0).

In 1997, Java underwent several significant updates, split into several distinct platforms, and began to gain ever-wider popularity—a popularity that has not diminished to this day.

**Main Advantages of Java:**

1. **Portability:** Java programs can run on any machine that supports the Java Virtual Machine (JVM).
1. **Object-Oriented:** Java is a fully object-oriented language, which allows for the creation of modular and scalable programs. The object-oriented approach promotes code reuse and makes maintenance easier.
1. **Security:** Java provides security mechanisms such as access control and type checking, which allow for the creation of more reliable applications. The Java Virtual Machine (JVM) also ensures isolation of programs from the operating system.
1. **Multithreading:** Java supports multithreading, enabling the development of efficient and responsive applications capable of performing multiple tasks simultaneously.
1. **Extensive Standard Library:** Java comes with an extensive standard library that includes classes and methods for solving a wide range of problems, thereby simplifying development.
1. **Support for Numerous Libraries and Frameworks:** There are many libraries and frameworks built on Java, such as Spring, Hibernate, Apache Struts, etc., which facilitate the creation of complex applications.
1. **Wide Adoption and Community:** Java is one of the most popular programming languages and has a huge developer community. This means that there are plenty of resources, documentation, and expertise available to support developers.
1. **Ease of Use:** Java has a relatively simple syntax, which simplifies development and code understanding, especially for beginners.

**Topics to Explore:**

- Entry point of the program, program structure;
- Compilation/interpretation of the program;
- Control structures of the language (sequential execution, branching, looping);
- Primitive data types (assignment, size, memory representation, operations);
- Composite data types (assignment, size, memory representation, operations);
- Input/output organization (stdin, stdout);
- Automatic, static, and dynamic memory, garbage collection;
- Complex data structures (templates and generics).

## Chapter III

### Project: Smart Utilities

This project covers the basic features of the language through a set of tools for solving various types of tasks.

**Attention!**
Each task should be organized as a separate project. For example: `T01/src/exercise0`, `T01/src/exercise1`, ..., `T01/src/exerciseN-1`, where *N* is the number of tasks. If the previous task is necessary for the next one, simply copy the previous project into the next directory and continue development there.

### Task 0: Creating the Project

In IntelliJ IDEA, create a new project:

- Choose the Java language.
- Choose the Gradle build system.
- Select JDK 18; if it’s not available, download any JDK 18 version.
- For Gradle DSL, choose Kotlin.

### Task 1: Calculating the Perimeter of a Triangle

Develop a mathematical module that calculates the perimeter of a triangle.

- The program reads the coordinates of the triangle’s vertices.
- The program works with floating-point numbers.
- The program calculates and outputs the perimeter of the triangle if the entered vertices form a triangle.
- If the entered vertices do not form a triangle, the program outputs: “It isn't triangle.”
- The program does not crash on incorrect input; it outputs: “Couldn't parse a number. Please, try again” and repeats the input attempt.
- Precision: 3 decimal places.
- Use only primitive types.

|**Input**|**Output**|
| ------ | ------ |
| 1.0 <br/>  2.0 <br/> 2.0 <br/> 1.0 <br/> 5.0 <br/> 5.0 <br/> | Perimeter: 11.414 |
| 2.0 <br/>  1.0 <br/> 2.0 <br/> 1.0 <br/> 2.0 <br/> 1.0 <br/> | It isn't triangle |
| 2.0 <br/> 1.0 <br/> 2.0 <br/> 1.0 <br/> 3.0 <br/> 1.0 <br/> | It isn't triangle |

### Task 2: Calculating Hours, Minutes, and Seconds

Develop a mathematical module that converts seconds into the format hh:mm:ss, i.e., calculates the number of hours, minutes, and seconds.

- The program reads the number of seconds.
- The program works with integers.
- The program calculates and outputs the number of hours, minutes, and seconds in the format hh:mm:ss.
- If a number of seconds less than 0 is entered, it should output: “Incorrect time.”
- The program does not crash on incorrect input; it outputs: “Couldn't parse a number. Please, try again” and repeats the input attempt.
- The program should have the following structure:
  - an input method;
  - a method for calculating hours, minutes, and seconds;
  - an output method;
  - all the above methods should be called from main.
- Use only primitive types.

|**Input**|**Output**|
| ------ | ------ |
| 3599 | 00:59:59 |
| 3601 | 01:00:01 |
| -100 | Incorrect time |

### Task 3: Finding a Fibonacci Number

Develop a mathematical module that finds the n-th Fibonacci number.

- The program reads the ordinal number of the Fibonacci number.
- The program works with integers.
- Consider memory overflow.
- Use a recursive approach to find the Fibonacci number.
- The program does not crash on incorrect input; it outputs: “Couldn't parse a number. Please, try again” and repeats the input attempt.
- Use only primitive types.

|**Input**|**Output**|
| ------ | ------ |
| 10 | 55 |
| 100000000 | Too large n |

### Task 4: Calculating the Arithmetic Mean of Negative Numbers

Develop a mathematical module that calculates the arithmetic mean of negative numbers.

- The program reads the count of numbers.
- The program reads each new number into an array.
- The program works with integers.
- If there are negative numbers, the program outputs their arithmetic mean; otherwise, it outputs: “There are no negative elements.”
- If a negative number or zero is entered as the count, it should output: “Input error. Size <= 0.”
- The program does not crash on incorrect input; it outputs: “Couldn't parse a number. Please, try again” and repeats the input attempt.
- Use a for-loop with a precondition.
- Use only primitive types.

|**Input**|**Output**|
| ------ | ------ |
| 4 <br/> 1 2 3 4 | There are no negative elements |
| -1 | Input error. Size <= 0 |
| 4 <br/> 1 -2 3 -4 | -3 |

### Task 5: Finding Numbers with Matching First and Last Digits

Develop a mathematical module that finds numbers where the first and last digit are the same.

- The program reads the count of numbers.
- The program reads each new number into an array.
- The program works with integers.
- If there are numbers whose first and last digits match, the program should output them; otherwise, it outputs: “There are no such elements.”
- Numbers with matching first and last digits should be saved into a separate array.
- If a negative number or zero is entered as the count, it should output: “Input error. Size <= 0.”
- The program does not crash on incorrect input; it outputs: “Couldn't parse a number. Please, try again” and repeats the input attempt.
- Use a while-loop with a precondition.
- There must be a separate method to determine if a number has matching first and last digits.
- Use only primitive types.

|**Input**|**Output**|
| ------ | ------ |
| 4 <br/> 100 200 300 400 | There are no such elements |
| -1 | Input error. Size <= 0 |
| 5 <br/> 1 202 300 200005 301213 | 1 202 301213 |

### Task 6: Selection Sort of an Array

Develop a mathematical module that performs selection sort of an array in ascending order.

- The program reads the count of numbers.
- The program reads each new number into an array.
- The program works with floating-point numbers.
- The program outputs the sorted array in ascending order.
- If a negative number or zero is entered as the count, it should output: “Input error. Size <= 0.”
- The program does not crash on incorrect input; it outputs: “Couldn't parse a number. Please, try again” and repeats the input attempt.
- There must be a separate method for selection sorting the array in ascending order.
- You cannot use built-in library implementations; you must write your own.
- Use only primitive types.

|**Input**|**Output**|
| ------ | ------ |
| 4 <br/> 100.0 50.0 60.0 10.0 | 10.0 50.0 60.0 100.0 |
| -1 | Input error. Size <= 0 |

### Task 7: Finding the Maximum and Minimum Values

Develop a mathematical module that finds the maximum and minimum values in an array.

- The program reads the path to a file.
- The program reads from the file the count of numbers.
- The program reads each new number from the file into an array until the count is exceeded or the end of the file is reached.
- The program works with floating-point numbers.
- The program outputs the read count of numbers and the numbers themselves.
- The program saves the found minimum and maximum values into a file named result.txt and outputs to the console: “Saving min and max values in file.”
- If fewer numbers are read than specified, it should output: “Input error. Insufficient number of elements.”
- If the file does not exist, it should output: “Input error. File isn't exist.”
- If a negative number or zero is entered as the count, it should output: “Input error. Size <= 0.”
- The program does not crash on incorrect input; it skips the erroneous input and proceeds to the next value.

| file1.txt |
| ------ |
| 4 <br/> 100.0 50.0 60.0 10.0 |

| file2.txt |
| ------ |
| 0 <br/> 100.0 50.0 60.0 10.0 |

| file3.txt |
| ------ |
| 10 <br/> 100.0 50.0 60.0 10.0 |

| file4.txt |
| ------ |
| 5 <br/> 20.0 50.0 f 60.0 g 10.0 1.0|

|Input|Console Output:|For result.txt output:|
| ------ | ------ | ------ |
| file1.txt | 4 <br/> 100.0 50.0 60.0 10.0 <br/> Saving min and max values in file | 10.0 100.0 |
| file2.txt | Input error. Size <= 0 | |
| file3.txt | Input error. Insufficient number of elements | |
| file4.txt | 5 <br/> 20.0 50.0 60.0 10.0 1.0 <br/> Saving min and max values in file | 1.0 60.0 |
| fileIsNotExist.txt | Input error. File isn't exist | |

### Task 8: Ascending Order Sequence

Develop a mathematical module that determines whether a sequence is ordered in ascending order.

- The program reads each new number.
- The program works with integers.
- You cannot use arrays.
- The program should determine whether the sequence is ordered in ascending order. If not, it should output: “The sequence is not ordered from the ordinal number of the number [number]”, indicating the ordinal number of the first number that breaks the order.
- The program ends the check of the entered sequence upon incorrect input and outputs: “The sequence is ordered in ascending order” if at least one number was entered.
- If no numbers are entered, it should output: “Input error.”
- Use only primitive types.

|**Input**|**Output**|
| ------ | ------ |
| 1 2 3 5 4 | The sequence is not ordered from the ordinal number of the number 4 |
| а | Input error |
| 10 20 50 80 90 g | The sequence is ordered in ascending order |

### Task 9: String Filtering

Develop a module that filters a list of strings based on a substring.

- The program reads the count of strings.
- The program reads each new string into a list.
- After reading all the strings, a substring for filtering is provided as input.
- The program works with reference data types (List, String, Integer, etc.).
- The program should output the list of strings that contain the entered substring.
- You cannot use the Java Stream API.
- You must implement your own filtering method.

|Input|**Output**|
| ------ | ------ |
| 4 <br/> First car <br/> Second door <br/> Third message <br/> Fourth wood <br/> oo | Second door, Fourth wood |
| 2 <br/> First car <br/> Second door <br/> kek | |

### Task 10: Finding Names of Adult Users

Develop a module that finds the names of adult users.

- Create a class User with two fields: a string for the user’s name and an integer for the age.
- The User class should be in a separate file.
- The program reads the count of users.
- Each user read is added to a list.
- If a negative or zero age is entered, the program outputs: “Incorrect input. Age <= 0” and moves on to the next input.
- The program does not crash on incorrect input; it outputs: “Couldn't parse a number. Please, try again” and repeats the input attempt.
- The program should output the names of adult users.
- The Java Stream API must be used.
- The program works with reference data types.

|**Input**|**Output**|
| ------ | ------ |
| 3 <br/> Name1 <br/> 16 <br/> Name2 <br/> 19 <br/> Name3 <br/> 18 | Name2, Name3 |
| 3 <br/> Name1 <br/> 16 <br/> Name2 <br/> 14 <br/> Name3 <br/> 13  | |
| 3 <br/> Name1 <br/> -2 <br/> Name2 <br/> 23 <br/> Name3 <br/> 13 <br/> Name4 <br/> 24 | Incorrect input. Age <= 0 <br/> Name2, Name4 |
