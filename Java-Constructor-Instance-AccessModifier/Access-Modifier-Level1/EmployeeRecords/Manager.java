

public class Manager extends Employee {
    private String teamName;

    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    public void showDetails() {
        System.out.println("Manager ID: " + employeeID + ", Department: " + department + ", Team: " + teamName);
    }
}
