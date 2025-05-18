# Unit Testing in Java with the Triple A Pattern

## What is the Triple A Pattern (Arrange-Act-Assert)?

The Triple A pattern is a methodology for structuring unit tests in a clear and organized way. This pattern divides each test into three distinct sections:

### 1. Arrange
In this phase, we prepare everything needed for the test:
- Creation of objects
- Setup of mocks/stubs
- Initialization of variables
- Definition of input data
- Configuration of preconditions

### 2. Act
This is the phase where we execute the operation being tested:
- Calling the method under test
- Executing the function or behavior being tested

### 3. Assert
In the final phase, we verify if the result of the operation matches the expected outcome:
- Comparing the actual result with the expected result
- Verifying if exceptions were thrown or not
- Confirming that the system state is as expected after execution

## Benefits of the Triple A Pattern

- **Readability**: Clear structure that makes tests easier to understand
- **Maintainability**: Facilitates maintenance and updates to tests
- **Isolation**: Promotes clear separation between setup and verification
- **Documentation**: Serves as living documentation of the expected code behavior

## Examples

### Example 1: Calculator Test

```java
@Test
public void testAddition() {
    // Arrange
    Calculator calculator = new Calculator();
    int a = 5;
    int b = 3;
    
    // Act
    int result = calculator.add(a, b);
    
    // Assert
    assertEquals(8, result);
}
```

### Example 2: Test with Mock

```java
@Test
public void testCustomerService() {
    // Arrange
    CustomerRepository repositoryMock = mock(CustomerRepository.class);
    Customer customer = new Customer("1", "Mary Smith");
    when(repositoryMock.findById("1")).thenReturn(customer);
    CustomerService service = new CustomerService(repositoryMock);
    
    // Act
    Customer result = service.findCustomerById("1");
    
    // Assert
    assertNotNull(result);
    assertEquals("Mary Smith", result.getName());
    verify(repositoryMock).findById("1");
}
```

### Example 3: Exception Test

```java
@Test
public void testDivisionByZero() {
    // Arrange
    Calculator calculator = new Calculator();
    
    // Act & Assert
    assertThrows(ArithmeticException.class, () -> {
        calculator.divide(10, 0);
    });
}
```

### Example 4: Test with List

```java
@Test
public void testFiltering() {
    // Arrange
    List<String> names = Arrays.asList("Anna", "John", "Mary", "Joseph", "Anthony");
    NameFilter filter = new NameFilter();
    
    // Act
    List<String> result = filter.filterByFirstLetter(names, 'A');
    
    // Assert
    assertEquals(2, result.size());
    assertTrue(result.contains("Anna"));
    assertTrue(result.contains("Anthony"));
}
```

## Tips for Good Unit Tests

1. **Keep tests small and focused**
   - Each test should verify only one specific behavior or aspect

2. **Use descriptive names**
   - The test name should explain what is being tested and the expected result
   - Ex: `shouldReturnTrueWhenEmailIsValid()`

3. **Isolate tests**
   - Tests should not depend on other tests or execution order
   - Use mocks or stubs to isolate external dependencies

4. **Avoid conditional logic in tests**
   - Tests should follow a linear and predictable path
   - If you need to test multiple scenarios, create multiple tests

5. **Follow the F.I.R.S.T. rule**
   - **F**ast: Tests should execute quickly
   - **I**solated: Tests should not depend on each other
   - **R**epeatable: Tests should be consistent in any environment
   - **S**elf-validating: Tests should automatically determine whether they pass or fail
   - **T**imely: Tests should be written along with the code or before

## Common Testing Tools in Java

- **JUnit 5**: Testing framework
- **Mockito**: Framework for creating mocks
- **AssertJ**: Library for fluent assertions
- **Hamcrest**: Library for matchers
- **PowerMock**: Extension of Mockito for advanced cases

## How to Run the Tests

```bash
# Using Maven
mvn test

# Using Gradle
gradle test
```
