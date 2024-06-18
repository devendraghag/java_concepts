package Cohesion.HighCohesion;

class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void sendEmail(String message) {
        // Code to send email
        System.out.println("Sending email to " + email + ": " + message);
    }

    public void displayUserInfo() {
        System.out.println("User: " + name + ", Email: " + email);
    }
}

public class Main {
    public static void main(String[] args) {
        User user = new User("John Doe", "john.doe@example.com");
        user.displayUserInfo();
        user.sendEmail("Welcome to our service!");
    }
}
