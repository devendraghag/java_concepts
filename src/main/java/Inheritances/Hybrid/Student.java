package Inheritances.Hybrid;

// Student class (Subclass) that extends Person and implements StudentActivities
class Student extends Person implements StudentActivities {
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

    // Implementing methods from StudentActivities interface
    @Override
    public void participateInSports() {
        System.out.println(getName() + " is participating in sports.");
    }

    @Override
    public void attendClasses() {
        System.out.println(getName() + " is attending classes.");
    }
}
