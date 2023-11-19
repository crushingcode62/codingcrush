public class BankAccount {
    private String accountNumber;
    private double balance;

    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Setter methods
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        // Create an instance of the BankAccount class
        BankAccount account = new BankAccount();

        // Set the values using setter methods
        account.setAccountNumber("123456789");
        account.setBalance(1000.50);

        // Display the values using getter methods
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: $" + account.getBalance());
    }
}
   