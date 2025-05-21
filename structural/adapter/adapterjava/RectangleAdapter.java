package structural.adapter.adapterjava;

public class RectangleAdapter implements ShapeAdapter {
    private Rectangle adaptee;

    public RectangleAdapter(Rectangle rectangle) {
        this.adaptee = rectangle;
    }

    public void draw() {
        adaptee.drawShape();
    }
}
