package singleton;

public class DbSingletonDemo {

    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();

        DbSingleton testConst = DbSingleton.getInstance();

        System.out.println(instance);
        System.out.println(testConst);

        if (instance == testConst) {
            System.out.println("This is the same instance");
        }
    }

}
