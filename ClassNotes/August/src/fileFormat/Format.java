package fileFormat;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Format {
    public static void main(String[] args) throws FileNotFoundException {
        File inFile = new File("C:\\Users\\tanne\\Desktop\\CISP1020\\CISP1020\\ClassNotes\\August\\src\\fileFormat\\input.txt");
        File outFile = new File("C:\\Users\\tanne\\Desktop\\CISP1020\\CISP1020\\ClassNotes\\August\\src\\fileFormat\\values.txt");
        Scanner input = new Scanner(inFile);
        PrintWriter out = new PrintWriter(outFile);

        while (input.hasNextDouble()) {
            String number1 = input.nextLine();
            String number2 = input.nextLine();
            String number3 = input.nextLine();
            out.println(number1 + "," + number2 + "," + number3);
        }
        out.close();
    }
}
