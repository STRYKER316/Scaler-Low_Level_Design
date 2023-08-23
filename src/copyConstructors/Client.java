package copyConstructors;

public class Client {
    public static void main(String[] args) {
        Student student1 = new Student("Anshil", 25, 98.05, "NITR");

        Student student1Copy = new Student(student1);

//        Student student1Copy = student1;        // Not a copy. just a reference

        System.out.println(student1.name);
        System.out.println(student1Copy.name);

        System.out.println(student1);
        System.out.println(student1Copy);
    }
}
