public class EmployeeMain {
    public static void main(String[] args) {
        
        Manager manager = new Manager("Alice", 101, 80000, 10);
        Developer developer = new Developer("Bob", 102, 60000, "Java");
        Intern intern = new Intern("Charlie", 103, 15000, 6);

        
        Employee[] employees = {manager, developer, intern};

        
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}

