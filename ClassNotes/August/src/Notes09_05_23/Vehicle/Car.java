package Notes09_05_23.Vehicle;

public class Car extends Vehicle
{
   // This instance variable is added to the subclass
   private String licensePlateNumber;
   
   public Car()
   {
      setNumberOfTires(4); 
      licensePlateNumber = "??????";
   }

   public void setLicensePlateNumber(String newValue)
   {
      licensePlateNumber = newValue;
   }

//this overrides the getDescription method in the superclass and shoes license plate in
   @Override
   public String getDescription() {
      return super.getDescription() + "[licensePlateNumber=" + licensePlateNumber + "]";
   }

   public String toString()
   {
      return super.toString() + "[licensePlateNumber=" + licensePlateNumber + "]";
      // This is a good way of implementing toString in a subclass--see Special Topic 9.6
   }
}

