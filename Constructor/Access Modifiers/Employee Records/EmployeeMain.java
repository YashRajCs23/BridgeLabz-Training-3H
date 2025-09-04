package Constructor.Access Modifiers.Employee Records;
public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "HR", 40000);
        e1.displayEmployeeDetails();
        
        // Modify salary using public method
        e1.setSalary(45000);
        System.out.println("Updated Salary (via getter): " + e1.getSalary());
        // Create Manager (subclass)
        Manager m1 = new Manager(201, "IT", 70000, "Development Team");
        m1.displayManagerDetails();
        // Update salary for Manager
        m1.setSalary(75000);
        m1.displayManagerDetails();
    }
}