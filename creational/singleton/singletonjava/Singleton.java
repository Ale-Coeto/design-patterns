package creational.singleton.singletonjava;

public class Singleton {
    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            System.out.println("Created new instance");
            instance = new Singleton();
        }
        return instance;
    }

    public void print() {
        System.out.println("Doing sth");
    }
}
