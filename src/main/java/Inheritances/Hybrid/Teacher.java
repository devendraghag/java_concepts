package Inheritances.Hybrid;

// Teacher class (Subclass) that extends Person and implements TeacherActivities
class Teacher extends Person implements TeacherActivities {
    private String subject;

    // Constructor to initialize Teacher object
    public Teacher(String name, int age, String subject) {
        super(name, age); // Call to the superclass (Person) constructor
        this.subject = subject;
    }

    // Getter method to access the subject field
    public String getSubject() {
        return subject;
    }

    // Method to display the teacher's details
    public void displayTeacherInfo() {
        // Call the superclass method to display the person's details
        displayPersonInfo();
        System.out.println("Subject: " + subject);
    }

    // Implementing methods from TeacherActivities interface
    @Override
    public void teach() {
        System.out.println(getName() + " is teaching " + subject + ".");
    }

    @Override
    public void conductResearch() {
        System.out.println(getName() + " is conducting research in " + subject + ".");
    }
}
