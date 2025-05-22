package creational.abstractFactory.absfactoryjava;

public class ModernChair implements Chair {
    public String getDescription() {
        return "Modern chair";
    }

    public boolean hasLegs() {
        return false;
    } 
}
