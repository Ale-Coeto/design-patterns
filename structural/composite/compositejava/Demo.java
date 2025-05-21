package structural.composite.compositejava;

public class Demo {
    public static void main(String[] args) {
        ProductLeaf headphones = new ProductLeaf("headphones", 10);
        ProductLeaf phone = new ProductLeaf("phone", 20);
        BoxComposite smallBox = new BoxComposite();
        smallBox.add(headphones);

        BoxComposite largeBox = new BoxComposite();
        largeBox.add(smallBox);
        largeBox.add(phone);
        largeBox.add(phone);

        System.out.println("Total price of big box: " + largeBox.getPrice());
    }
    
}
