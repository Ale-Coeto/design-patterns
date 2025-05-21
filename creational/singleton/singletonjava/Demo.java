package creational.singleton.singletonjava;

public class Demo {
    public static void main(String[] args) {
        // In some system
        Singleton database1 = Singleton.getInstance();
        database1.print();

        // In another system
        Singleton database2 = Singleton.getInstance();
        database2.print();
    }
    
}
