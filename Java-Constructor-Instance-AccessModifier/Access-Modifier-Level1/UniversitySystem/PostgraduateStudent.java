

public class PostgraduateStudent extends Student {

    private String specialization;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void showDetails() {
        System.out.println("PG Student: " + name + " (Specialization: " + specialization + ")");
    }
}
