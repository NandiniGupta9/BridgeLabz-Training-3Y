

public class Main {
    public static void main(String[] args) {
        
        Faculty f1 = new Faculty("Alice", "Computer Science");
        Faculty f2 = new Faculty("Bob", "Mathematics");
        Faculty f3 = new Faculty("Charlie", "Physics");

       
        University uni = new University("GLA University");
        Department cs = new Department("Computer Science");
        Department math = new Department("Mathematics");

        
        cs.addFaculty(f1);
        math.addFaculty(f2);

      
        uni.addDepartment(cs);
        uni.addDepartment(math);

        
        uni.showDetails();

        System.out.println("\nFaculty existing independently:");
        f3.showDetails(); 

        
        System.out.println("\n--- Deleting University ---");
        uni.deleteUniversity();
        uni.showDetails(); 
    }
}
