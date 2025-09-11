

public class Main {
    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank("City Bank");

        // Create customers
        Customer cust1 = new Customer("Nandini");
        Customer cust2 = new Customer("Mahak");

        // Open accounts for customers
        bank.openAccount(cust1, 1000.0);
        bank.openAccount(cust2, 2500.0);

        // Show customers in bank
        bank.showCustomers();

        // Customers check balance
        cust1.viewBalance();
        cust2.viewBalance();
    }
}
