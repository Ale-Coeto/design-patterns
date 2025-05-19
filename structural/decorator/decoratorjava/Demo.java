package decoratorjava;

public class Demo {
    public static void main(String[] args) {
        // Example 1
        DarkRoast darkRoast = new DarkRoast();
        WholeMilkDecorator darkRoastWithFullMilk = new WholeMilkDecorator(darkRoast);
        System.out.println("Total price: $" + darkRoastWithFullMilk.getPrice() + "\n\n");

        // Example 2
        Decaf decaf = new Decaf();
        MochaDecorator decafWithMocha = new MochaDecorator(decaf);
        CreamDecorator defacWithMochaAndCream = new CreamDecorator(decafWithMocha);
        System.out.println("Total price: $" + defacWithMochaAndCream.getPrice());
    }
}
