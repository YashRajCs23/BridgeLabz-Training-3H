package Constructor.Access Modifiers.Employee Records;
public class Employee {
    // Public: accessible everywhere
    public int employeeID;
    
    // Protected: accessible within package and subclasses
    protected String department;
    // Private: accessible only inside this class
    private double salary;
    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    // Public getter for salary
    public double getSalary() {
        return salary;
    }
    // Public method to modify salary
    public void setSalary(double newSalary) {
        if (newSalary > 0) {
            salary = newSalary;
            System.out.println("Salary updated to: " + salary);
        } else {
            System.out.println("Invalid salary amount!");
        }
    }
    // Display details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID +
                           ", Department: " + department +
                           ", Salary: " + salary);
    }
}
// Subclass Manager
class Manager extends Employee {
    String teamName;
    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }
    // Demonstrating access to public and protected members
    public void displayManagerDetails() {
        // employeeID -> public (accessible)
        // department -> protected (accessible)
        // salary -> private (NOT directly accessible, must use getter)
        System.out.println("Manager ID: " + employeeID +
                           ", Department: " + department +
                           ", Salary: " + getSalary() +
                           ", Team: " + teamName);
    }
}