package structural.adapter.adapterjava;

public class TriangleAdapter implements ShapeAdapter{
    private Triangle adaptee;

    public TriangleAdapter(Triangle triangle) {
        this.adaptee = triangle;
    }

    public void draw() {
        System.out.println("Drawing a triangle.");
    }
}

