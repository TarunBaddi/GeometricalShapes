package CIE_1.G2;

import java.text.ParseException;

public class EmployeeDetails extends Person {
    private int emp_id;
    private double salary;

    // Constructor
    public EmployeeDetails(String name, String dateOfBirthStr, int emp_id, double salary) throws ParseException {
        super(name, dateOfBirthStr);
        this.emp_id = emp_id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + emp_id);
        displayName();
        displayAge();
        System.out.println("Employee Salary: $" + salary);
    }

    // Main method for testing
    public static void main(String[] args) {
        try {
            EmployeeDetails employee = new EmployeeDetails("John", "1990-05-15", 101, 50000.00); // Using YYYY-MM-DD
                                                                                                 // format
            employee.displayEmployeeDetails();

            EmployeeDetails employee2 = new EmployeeDetails("Alice", "15-05-1990", 102, 60000.00); // Using DD-MM-YYYY
                                                                                                   // format
            employee2.displayEmployeeDetails();
        } catch (ParseException e) {
            System.out.println("Invalid date format!");
        }
    }
}
