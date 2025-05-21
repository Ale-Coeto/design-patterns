package structural.flyweight.flyweightjava;

public class SampleBullet {
    private int x;
    private int y;

    private ParticleFlyweight pattern;

    public SampleBullet(String color, String texture, int x, int y) {
        this.pattern = ParticleFactory.getFlyweight(color, texture);
        this.x = x;
        this.y = y;
    }

    public void drawBullet() {
        System.out.println("Drawing bullet " + pattern.getDescription() + " at: " + x + ", " + y);
    }
    
}
