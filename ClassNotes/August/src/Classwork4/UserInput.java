package Classwork4;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws NanException{
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a: ");
        double a = input.nextDouble();
        System.out.println("Enter b: ");
        double b = input.nextDouble();
        System.out.println("Enter c: ");
        double c = input.nextDouble();

        // Calculate the solutions
        double[] solutions = null;
        try {
            solutions = QuadraticSolver.solveQuadraticEQ(a, b, c);
            System.out.println("The solutions are: ");
            for (double solution : solutions) {
                System.out.println(solution);
            }
        }catch (NanException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
