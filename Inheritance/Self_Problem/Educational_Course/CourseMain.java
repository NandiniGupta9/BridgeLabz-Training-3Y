
public class CourseMain {
    public static void main(String[] args) {
     
        Course basicCourse = new Course("Introduction to Programming", 40);
        basicCourse.displayInfo();
        System.out.println();

       
        OnlineCourse onlineCourse = new OnlineCourse("Java Programming", 50, "Udemy", true);
        onlineCourse.displayInfo();
        System.out.println();

      
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Advanced Java", 60, "Coursera", true, 200, 20);
        paidCourse.displayInfo();
    }
}
