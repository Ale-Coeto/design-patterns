package creational.prototype.prototypejava;

public class Demo {
    public static void main(String[] args) {
        Rectangle original = new Rectangle(0, 0, "blue", 2, 4);
        original.print();

        Rectangle copy = original.clone();
        copy.print();
    }
}
