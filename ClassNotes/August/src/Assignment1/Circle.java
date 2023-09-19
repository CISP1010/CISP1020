package Assignment1;

public class Circle extends GeometricObject{
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public String toString() {
        return "Circle: Date Created = " + getDateCreated() + " Radius = " + radius + " area = " + getArea() + " perimeter = " + getPerimeter() + " color = " + getColor() + " filled = " + isFilled();
    }

    public boolean equals(Object otherObject) {
        if (otherObject instanceof Circle other) {
            return radius == other.radius && getColor().equals(other.getColor()) && isFilled() == other.isFilled();
        }
        return false;
    }

}
