# Area Calculator
This project was developed as part of the **"Software Testing Formation"** course at **Iterasys**.
It consists of two main components: the implementation of an area calculator and the unit testing of its functionalities.

## Summary
* [Part 1: Area Calculator Project](#part-1-area-calculator-project)
    * [Features](#features)
    * [Running the Calculator](#running-the-calculator)

* [Part 2: Unit Tests](#part-2-unit-tests)
    * [Test Features](#test-features)
    * [Running the Tests](#running-the-tests)
    * [Test Dependencies](#test-dependencies)

* [Language and Tools](#language-and-tools)

* [Feedback](#feedback)


## Part 1: Area Calculator Project
The area calculator is a console application that allows users to calculate the areas of various geometric shapes.
It features an intuitive menu for user interaction.

### Features
- [x] Calculate the area of a square
- [x] Calculate the area of a rectangle
- [x] Calculate the area of a circle
- [x] Calculate the area of a triangle
- [x] Intuitive menu for user interaction

### Running the Calculator
1. Open the project in your preferred IDE.
2. Navigate to the `Main` class located in the ``com.iterasys`` source package.
3. Run the ``Main`` class.
4. Follow the prompts in the console to select a geometric shape and input dimensions.


## Part 2: Unit Tests
Unit tests have been written to validate the correctness of the area calculations.
The tests include both simple cases and data-driven scenarios.

### Test Features
- [x] **Square Area Test:** Validates the calculation of a square's area.
- [x] **Rectangle Area Test (***Data-driven***):** Uses multiple data sets to verify rectangle area calculations.
- [x] **Circle Area Test:** Validates the calculation of a circle's area.
- [x] **Triangle Area Test (***CSV Data-driven***):** Reads test data from a CSV file to validate triangle area calculations.

### Running the Tests
1. Ensure Maven is correctly installed and added to your system's PATH.
2. Open the terminal and navigate to the project root directory.
3. Execute ``mvn clean test``
4. View the test results in the console.

### Test Dependencies
The following dependencies are used for unit testing:
- ``junit-jupiter-api`` (version 5.11.4)
- ``junit-jupiter-params`` (version 5.11.4)
- ``hamcrest`` (version 3.0)

Make sure these dependencies are listed in the ``pom.xml`` file.

## Language and Tools
<p>
  <a href="https://go-skill-icons.vercel.app/">
    <img
      src="https://go-skill-icons.vercel.app/api/icons?i=java,maven"
    />
  </a>
</p>

## Feedback
This is my first Java project, and I am also practicing my English writing skills through this repository.
If you have any suggestions, feel free to reach out to me on [LinkedIn](https://www.linkedin.com/in/carol-guimaraes/).

Thank you for checking out my project!