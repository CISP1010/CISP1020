package Notes09_12_23;
/**
   Describes any class whose objects can be measured.
*/
public interface Measurable //interface is a class that has no implementation.
                            //It is a contract that says that any class that implements this interface must have a getMeasure method.
                           //The getMeasure method must return a double.
                           //Interface can automatically call the getMeasure method of any class that implements this interface.
                           //Even if the class that implements this interface has a different name for the getMeasure method, the interface can still call it.
{
   /**
      Computes the measure of the object.
      @return the measure
   */
   double getMeasure();
}
