

public class Main {
    public static void main(String[] args) {
        
        School school = new School("Greenwood High");

        Student s1 = new Student("Sakshi");
        Student s2 = new Student("Khushi");

       
        school.addStudent(s1);
        school.addStudent(s2);

        
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

       
        math.enrollStudent(s1);
        science.enrollStudent(s1);

        science.enrollStudent(s2);

        
        school.showStudents();

        
        s1.showCourses();
        s2.showCourses();

        
        math.showEnrolledStudents();
        science.showEnrolledStudents();
    }
}

