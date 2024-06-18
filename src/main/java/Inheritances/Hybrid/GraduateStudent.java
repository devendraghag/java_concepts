package Inheritances.Hybrid;

// GraduateStudent class (Subclass) that extends Student and implements TeacherActivities
class GraduateStudent extends Student implements TeacherActivities {
    private String researchTopic;

    // Constructor to initialize GraduateStudent object
    public GraduateStudent(String name, int age, String studentId, String researchTopic) {
        super(name, age, studentId); // Call to the superclass (Student) constructor
        this.researchTopic = researchTopic;
    }

    // Getter method to access the researchTopic field
    public String getResearchTopic() {
        return researchTopic;
    }

    // Method to display the graduate student's details
    public void displayGraduateStudentInfo() {
        // Call the superclass method to display the student's details
        displayStudentInfo();
        System.out.println("Research Topic: " + researchTopic);
    }

    // Implementing methods from TeacherActivities interface
    @Override
    public void teach() {
        System.out.println(getName() + " is teaching as a part-time lecturer.");
    }

    @Override
    public void conductResearch() {
        System.out.println(getName() + " is conducting research on " + researchTopic + ".");
    }
}
