

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Employee> employees;

    // Constructor
    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    // Add employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Show employees
    public void showEmployees() {
        System.out.println("Department: " + name);
        for (Employee e : employees) {
            System.out.println(" - " + e.getDetails());
        }
    }
}
