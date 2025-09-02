import java.util.Scanner;

public class AthleteRun {
    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000; 
        return (int)Math.ceil(totalDistance / perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 sides of the triangle in meters: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        System.out.println("Rounds needed = " + calculateRounds(a, b, c));
    }
}
