import java.util.ArrayList;

class Account {
    private String accountHolder;
    private double balance;

    // Constructor to initialize account details
    public Account(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Getter methods
    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance for " + accountHolder + ": " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance for " + accountHolder + ": " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}

class Bank {
    private ArrayList accounts;

    // Constructor to initialize the collection of accounts
    public Bank() {
        this.accounts = new ArrayList<>();
    }

    // Method to add an account to the collection
    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added for " + account.getAccountHolder());
    }

    // Method to remove an account from the collection
    public void removeAccount(Account account) {
        if (accounts.remove(account)) {
            System.out.println("Account removed for " + account.getAccountHolder());
        } else {
            System.out.println("Account not found for removal.");
        }
    }

    // Method to display all accounts in the bank
    public void displayAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts in the bank.");
        } else {
            System.out.println("Accounts in the bank:");
            for (Account account : accounts) {
                System.out.println("Account Holder: " + account.getAccountHolder() + ", Balance: " + account.getBalance());
            }
        }
    }
}

public class BankExample {
    public static void main(String[] args) {
        // Create an instance of the Bank class
        Bank myBank = new Bank();

        // Create instances of the Account class
        Account account1 = new Account("John Doe", 5000.0);
        Account account2 = new Account("Jane Smith", 8000.0);

        // Add accounts to the bank
        myBank.addAccount(account1);
        myBank.addAccount(account2);

        // Display accounts in the bank
        myBank.displayAccounts();

        // Deposit and withdraw money from an account
        account1.deposit(2000.0);
        account2.withdraw(3000.0);

        // Display updated balances
        myBank.displayAccounts();

        // Remove an account from the bank
        myBank.removeAccount(account1);

        // Display updated accounts in the bank
        myBank.displayAccounts();
    }
}
