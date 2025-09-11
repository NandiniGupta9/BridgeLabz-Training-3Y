

public class Main {
    public static void main(String[] args) {
        // Create company
        Company company = new Company("TechCorp");

        // Create departments
        Department devDept = new Department("Development");
        Department hrDept = new Department("Human Resources");

        // Add employees to departments
        devDept.addEmployee(new Employee("Alice", "Software Engineer"));
        devDept.addEmployee(new Employee("Bob", "Backend Developer"));

        hrDept.addEmployee(new Employee("Charlie", "HR Manager"));

        // Add departments to company
        company.addDepartment(devDept);
        company.addDepartment(hrDept);

        // Show structure
        company.showCompanyStructure();

        // Delete company (composition effect)
        company.closeCompany();

        // Try showing after deletion
        company.showCompanyStructure();
    }
}

