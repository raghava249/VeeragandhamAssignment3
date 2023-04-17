package singleton;

public class Singleton {
    // Private static field to hold the single instance of the class
    private static Singleton instance;

    // Private constructor to prevent external instantiation
    private Singleton() {
    }

    // Public static method to access the single instance of the class
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Other methods and fields can be added as needed
    public void doSomething() {
        // ...
    }
}
