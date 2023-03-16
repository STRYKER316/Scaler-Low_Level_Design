package designPatterns.prototype;

public class Client {

    // fill up a given registry with some prototypes (Dummy function for registry example purposes)
    private static void fillRegister(StudentRegistry studentRegistry) {
        // create a prototype
        Student feb23studentPrototype = new Student();
        feb23studentPrototype.setBatch("Feb23 LLD");
        feb23studentPrototype.setAverageBatchPsp(85.0);
        // register the prototype
        studentRegistry.registerPrototype("Feb23 LLD", feb23studentPrototype);


        // create a prototype
        IntelligentStudent feb23IntelligentStudentPrototype = new IntelligentStudent();
        feb23IntelligentStudentPrototype.setBatch("Feb23 LLD");
        feb23IntelligentStudentPrototype.setAverageBatchPsp(85.0);
        feb23IntelligentStudentPrototype.setIq(180);
        // register the prototype
        studentRegistry.registerPrototype("Feb23 LLD Intelligent", feb23IntelligentStudentPrototype);
    }


    public static void main(String[] args) {
        // create a registry object and register a few objects
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegister(studentRegistry);

        Student s1 = studentRegistry.getPrototype("Feb23 LLD").clone();
        s1.setName("Alex");
        s1.setAge(25);
        s1.setStudentPsp(90.56);

        Student s2 = studentRegistry.getPrototype("Feb 23 LLD Intelligent").clone();
        s2.setName("Mark");
        s2.setAge(25);
        s2.setStudentPsp(95.96);


        System.out.println("DEBUG");
    }
}
