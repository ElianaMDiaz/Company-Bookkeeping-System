// HourlyEmployee.java
public class HourlyEmployee extends Employee {
  // Instance variables to store hourly wage and hours worked
  private double hourlyWage;
  private double hoursWorked;

  // Constructor to initialize an hourly employee with name and hourly wage
  public HourlyEmployee(String name, double hourlyWage) {
    super(name); // Call the constructor of the superclass (Employee) with name
    this.hourlyWage = hourlyWage; // Set the hourly wage
  }

  // Method to set the hours worked by the hourly employee
  public void setHoursWorked(double hoursWorked) {
    this.hoursWorked = hoursWorked;
  }

  // Method to calculate the pre-bonus pay for the hourly employee
  @Override
  public double calcPrebonusPay() {
    if (hoursWorked <= 40) { // If hours worked is 40 or less
      return hoursWorked * hourlyWage; // Calculate pay based on regular hours
    } else {
      // Calculate pay based on regular hours (up to 40) and overtime hours (above 40)
      return 40 * hourlyWage + (hoursWorked - 40) * 1.5 * hourlyWage;
    }
  }

  // Method to get the job code of the hourly employee
  @Override
  public String getJobCode() {
    return "HRLY"; // Return the job code for an hourly employee
  }
}
