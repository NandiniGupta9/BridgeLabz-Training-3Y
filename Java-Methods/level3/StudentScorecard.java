import java.util.*;

public class StudentScorecard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[3]; // PCM

        System.out.print("Enter Physics marks: ");
        marks[0] = sc.nextInt();
        System.out.print("Enter Chemistry marks: ");
        marks[1] = sc.nextInt();
        System.out.print("Enter Maths marks: ");
        marks[2] = sc.nextInt();

        int total = marks[0] + marks[1] + marks[2];
        double avg = total / 3.0;
        double percentage = (total / 300.0) * 100;

        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
        System.out.println("Percentage: " + percentage + "%");
    }
}
