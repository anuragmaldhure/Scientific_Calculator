# Scientific_Calculator
To demonstrate Core Java Concepts - More Comprehensive Approach 

## Table of contents
* [Objective](#objective)
* Project Implementation :
* [Phase 1](#phase-1)

Also Checkout my other Core Java based Projects :
* [URL shortener - Basic Approach](https://github.com/anuragmaldhure/URL_Shortener)
* [Movie Review App - More Comprehensive Approach with RDMBS](https://github.com/anuragmaldhure/Movie_Review_Hackathon)

## Objectives
* Implementing OOPS using Java SE
* Implement basic arithmetic operations with two numbers
* Write Unit Tests for some of the arithmetic operations
* Execute and Test the calculator application
* Implement new methods to support floating point arithmetic operations using method overloading
* Debug and Handle Exceptions for invalid data
* Write unit tests to validate the Exception being thrown
* Extend the existing class to support new features for a Scientific Calculator
* Re-use and improve upon the existing features
* Fix compilation errors caused probably due to syntax / import issues
* Correct logical issues in the code
* Fix the behaviour of a method when data is invalid
* Write Unit Tests for edge cases initially not thought of

## Implementation

## Phase 1 
### Creating Standard Calculator, Basic operations and writing unit test case
1. Created a gradle project and created a class src/main/java/StandardCalulator.java and added a static method getVersion() to print version of Calculator 
2. Implemented these basic arithmetic operations :
* public int add(int num1, int num2)
* public int subtract(int num1, int num2)
* public int multiply(int num1, int num2)
* public int divide(int num1, int num2)
3. Tesed them succesfully after calling them from class CalulatorAppliaction which has main method and invokes the above methods after creating object of StandardCalulator
4. Added a private field result in StandardCalulator.java and added getters and setters and modified result by setResult() and the CalulatorAppliaction.java to call getResult() after calling clearResult()
5. Wrote test case in src/test/java/CalulatorApplicationTest.java using junit 
6. Used annotations @BeforeEach [to mark methods to be run before each test method is run. We use this method mostly to set up a few initial things which are required for all the tests present in the Test Class. Here, we are initializing the standardCalculator variable with a new object] @Test [which is used to mark the testAdditionOperation() method as a test] @DisplayName [which is used to declare a custom display name for the annotated test class or test method] which is a tag that represents the metadata i.e. attached with a class, interface, methods or fields to indicate some additional information which can be used by java compiler and JVM. [Read more about JUNIT 5](https://www.baeldung.com/junit-5)
* A unit test is a way of testing a unit - the smallest piece of code that can be logically isolated in a system. It helps with the software development cycle by spotting bugs earlier as well as reducing testing time. It is recommended to have one Test class with unit tests for every Java class that needs testing.
7. There is an Assertions class which has a static method assertEquals() being used in some methods. Run these two test cases successfully!
![Local Image](./images/phase1_1.png)


### My Core Java Practice Assignments (My CDAC assignments)
[Click here](https://github.com/D3-80316-Anurag-Maldhure/JAVA_Assignments)
