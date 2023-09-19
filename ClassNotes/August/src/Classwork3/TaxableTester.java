package Classwork3;
/**
 This program demonstrates the Taxable Houses and Items classes.
 */
public class TaxableTester {
    public static void main(String[] args) {
        // Calling the Taxable method with an array of House objects
        Taxable[] houses = new Taxable[3];
        houses[0] = new House("house1", 100000);
        houses[1] = new House("house2", 200000);
        houses[2] = new House("house3", 300000);

        double totalTax = Utility.totalTax(houses); //Calls the totalTax method in Utility.java and passes the array houses.
        System.out.println("TotalTax: $" + Math.round(totalTax * 100) / 100.0);
        System.out.println("Expected: $6000.0");

        // Calling the Taxable method with an array of Item objects
        Taxable[] items = new Taxable[3];
        items[0] = new Item("Code1", 45.34);
        items[1] = new Item("Code2", 22.99);
        items[2] = new Item("Code3", 98.23);

        double totalTaxItems = Utility.totalTax(items); //calls the TotalTax method in Utility.java and passes the array Items.
        //The TotalTax method in Utility.java calls the getTax method in Items.java
        System.out.println("Total Tax: $" + Math.round(totalTaxItems * 100.0) / 100.0);
        System.out.println("Expected: $11.66");
    }
}
