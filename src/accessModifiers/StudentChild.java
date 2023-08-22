package accessModifiers;

public class StudentChild extends Student {
    public void doStuff() {
//        name = "GG EZ";           // private  (Not accessible in child class)
        batchId = 123;              // default  (Accessible bcz same package)
        psp = 98.06;                // protected (Accessible bcz Child class)
        universityName = "NITR";    // public
    }
}
