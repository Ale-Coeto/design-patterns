package structural.adapter.adapterjava;

public class Demo {
    public static void main(String[] args) {
        // Normal shape
        Square square = new Square();

        // Outdated shapes (require adapter)
        RectangleAdapter rectangle = new RectangleAdapter(new Rectangle());
        TriangleAdapter triangle = new TriangleAdapter(new Triangle());

        // Draw
        square.draw();
        rectangle.draw();
        triangle.draw();
    }
}
