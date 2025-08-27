import java.util.Scanner;

public class FitnessCenter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean keepRunning = true;

        System.out.println("=== Welcome to Fitness Center Membership System ===");

       
        while (keepRunning) {
            System.out.print("Enter number of members to register in this session: ");
            int n = sc.nextInt();

            int i = 0;
            do {
                System.out.println("\nRegistering Member " + (i + 1));

               
                System.out.println("Select Membership Type:");
                System.out.println("1. Monthly (₹1000)");
                System.out.println("2. Quarterly (₹2500)");
                System.out.println("3. Yearly (₹9000)");
                int choice = sc.nextInt();

                double fee = 0;
                switch (choice) {
                    case 1: fee = 1000; break;
                    case 2: fee = 2500; break;
                    case 3: fee = 9000; break;
                    default: 
                        System.out.println("Invalid choice! Default Monthly selected.");
                        fee = 1000;
                }

               
                System.out.println("Are you a student (s) or senior citizen (c)? Enter y/n:");
                char discountCheck = sc.next().charAt(0);

                if (discountCheck == 'y' || discountCheck == 'Y') {
                    fee = fee * 0.8;  
                    System.out.println("Discount applied: 20%");
                }

                System.out.println("Final Fee for Member " + (i + 1) + ": ₹" + fee);

                i++;
            } while (i < n);

       
            System.out.println("\nDo you want to register more members? (y/n): ");
            char ch = sc.next().charAt(0);
            if (ch == 'n' || ch == 'N') {
                keepRunning = false;
                System.out.println("System Closed. Thank you!");
            }
        }

      
    }
}
