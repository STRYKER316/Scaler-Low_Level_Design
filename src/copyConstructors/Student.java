package copyConstructors;

public class Student {
    String name;
    int age;
    double psp;
    String universtiyName;

    // parametrised constructor
    public Student(String studentName, int studentAge, double studentPsp, String univName) {
        name = studentName;
        age = studentAge;
        psp = studentPsp;
        universtiyName = univName;

        System.out.println("This is constructor1");
    }

    // Copy Constructor
    public Student(Student studentObj) {
        name = studentObj.name;
        age = studentObj.age;
        psp = studentObj.psp;
        universtiyName = studentObj.universtiyName;

        System.out.println("This is a copy contractor");
    }
}
