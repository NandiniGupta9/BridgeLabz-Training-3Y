

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    int rollNumber;
    List<Course> enrolledCourses;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.enrolledCourses = new ArrayList<>();
    }

    // Communication method: student enrolling in a course
    public void enrollCourse(Course c) {
        enrolledCourses.add(c);
        c.addStudent(this);
        System.out.println(name + " enrolled in " + c.courseName);
    }

    public void showEnrolledCourses() {
        System.out.println("\nStudent: " + name + " | Roll: " + rollNumber);
        System.out.println("Enrolled Courses:");
        for (Course c : enrolledCourses) {
            System.out.println(" - " + c.courseName);
        }
    }
}
