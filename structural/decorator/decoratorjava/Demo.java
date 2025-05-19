package decoratorjava;

/**
 * Clase ejemplo de uso de decoradores para generar dos cafés y obtener su precio total.
 */
public class Demo {
    public static void main(String[] args) {
        // Ejemplo 1: café dark roast con leche entera
        DarkRoast darkRoast = new DarkRoast();
        WholeMilkDecorator darkRoastWithFullMilk = new WholeMilkDecorator(darkRoast);
        System.out.println("Total price: $" + darkRoastWithFullMilk.getPrice() + "\n\n");

        // Ejemplo 2: café descafeinado con mocha y crema
        Decaf decaf = new Decaf();
        MochaDecorator decafWithMocha = new MochaDecorator(decaf);
        CreamDecorator defacWithMochaAndCream = new CreamDecorator(decafWithMocha);
        System.out.println("Total price: $" + defacWithMochaAndCream.getPrice());
    }
}
