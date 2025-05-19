package decoratorjava;

class CondimentDecorator implements BaseDrink {
    protected BaseDrink baseDrink;
    protected double condimentPrice;

    public CondimentDecorator(BaseDrink baseDrink) {
        this.baseDrink = baseDrink;
        condimentPrice = 0.0;
    }

    public double getPrice() {
        return baseDrink.getPrice() + condimentPrice;
    }
}

class WholeMilkDecorator extends CondimentDecorator {

    public WholeMilkDecorator(BaseDrink baseDrink) {
        super(baseDrink);
        this.condimentPrice = 0.5;
    }

    @Override
    public double getPrice() {
        double priceWithCondiment = super.getPrice();
        System.out.println("Added Whole Milk: " + condimentPrice);
        return priceWithCondiment;
    }
} 

class LactoseFreeMilkDecorator extends CondimentDecorator {
    
    public LactoseFreeMilkDecorator(BaseDrink baseDrink) {
        super(baseDrink);
        this.condimentPrice = 0.6;
    }

    @Override
    public double getPrice() {
        double priceWithCondiment = super.getPrice();
        System.out.println("Added Lactose Free Milk: " + condimentPrice);
        return priceWithCondiment;
    }
}

class LightMilkDecorator extends CondimentDecorator {

    public LightMilkDecorator(BaseDrink baseDrink) {
        super(baseDrink);
        this.condimentPrice = 0.3;
    }

    @Override
    public double getPrice() {
        double priceWithCondiment = super.getPrice();
        System.out.println("Added Light Milk: " + condimentPrice);
        return priceWithCondiment;
    }
}

class LactoseFreeLightMilkDecorator extends CondimentDecorator {

    public LactoseFreeLightMilkDecorator(BaseDrink baseDrink) {
        super(baseDrink);
        this.condimentPrice = 0.8;
    }

    @Override
    public double getPrice() {
        double priceWithCondiment = super.getPrice();
        System.out.println("Added Lactose Free Light Milk: " + condimentPrice);
        return priceWithCondiment;
    }
}

class MochaDecorator extends CondimentDecorator {
    public MochaDecorator(BaseDrink baseDrink) {
        super(baseDrink);
        this.condimentPrice = 0.5;
    }

    @Override
    public double getPrice() {
        double priceWithCondiment = super.getPrice();
        System.out.println("Added Mocha: " + condimentPrice);
        return priceWithCondiment;
    }
}

class SoyMilkDecorator extends CondimentDecorator {
    public SoyMilkDecorator(BaseDrink baseDrink) {
        super(baseDrink);
        this.condimentPrice = 0.5;
    }

    @Override
    public double getPrice() {
        double priceWithCondiment = super.getPrice();
        System.out.println("Added Soy Milk: " + condimentPrice);
        return priceWithCondiment;
    }
}

class CreamDecorator extends CondimentDecorator {

    public CreamDecorator(BaseDrink baseDrink) {
        super(baseDrink);
        this.condimentPrice = 0.5;
    }

    @Override
    public double getPrice() {
        double priceWithCondiment = super.getPrice();
        System.out.println("Added Cream: " + condimentPrice);
        return priceWithCondiment;
    }
}
