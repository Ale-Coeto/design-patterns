package structural.facade.facadejava;

public class HomeTheatherFacade {
    private Amplifier amplifier;
    private TV tv;

    public HomeTheatherFacade(Amplifier amp, TV tv) {
        this.amplifier = amp;
        this.tv = tv;
    }

    public void turnSystemOn() {
        tv.turnOn();
        amplifier.turnOn();
    }

    public void theatherMode() {
        tv.theatherColors();
        amplifier.maxVolume();
    }
}
