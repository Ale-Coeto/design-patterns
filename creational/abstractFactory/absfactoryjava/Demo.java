package creational.abstractFactory.absfactoryjava;


public class Demo {
    public static void main(String [] args) {
        FurnitureFactory factory = new ModernFactory();
        Chair chair = factory.createChair();
        System.out.println(chair.getDescription());
    }

    // Example for implementation:
    // config = readApplicationConfigFile()

    // if (config.OS == "Windows") then
    //     factory = new WinFactory()
    // else if (config.OS == "Mac") then
    //     factory = new MacFactory()
    // else
    //     throw new Exception("Error! Unknown operating system.")

    // Application app = new Application(factory)
}
