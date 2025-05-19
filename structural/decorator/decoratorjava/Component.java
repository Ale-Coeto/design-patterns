package decoratorjava;

interface BaseDrink {
    double getPrice();
}

class HouseBlen implements BaseDrink {

    private double price = 1.5;

    @Override
    public double getPrice() {
        System.out.println("Base Price HouseBlen: " + price);
        return price;
    } 
}

class DarkRoast implements BaseDrink {

    private double price = 1.0;

    @Override
    public double getPrice() {
        System.out.println("Base price DarkRoast: " + price);
        return price;
    }
}

class Espresso implements BaseDrink {

    private double price = 1.5;

    @Override
    public double getPrice() {
        System.out.println("Base price Espresso: " + price);
        return price;
    }
}

class Decaf implements BaseDrink {

    private double price = 2.0;

    @Override
    public double getPrice() {
        System.out.println("Base price Decaf: " + price);
        return price;
    }
}