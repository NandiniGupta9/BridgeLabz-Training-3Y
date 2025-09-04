

public class UniversityMain {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice", 8.5);
        s1.display();

        PostgraduateStudent pg = new PostgraduateStudent(102, "Bob", 9.0, "AI");
        pg.showDetails();

        s1.setCGPA(9.2);
        System.out.println("Updated CGPA of " + s1.name + ": " + s1.getCGPA());
    }
}
