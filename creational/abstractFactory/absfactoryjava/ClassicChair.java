package creational.abstractFactory.absfactoryjava;

public class ClassicChair implements Chair {
    public String getDescription() {
        return "Classic chair";
    }

    public boolean hasLegs() {
        return true;
    }
}
