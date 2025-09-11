

public class Customer {
    private String name;
    private Bank bank;   // association: Customer ↔ Bank
    private double balance;

    // Constructor
    public Customer(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setters for association
    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to view balance
    public void viewBalance() {
        if (bank != null) {
            System.out.println(name + " has a balance of " + balance + " in " + bankName());
        } else {
            System.out.println(name + " does not have a bank account.");
        }
    }

    private String bankName() {
        return bank == null ? "No Bank" : bank.getClass().getSimpleName();
    }
}
