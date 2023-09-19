package Assignment1;

public class Square extends GeometricObject implements Colorable, Comparable<Square>{
    private int side;

    public Square(int side) {
        this.side = side;
    }
    public Square(int side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public int getSide() {
        return side;
    }
    public void setSide(int side) {
        this.side = side;
    }

    public int getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public void howToColor() {
        System.out.println(" How to color = Color all four sides");
    }

    public interface Comparable<E> {
        public int compareTo(E o);
    }

    public int compareTo(Square other) {
        if (Math.abs(this.getArea() - other.getArea()) < 1e-9) {
            return 0;
        }
        return (this.getArea() < other.getArea()) ? -1 : 1;
    }

    public String toString() {
        return "Square: Date Created = " + getDateCreated() + " Side = " + side + " area = " + getArea() + " perimeter = " + getPerimeter() + " color = " + getColor() + " filled = " + isFilled();
    }

}
