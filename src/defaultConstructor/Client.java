package defaultConstructor;

public class Client {
    public static void main(String[] args) {
        Student anshil = new Student();

//        Every property of the object is initialized to their default values
        System.out.println(anshil.name);
        System.out.println(anshil.age);
        System.out.println(anshil.psp);
        System.out.println(anshil.universtiyName);
    }
}
