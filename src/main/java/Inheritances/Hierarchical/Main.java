package Inheritances.Hierarchical;

public class Main {
    public static void main(String[] args) {
        // Creating Student object and initializing it through the constructor
        Student student = new Student("Alice", 20, "S12345");

        // Creating Teacher object and initializing it through the constructor
        Teacher teacher = new Teacher("Bob", 45, "Mathematics");

        // Displaying the student's details
        System.out.println("Student Details:");
        student.displayStudentInfo();

        // Displaying the teacher's details
        System.out.println("\nTeacher Details:");
        teacher.displayTeacherInfo();
    }
}
