package accessModifiersCheck;

import accessModifiers.Student;

public class StudentChild extends Student {

    public void doStuff() {
        psp = 69.42;                // protected (accessible bcz of child class)
        universityName = "NITW";    // public
//        name = "GG";              // private  (not accessible in child class)
//        batchId = 234;            // default  (not accessible outside the package)
    }


}
