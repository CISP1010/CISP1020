package Notes08_15_23;

import java.util.ArrayList;
public class Pretest {
    String item = "Laptop";
    double price = 299.856;
    int warranty = 2;
    public static void main(String[] args) {
        Pretest e = new Pretest();
        System.out.println();
        ArrayList<Double> prices = new ArrayList<>();
        prices.add(3.5);
        prices.add(5.90);
        prices.add(7.99);
        System.out.println(prices);
        System.out.println(prices.get(2));
    }

}
