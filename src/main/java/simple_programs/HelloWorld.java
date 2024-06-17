package simple_programs;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!"); // Prints "Hello World!" to the console
        System.out.println("This is another line!"); // Prints "This is another line!" to the console
        System.out.println("This is a third line!"); // Prints "This is a third line!" to the console
        System.out.print("This is a third line!, without new line"); // cursor stay on this line, generally move to next line due to println statement
        System.out.println();
        for (String arg : args) {
            System.out.println("Argument: " + arg); // command line argument
        }
    }
}
