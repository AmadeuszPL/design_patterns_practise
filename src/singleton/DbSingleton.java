package singleton;

public class DbSingleton {

    //static private instance
    //volatile - thread safe fist thing to do
    private static volatile DbSingleton instance = null;

    //people cannot create
    private DbSingleton() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    //standard convention name class
    public static DbSingleton getInstance() {
        //lazy loading
        if (instance == null) {
            //synchronized and another is null check - second thing to do to assure
            synchronized (DbSingleton.class) {
                if (instance == null) {
                    instance = new DbSingleton();
                }
            }
        }

        return instance;
    }

}
