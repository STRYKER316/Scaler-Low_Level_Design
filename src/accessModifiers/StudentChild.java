package accessModifiers;

public class StudentChild extends Student {
    public void doStuff() {
        batchId = 123;              // default
        psp = 98.06;                // protected (Child class)
        universityName = "NITR";    // public
//        name = "GG EZ";           // private
    }
}
