package Inheritances.multilevel;

public class Main {
    public static void main(String[] args) {
        // Creating a GraduateStudent object and initializing it through the constructor
        GraduateStudent gradStudent = new GraduateStudent("Alice", 25, "S12345", "Machine Learning");

        // Displaying the graduate student's details
        gradStudent.displayGraduateStudentInfo();
    }
}
