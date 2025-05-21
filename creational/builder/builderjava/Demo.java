package creational.builder.builderjava;

public class Demo {
   public static void main(String[] args) {

    CarBuilder builder = new CarBuilder();
    Director.makeSportsCar(builder);
    Car result = builder.getProduct();
    result.printCar();

   } 
}
