package designPatterns.builder;

public class Client {
    public static void main(String[] args) {
        // create a Student builder object and set desired attributes
        Builder studentBuilder = new Builder();
        studentBuilder.setId(1);
        studentBuilder.setName("Alex");
        studentBuilder.setAge(25);
        studentBuilder.setGradYear(2020);
//        studentBuilder.setGradYear(2023);       // throws an exception because of failed validation

        // create a new student object using the builder object we created
        Student s1 = new Student(studentBuilder);

        System.out.println("DEBUG");
    }
}
