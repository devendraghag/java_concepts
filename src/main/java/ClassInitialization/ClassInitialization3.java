package ClassInitialization;

class Employee3 {
    int id;
    String name;
    float salary;

    // create a parameterized constructor
    Employee3(int i, String n, float s) {
        id = i;
        name = n;
        salary = s;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}

public class ClassInitialization3 {
    public static void main(String[] args) {
        Employee3 employee1 = new Employee3(1, "Harry", 35000);
        Employee3 employee2 = new Employee3(2, "Ron", 45000);
        Employee3 employee3 = new Employee3(3, "Her", 55000);
        employee1.display();
        employee2.display();
        employee3.display();
    }
}  