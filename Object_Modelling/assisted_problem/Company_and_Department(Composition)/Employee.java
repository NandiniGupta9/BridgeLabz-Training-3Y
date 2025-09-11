

public class Employee {
    private String name;
    private String position;

    // Constructor
    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getDetails() {
        return name + " (" + position + ")";
    }
}
