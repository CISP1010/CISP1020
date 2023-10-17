package Classwork4;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NanException {
        // Define the file names
        String currentDirectory = System.getProperty("user.dir") + File.separator + "ClassNotes" + File.separator + "August" + File.separator + "src" + File.separator + "Classwork4";
        String inputFileName = currentDirectory + File.separator + "input.txt";
        String outputFileName = currentDirectory + File.separator + "output.txt";
        Scanner input = new Scanner(System.in);

        System.out.println("Select one of the following options:");
        System.out.println("1. Enter coefficients from the keyboard");
        System.out.println("2. Read VALID coefficients from the input file");
        System.out.println("3. Read INVALID coefficients from the input file");
        System.out.print("Select an option: ");
        double option = input.nextDouble();

        switch ((int) option) {
            case 1:
                UserInput.main(null);
                break;
            case 2:
                FileInput.fileInput(inputFileName, outputFileName);
                break;
            case 3:
                System.out.println("Select one of the following options:");
                System.out.println("1: Divide by 0 error");
                System.out.println("2: Negative square root error");
                System.out.print("Select an option: ");
                option = input.nextDouble();
                if (option == 1) {
                    inputFileName = currentDirectory + File.separator + "div_by_0_input.txt";
                    FileInput.fileInput(inputFileName, outputFileName);
                    break;
                } else if (option == 2) {
                    inputFileName = currentDirectory + File.separator + "neg_sqr_root_input.txt";
                    FileInput.fileInput(inputFileName, outputFileName);
                    break;

                }
        }
    }
}
