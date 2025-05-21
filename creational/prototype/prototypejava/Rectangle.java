package creational.prototype.prototypejava;

public class Rectangle extends ShapePrototype {
    private int w;
    private int h;

    public Rectangle(int x, int y, String color, int w, int h) {
        super(x, y, color);
        this.w = w;
        this.h = h;
    }

    public Rectangle(Rectangle source) {
        super(source);
        if (source != null) {
            this.w = source.w;
            this.h = source.h;
        }
    }

    public Rectangle clone() {
        return new Rectangle(this);
    }

    public void print() {
        System.out.println("Rectangle: " + color + ". W: " + w + ". H: " + h);
    }
}
