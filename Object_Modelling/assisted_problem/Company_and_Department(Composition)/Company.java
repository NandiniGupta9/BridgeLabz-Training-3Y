

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Department> departments;

    // Constructor
    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Add department
    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    // Show all departments and employees
    public void showCompanyStructure() {
        System.out.println("Company: " + name);
        for (Department d : departments) {
            d.showEmployees();
        }
    }

    // Simulate deleting company
    public void closeCompany() {
        System.out.println("Closing company: " + name);
        departments.clear(); // delete all departments (and employees inside them)
    }
}
