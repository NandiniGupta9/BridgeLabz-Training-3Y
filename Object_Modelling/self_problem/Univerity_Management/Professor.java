

import java.util.ArrayList;
import java.util.List;

public class Professor {
    String name;
    String department;
    List<Course> assignedCourses;

    public Professor(String name, String department) {
        this.name = name;
        this.department = department;
        this.assignedCourses = new ArrayList<>();
    }

    // Communication method: professor assigned to a course
    public void assignCourse(Course c) {
        assignedCourses.add(c);
        c.setProfessor(this);
        System.out.println("Professor " + name + " assigned to teach " + c.courseName);
    }

    public void showAssignedCourses() {
        System.out.println("\nProfessor: " + name + " | Department: " + department);
        System.out.println("Courses Teaching:");
        for (Course c : assignedCourses) {
            System.out.println(" - " + c.courseName);
        }
    }
}
