package inheritance;

public class Instructor extends User {
    String batchName;
    double avgRating;

    void scheduleClass() {
        System.out.println("Instructor is scheduling a class");
    }
}
