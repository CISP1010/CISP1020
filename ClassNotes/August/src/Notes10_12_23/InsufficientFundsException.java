package Notes10_12_23;
//this goes with the BankAccount.java and InsufficientFundsException.java files

public class InsufficientFundsException extends IllegalArgumentException
{
   public InsufficientFundsException() {}
   public InsufficientFundsException(String message)
   {
      super(message);
   }
}

