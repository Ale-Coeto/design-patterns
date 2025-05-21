package structural.composite.compositejava;

public class ProductLeaf implements Component {
   private String name;
   private double price; 

   public ProductLeaf(String name, double price) {
    this.name = name;
    this.price = price;
   }
   
   public double getPrice() {
    return price;
   }

   public String getName() {
    return name;
   }
}
