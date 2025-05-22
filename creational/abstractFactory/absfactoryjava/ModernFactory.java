package creational.abstractFactory.absfactoryjava;

public class ModernFactory implements FurnitureFactory {
    public Chair createChair() {
        return new ModernChair();
    } 

    public Table creatTable() {
        return new ModernTable();
    }
}
