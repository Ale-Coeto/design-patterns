package structural.composite.compositejava;

import java.util.ArrayList;

public class BoxComposite implements Component {
    private ArrayList<Component> children = new ArrayList<>();

    public double getPrice() {
        double price = 0;

        for (int i = 0; i < children.size(); i++) {
            price += children.get(i).getPrice();
        }

        return price;
    }

    public void add(Component c) {
        children.add(c);
    }
}
