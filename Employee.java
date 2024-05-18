// Employee.java
public abstract class Employee implements PayableEntity {
  // Static variable to count the number of employees
  private static int numEmployees = 0;
  private String name; // Instance variable to store the name of the employee
  private double bonus; // Instance variable to store the bonus amount

  // Constructor to initialize an employee with name and increment the count of
  // employees
  public Employee(String name) {
    this.name = name;
    numEmployees++;
  }

  // Abstract method to calculate the pre-bonus pay for the employee
  public abstract double calcPrebonusPay();

  // Abstract method to get the job code of the employee
  public abstract String getJobCode();

  // Static method to get the total number of employees
  public static int getNumEmployees() {
    return numEmployees;
  }

  // Method to calculate the total pay for the employee
  public double calcTotalPay() {
    return calcPrebonusPay() + bonus;
  }

  // Method to implement the amountOwed() method of the PayableEntity interface
  @Override
  public double amountOwed() {
    return calcTotalPay();
  }

  // Getter method to get the name of the employee
  public String getName() {
    return name;
  }

  // Getter method to get the bonus amount of the employee
  public double getBonus() {
    return bonus;
  }

  // Setter method to set the bonus amount of the employee
  public void setBonus(double bonus) {
    this.bonus = bonus;
  }

  // Method to generate a string representation of the employee
  @Override
  public String toString() {
    // Format the pre-bonus pay and total pay as currency with 2 decimal places
    String preBonusPayFormatted = String.format("$%10.2f", calcPrebonusPay());
    String totalPayFormatted = String.format("$%10.2f", calcTotalPay());

    // Return the formatted string containing employee details
    return String.format("%-15s %-4s %-12s %-12s",
        name, getJobCode(), preBonusPayFormatted, totalPayFormatted);
  }
}
