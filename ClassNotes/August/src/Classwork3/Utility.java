package Classwork3;

public class Utility {
    public static double totalTax(Taxable[] elements){
        double total = 0;
        for (Taxable element : elements) {
            total += element.getTaxable();
        }
        return total;
    }

    public static Taxable largest(Taxable obj1, Taxable obj2){
        if (obj1.getTaxable() > obj2.getTaxable()){
            return obj1;
        }
        else{
            return obj2;
        }
    }
}
