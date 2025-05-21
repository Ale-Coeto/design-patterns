package creational.prototype.prototypejava;

public class ShapePrototype {
    protected int x;
    protected int y;
    protected String color;

    public ShapePrototype(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public ShapePrototype(ShapePrototype source) {
        if (source != null) {
            this.x = source.x;
            this.y = source.y;
            this.color = source.color;
        }
    }

    public void cloneShape() {

    }
}