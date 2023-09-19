package Classwork3;

public class Utility {
    public static double totalTax(Taxable[] elements){
        double total = 0;
        for (Taxable element : elements) {
            total += element.getTaxable();
        }
        return total;
    }
}
