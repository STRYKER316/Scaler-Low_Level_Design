package introToOOP;

public class Student {
    String name;
    String batchName;
    int age;
    double psp;


    void changeBatch(String newBatchName) {
        batchName = newBatchName;
    }

    void giveMockInterview() {
        System.out.println("Giving mock interview!");
    }
}
