package Classwork4;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EvenOdd {
    public static void evenOdd(String inputFileName, String outputFileName) {

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {

            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    int number = Integer.parseInt(line);
                    String classification = (number % 2 == 0) ? "Even" : "Odd";
                    writer.write(number + " is " + classification + "\n");
                } catch (NumberFormatException e) {
                    System.err.println("Skipping non-integer value: " + line);
                }
            }

            System.out.println("Numbers and their classifications have been written to " + outputFileName);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
