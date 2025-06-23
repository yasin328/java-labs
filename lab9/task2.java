class BankAccount {
    // Private fields
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Setter methods
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getter methods
    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Method to show account info securely
    public void showAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

// Main class to test BankAccount
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setAccountHolder("Yasin Ahmed");
        account.setAccountNumber("1234567890");
        account.setBalance(5000.00);

        System.out.println("Bank Account Information:");
        account.showAccountInfo();
    }
}
