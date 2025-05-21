package structural.flyweight.flyweightjava;

public class ParticleFlyweight {
    private String color;
    private String texture;

    public ParticleFlyweight(String color, String texture) {
        this.color = color;
        this.texture = texture;
    }

    public String getColor() {
        return color;
    }

    public String getTexture() {
        return texture;
    }
    public String getDescription() {
        return color + " " + texture;
    }
}