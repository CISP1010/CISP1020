package Notes09_26_23;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputFileDemo {
    public static void main(String[] args) {
        Scanner input = initializeScanner("input.txt", "C:\\Users\\tanne\\Desktop\\CISP1020\\CISP1020\\ClassNotes\\August\\src\\Notes09_26_23\\input.txt");
        PrintWriter out = initializePrintWriter("output.txt", "C:\\Users\\tanne\\Desktop\\CISP1020\\CISP1020\\ClassNotes\\August\\src\\Notes09_26_23\\output.txt");

        double sum = 0;
        while (input != null && input.hasNextDouble()) {
            double number = input.nextDouble();
            sum += number;
            System.out.println(number);
            if (out != null) {
                out.println(number);
            }
        }
        System.out.println("Sum = " + sum);
        if (out != null) {
            out.println("Sum = " + sum);
        }
        if (out != null) {
            out.close();
        }
    }

    private static Scanner initializeScanner(String filePath, String fullPath) {
        Scanner scanner = null;
        try {
            File inFile = new File(filePath);
            scanner = new Scanner(inFile);
        } catch (FileNotFoundException e) {
            System.out.println("In File not found. Creating...");
            createFile(fullPath);
            File inFile = new File(fullPath);
            try {
                scanner = new Scanner(inFile);
            } catch (FileNotFoundException ex) {
                System.out.println("File creation failed.");
            }
        }
        return scanner;
    }

    private static PrintWriter initializePrintWriter(String filePath, String fullPath) {
        PrintWriter writer = null;
        try{
            File outFile = createFile(filePath);
            assert outFile != null;
            writer = new PrintWriter(outFile);
        } catch (FileNotFoundException e) {
            System.out.println("Out File not found. Creating...");
            createFile(fullPath);
            File outFile = new File(fullPath);
            try {
                writer = new PrintWriter(outFile);
            } catch (FileNotFoundException ex) {
                System.out.println("File creation failed.");
            }
        }
        return writer;
    }

    private static File createFile(String fullPath) {
        try {
            File file = new File(fullPath);
            if (file.createNewFile()) {
                System.out.println("File created.");
            }return file;
        } catch (IOException e) {
            System.out.println("File creation failed.");
        }return null;
    }
}
