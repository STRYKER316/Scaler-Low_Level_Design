package designPatterns.singleton.doubleCheckLocking;

public class DBConnection {
    private String url;
    private String userName;
    private String password;
    private static DBConnection connectionInstance = null;

    private DBConnection(String config) {
//        use the given config to customize the constructor
    }

////    Slow performance in multithreaded setup
//    public static DBConnection getInstance(String config) {
//        synchronized (DBConnection.class) {
//            if (instance == null) {
//                instance = new DBConnection(config);
//            }
//            return instance;
//        }
//    }

    public static DBConnection getInstance(String config) {
        if (connectionInstance == null) {
            synchronized (DBConnection.class) {
                if (connectionInstance == null)
                    connectionInstance = new DBConnection(config);
            }
        }
        return connectionInstance;
    }
}
