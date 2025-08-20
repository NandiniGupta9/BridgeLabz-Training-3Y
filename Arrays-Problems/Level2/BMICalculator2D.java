import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter height (m) of person " + (i+1));
            double h = sc.nextDouble();
            System.out.println("Enter weight (kg) of person " + (i+1));
            double w = sc.nextDouble();

            personData[i][0] = h;
            personData[i][1] = w;
            personData[i][2] = w / (h * h);

            if (personData[i][2] < 18.5) weightStatus[i] = "Underweight";
            else if (personData[i][2] < 25) weightStatus[i] = "Normal";
            else if (personData[i][2] < 30) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i+1) + ": H=" + personData[i][0] + " W=" + personData[i][1] + " BMI=" + personData[i][2] + " Status=" + weightStatus[i]);
        }
    }
}
