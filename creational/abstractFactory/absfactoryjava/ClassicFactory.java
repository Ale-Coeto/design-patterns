package creational.abstractFactory.absfactoryjava;

public class ClassicFactory implements FurnitureFactory {
    public Chair createChair() {
        return new ClassicChair();
    }

    public Table creatTable() {
        return new ClassicTable();
    }
    
}
