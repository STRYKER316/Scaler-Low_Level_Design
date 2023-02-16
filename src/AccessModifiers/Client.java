package AccessModifiers;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student();
//        s1.name = "Alok";     // private
        s1.batchId = 123;
        s1.universityName = "NITR";
        s1.psp= 90.13;


    }
}
