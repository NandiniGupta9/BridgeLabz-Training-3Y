

public class Main {
    public static void main(String[] args) {
        // Create students
        Student s1 = new Student("Alice", 101);
        Student s2 = new Student("Bob", 102);

        // Create professors
        Professor p1 = new Professor("Dr. Smith", "Computer Science");
        Professor p2 = new Professor("Dr. Johnson", "Mathematics");

        // Create courses
        Course c1 = new Course("Data Structures");
        Course c2 = new Course("Discrete Mathematics");

        // Assign professors to courses
        p1.assignCourse(c1);
        p2.assignCourse(c2);

        // Students enroll in courses
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c2);

        // Show details
        s1.showEnrolledCourses();
        s2.showEnrolledCourses();

        p1.showAssignedCourses();
        p2.showAssignedCourses();

        c1.showCourseDetails();
        c2.showCourseDetails();
    }
}
