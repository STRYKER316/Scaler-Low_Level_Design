package designPatterns.builder;

public class StudentV2 {
    private String name;
    private int age;
    private double psp;
    private String universityName;
    private String batch;
    private long id;
    private int gradYear;
    private long phoneNumber;


    public static BuilderV2 getBuilder() {
        return new BuilderV2();
    }


//     // Not a good approach to have a constructor with too many args
//    public Student(String name, int age, ...) {
//
//    }


    private StudentV2(BuilderV2 builder) {
        // create your object using the attributes provided
        this.age = builder.getAge();
        this.name = builder.getName();
        this.id = builder.getId();
        this.gradYear = builder.getGradYear();
        // other attributes are also initialized here
    }


    // Builder class is now an inner class in Student class
    public static class BuilderV2 {
        private String name;
        private int age;
        private double psp;
        private String universityName;
        private String batch;
        private long id;
        private int gradYear;
        private long phoneNumber;


        // constructor
        public BuilderV2() {}

        // Student object builder method
        public StudentV2 build() {
            // perform your business-logic validations here
            if (this.getGradYear() > 2022) {
                throw new IllegalArgumentException("Grad year can't be greater than 2022");
            }
            // other validations are also performed as per requirement

            // control is passed to Student() constructor to create an object
            // and then build() will return the student object created
            return new StudentV2(this);
        }


        // getters and setters
        public String getName() {
            return name;
        }

        public BuilderV2 setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public BuilderV2 setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public void setPsp(double psp) {
            this.psp = psp;
        }

        public String getUniversityName() {
            return universityName;
        }

        public void setUniversityName(String universityName) {
            this.universityName = universityName;
        }

        public String getBatch() {
            return batch;
        }

        public void setBatch(String batch) {
            this.batch = batch;
        }

        public long getId() {
            return id;
        }

        public BuilderV2 setId(long id) {
            this.id = id;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public BuilderV2 setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public long getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(long phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    }

}
