package Midterm;

public class Refrigerator implements ThreeDShape{
    double depth;
    double width;
    double height;

    public Refrigerator(){
    }
    public Refrigerator(double depth, double width, double height) {
        this.depth = depth;
        this.width = width;
        this.height = height;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getDepth() {
        return depth;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getSurfaceArea() {
        return 2 * (width * depth + depth * height + height * width);
    }

    @Override
    public double getVolume() {
        return width * depth * height;
    }
}