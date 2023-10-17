package Classwork4;

import java.io.*;

public class FileInput {
    public static void fileInput(String inputFileName, String outputFileName){
        try {
            // Create file readers and writers
            BufferedReader inputFileReader = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter outputFileWriter = new BufferedWriter(new FileWriter(outputFileName));

            // Read coefficients from the input file
            double a = Double.parseDouble(inputFileReader.readLine());
            double b = Double.parseDouble(inputFileReader.readLine());
            double c = Double.parseDouble(inputFileReader.readLine());

            // Calculate the solutions
            double[] solutions = QuadraticSolver.solveQuadraticEQ(a, b, c);

            // Write solutions to the output file
            for (double solution : solutions) {
                outputFileWriter.write(String.valueOf(solution));
                outputFileWriter.newLine();
            }

            // Close file readers and writers
            inputFileReader.close();
            outputFileWriter.close();

            System.out.println("Solutions written to " + outputFileName);
        } catch (IOException e) {
            System.err.println("An error occurred while reading/writing files: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid input format. Make sure the input file contains valid numbers.");
        } catch (NanException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
