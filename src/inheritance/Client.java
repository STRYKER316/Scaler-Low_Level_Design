package inheritance;

public class Client {
    public static void main(String[] args) {
//        Create an Instructor Object
        Instructor i = new Instructor();

        i.avgRating = 4.5;
        i.login();
        i.userName = "Anshil";
        i.scheduleClass();

//        Create a User object
        User u = new User();
        u.login();
//        u.scheduleClass();    // Not possible

    }
}
