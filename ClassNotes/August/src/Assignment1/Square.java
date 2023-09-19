package Assignment1;

public class Square extends GeometricObject implements Colorable, Comparable<Square>{
    private double side;

    public Square() {
    }
    public Square(double side) {
        this.side = side;
    }
    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }


    @Override
    public void howToColor() {
        System.out.println(" How to color = Color all four sides");
    }

    @Override
    public int compareTo(Square other) {
        return Double.compare(this.getArea(), other.getArea());
    }

    @Override
    public String toString() {
        return "Square: Date Created = " + getDateCreated() + " Side = " + side + " area = " + getArea() + " perimeter = " + getPerimeter() + " color = " + getColor() + " filled = " + isFilled();
    }

}
