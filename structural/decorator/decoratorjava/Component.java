package decoratorjava;

/**
 * Interfaz base para las bebidas.
 */
interface BaseDrink {
    double getPrice();
}

/**
 * Implementación de café House Blen.
 */
class HouseBlen implements BaseDrink {

    private double price = 1.5;

    @Override
    public double getPrice() {
        System.out.println("Base Price HouseBlen: " + price);
        return price;
    } 
}

/**
 * Implementación de café Dark Roast.
 */
class DarkRoast implements BaseDrink {

    private double price = 1.0;

    @Override
    public double getPrice() {
        System.out.println("Base price DarkRoast: " + price);
        return price;
    }
}

/**
 * Implementación de café Espresso.
 */
class Espresso implements BaseDrink {

    private double price = 1.5;

    @Override
    public double getPrice() {
        System.out.println("Base price Espresso: " + price);
        return price;
    }
}

/**
 * Implementación de café Decafeinado.
 */
class Decaf implements BaseDrink {

    private double price = 2.0;

    @Override
    public double getPrice() {
        System.out.println("Base price Decaf: " + price);
        return price;
    }
}