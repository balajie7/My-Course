package Task3;

public class Employee implements Taxable {
    private int empId;
    private String name;
    private double salary;

    // Constructor
    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Implementing calculateTax() from Taxable interface
    @Override
    public double calculateTax() {
        return salary * INCOME_TAX_RATE;
    }

    @Override
    public String toString() {
        return "Employee ID: " + empId + ", Name: " + name + ", Salary: $" +salary;
  }


}
