// SalariedEmployee.java
public class SalariedEmployee extends Employee {
  // Instance variable to store the weekly pay of the salaried employee
  private double weeklyPay;

  // Constructor to initialize a salaried employee with name and weekly pay
  public SalariedEmployee(String name, double weeklyPay) {
    super(name); // Call the constructor of the superclass (Employee)
    this.weeklyPay = weeklyPay;
  }

  // Method to calculate the pre-bonus pay for the salaried employee
  @Override
  public double calcPrebonusPay() {
    return weeklyPay;
  }

  // Method to get the job code of the salaried employee
  @Override
  public String getJobCode() {
    return "SLRY"; // Return the job code for a salaried employee
  }
}
