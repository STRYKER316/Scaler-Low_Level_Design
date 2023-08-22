package accessModifiers;

public class StudentChild extends Student {
    public void doStuff() {
//        name = "GG EZ";           // private  (Not accessible)
        batchId = 123;              // default
        psp = 98.06;                // protected (Accessible bcz Child class)
        universityName = "NITR";    // public
    }
}
