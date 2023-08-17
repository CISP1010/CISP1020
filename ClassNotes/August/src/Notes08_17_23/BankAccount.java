package Notes08_17_23;

public class BankAccount {
    private int accountNum;
    private double balance;
    private String name;

    public BankAccount(int accountNum, double balance, String name) {
        this.accountNum = accountNum;
        this.balance = balance;
        this.name = name;
    }
    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public int getAccountNum() {
        return accountNum;
    }
    public double getBalance() {
        return balance;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return "Account Number: " + accountNum + "\nBalance: " + balance + "\nName: " + name;
    }
}
