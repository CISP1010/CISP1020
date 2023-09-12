package Notes09_12_23;
/**
   This program demonstrates the measurable BankAccount and Country classes.
*/
public class MeasurableTester
{
   public static void main(String[] args)
   {
      // Calling the average method with an array of BankAccount objects
      Measurable[] accounts = new Measurable[3];
      accounts[0] = new BankAccount(0);
      accounts[1] = new BankAccount(10000);
      accounts[2] = new BankAccount(2000);

      double averageBalance = Data.average(accounts); //calls the average method in Data.java and passes the array accounts.
                                                      //The average method in Data.java calls the getMeasure method in BankAccount.java
      System.out.println("Average balance: " + averageBalance);
      System.out.println("Expected: 4000");

      // Calling the average method with an array of Country objects
      Measurable[] countries = new Measurable[3];
      countries[0] = new Country("Uruguay", 176220);
      countries[1] = new Country("Thailand", 513120);
      countries[2] = new Country("Belgium", 30510);

      double averageArea = Data.average(countries); //calls the average method in Data.java and passes the array countries.
                                                    //The average method in Data.java calls the getMeasure method in Country.java
      System.out.println("Average area: " + averageArea);
      System.out.println("Expected: 239950");
   }
}
