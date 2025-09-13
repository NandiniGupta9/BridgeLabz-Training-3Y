public class BankMain {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA123", 5000, 4.5);
        CheckingAccount checking = new CheckingAccount("CA456", 2000, 1000);
        FixedDepositAccount fd = new FixedDepositAccount("FD789", 10000, 12);

        // Display all accounts
        savings.displayAccountType();
        checking.displayAccountType();
        fd.displayAccountType();
    }
}

