package Classwork4;
public class QuadraticSolver {

    public static double[] solveQuadraticEQ(double a, double b, double c) throws NanException {
        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        // Check if the discriminant is negative (no real solutions)
        if (discriminant < 0) {
            throw new NanException("No square root for negative numbers; make sure that b^2 is greater than 4*a*c.");
        }

        // Check for division by zero before calculating the solutions
        if (a == 0) {
            throw new NanException("Division by zero occurred; 'a' cannot be zero.");
        }

        // Calculate the two solutions
        double root1;
        double root2;

        root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

        // Create an array to store the solutions
        return new double[]{root1, root2};
    }



}
