

public class Faculty {
    String name;
    String specialization;

    public Faculty(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public void showDetails() {
        System.out.println("Faculty: " + name + " | Specialization: " + specialization);
    }
}

