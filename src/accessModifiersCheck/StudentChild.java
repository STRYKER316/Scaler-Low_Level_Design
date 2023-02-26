package accessModifiersCheck;

import accessModifiers.Student;

public class StudentChild extends Student {

    public void doStuff() {
        psp = 69.42;
        universityName = "NITW";
//        name = "GG";          // private
//        batchId = 234;        // default
    }


}
