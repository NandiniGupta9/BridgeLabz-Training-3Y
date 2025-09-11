

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private List<Student> students; // association: many students per course

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            student.addCourse(this); // two-way association
        }
    }

    public void showEnrolledStudents() {
        System.out.println("Course: " + name + " has students:");
        for (Student s : students) {
            System.out.println(" - " + s.getName());
        }
    }
}

