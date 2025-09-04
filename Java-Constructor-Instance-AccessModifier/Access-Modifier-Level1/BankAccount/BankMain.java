

public class BankMain {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("ACC123", "Alice", 5000);
        acc1.deposit(1500);
        acc1.withdraw(2000);

        SavingsAccount sa = new SavingsAccount("SAV456", "Bob", 10000, 4.5);
        sa.showAccountDetails();
    }
}
