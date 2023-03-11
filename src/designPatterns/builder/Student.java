package designPatterns.builder;

public class Student {
    private String name;
    private int age;
    private double psp;
    private String universityName;
    private String batch;
    private long id;
    private int gradYear;
    private long phoneNumber;


//     // Not a good approach to have a constructor with too many args
//    public Student(String name, int age, ...) {
//
//    }


    public Student(Builder builder) {
        // perform your business-logic validations here
        if (builder.getGradYear() > 2022) {
            throw new IllegalArgumentException("Grad year can't be greater than 2022");
        }
        // other validations are also performed as per requirement

        // create your object using the attributes provided
        this.age = builder.getAge();
        this.name = builder.getName();
        this.id = builder.getId();
        this.gradYear = builder.getGradYear();
        // other attributes are also initialized here
    }
}
