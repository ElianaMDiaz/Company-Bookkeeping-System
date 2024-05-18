// This is code by Eliana Diaz.

// Company.java
public class Company {
  // Company name
  private String name;
  // Array to hold employees
  private Employee[] employees;
  // Array to hold utilities
  private Utility[] utilities;
  // Index to keep track of employee array
  private int employeeIndex;
  // Index to keep track of utility array
  private int utilityIndex;

  // Constructor to initialize company name, employee, and utility arrays
  public Company(String name, int maxEmployees, int maxUtilities) {
    this.name = name;
    this.employees = new Employee[maxEmployees];
    this.utilities = new Utility[maxUtilities];
    this.employeeIndex = 0;
    this.utilityIndex = 0;
  }

  // Getter method for company name
  public String getName() {
    return name;
  }

  // Method to add an employee to the employees array
  public void addEmployee(Employee employee) {
    if (employeeIndex < employees.length) {
      employees[employeeIndex++] = employee;
    } else {
      System.out.println("Maximum number of employees reached.");
    }
  }

  // Method to add a utility to the utilities array
  public void addUtility(Utility utility) {
    if (utilityIndex < utilities.length) {
      utilities[utilityIndex++] = utility;
    } else {
      System.out.println("Maximum number of utilities reached.");
    }
  }

  // Method to create a payroll listing for the company
  public String createPayrollListing() {
    StringBuilder payrollListing = new StringBuilder();
    payrollListing.append(name).append(" Payroll\n");
    payrollListing.append("Name               Code Pay       Total Pay\n");
    for (Employee employee : employees) {
      if (employee != null) {
        payrollListing.append(employee.toString()).append("\n");
      }
    }
    return payrollListing.toString();
  }

  // Method to create a utility listing for the company
  public String createUtilityListing() {
    StringBuilder utilityListing = new StringBuilder();
    utilityListing.append(name).append(" Utilities\n");
    utilityListing.append("Name                Bill Amount\n");
    for (Utility utility : utilities) {
      if (utility != null) {
        utilityListing.append(utility.toString()).append("\n");
      }
    }
    return utilityListing.toString();
  }

  // Private method to calculate expenditures for either employees or utilities
  private double calcExpenditures(PayableEntity[] payableEntities) {
    double total = 0;
    for (PayableEntity entity : payableEntities) {
      if (entity != null) {
        total += entity.amountOwed();
      }
    }
    return total;
  }

  // Method to calculate total expenditures for the company
  public double calcTotalExpenditures() {
    double totalEmployeeExpenditure = calcExpenditures(employees);
    double totalUtilityExpenditure = calcExpenditures(utilities);
    return totalEmployeeExpenditure + totalUtilityExpenditure;
  }
}
