package Inheritances.Hierarchical;

// Student class (Subclass) that extends Person
class Student extends Person {
    private String studentId;

    // Constructor to initialize Student object
    public Student(String name, int age, String studentId) {
        super(name, age); // Call to the superclass (Person) constructor
        this.studentId = studentId;
    }

    // Getter method to access the studentId field
    public String getStudentId() {
        return studentId;
    }

    // Method to display the student's details
    public void displayStudentInfo() {
        // Call the superclass method to display the person's details
        displayPersonInfo();
        System.out.println("Student ID: " + studentId);
    }
}
