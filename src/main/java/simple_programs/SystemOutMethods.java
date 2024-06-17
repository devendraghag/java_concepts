package simple_programs;

import java.util.Scanner;

public class SystemOutMethods {
    public static void main(String[] args) {
        Scanner scanVariable = new Scanner(System.in);
        String variableStoringInput = "";
        System.out.print("Enter something: \n");
        // Reading input
        variableStoringInput = scanVariable.nextLine();
        // Printing read input
        System.out.println("Your input was: " + variableStoringInput);

        // Check if an error occurred during the previous output operations
        if (System.out.checkError()) {
            System.err.println("An error occurred in the output stream.");
        } else {
            System.out.println("Output operations were successful.");
        }
        // Simulate an error scenario by closing the stream
    //    System.out.close(); // it will close the operation
        System.out.flush(); // typically its unbuffered here but in other case flush means forcefully action

        // Formatting integers
        int value = 42;
        System.out.format("Integer: %d%n", value);
        // Formatting floating-point numbers
        double pi = 3.14159;
        System.out.format("Floating-point: %.2f%n", pi);
        // Formatting strings
        String name = "Alice";
        System.out.format("String: %s%n", name);
        // Formatting multiple values
        int age = 30;
        double height = 1.75;
        System.out.format("Name: %s, Age: %d, Height: %.2f meters%n", name, age, height);
        // Formatting hexadecimals
        int hexValue = 255;
        System.out.format("Hexadecimal: %x%n", hexValue);
    }
}
