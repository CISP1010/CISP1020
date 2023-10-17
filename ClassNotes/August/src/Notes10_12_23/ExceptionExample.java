package Notes10_12_23;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
//this is a standalone file from class...the CustomExceptions.java, BankAccount.java, and InsufficientFundsException.java
//are a separate set that go together
//handling exceptions
public class ExceptionExample {
    public static void main(String[] args) { //note no 'throws exception' here
        File inputFile = new File("C:\\Users\\gregt\\IdeaProjects\\CISP1020\\ClassNotes10_12_23\\test.txt");
        try {
            Scanner in = new Scanner(inputFile);
            while (in.hasNext()) {      //since this accept all input - will throw data mismatch exception
                double number = in.nextDouble(); //when storing into this double
                System.out.println(number);
            }
        }
        catch (FileNotFoundException ex){
            ex = new FileNotFoundException("File not found - object method");
            System.out.println(ex.getMessage());

        }

      catch (IOException exception) {
          exception = new IOException("File not found - IOException");
          System.out.println(exception.getMessage());
          // exception.printStackTrace(); - this will give a more detailed error message
      }


        catch (InputMismatchException exception) {
            System.out.println("Data format error"); //throws this because hasNext() is not hasNextDouble()
                                                      // at line 14
            exception = new InputMismatchException("Wrong Format"); //this creates an exception object
            System.out.println(exception.getMessage());             //calls the getMessage() method on it
        }                                                           //I think getMessage() is a method of the
                                                                    //exception class and is inherited by InputMismatchException
        finally {
            System.out.println("This part is in 'finally' and will always run");
        }
    }


    }





/*
chap 11 recap:
//things we've gone over
//to read from a file
File inputFile = new File("input.txt");
Scanner input = new Scanner(inputFile);

//to write to a file
PrintWriter output = new PrintWriter("output.txt"); //will create if not there already
                  //overwrites if already there


need import java.io.*; to use file and printwriter
also need to throw exception in main method (file not found exception)


- hierarchy of exceptions
    - runtime exceptions - will compile but will crash at runtime
        -unchecked exceptions
            -arithmetic exception
            -null pointer exception
            -index out of bounds exception
    - checked exceptions - will not compile

try blocks - try to run this code
catch blocks - if an exception is thrown, catch it and do something with it
finally blocks - always run this code
catch most specific exceptions first, then more general ones
    -if you catch a general exception first, it will catch all exceptions and the specific ones will never run

e.g., --
try {
    String filename = "input.txt";
    Scanner in = new Scanner(new File(filename));
    String input = in.next();
    int value = Integer.parseInt(input);
    System.out.println(value);
    }
catch (IOException exception) {
    System.out.println("File not found");
    exception.printStackTrace();
    }
catch (NumberFormatException exception) {
    System.out.println("Not a number");
    exception.printStackTrace();
    }
    //list all possible exceptions in order of most specific to least specific
    //and catch





 */