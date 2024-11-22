# Software Engineering HW4 - #7, 8, 9

This project demonstrates three design patterns implemented in Java: **Observer Pattern**, **Factory Method Pattern**, and **Adapter Pattern**. Each pattern is implemented in separate classes with a Main file to demonstrate the functionality.

## Prerequisites

* **Java 17 or later**: Ensure you have Java Development Kit (JDK) version 17 or above installed.
* **Maven 3.x or later**: The project uses Maven for dependency management and build automation.

## Project Structure

### Classes
* **CarFactory**: Factory class for creating different types of cars
* **LegacyReservation**: Legacy reservation system class
* **LuxuryCar**: Implementation of luxury car type
* **Main**: Main class to demonstrate pattern usage
* **Mediator**: Interface for mediator pattern
* **MessageMediator**: Implementation of message mediator
* **NormalCar**: Implementation of standard car type
* **Observer**: Interface for observer pattern
* **ReservationAdapter**: Adapter for reservation system
* **ReservationSystem**: Interface for reservation system
* **Rider**: Class representing a rider
* **RiderObserver**: Implementation of rider observer
* **ShareableCar**: Interface for shareable cars
* **SUVCar**: Implementation of SUV car type
* **WheelchairAccessibleCar**: Implementation of wheelchair accessible car type

### Test Folder
Includes the following test classes:
* RiderMediatorTest.java: Tests the Observer Pattern implementation
* CarFactoryTest.java: Tests the Factory Method Pattern implementation
* ReservationAdapterTest.java: Tests the Adapter Pattern implementation

## Build and Run Instructions

### Clone the Repository

```bash
git clone <repository-url>
cd SoftwareEngineeringHW4
```

### Build the Project

Use Maven to compile the project:

```bash
mvn clean install
```

### Run the Code

Execute the Main class to see the demonstration of all three patterns:

```bash
mvn exec:java -Dexec.mainClass="Main"
```

### Run Tests

The test folder contains individual test cases for each pattern. Run the tests using Maven:

```bash
mvn test
```

## Dependencies

The project uses the following dependency:

* **JUnit 5**: Version 5.11.3 for testing. Specified in the pom.xml file:

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.11.3</version>
</dependency>
```

## Notes

1. **Pattern Implementation**: Each design pattern is implemented in its respective classes with clear separation of concerns.
2. **Test Structure**: Each pattern has a dedicated test class for clarity.