package structural.proxy.proxyjava;

public class Demo {
   public static void main(String [] args) {
    ProxyImage img = new ProxyImage();
    System.out.println("Doing other things in my webpage...");
    System.out.println("User entered the main page that has the image");
    System.out.println("Image: " + img.getImage() + ". Size: " + img.getSize());
   } 
}
