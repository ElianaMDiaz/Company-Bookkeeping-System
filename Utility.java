// Utility.java
public class Utility implements PayableEntity {
  // Instance variables to store utility information
  private String name; // Name of the utility
  private double usage; // Amount of utility used
  private double rate; // Rate of the utility
  private double baseFee; // Base fee for the utility

  // Constructor to initialize utility with name, rate, and base fee
  public Utility(String name, double rate, double baseFee) {
    this.name = name;
    this.rate = rate;
    this.baseFee = baseFee;
  }

  // Method to set the usage of the utility
  public void setUsage(double usage) {
    this.usage = usage;
  }

  // Method to calculate the amount owed for the utility
  @Override
  public double amountOwed() {
    return usage * rate + baseFee;
  }

  // Method to format the utility information as a string
  @Override
  public String toString() {
    // Format the amount owed to display as currency with 2 decimal places
    String amountOwedFormatted = String.format("$%10.2f", amountOwed());
    // Format the utility information with left-aligned name and right-aligned
    // amount owed
    return String.format("%-20s %s", name, amountOwedFormatted);
  }
}
