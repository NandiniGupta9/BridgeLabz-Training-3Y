import java.util.*;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salaries = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary of Employee " + (i+1) + ": ");
            salaries[i] = sc.nextDouble();
        }

        for (int i = 0; i < 10; i++) {
            double bonus = salaries[i] * 0.10;
            double newSalary = salaries[i] + bonus;
            System.out.println("Employee " + (i+1) + " - Old: " + salaries[i] + ", New: " + newSalary);
        }
    }
}
