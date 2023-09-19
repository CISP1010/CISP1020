package Assignment1;

import java.util.Arrays;
public class ObjectTester {
    public static void main(String[] args) {
        GeometricObject object = new GeometricObject("red", true);
        System.out.println(object.toString());
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println(rectangle.toString());
        Rectangle rectangle1 = new Rectangle(5, 10, "blue", true);
        System.out.println(rectangle1.toString());
        Circle circle1 = new Circle(5);
        System.out.println(circle1.toString());
        Circle circle2 = new Circle(5, "red", true);
        System.out.println(circle2.toString());
        Circle circle3 = new Circle(5, "blue", true);
        System.out.println(circle2.equals(circle3));
        System.out.println();
        System.out.println();
        System.out.println("Array Tests with Squares and Colorable Interface");
        System.out.println();
        GeometricObject[] objects = new GeometricObject[6];
        objects[0] = new Square(8);
        objects[1] = new Square(5, "blue", true);
        objects[2] = new Circle(12);
        objects[3] = new Circle(3, "red", true);
        objects[4] = new Rectangle(14, 10);
        objects[5] = new Rectangle(5, 10, "blue", true);

        for (GeometricObject o : objects) {
            System.out.println(o.toString());
            if (o instanceof Colorable) {
                ((Colorable) o).howToColor();
            }
        }

        Square[] squares = new Square[5];
        squares[0] = new Square(15, "yellow", true);
        squares[1] = new Square(3, "blue", false);
        squares[2] = new Square(24, "purple", true);
        squares[3] = new Square(2, "green", false);
        squares[4] = new Square(18, "red", true);

        Arrays.sort(squares);
        System.out.println();
        System.out.println("Sorted Squares: ");
        System.out.println();
        for (Square s : squares) {
            System.out.println(s.toString());
        }

    }
}



