

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Customer> customers;

    // Constructor
    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    // Method to open a new account for a customer
    public void openAccount(Customer customer, double initialBalance) {
        customer.setBank(this);  // link customer to this bank
        customer.setBalance(initialBalance);
        customers.add(customer);
        System.out.println("Account opened for " + customer.getName() + " in " + name + " with balance " + initialBalance);
    }

    // Show all customers of the bank
    public void showCustomers() {
        System.out.println("Bank: " + name + " has following customers:");
        for (Customer c : customers) {
            System.out.println(" - " + c.getName());
        }
    }
}

