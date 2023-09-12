package Notes09_12_23;

/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount implements Measurable //BankAccount class implements the Measurable interface.
                                                //The Measurable interface has a getMeasure method.
                                                //The BankAccount class must have a getMeasure method.
                                                //The getMeasure method passes the balance of the bank account to the Measurable interface.
{  
   private double balance;

   /**
      Constructs a bank account with a zero balance.
   */
   public BankAccount()
   {   
      balance = 0;
   }

   /**
      Constructs a bank account with a given balance.
      @param initialBalance the initial balance
   */
   public BankAccount(double initialBalance)
   {   
      balance = initialBalance;
   }

   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
   {  
      balance = balance + amount;
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {   
//      if (amount > balance)
//      {
//         throw new InsufficientFundsException(
//            "withdrawal of " + amount + " exceeds balance of " + balance);
//      }
      balance = balance - amount;
   }

   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance() {
      return balance; //The getMeasure method of the Measurable interface returns the balance of the bank account.
   }
   @Override
   public double getMeasure()
   {
       return balance;
   }
}

