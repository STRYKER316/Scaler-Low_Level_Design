package designPatterns.prototype;

public class Student {
    // object specific attributes
    private int age;
    private String name;
    private double studentPsp;
    // generic attributes or common attributes
    private String batch;
    private double averageBatchPsp;


    // default constructor
    public Student () {

    }

    // copy constructor
    public Student (Student student) {
        this.age = student.age;
        this.studentPsp = student.studentPsp;
        this.name = student.name;
        this.batch = student.batch;
        this.averageBatchPsp = student.averageBatchPsp;
    }


    // Getters and Setters to access private attributes
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStudentPsp() {
        return studentPsp;
    }

    public void setStudentPsp(double studentPsp) {
        this.studentPsp = studentPsp;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getAverageBatchPsp() {
        return averageBatchPsp;
    }

    public void setAverageBatchPsp(double averageBatchPsp) {
        this.averageBatchPsp = averageBatchPsp;
    }


    public Student clone() {
////        make a clone of the object we have
//        Student studentClone = new Student();
//        studentClone.setBatch(this.getBatch());
//        studentClone.setAverageBatchPsp(this.getAverageBatchPsp());
//
//        return studentClone;

        // Alternate code template
        return new Student(this);
    }
}
