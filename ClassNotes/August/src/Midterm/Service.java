package Midterm;

public class Service {
    public static ThreeDShape smallestArea(ThreeDShape shape1, ThreeDShape shape2) {
        if (shape1.getSurfaceArea() < shape2.getSurfaceArea()) {
            return shape1;
        } else {
            return shape2;
        }
    }
    public static double TotalVolumes(ThreeDShape[] shapes) {
        double total = 0;
        for (ThreeDShape shape : shapes) {
            total += shape.getVolume();
        }
        return total;
    }

}
