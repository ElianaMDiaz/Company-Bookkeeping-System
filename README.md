# Company Bookkeeping System

## Overview
This Java application manages the payroll and utility payments for a company. It supports different types of employees, including hourly, salaried, commission-based, and limited commission employees. The system also handles utility payments, calculating each utility's cost based on usage and a fixed base fee.

## Features

- **Employee Payment Calculation**: Calculates weekly payments for different types of employees based on their work hours, sales, or salary.
- **Utility Payment Calculation**: Computes the cost for utilities such as electricity and internet based on usage and a fixed base fee.
- **Bonus Handling**: Includes functionality to add bonuses to employees' payments.
- **Comprehensive Output**: Generates detailed payroll and utility payment listings for the company.

## Classes and Interfaces

- **PayableEntity**: Interface that requires implementing an `amountOwed` method.
- **Employee**: Abstract class for all employee types with common methods and attributes.
- **HourlyEmployee**, **SalariedEmployee**, **CommissionEmployee**, **LimitedCommissionEmployee**: Concrete classes for different types of employees.
- **Utility**: Class for handling utility payment calculations.
- **Company**: Class that aggregates employees and utilities, responsible for generating payment reports.

## Setup and Execution

1. **Environment Setup**: Ensure Java SDK is installed on your system and the JAVA_HOME environment variable is set.
2. **Compilation**: Compile the classes using Java compiler.
   ```bash
   javac *.java
