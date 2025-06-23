// Interface
interface ATMService {
    void withdraw(double amount);
    void deposit(double amount);
    void checkBalance();
}

// Implementing class
class DBBL implements ATMService {
    private double balance;

    // Constructor
    DBBL(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// Main class to test DBBL ATM
public class Main {
    public static void main(String[] args) {
        DBBL myAccount = new DBBL(10000.0);

        myAccount.deposit(2000.0);
        myAccount.withdraw(1500.0);
        myAccount.checkBalance();
    }
}
