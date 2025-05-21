package creational.builder.builderjava;

public class CarBuilder implements Builder {
    
    private Car car = new Car();

    public void reset() {
        car.setColor(null);
        car.setEngine(null);
        car.setSeats(0);
    }

    public void setColor(String color) {
        this.car.setColor(color);
    }

    public void setEngine(String engine) {
        this.car.setEngine(engine);
    }
    
    public void setSeats(int seats) {
        this.car.setSeats(seats);
    }

    public Car getProduct() {
        return car;
    }
}   
