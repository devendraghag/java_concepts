package StaticPrograms;

class Student3 {
    int rollno;
    String name;
    static String college = "ITS";

    static void change() {
        System.out.println("College name is changed " + college);
        college = "BBDIT";
        System.out.println("College name is changed " + college);
    }

    Student3(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

public class StaticMethod {
    public static void main(String args[]) {
        Student3.change();// calling change method
        Student3 s1 = new Student3(111, "Karan");
        Student3 s2 = new Student3(222, "Aryan");
        Student3 s3 = new Student3(333, "Sonoo");
        s1.display();
        s2.display();
        s3.display();
    }
}

/*
 * There are two main restrictions for the static method. They are:
 * 1.The static method can not use non static data member or call non-static method directly.
 * 2.this and super cannot be used in static context.
 */