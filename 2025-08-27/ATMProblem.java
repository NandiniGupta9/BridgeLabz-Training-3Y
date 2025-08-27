import java.util.Scanner;

public class ATMProblem {

    
    public static int getBalance(int[] arr, int n) {
        int balance = 0;
        for (int i = 0; i < n; i++) {
            balance += arr[i]; 
        }
        return balance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] transactions = new int[100]; 
        int count = 0;

        while (true) {
            System.out.println("\n1. Deposit  2. Withdraw  3. Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter deposit amount: ");
                int dep = sc.nextInt();
                transactions[count] = dep;   
                count++;
            } 
            else if (choice == 2) {
                System.out.print("Enter withdraw amount: ");
                int wd = sc.nextInt();
                transactions[count] = -wd;  
                count++;
            } 
            else if (choice == 3) {
                break; 
            } 
            else {
                System.out.println("Invalid choice");
                continue;
            }

            int balance = getBalance(transactions, count);
            System.out.println("Current Balance: " + balance);

            if (balance < 0) {
                System.out.println("Overdraft!");
            }
        }

       
        int finalBal = getBalance(transactions, count);
        System.out.println("\nFinal Balance = " + finalBal);
        if (finalBal < 0) {
            System.out.println("Overdraft!");
        }

        
    }
}

