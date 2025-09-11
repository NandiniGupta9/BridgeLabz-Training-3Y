

import java.util.ArrayList;
import java.util.List;

public class Course {
    String courseName;
    Professor professor;
    List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    // Aggregation: Course can exist even without students/professor
    public void setProfessor(Professor p) {
        this.professor = p;
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void showCourseDetails() {
        System.out.println("\nCourse: " + courseName);
        if (professor != null) {
            System.out.println("Professor: " + professor.name);
        } else {
            System.out.println("No professor assigned yet.");
        }

        System.out.println("Enrolled Students:");
        if (students.isEmpty()) {
            System.out.println(" - No students enrolled yet.");
        } else {
            for (Student s : students) {
                System.out.println(" - " + s.name);
            }
        }
    }
}
