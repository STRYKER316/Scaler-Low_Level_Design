package accessModifiersCheck;

import accessModifiers.Student;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student();

//        s1.name = "EZ";               // private (not accessible outside class)
//        s1.batchId = 123;             // default (not accessible outside package)
//        s1.psp = 34.56;               // protected (not accessible outside package if not child class)
        s1.universityName = "NITT";     // public

    }
}
