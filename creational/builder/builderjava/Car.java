package creational.builder.builderjava;

public class Car {
   private int seats;
   private String color;
   private String engine;
   
   public void setSeats(int seats) {
    this.seats = seats;
   }

   public void setColor(String color) {
    this.color = color;
   }

   public void setEngine(String engine) {
    this.engine = engine;
   }

   public void printCar() {
    System.out.println("Car: " + color + ". " + engine + ". " + seats + " seats.");
   }
}
