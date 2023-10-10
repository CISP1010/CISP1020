package Midterm;
public class ThreeDShapesTester {
    public static void main(String[] args) {

        ThreeDShape[] fridges = {new Refrigerator(29, 30, 67),
                new Refrigerator(35, 36, 70),
                new Refrigerator(30, 31, 68)};

        // 1- Find the smallest area and display the dimensions of the smallest fridge
            ThreeDShape smaller = Service.smallestArea(fridges[1], fridges[2]);
            Refrigerator tinyFridge = (Refrigerator) smaller;
            System.out.print("QUESTION 1 \nPart 1 - Find the smallest area.");
            System.out.printf("\n\nThe smallest area is " + tinyFridge.getSurfaceArea() + " square units.");
            System.out.print("\nExpected: 10156.0 square units.");
            System.out.print("\n\n\nPart 2 - Display the dimensions of the smallest fridge.");
            System.out.printf("\n\nThe dimensions of the smallest fridge are:" + "\nDepth: " + tinyFridge.getDepth() + "\nWidth: " + tinyFridge.getWidth() + "\nHeight: " + tinyFridge.getHeight());
            System.out.print("\nExpected: Depth: 30.0 | Width: 31.0  | Height: 68.0");

        //2-  Find the total volumes for the following balls array
            ThreeDShape[] balls = {new Sphere(345), new Sphere(67), new Sphere(12)};
            double total = Service.TotalVolumes(balls);
            double expected = 173273981;
            System.out.print("\n\nQUESTION 2\nFind the total volumes for the following balls array.");
            System.out.printf("\n\nThe total volume is " + total + " cubic units.");
            System.out.printf("\nExpected: " + expected + " cubic units.");
            System.out.println();
            System.out.println();
    }

}
