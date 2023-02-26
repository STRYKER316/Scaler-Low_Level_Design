package constructors;

public class Student {
    String name;
    int age;
    double psp;
    String universtiyName;


    public Student(String studentName, String univName) {
        name = studentName;
        universtiyName = univName;
        System.out.println("This si constructor1");
    }

    public Student(String studentname) {
        name = studentname;
        System.out.println("This is constructor2");
    }

    public Student(int studentAge) {
        age = studentAge;
        System.out.println("This is constructor3");
    }

}
