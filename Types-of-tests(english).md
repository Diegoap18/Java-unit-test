# Unit Testing in Java: Main Types and Categories

## Introduction
## Main Types of Unit Tests in Java

| Category | Test Type | Description |
|----------|-----------|-------------|
| **By Test Category** | Basic Unit Tests | Testing individual methods or functions in isolation |
| | Integration Tests | Testing the interaction between components or systems |
| | Functional Tests | Testing complete functionality from a user perspective |
| | Regression Tests | Ensuring previously fixed bugs don't reappear |
| | Parameterized Tests | Running the same test with different input parameters |
| | Performance Tests | Evaluating system performance under specific conditions |
| **By Test Focus** | Positive Tests | Verifying that the code works correctly with valid inputs |
| | Negative Tests | Verifying that the code handles invalid inputs appropriately |
| | Boundary Tests | Testing behavior at the boundaries of valid input ranges |
| | Exception Tests | Verifying proper exception handling in error situations |
| | Coverage Tests | Ensuring all code paths are executed during testing |
| **By Testing Technique** | State Testing | Verifying that methods change object state correctly |
| | Behavior Testing | Verifying that objects interact with each other correctly |
| | Black Box Testing | Testing functionality without knowledge of internal implementation |
| | White Box Testing | Testing with knowledge of internal implementation |
| | Data-Driven Testing | Using data files to provide test case inputs and expected results |
| | Mutation Testing | Deliberately changing code to verify if tests detect the changes |

## Common Testing Tools in Java

| Tool | Description |
|------|-------------|
| **JUnit 5** | Primary testing framework for Java |
| **Mockito** | Popular framework for creating and managing mock objects |
| **AssertJ** | Library for fluent and readable assertions |
| **Hamcrest** | Library providing matcher objects for test assertions |
| **PowerMock** | Extension of Mockito for testing static/final methods and constructors |
| **TestNG** | Alternative testing framework with advanced features |
| **Selenium** | Framework for UI/web testing automation |
| **Cucumber** | Framework for behavior-driven development (BDD) |
| **JaCoCo** | Java code coverage analysis tool |
| **PIT** | Mutation testing system for Java |

## How to Run the Tests

```bash
# Using Maven
mvn test

# Using Gradle
gradle test
```
