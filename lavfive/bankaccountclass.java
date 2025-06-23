class BankAccount {
int accountNumber;
String accountHolderName;
double balance;
static String bankName = "Sonali Bank";
BankAccount(int accountNumber, String accountHolderName, double balance) {
this.accountNumber = accountNumber;
this.accountHolderName = accountHolderName;
this.balance = balance;
}
static void showBankName() {
System.out.println("Bank Name: " + bankName);
}
void displayAccountInfo() {
System.out.println("Account Number: " + accountNumber);
System.out.println("Account Holder: " + accountHolderName);
System.out.println("Balance: " + balance);
System.out.println();
}
}
public class Main {
public static void main(String[] args) {
BankAccount account1 = new BankAccount(1001, "Rahim Uddin", 5000.0);
BankAccount account2 = new BankAccount(1002, "Karim Uddin", 8000.0);
BankAccount.showBankName();
System.out.println();
account1.displayAccountInfo();
account2.displayAccountInfo();
}
}
