package structural.facade.facadejava;

public class Demo {
    public static void main(String [] args) {
        HomeTheatherFacade theatherSetup = new HomeTheatherFacade(new Amplifier(), new TV());
        theatherSetup.turnSystemOn();
        theatherSetup.theatherMode();
    }
}
