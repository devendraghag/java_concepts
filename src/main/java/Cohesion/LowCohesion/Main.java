package Cohesion.LowCohesion;
import java.util.Arrays;
class Utility {
    public void calculateSum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public void printUserInfo(String name, String email) {
        System.out.println("User: " + name + ", Email: " + email);
    }

    public void sendEmail(String email, String message) {
        System.out.println("Sending email to " + email + ": " + message);
    }

    public void sortArray(int[] array) {
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}

public class Main {
    public static void main(String[] args) {
        Utility utility = new Utility();
        utility.calculateSum(5, 10);
        utility.printUserInfo("John Doe", "john.doe@example.com");
        utility.sendEmail("john.doe@example.com", "Welcome!");
        int[] array = {5, 3, 8, 1};
        utility.sortArray(array);
    }
}
