package accessModifiers;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student();
//        s1.name = "Alok";             // private  (Not accessible outside parent class)
        s1.batchId = 123;               // default (Accessible inside same package)
        s1.universityName = "NITR";     // public
        s1.psp = 90.13;                 // protected (Accessible in same package)

    }
}
