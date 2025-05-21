package structural.bridge.bridgejava;

public class RemoteAbstraction {
    private DeviceImplementation implementation;

    public RemoteAbstraction(DeviceImplementation implementation) {
        this.implementation = implementation;
    }

    public void clickOn() {
        System.out.println("Button turn on clicked.");
        implementation.enable();
    }

    public void clickOff() {
        System.out.println("Button turn off clicked.");
        implementation.disable();
    }
}
