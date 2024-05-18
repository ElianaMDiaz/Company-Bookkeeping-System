// CommissionEmployee.java
public class CommissionEmployee extends Employee {
    // Commission rate for the employee
    private double commissionRate;
    // Total sales amount for the employee
    private double salesAmount;

    // Constructor to initialize the commission employee with a name and commission rate
    public CommissionEmployee(String name, double commissionRate) {
        // Call the constructor of the superclass (Employee) with the given name
        super(name);
        // Initialize the commission rate
        this.commissionRate = commissionRate;
    }

    // Method to set the sales amount for the employee
    public void setSales(double salesAmount) {
        this.salesAmount = salesAmount;
    }

    // Override method to calculate the pre-bonus pay for the commission employee
    @Override
    public double calcPrebonusPay() {
        // Calculate pre-bonus pay by multiplying commission rate with sales amount
        return commissionRate * salesAmount;
    }

    // Override method to get the job code of the commission employee
    @Override
    public String getJobCode() {
        // Return the job code for a commission employee
        return "COMM";
    }
}
