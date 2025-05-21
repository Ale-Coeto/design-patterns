package structural.bridge.bridgejava;

public class Demo {
    public static void main(String [] args) {
        TVDevice tv = new TVDevice();
        RemoteAbstraction remoteControl = new RemoteAbstraction(tv);
        remoteControl.clickOn();
        remoteControl.clickOff();
    }
}
