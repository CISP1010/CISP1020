package Notes08_17_23;
import java.util.ArrayList;
import java.util.Scanner;

public class BankAccountTester {
    static ArrayList<BankAccount> accounts = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean adding = true;
        while (adding) {
            System.out.println("What is your account number?");
            int accountNum = scanner.nextInt();
            System.out.println("What is your name?");
            String name = scanner.next();
            System.out.println("What is your balance?");
            double balance = scanner.nextDouble();
            BankAccount bankAccount = new BankAccount(accountNum, balance, name);
            accounts.add(bankAccount);
            System.out.println("Account Added! Here is your information:");
            for (BankAccount ba : accounts) {
                System.out.println(ba.toString());
            }
            System.out.println();
            System.out.println("Would you like to add another account? (Y/N)");
            adding = scanner.next().equalsIgnoreCase("Y");
        }
        System.out.println("Total Balance of all accounts");
        System.out.println("Total Balance is: " + totalBalance(accounts));
    }
    public static double totalBalance(ArrayList<BankAccount> accounts) {
        double totalBalance = 0;
        for (BankAccount ba : accounts) {
            totalBalance += ba.getBalance();
        }
        return totalBalance;
    }
}
