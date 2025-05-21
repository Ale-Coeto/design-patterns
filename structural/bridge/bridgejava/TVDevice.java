package structural.bridge.bridgejava;

public class TVDevice implements DeviceImplementation{

    @Override
    public void enable() {
        System.out.println("Turning TV on");
    }

    @Override
    public void disable() {
        System.out.println("Turning TV off");
    }
}
