

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "HR", 50000);
        e1.display();
        e1.updateSalary(60000);

        Manager m1 = new Manager(102, "IT", 80000, "Backend Team");
        m1.showDetails();
    }
}
