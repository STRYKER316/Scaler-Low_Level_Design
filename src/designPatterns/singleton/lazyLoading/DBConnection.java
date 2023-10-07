package designPatterns.singleton.lazyLoading;

public class DBConnection {
    private String url;
    private String userName;
    private String password;
    private static DBConnection connectionInstance = null;

    private DBConnection() {
        // Code for DBConenction object creation
    }

//    Won't work in multi-thread environment
    public static DBConnection getInstance() {
        if (connectionInstance == null) {
            connectionInstance = new DBConnection();
        }
        return connectionInstance;
    }
}
