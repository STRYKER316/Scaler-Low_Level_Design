package designPatterns.singleton.eagerLoading;

public class DBConnection {
    private String url;
    private String userName;
    private String password;
    private static DBConnection connectionInstance = new DBConnection();

    private DBConnection() {
        // Code for DBConenction object creation
    }

//    slow startup and no customization possible for constructor
    public static DBConnection getInstance() {
        return connectionInstance;
    }
}
