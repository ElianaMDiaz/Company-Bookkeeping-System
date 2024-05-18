// LimitedCommissionEmployee.java
public class LimitedCommissionEmployee extends CommissionEmployee {
  // Instance variable to store the base pay of the limited commission employee
  private double basePay;

  // Constructor to initialize a limited commission employee with name, commission
  // rate, and base pay
  public LimitedCommissionEmployee(String name, double commissionRate, double basePay) {
    // Call the constructor of the superclass (CommissionEmployee) with name and
    // commission rate
    super(name, commissionRate);
    this.basePay = basePay; // Set the base pay
  }

  // Method to get the base pay of the limited commission employee
  public double getBasePay() {
    return basePay;
  }

  // Method to calculate the pre-bonus pay for the limited commission employee
  @Override
  public double calcPrebonusPay() {
    // Calculate the pre-bonus pay using the commission rate and sales amount
    double prebonusPay = super.calcPrebonusPay();
    // Calculate the limited pay based on the base pay and twice the base pay
    double limitedPay = Math.max(basePay, Math.min(2 * basePay, prebonusPay));
    return limitedPay; // Return the limited pay
  }

  // Method to get the job code of the limited commission employee
  @Override
  public String getJobCode() {
    return "LCOM"; // Return the job code for a limited commission employee
  }
}
