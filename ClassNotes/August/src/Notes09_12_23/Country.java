package Notes09_12_23;
/**
   A country with a name and area.
*/
public class Country implements Measurable //Country class implements the Measurable interface.
                                           //The Measurable interface has a getMeasure method.
                                           //The Country class must have a getMeasure method.
                                           //The getMeasure method passes the area of the country to the Measurable interface.

{
   private final String name;
   private final double area;

   /**
      Constructs a country.
      @param aName the name of the country
      @param anArea the area of the country
   */
   public Country(String aName, double anArea) 
   { 
      name = aName;
      area = anArea; 
   }

   /**
      Gets the country name.
      @return the name
   */
   public String getName() 
   {
      return name;
   }

   /**
      Gets the area of the country.
      @return the area
   */
   public double getArea() 
   {
      return area;
   }
   @Override
   public double getMeasure()
   {
      return area; //The getMeasure method of the Measurable interface returns the area of the country.
   }

  }
