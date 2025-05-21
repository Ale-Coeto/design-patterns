package creational.builder.builderjava;

public class Director {
   public static void makeSportsCar(Builder builder) {
    builder.setColor("Red");
    builder.setEngine("Hibrid");
    builder.setSeats(2);
   } 
}
