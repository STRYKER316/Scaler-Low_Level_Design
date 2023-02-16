package AccessModifiersCheck;

import AccessModifiers.Student;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student();

//        s1.name = "EZ";       // private
//        s1.batchId = 123;     // default
//        s1.psp = 34.56;       // protected
        s1.universityName = "NITT";

    }
}
