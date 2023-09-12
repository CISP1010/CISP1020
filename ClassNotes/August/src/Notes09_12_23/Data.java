package Notes09_12_23;
public class Data
{
   /**
      Computes the average of the measures of the given objects.
      @param objects an array of Measurable objects
      @return the average of the measures
   */
   public static double average(Measurable[] objects) //This method can be called with an array of any class that implements the Measurable interface.
                                                      //The array is passed to the Measurable interface which calls the getMeasure method of the class that implements the Measurable interface.
   {
      double sum = 0;
      for (Measurable obj : objects)
      {
         sum = sum + obj.getMeasure();
      }
      if (objects.length > 0) { return sum / objects.length; }
      else { return 0; }
   }
}
