package Notes09_05_23.Vehicle;
public class Vehicle
{
   private int numberOfTires;

   public int getNumberOfTires() 
   {
      return numberOfTires; 
   }

   public void setNumberOfTires(int newValue) 
   { 
      numberOfTires = newValue;
   }

   public String getDescription()
   {
      return getClass().getName() + "[numberOfTires=" + numberOfTires + "]";
   }
   public String toString()
   {
      return getClass().getName() + "[numberOfTires=" + numberOfTires + "]";
      // This is a good way of implementing toString in a superclass--see Special Topic 9.6
      // the getClass() will get the name and display it no matter what the name is
   }
}

