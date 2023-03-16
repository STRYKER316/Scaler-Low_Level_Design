package designPatterns.prototype;

public class IntelligentStudent extends Student {
    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    private int iq;


    // default constructor
    public IntelligentStudent () {

    }

    // copy constructor
    public IntelligentStudent(IntelligentStudent intelliStudent) {
        super(intelliStudent);          // fill in the generic attributes using parent super class
        this.iq = intelliStudent.iq;    // fill attributes specific to child class
    }

    @Override
    public IntelligentStudent clone() {
        // let's say the parent Student class doesn't provider us with setters to modify private variables
        // then how can we still clone the object?
        return new IntelligentStudent(this);
    }
}
