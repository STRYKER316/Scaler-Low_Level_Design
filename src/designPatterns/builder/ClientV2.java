package designPatterns.builder;

public class ClientV2 {
    public static void main(String[] args) {
        // create a Student builder object
        // we have a builder now, so build your custom student object
        StudentV2 student1 = StudentV2.getBuilder()
                                .setId(12)
                                .setName("Alex")
                                .setAge(25)
                                .setGradYear(2023)
                                .build();


        System.out.println("DEBUG");
    }
}
